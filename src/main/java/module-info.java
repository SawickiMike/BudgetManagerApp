module com.sawickimike.budgetmanagerapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;
    requires java.sql;
    requires javafx.swing;


    opens com.sawickimike.budgetmanagerapp to javafx.fxml;
    exports com.sawickimike.budgetmanagerapp.ui;
    opens com.sawickimike.budgetmanagerapp.ui to javafx.fxml;
}