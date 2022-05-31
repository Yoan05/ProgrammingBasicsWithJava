package Lab;

import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();
        switch (day) {
            case "Monday":
                if (time == 10 || time == 11 || time == 12
                        || time == 13 || time == 14 || time == 15
                        || time == 16 || time == 17 || time == 18) {
                    System.out.println("open");
                } else {
                    System.out.println("closed");
                }

                break;
            case "Tuesday":
                if (time == 10 || time == 11 || time == 12
                        || time == 13 || time == 14 || time == 15
                        || time == 16 || time == 17 || time == 18) {
                    System.out.println("open");
                } else {
                    System.out.println("closed");
                }

                break;
            case "Wednesday":
                if (time == 10 || time == 11 || time == 12
                        || time == 13 || time == 14 || time == 15
                        || time == 16 || time == 17 || time == 18) {
                    System.out.println("open");
                } else {
                    System.out.println("closed");
                }

                break;
            case "Thursday":
                if (time == 10 || time == 11 || time == 12
                        || time == 13 || time == 14 || time == 15
                        || time == 16 || time == 17 || time == 18) {
                    System.out.println("open");
                } else {
                    System.out.println("closed");
                }

                break;
            case "Friday":
                if (time == 10 || time == 11 || time == 12
                        || time == 13 || time == 14 || time == 15
                        || time == 16 || time == 17 || time == 18) {
                    System.out.println("open");
                } else {
                    System.out.println("closed");
                }

                break;
            case "Saturday":
                if (time == 10 || time == 11 || time == 12
                        || time == 13 || time == 14 || time == 15
                        || time == 16 || time == 17 || time == 18) {
                    System.out.println("open");
                } else {
                    System.out.println("closed");
                }

                break;
            case "Sunday":

                System.out.println("closed");

                break;


        }
    }
}
