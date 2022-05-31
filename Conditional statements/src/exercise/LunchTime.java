package exercise;

import java.util.Scanner;

public class LunchTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String seriesName = scanner.nextLine();
        int episodeDuration = Integer.parseInt(scanner.nextLine());
        int breakDuration = Integer.parseInt(scanner.nextLine());

        double lunchTime = breakDuration / 8.0;
        double restTime = breakDuration / 4.0;
        double totalTime = episodeDuration + lunchTime + restTime;
        if (totalTime <= breakDuration) {
            System.out.printf("You have enough time to watch %s" + " and left with %.0f minutes free time.", seriesName, Math.ceil(breakDuration - totalTime));
        } else {
            System.out.printf("You don't have enough time to watch %s," + " you need %.0f more minutes.", seriesName, Math.ceil(totalTime - breakDuration));
        }
    }
}
