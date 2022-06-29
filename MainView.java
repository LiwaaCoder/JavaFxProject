package View;
import java.util.ArrayList;

import Model.Model;
import Model.StackofContainers;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MainView {
	private Stage stage;
	private Group root;
	private Scene scene;
	public Button move;
	
	public MainView(Stage s)
	{
		
		root = new Group();
		scene = new Scene(root,1500,800);
		scene.setFill(Color.WHITE);	
		stage = s;
		stage.setScene(scene);		
		stage.show();
		move = new Button("Move");
		move.setLayoutX(200);
		move.setLayoutY(200);
		root.getChildren().add(move);
	}	
	public void addEventHandler(EventHandler<MouseEvent> ev) 
	{
		scene.addEventHandler(MouseEvent.MOUSE_CLICKED, ev);
	}
	
	public void AddbuttonMove(EventHandler<ActionEvent> av)
	{
		move.setOnAction(av);
	}

	public void update(Model model)
	{
		root.getChildren().clear();
		PlatformView p = new PlatformView(model.getSideContainer());
		ShipView sv = new ShipView(model.GetAllStackofContainers());
		TruckView t = new TruckView(350,630, model.getTruck());
		sv.show(root);
		p.show(root);
		t.show(root);
		root.getChildren().add(move);
	}

}
