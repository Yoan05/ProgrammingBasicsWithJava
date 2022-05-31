package Exercise;

import java.util.Scanner;

public class OperationBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        double finalNumber = 0.0;
        int specialFinalNumber = 0;
        String operator = scanner.next();
        switch (operator) {
            case "+":
                finalNumber = n1 + n2;
                if (finalNumber % 2 == 0) {
                    System.out.printf("%d + %d = %.0f - even", n1, n2, finalNumber);
                } else {
                    System.out.printf("%d + %d = %.0f - odd", n1, n2, finalNumber);
                }
                break;
            case "-":
                finalNumber = n1 - n2;
                if (finalNumber % 2 == 0) {
                    System.out.printf("%d - %d = %.0f - even", n1, n2, finalNumber);
                } else {
                    System.out.printf("%d - %d = %.0f - odd", n1, n2, finalNumber);
                }
                break;
            case "*":
                finalNumber = n1 * n2;
                if (finalNumber % 2 == 0) {
                    System.out.printf("%d * %d = %.0f - even", n1, n2, finalNumber);
                } else {
                    System.out.printf("%d * %d = %.0f - odd", n1, n2, finalNumber);
                }
                break;
            case "/":
                finalNumber = n1/(n2*1.00);
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    System.out.printf("%d / %d = %.2f", n1, n2, finalNumber);
                }
                    break;
            case "%":
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    specialFinalNumber = n1% n2;
                    System.out.println(n1 + " % " + n2 + " = " + specialFinalNumber);
                }
                break;
        }
    }
}
