package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    TextArea TextArea;
    @FXML
    TextField TextField;

    public void clickOnBtn() {
        TextArea.setText(TextField.getText());
        TextField.clear();
    }

}
