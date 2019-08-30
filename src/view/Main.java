package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

import controller.*;
import model.CalculateFunction;

public class Main extends Application {

    private Stage stage;

    @Override
    public void start(Stage primaryStage) {
        stage = primaryStage;// 参数转存，便于方法外使用
        // stage.setWidth(800);
        // stage.setHeight(560);
       // stage.setResizable(false);// 固定窗口大小
        gotoMainMenu();
        stage.show();
    }

    /**
     * 切换至主界面
     */
    public void gotoMainMenu() {
        try {
            stage.setTitle("萌泪爆气表");
            MainMenu mainMenu = (MainMenu) replaceSceneContent("mainMenu.fxml");
            mainMenu.setApp(this);
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, e);
        }
    }

    /**
     * 切换至爆点计算-条件选择界面
     */
    public void gotoCalcu1() {
        try {
            stage.setTitle("萌泪爆气表 - 爆点计算");
            Calcu1 calcu1 = (Calcu1) replaceSceneContent("calcu1.fxml");
            calcu1.setApp(this);
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, e);
        }
    }

    /**
     * 切换至爆点计算-计算界面
     */
    public void gotoCalcu2(File[] initialFiles, int outMode, int fireMaxNum, int maxDiff) {
        try {
            Calcu2 calcu2 = (Calcu2) replaceSceneContent("calcu2.fxml");
            calcu2.setApp(this);
            new CalculateFunction(calcu2, initialFiles, outMode, fireMaxNum, maxDiff).start();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, e);
        }
    }

    /**
     * 切换至提取文件-条件选择界面
     */
    public void gotoX5Apk1() {
        try {
            stage.setTitle("萌泪爆气表 - 提取文件");
            X5Apk1 x5Apk1 = (X5Apk1) replaceSceneContent("x5apk1.fxml");
            x5Apk1.setApp(this);
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, e);
        }
    }


    /**
     * 切换至文件转化-条件选择界面
     */
    public void gotoBytes1() {
        try {
            stage.setTitle("萌泪爆气表 - 文件转化");
            Bytes1 bytes1 = (Bytes1) replaceSceneContent("bytes1.fxml");
            bytes1.setApp(this);
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, e);
        }
    }


    private Initializable replaceSceneContent(String fxml) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setBuilderFactory(new JavaFXBuilderFactory());
        loader.setLocation(getClass().getResource(fxml));
        stage.setScene(new Scene(loader.load(getClass().getResourceAsStream(fxml))));
        stage.sizeToScene();
        return (Initializable) loader.getController();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
