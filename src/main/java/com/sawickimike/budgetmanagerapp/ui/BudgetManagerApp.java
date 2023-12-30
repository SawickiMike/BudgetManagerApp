package com.sawickimike.budgetmanagerapp.ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BudgetManagerApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/sawickimike/budgetmanagerapp/example.fxml"));
        Parent root = loader.load();

        BudgetManagerController controller = loader.getController();
        // Tutaj możesz przekazać referencję do serwisu lub innych elementów, jeśli są potrzebne w kontrolerze

        primaryStage.setTitle("Budget Manager App");
        primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
