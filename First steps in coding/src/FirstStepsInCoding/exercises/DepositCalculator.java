package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Прочитане вход
        double depositSum = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double interestRate = Double.parseDouble(scanner.nextLine());
        //Изчисляване
        // сума = депозирана сума + срок на депозита *
        //лихва 1 месец = (депозирана сума * годишен лихвен процент ) / 12)
        double interestPerMonth = depositSum * (interestRate / 100) / 12;
        double totalSum = depositSum + months *interestPerMonth;
        // Принт
        System.out.println(totalSum);
    }
}
