package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.awt.*;

public class Controller {

    @FXML public javafx.scene.control.TextArea TextArea;
    @FXML public javafx.scene.control.TextField TextField;

    public void send(ActionEvent actionEvent) {
        TextArea.appendText(TextField.getText()+'\n');
        TextField.setText("");
    }
}
