package exercise;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double recordInSec = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double TimeForOneMeter = Double.parseDouble(scanner.nextLine());
        double resistance = Math.floor(distance/15);
        double addedTime = resistance*12.5;
        double personalRecord = distance *TimeForOneMeter + addedTime;
        if (personalRecord<recordInSec){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",personalRecord);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.",personalRecord-recordInSec);
        }
    }
}
