package com.sawickimike.budgetmanagerapp.services;

import java.util.ArrayList;
import java.util.List;
import com.sawickimike.budgetmanagerapp.models.Expense;
import com.sawickimike.budgetmanagerapp.models.Income;


    public class BudgetService {
        private List<Income> incomes;
        private List<Expense> expenses;

        public BudgetService() {
            this.incomes = new ArrayList<>();
            this.expenses = new ArrayList<>();
        }

        // Functions for managing incomes

        public void addIncome(Income income) {
            incomes.add(income);
        }

        public void editIncome(int index, Income updatedIncome) {
            if (index >= 0 && index < incomes.size()) {
                incomes.set(index, updatedIncome);
            } else {
                System.out.println("Invalid index for editing income.");
            }
        }

        public void deleteIncome(int index) {
            if (index >= 0 && index < incomes.size()) {
                incomes.remove(index);
            } else {
                System.out.println("Invalid index for deleting income.");
            }
        }

        // Functions for managing expenses

        public void addExpense(Expense expense) {
            expenses.add(expense);
        }

        public void editExpense(int index, Expense updatedExpense) {
            if (index >= 0 && index < expenses.size()) {
                expenses.set(index, updatedExpense);
            } else {
                System.out.println("Invalid index for editing expense.");
            }
        }

        public void deleteExpense(int index) {
            if (index >= 0 && index < expenses.size()) {
                expenses.remove(index);
            } else {
                System.out.println("Invalid index for deleting expense.");
            }
        }

        // Calculate total income

        public double calculateTotalIncome() {
            double totalIncome = 0;
            for (Income income : incomes) {
                totalIncome += income.getAmount();
            }
            return totalIncome;
        }

        // Calculate total expense

        public double calculateTotalExpense() {
            double totalExpense = 0;
            for (Expense expense : expenses) {
                totalExpense += expense.getAmount();
            }
            return totalExpense;
        }

        // Calculate budget balance

        public double calculateBudgetBalance() {
            return calculateTotalIncome() - calculateTotalExpense();
        }

        // Additional method to get budget summary as a formatted string
        public String getBudgetSummary() {
            StringBuilder sb = new StringBuilder();
            sb.append("Total Income: ").append(calculateTotalIncome()).append("\n");
            sb.append("Total Expense: ").append(calculateTotalExpense()).append("\n");
            sb.append("Budget Balance: ").append(calculateBudgetBalance()).append("\n");
            return sb.toString();
        }
    }