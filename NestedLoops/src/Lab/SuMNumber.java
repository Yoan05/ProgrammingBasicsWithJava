package Lab;

import java.util.Scanner;

public class SuMNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int countCombinations = 0;

        boolean isFound = false;
        //за всяка една стойност на първото число: всяка една стойност на второто число
        for (int firstNumber = startNumber; firstNumber<=endNumber; firstNumber++){
            for (int secondNumber = startNumber; secondNumber<=endNumber; secondNumber++){
                countCombinations++;
                int sum = firstNumber + secondNumber;
                if (sum ==magicNumber){
                    isFound = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)",countCombinations, firstNumber, secondNumber, magicNumber);
                    break;
                }
            }
            if (isFound){ //isFound == true
                break;
            }
        }
    if (!isFound){ //isFound == false
        System.out.printf("%d combinations - neither equals %d", countCombinations, magicNumber);
    }
    }
}
