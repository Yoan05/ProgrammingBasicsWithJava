package Exercise;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String hotelOrCamp = "";
        String destination = "";
        double price = 0.0;
        switch (season) {
            case "summer":
                hotelOrCamp = "Camp";
                if (budget <= 100) {
                    destination = "Somewhere in Bulgaria";
                    price = 0.3 * budget;
                } else if (budget <= 1000) {
                    destination  = "Somewhere in Balkans";
                    price = 0.4 *budget;
                } else {
                    hotelOrCamp = "Hotel";
                    destination = "Somewhere in Europe";
                    price = 0.9 * budget;
                }
                break;
            case "winter":
                hotelOrCamp = "Hotel";
                if (budget <= 100) {
                    destination = "Somewhere in Bulgaria";
                    price = 0.7*budget;
                } else if (budget <= 1000) {
                    destination = "Somewhere in Balkans";
                    price = 0.8 *budget;
                } else {
                    destination = "Somewhere in Europe";
                    price = 0.9 * budget;
                }
                break;
        }
        System.out.printf("%s\n"+ "%s - %.2f", destination, hotelOrCamp, price);
    }
}
