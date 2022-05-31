package exercise;

import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int newMinutes = minutes + 15;

        if (newMinutes >= 70) {
            newMinutes = newMinutes - 60;
            hour = hour + 1;
        }
        if (hour >= 24) {
            hour = 0;
            System.out.printf("%d:%d", hour, newMinutes);
        } else if (newMinutes >= 60) {
            newMinutes = newMinutes - 60;
            hour = hour + 1;
            if (hour == 24) {
                hour = 0;
            }
            System.out.printf("%d:0%d", hour, newMinutes);
        } else {
            System.out.printf("%d:%d", hour, newMinutes);
        }

    }

}

