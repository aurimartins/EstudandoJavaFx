package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

public class ViewController {

	@FXML
	private Button btTest;

	@FXML
	public void onBuTestAction() {
		//Alerts.showAlert("Alert titulo", null, "Hello", AlertType.WARNING);
		// Alerts.showAlert("Alert titulo", null, "Hello", AlertType.CONFIRMATION);
		// Alerts.showAlert("Alert titulo", null, "Hello", AlertType.ERROR);
		 Alerts.showAlert("Alert titulo", null, "Hello", AlertType.INFORMATION);
	}
}
