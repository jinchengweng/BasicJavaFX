package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;

public class funciones {
	@FXML
	private ImageView img1;
	
	
	
	@FXML
	public void imgSombreado() {
		img1.setEffect(new GaussianBlur(40));
	}
	
	@FXML
	public void salirX() {
		System.exit(0);
	}
}
