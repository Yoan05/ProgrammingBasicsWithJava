package Exercise;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int primeSum = 0;
        int nonPrimeSum = 0;
        while (!input.equals("stop")){
            boolean isNonprime = false;
            int number = Integer.parseInt(input);
            if (number<0){
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }
            //Проверка дали числото е просто
            for (int i = 2; i< number; i++ ){
                if (number % i == 0 ){
                    isNonprime = true;
                    break;
                }
            }
            if (isNonprime) {
                nonPrimeSum += number;
            }else {
                primeSum +=number;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d\n" +
                "Sum of all non prime numbers is: %d",primeSum, nonPrimeSum);
    }
}
