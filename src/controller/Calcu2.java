package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;
import view.Main;

import java.net.URL;
import java.util.ResourceBundle;

public class Calcu2 implements Initializable {

    private Main application;

    public void setApp(Main application) {
        this.application = application;
    }

    @FXML
    public ProgressBar progressBar;

    @FXML
    public Text text;

    @FXML
    public TextArea textArea;

    @FXML
    public Button finish;

    @FXML
    public void finish() {
        application.gotoMainMenu();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

}
