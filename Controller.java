import java.util.ArrayList;
import java.util.List;

import Model.Container;
import Model.Model;
import Model.StackofContainers;
import View.MainView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class Controller 
{
	private MainView  view ; 
	private Model model ; 
	private int x , y ,  temp=660,ChangeDirection=0;
	private int new_x , new_y;
	
	public Controller(MainView mv  , Model m)
	{
		this.view = mv ;
		this.model = m ;
		
		
		
		
		
		
		EventHandler<MouseEvent>click = new EventHandler<MouseEvent>() {
			
			@Override
			public void handle(MouseEvent ev) 
			{
				int x =(int)ev.getX();
				int y = (int)ev.getY();
				for (int j = 0; j < m.GetAllStackofContainers().size(); j++) {
					StackofContainers currentStack = m.GetAllStackofContainers().get(j);
					if(currentStack.SetActive(x,y)) {
						for (int i = 0; i < m.GetAllStackofContainers().size(); i++) {
							if( i!=j) {
								currentStack = m.GetAllStackofContainers().get(i); 
								currentStack.setActiveFalse();
							}
						}
						break;
					}
				}
				view.update(m);
			}
		};
		
		
		view.AddbuttonMove(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent arg0) {
				
					for (int j = 0; j < m.GetAllStackofContainers().size(); j++) {
						StackofContainers currentStack = m.GetAllStackofContainers().get(j);
						if(currentStack.getIsActive()) {
							if (ChangeDirection == 0) {
								Container top = currentStack.getTopcontainer();
								if (top.getIsActive()) {
									currentStack.removeTopcontainer();
									m.getTruck().loadContainer(top);	
									ChangeDirection = 1;
								} else {
									currentStack.removeTopcontainer();
									m.getSideContainer().addToStack(top);
								}
							}else {
								if(m.getSideContainer().isEmpty()) {
									ChangeDirection = 0;
									m.getTruck().removeContainer();
									currentStack.setActiveFalse();
								}else {
									Container top = m.getSideContainer().getTopcontainer();
									m.getSideContainer().removeTopcontainer();
									currentStack.addToStack(top);
								}
							}
							view.update(m);
							break;
						}
					}
		}});
		
		view.update(m);
		view.addEventHandler(click);
	}
}

