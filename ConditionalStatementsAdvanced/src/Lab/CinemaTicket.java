package Lab;

import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        int ticketPrice = 0;
        switch (day){
            case"Monday":
            case "Tuesday":
            case "Friday":
                ticketPrice = 12;
              break;
            case "Wednesday":
            case "Thursday":
                ticketPrice = 14;
                break;
            case "Saturday":
            case "Sunday":
                ticketPrice = 16;
        }
        System.out.println(ticketPrice);
    }
}
