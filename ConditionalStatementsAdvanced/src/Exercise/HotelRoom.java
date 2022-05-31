package Exercise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double studioPrice = 0.0;
        double apartmentPrice = 0.0;
        double discountA = 0.0;
        double discountS = 0.0;
        switch (month) {
            case "May":
            case "October":
                studioPrice = 50.00;
                apartmentPrice = 65.00;
                if (nights > 14) {
                    discountS = 0.30;
                    discountA = 0.10;
                } else if (nights > 7) {
                    discountS = 0.05;
                }
                break;
            case "June":
            case "September":
                studioPrice = 75.20;
                apartmentPrice = 68.70;
                if (nights > 14) {
                    discountS = 0.20;
                    discountA = 0.10;
                }
                break;
            case "July":
            case "August":
                studioPrice = 76.00;
                apartmentPrice = 77.00;
                if (nights > 14) {
                    discountA = 0.10;
                }
                break;
        }
        double discountPriceA = apartmentPrice - (discountA * apartmentPrice);
        double discountPriceS = studioPrice - (discountS * studioPrice);
        double totalStudio = discountPriceS * nights;
        double totalApartment = discountPriceA * nights;
        System.out.printf("Apartment: %.2f lv.\n"
                + "Studio: %.2f lv.", totalApartment, totalStudio);
    }
}
