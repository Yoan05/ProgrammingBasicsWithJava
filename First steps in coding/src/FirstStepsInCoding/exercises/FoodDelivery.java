package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int vegan = Integer.parseInt(scanner.nextLine());
        double priceOfChicken = chicken * 10.35;
        double priceOfFish = fish * 12.40;
        double priceOfVegan = vegan * 8.15;
        double totalWithoutDelivery = priceOfChicken + priceOfFish + priceOfVegan;
        double dessert = totalWithoutDelivery * 0.2;
        double priceOfDelivery = 2.50;
        double total = totalWithoutDelivery + dessert + priceOfDelivery;
        System.out.println(total);
    }
}
