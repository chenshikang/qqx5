package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import view.Main;

import java.net.URL;
import java.util.ResourceBundle;

public class Exit implements Initializable {

    private Main application;

    public void setApp(Main application) {
        this.application = application;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }


    @FXML
    Button back;

    @FXML
    public void back() {
        //ExitStage.close();
    }

    @FXML
    Button exit;

    @FXML
    public void exit() {
       // ExitStage.close();
       // PrimaryStage.close();
        System.exit(0);
    }

}
