package services;
import models.*;

import java.util.List;

public class ReportService {
    private GoalService goalService;

    public ReportService(GoalService goalService) {
        this.goalService = goalService;
    }

    /**
     * Generates a progress report for a specific savings goal.
     * @param goalName The name of the savings goal for the report.
     * @return A string representing the progress report.
     */
    public String generateGoalProgressReport(String goalName) {
        List<SavingsGoal> goals = goalService.getSavingsGoals();
        for (SavingsGoal goal : goals) {
            if (goal.getGoalName().equals(goalName)) {
                double progress = (goal.getCurrentAmount() / goal.getTargetAmount()) * 100;
                return "Goal Progress Report for Goal '" + goalName + "':\n" +
                        "Target Amount: " + goal.getTargetAmount() + "\n" +
                        "Current Amount Saved: " + goal.getCurrentAmount() + "\n" +
                        "Progress: " + progress + "%";
            }
        }
        return "Goal '" + goalName + "' not found.";
    }

    /**
     * Generates a comparison report between two savings goals.
     * @param goalName1 The name of the first savings goal.
     * @param goalName2 The name of the second savings goal.
     * @return A string representing the comparison report.
     */
    public String generateComparisonReport(String goalName1, String goalName2) {
        SavingsGoal goal1 = null, goal2 = null;
        List<SavingsGoal> goals = goalService.getSavingsGoals();
        for (SavingsGoal goal : goals) {
            if (goal.getGoalName().equals(goalName1)) {
                goal1 = goal;
            } else if (goal.getGoalName().equals(goalName2)) {
                goal2 = goal;
            }
        }

        if (goal1 != null && goal2 != null) {
            return "Comparison Report between Goal '" + goalName1 + "' and Goal '" + goalName2 + "':\n" +
                    "Goal 1 Target Amount: " + goal1.getTargetAmount() + "\n" +
                    "Goal 1 Current Amount Saved: " + goal1.getCurrentAmount() + "\n" +
                    "----------------------------------------\n" +
                    "Goal 2 Target Amount: " + goal2.getTargetAmount() + "\n" +
                    "Goal 2 Current Amount Saved: " + goal2.getCurrentAmount();
        } else {
            return "One or both goals not found.";
        }
    }
    // charts and graphics with analysis of budget data to be added later
}

