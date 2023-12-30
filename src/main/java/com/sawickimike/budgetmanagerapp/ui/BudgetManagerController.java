package com.sawickimike.budgetmanagerapp.ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;

public class BudgetManagerController {

    @FXML
    private MenuItem newIncomeMenuItem;

    @FXML
    private MenuItem showAllIncomeMenuItem;

    @FXML
    private MenuItem newExpenseMenuItem;

    @FXML
    private MenuItem showAllExpenseMenuItem;

    @FXML
    private MenuItem showAllInputsMenuItem;

    @FXML
    private MenuItem aboutMyHelloAppMenuItem;

    @FXML
    private MenuItem aboutBudgetManagerAppMenuItem;

    // Obsługa zdarzenia dla opcji "New Income"
    @FXML
    public void handleNewIncome() {
        // Tutaj wywołaj metodę dodawania nowego przychodu z serwisu
        // budgetService.addNewIncome();
    }

    // Obsługa zdarzenia dla opcji "Show All Income"
    @FXML
    public void handleShowAllIncome() {
        // Tutaj wywołaj metodę wyświetlającą wszystkie przychody z serwisu
        // budgetService.showAllIncome();
    }

    // Podobnie obsłuż pozostałe opcje, np. dodawanie wydatków, pokazywanie celów oszczędnościowych itp.

    // Obsługa zdarzenia dla opcji "About MyHelloApp"
    @FXML
    public void handleAboutMyHelloApp() {
        // Tutaj wyświetlić informacje o Twojej aplikacji
        // notificationService.showAboutMyHelloApp();
    }

    // Obsługa zdarzenia dla opcji "About BudgetManagerApp"
    @FXML
    public void handleAboutBudgetManagerApp() {
        // Tutaj wyświetlić informacje o aplikacji do zarządzania budżetem
        // notificationService.showAboutBudgetManagerApp();
    }

    public void handleNewExpense() {
    }

    public void handleShowAllExpense() {
    }

    public void handleShowAllInputs() {
    }
}
