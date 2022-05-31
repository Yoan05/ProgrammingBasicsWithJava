package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class UsdToBgnConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Прочитане на вход
        //Изчисления
        //Принт на резултат

        double usd = Double.parseDouble(scanner.nextLine());
        double bgn = usd * 1.79549;
        System.out.println(bgn);
    }

}
