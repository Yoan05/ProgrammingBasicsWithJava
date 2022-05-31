package exercise;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());
        double priceOfVideoCards = videoCards * 250;
        double priceOfProcessors = processors * priceOfVideoCards * 0.35;
        double priceOfRam = ram * priceOfVideoCards * 0.10;
        double totalPrice = priceOfProcessors + priceOfRam + priceOfVideoCards;
        if (videoCards > processors) {
            totalPrice = totalPrice * 0.85;
        }
        if (budget >= totalPrice) {
            System.out.printf("You have %.2f leva left!", budget - totalPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", totalPrice - budget);
        }

    }
}
