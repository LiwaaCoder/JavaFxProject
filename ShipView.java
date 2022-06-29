package View;

import java.util.List;

import Model.StackofContainers;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;


public class ShipView
{
	List<StackofContainers> stackOfContainers;
	public ShipView(List<StackofContainers> stackOfContainers){
		this.stackOfContainers = stackOfContainers;
	};
	
	public void show(Group root)
	{
		Polygon p = new Polygon();
		p.getPoints().addAll((new Double[] {1350.0,500.0,
				1100.0,700.0,
				1100.0,500.0}));
		p.setFill(Color.MAROON);
		Rectangle r = new Rectangle(150,500,950,200);
		r.setFill(Color.MAROON);
		root.getChildren().addAll(p,r);
		for(int i =0; i<stackOfContainers.size();i++) {
			StackOfContainerView sc = new StackOfContainerView(stackOfContainers.get(i));
			sc.show(root);
		}
	}
		
	
	

}
