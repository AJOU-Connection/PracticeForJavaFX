package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

	private Model model = new Model();
	
	@FXML
	private TextArea result;
	
	@FXML
	private TextField inputBox;
	
	@FXML
	private void getData(ActionEvent event) {
		String ret = model.getArrivalTimes(inputBox.getText());
		result.setText(ret);
	}
	
}
