/// LiwaaHosh 323036533 , Hadar Givoni 208645408  , Etay Torres 205736531 

import Model.Model;
import View.MainView;
import javafx.application.*;
import javafx.stage.Stage;

public class Main extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		MainView view = new MainView(stage);
		Model model = new Model();
		Controller controller = new Controller(view, model);
 	}

}
