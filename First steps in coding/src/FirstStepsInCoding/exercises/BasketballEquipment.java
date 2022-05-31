package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yearFee = Integer.parseInt(scanner.nextLine());
        double sneakers = yearFee * 0.6;
        double cloths = sneakers * 0.8;
        double ball = cloths * 0.25;
        double accessories = ball * 0.2;
        double total = yearFee + sneakers + cloths + ball + accessories;
        System.out.println(total);
    }
}
