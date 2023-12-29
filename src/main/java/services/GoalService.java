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

    public void editSavingsGoal(String goalName, SavingsGoal updatedGoal) {
        for (int i = 0; i < savingsGoals.size(); i++) {
            SavingsGoal goal = savingsGoals.get(i);
            if (goal.getGoalName().equals(goalName)) {
                savingsGoals.set(i, updatedGoal);
                return;
            }
        }
        System.out.println("Goal '" + goalName + "' not found.");
    }

    public void deleteSavingsGoal(String goalName) {
        for (int i = 0; i < savingsGoals.size(); i++) {
            SavingsGoal goal = savingsGoals.get(i);
            if (goal.getGoalName().equals(goalName)) {
                savingsGoals.remove(i);
                return;
            }
        }
        System.out.println("Goal '" + goalName + "' not found.");
    }

    // Getters for savings goals list

    public List<SavingsGoal> getSavingsGoals() {
        return savingsGoals;
    }

    // Additional method to get all goals as a formatted string
    public String getAllGoalsAsString() {
        StringBuilder sb = new StringBuilder();
        sb.append("All Savings Goals:\n");
        for (SavingsGoal goal : savingsGoals) {
            sb.append("Goal Name: ").append(goal.getGoalName()).append("\n");
            sb.append("Target Amount: ").append(goal.getTargetAmount()).append("\n");
            sb.append("Current Amount Saved: ").append(goal.getCurrentAmount()).append("\n");
            sb.append("---------------------------------\n");
        }
        return sb.toString();
    }
}

