package Exercise;

import java.util.Scanner;

public class ExamPrep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int poorGradesLimit = Integer.parseInt(scanner.nextLine());;

        String problem = scanner.nextLine();
        int poorGrades = 0;
        boolean isFailed = false;
        double gradesSum = 0;
        int gradesCount = 0;
        String lastProblem = "";
        while (!problem.equals("Enough")) {
            int grade = Integer.parseInt(scanner.nextLine());
            gradesSum += grade;
            gradesCount++;
            lastProblem = problem;
            if (grade <= 4) {
                poorGrades++;
                if (poorGrades == poorGradesLimit) {
                    isFailed = true;
                    break;
                }
            }

            problem = scanner.nextLine();
        }

        if (isFailed) {
            System.out.printf("You need a break, %d poor grades.", poorGrades);
        } else {
            System.out.printf("Average score: %.2f\n" +
                    "Number of problems: %d\n" +
                    "Last problem: %s", gradesSum / gradesCount
                                      , gradesCount
                                      ,lastProblem);
        }

    }
}
