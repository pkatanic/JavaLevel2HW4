package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller {
    @FXML
    private TextArea textArea;

    @FXML
    private TextField txtWrite;


    public void msgSend(ActionEvent actionEvent) {
        textArea.appendText(txtWrite.getText() + '\n');
        txtWrite.clear();
        txtWrite.requestFocus();

    }

    public void keyListener(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.ENTER) {
            textArea.appendText(txtWrite.getText() + '\n');
            ((TextField) keyEvent.getSource()).clear();
            txtWrite.requestFocus();
        }
    }
}
