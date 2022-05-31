package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double priceOfNylon = (nylon + 2) *1.50;
        double priceOfPaint = (paint + 0.1 * paint) * 14.50;
        double priceOfThinner = thinner * 5.00;
        double priceOfBags = 0.40;
        double totalPrice = priceOfNylon + priceOfPaint + priceOfThinner + priceOfBags;
        double priceWorkers = (totalPrice * 0.3) * hours;
        double total = totalPrice + priceWorkers;
        System.out.println(total);

    }
}
