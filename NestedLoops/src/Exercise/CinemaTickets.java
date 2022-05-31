package Exercise;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        int totalTickets = 0;
        int kids = 0;
        int standard = 0;
        int student = 0;
        while (!input.equals("Finish")){
            int places = Integer.parseInt(scanner.nextLine());
            int currentTickets = 0;
            String ticket = scanner.nextLine();
            while (!ticket.equals("End")){

                totalTickets ++;
                if (currentTickets >= places){
                break;
            }
            switch (ticket){
                case "student":
                    student ++;
                    break;
                case "standard":
                    standard ++;
                    break;
                case "kid":
                    kids ++;
                    break;
            }
                currentTickets++;
                ticket = scanner.nextLine();
        }
            System.out.printf("%s - %.2f%% full.\n", input, currentTickets *1.0 /places * 100);
            input = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d", totalTickets);
    }
}
