package exercise;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double priceFor1Cloth = Double.parseDouble(scanner.nextLine());

        double decorPrice = 0.1*budget;
        double priceForAllClothes = statists*priceFor1Cloth;
        if (statists>=150){priceForAllClothes=0.9*priceForAllClothes;}
        double total = decorPrice + priceForAllClothes;
        if (total>budget){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",total-budget);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",budget-total);
        }

    }
}
