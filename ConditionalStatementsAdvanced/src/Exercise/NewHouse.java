package Exercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price = 0.0;
        double discount = 1.0;

        switch (type) {
            case "Roses":
                price = quantity * 5.00;
                if (quantity > 80) {
                    discount = 0.9;
                }
                break;
            case "Dahlias":
                price = quantity * 3.80;
                if (quantity > 90) {
                    discount = 0.85;
                }
                break;
            case "Tulips":
                price = quantity * 2.80;
                if (quantity > 80) {
                    discount = 0.85;
                }
                break;
            case "Narcissus":
                price = quantity * 3.00;
                if (quantity < 120) {
                    discount = 1.15;
                }
                break;
            case "Gladiolus":
                price = quantity * 2.50;
                if (quantity < 80) {
                    discount = 1.20;
                }
                break;
        }
        double total = price*discount;
        if (budget >= total){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", quantity, type, budget - total);
        }else {
            System.out.printf("Not enough money, you need %.2f leva more.", total - budget);
        }
    }
}
