package View;

import Model.StackofContainers;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class PlatformView 
{
	private StackofContainers stackofContainers;
	public PlatformView(StackofContainers stackofContainers) {
		this.stackofContainers = stackofContainers;
	};
	
	
	public void show(Group root)
	{
		Rectangle rc = new Rectangle(0,700,1500,100);
		rc.setFill(Color.GRAY);
		root.getChildren().add(rc);
		StackOfContainerView sc = new StackOfContainerView(stackofContainers);
		sc.show(root);
	}
	

}
