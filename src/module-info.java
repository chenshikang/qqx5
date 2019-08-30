module qqx5 {
    requires javafx.fxml;
    requires javafx.controls;

    requires java.desktop;
    requires java.logging;

    requires miniMengLei;
    requires annotations;
    requires dom4j;

    opens controller;
    opens model;
    opens view;
}