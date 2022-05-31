import java.util.Scanner;

public class TouristShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int countProducts = 0;
        double totalSum = 0;
        String command = scanner.nextLine();
        while (!command.equals("Stop")){
            double price = Double.parseDouble(scanner.nextLine());
            countProducts ++;
            if (countProducts %3 == 0){
                price = price / 2;
            }
            totalSum += price;
            command = scanner.nextLine();
            if (totalSum>budget){
                System.out.printf("You don't have enough money!");
                double needMoney = totalSum - budget;
                System.out.printf("You need %.2f leva!", needMoney);
                break;
            }

        }
    if (command.equals("Stop")){
        System.out.printf("You bought %d products for %.2f leva.", countProducts, totalSum);
    }
    }
}
