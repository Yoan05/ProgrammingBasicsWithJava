package exercise;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceOfHoliday = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());
        double totalProfit = puzzles * 2.60 + dolls * 3.00 + bears * 4.10 + minions * 8.20 + trucks * 2.00;
        if (puzzles + dolls + bears + minions + trucks >= 50) {
            totalProfit = totalProfit * 0.75;
        }
        totalProfit = totalProfit*0.9;
        if (totalProfit>=priceOfHoliday){
            System.out.printf("Yes! %.2f lv left.", totalProfit-priceOfHoliday);
        }
        else {
            System.out.printf("Not enough money! %.2f lv needed.", priceOfHoliday - totalProfit);
        }

    }
}
