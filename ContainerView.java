package View;

import Model.Container;
import javafx.scene.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;	

public class ContainerView {
	private int x,y;
	private int r,g,b;
	private boolean IsActive;
	
	public ContainerView(Container c)
	{
		IsActive = c.getIsActive(); // need to add it
		x = c.getX();
		y = c.getY();
		r = c.getR();
		g = c.getG();
		b = c.getB();
		
	}
	


	public void show(Group root)
	{
		Rectangle  rct = new Rectangle(x,y,100,40);
		rct.setFill(Color.rgb(r,g,b));
		if(IsActive)
		{
			rct.setStroke(Color.RED);
		}
		else
			rct.setStroke(Color.BLACK);
		root.getChildren().add(rct);
		
	}	
}

