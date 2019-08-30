package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import view.Main;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainMenu implements Initializable {

    private Main app;

    public void setApp(Main application) {
        this.app = application;
    }

    @FXML
    Button calcu;

    @FXML
    private void gotoCalcu1() {
        app.gotoCalcu1();
    }

    @FXML
    Button x5apk;

    @FXML
    public void gotoX5Apk1() {
        app.gotoX5Apk1();
    }

    @FXML
    Button bytes;

    @FXML
    public void gotoBytes1() {
        app.gotoBytes1();
    }

    @FXML
    Button scan;

    @FXML
    public void showScan() {
        Desktop desktop = Desktop.getDesktop();
        File dir = new File("爆点信息");
        if (!dir.exists()){
            dir.mkdirs();
        }
        EventQueue.invokeLater(() -> {
            try {
                desktop.open(dir);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
    }

    @FXML
    Button info;

    @FXML
    public void info() {
        // todo:将原窗口变为不可操作
        // InfoStage.showAndWait();
    }

    @FXML
    Button exit;

    @FXML
    public void exit() {
        // todo:将原窗口变为不可操作
        // ExitStage.showAndWait();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

}