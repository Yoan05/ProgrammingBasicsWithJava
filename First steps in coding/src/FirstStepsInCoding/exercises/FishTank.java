package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percentage = Double.parseDouble(scanner.nextLine());
        double volumeOfTank = length * width * height;
        double volumeInLitres = volumeOfTank/1000.0;
        volumeInLitres= volumeInLitres - volumeInLitres * (percentage / 100);
        System.out.println(volumeInLitres);
    }
}


