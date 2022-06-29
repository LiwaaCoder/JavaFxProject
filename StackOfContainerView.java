package View;

import java.util.Stack;

import Model.Container;
import Model.StackofContainers;
import javafx.scene.Group;	

public class StackOfContainerView {
	
	StackofContainers stackofContainers;
	
	public StackOfContainerView(StackofContainers stackofContainers)
	{
		this.stackofContainers = stackofContainers;
		
	}
	
	public void show(Group root)
	{
		Stack<Container> stack = stackofContainers.getContainers();
		for(int i = 0; i< stack.size(); i++) {
			ContainerView cv = new ContainerView(stack.get(i));
			cv.show(root);
		}
	}
}

