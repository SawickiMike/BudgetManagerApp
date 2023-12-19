package services;

import java.util.ArrayList;
import java.util.List;
import models.SavingsGoal;

public class GoalService {
    private List<SavingsGoal> savingsGoals;

    public GoalService() {
        this.savingsGoals = new ArrayList<>();
    }

    // Functions for managing savings goals
    public void addSavingsGoal(SavingsGoal goal) {
        savingsGoals.add(goal);
    }

    public void editSavingsGoal(int index, SavingsGoal updatedGoal) {
        if (index >= 0 && index < savingsGoals.size()) {
            savingsGoals.set(index, updatedGoal);
        } else {
            System.out.println("Invalid index for editing savings goal.");
        }
    }

    public void deleteSavingsGoal(int index) {
        if (index >= 0 && index < savingsGoals.size()) {
            savingsGoals.remove(index);
        } else {
            System.out.println("Invalid index for deleting savings goal.");
        }
    }

    // Calculate total saved amount for all goals
    public double calculateTotalSavedAmount() {
        double totalSaved = 0;
        for (SavingsGoal goal : savingsGoals) {
            totalSaved += goal.getCurrentAmount();
        }
        return totalSaved;
    }

    // Calculate total target amount for all goals
    public double calculateTotalTargetAmount() {
        double totalTarget = 0;
        for (SavingsGoal goal : savingsGoals) {
            totalTarget += goal.getTargetAmount();
        }
        return totalTarget;
    }

    // Calculate progress for all goals (as a percentage)
    public double calculateGoalProgress() {
        if (calculateTotalTargetAmount() > 0) {
            return (calculateTotalSavedAmount() / calculateTotalTargetAmount()) * 100;
        }
        return 0;
    }

    // Getters for savings goals list
    public List<SavingsGoal> getSavingsGoals() {
        return savingsGoals;
    }
}
