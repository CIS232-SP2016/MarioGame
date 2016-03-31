package edu.cis232;

import javafx.animation.AnimationTimer;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class GameController {

	@FXML
	ImageView player;

	Image mario = new Image(
			"http://vignette1.wikia.nocookie.net/mario/images/1/15/MarioNSMB2.png/revision/latest?cb=20120816162009");

	Scene scene;

	public void setScene(Scene scene) {
		this.scene = scene;
		scene.setOnKeyPressed((KeyEvent e) -> {
			if (e.getCode() == KeyCode.SPACE) {
				fireAnimator();
			}
		});
	}

	@FXML
	void initialize() {
		player.setImage(mario);
	}

	public void fireAnimator() {
		final long startNanoTime = System.nanoTime();

		new AnimationTimer() {
			public void handle(long currentNanoTime) {
				double t = (currentNanoTime - startNanoTime) / 1000000000.0;
				player.setX(t + player.getX());
			}
		}.start();
	}
}
