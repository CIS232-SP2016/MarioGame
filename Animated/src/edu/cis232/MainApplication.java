package edu.cis232;

import java.io.FileInputStream;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApplication extends Application{

	public static void main(String[] args){
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		FXMLLoader loader = new FXMLLoader();
		Parent parent = loader.load(new FileInputStream("Game.fxml"));

		Scene scene = new Scene(parent);
		GameController controller = loader.getController();
		controller.setScene(scene);
		
		stage.setTitle("Mario Brothers Beta 1");
		stage.setScene(scene);
		stage.show();
		
	}

}
