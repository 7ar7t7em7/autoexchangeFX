package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
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
		TabPane tabPane = createTabPane();
		
		Scene scene = new Scene(tabPane, Color.AZURE);
				
		stage.getIcons().add(new Image("icon.png"));
		stage.setTitle("Автообмен");
		stage.setScene(scene);
		stage.setWidth(1024);
		stage.setHeight(768);
		
		stage.show();
	}

	private TabPane createTabPane() {
		TabPane tabPane = new TabPane();
        Tab tab1 = new Tab("Главная");
        Tab tab2 = new Tab("Настройки");
        Tab tab3 = new Tab("О программе");
        tabPane.getTabs().addAll(tab1, tab2, tab3);
		return tabPane;
	}
}
