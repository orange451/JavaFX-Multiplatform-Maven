import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MyApplication extends Application {

	@Override
	public void start(Stage stage) {
		StackPane alignment = new StackPane();
		alignment.setAlignment(Pos.CENTER);
		
		Label label = new Label("Hello OpenJFX! Running on Java Version: " + System.getProperty("java.version"));
		alignment.getChildren().add(label);
		
		stage.setScene(new Scene(alignment, 320, 240));
		stage.show();
	}

	/**
	 * JavaFX Application entry point.
	 * If running from IDE or CLI please use Main.class as primary class.
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
