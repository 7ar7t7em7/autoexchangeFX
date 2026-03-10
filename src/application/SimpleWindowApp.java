package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.scene.paint.Color;


public class SimpleWindowApp extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

	@Override
	public void start(Stage stage) throws Exception {
		
		startWindow(stage);
		
	}

	private void startWindow(Stage stage) {
		Group root = new Group();
		Scene scene = new Scene(root, Color.AZURE);
		
		Image icon = new Image("icon.png");

		
		stage.getIcons().add(icon);
		stage.setTitle("Автообмен");
		stage.setScene(scene);
		stage.setWidth(1024);
		stage.setHeight(768);
		
		stage.show();
	}
}
