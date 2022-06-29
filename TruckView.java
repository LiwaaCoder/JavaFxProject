package View;
 
import Model.Truck;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;	

public class TruckView {
	private int x,y ;
	private Truck truck;
	public TruckView(int x , int y, Truck truck)
	{
		this.truck = truck;
		this.x = x ;
		this.y = y ;
		
	}
	
	public void show(Group root) {
		
		Circle c1 = new Circle(x+30,y+70,10);
		c1.setFill(Color.BLACK);
		Circle c2 = new Circle(x+240,y+70,10);
		c2.setFill(Color.BLACK);
		Circle c3 = new Circle(x+200,y+70,10);
		c3.setFill(Color.BLACK);
		Rectangle rct = new Rectangle(x,y,50,70);
		rct.setFill(Color.YELLOW);
		rct.setStroke(Color.BLACK);
		Rectangle rct1 = new Rectangle(x+50,y+50,200,10);
		rct1.setFill(Color.YELLOW);
		rct1.setStroke(Color.BLACK);
		Rectangle rct2 = new Rectangle(x+1,y+10,30,10);
		rct2.setFill(Color.MAROON);
		rct2.setStroke(Color.BLACK);
		
		root.getChildren().addAll(rct,rct1,rct2,c1,c2,c3);
		if(truck.getContainer() != null) {
			ContainerView cv = new ContainerView(truck.getContainer());
			cv.show(root);
		}
	}

}
