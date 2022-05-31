package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Прочитане на вход
        Double radians = Double.parseDouble(scanner.nextLine());
        //Изчисления
        Double degrees = radians * 180/ Math.PI;
        //Принт
        System.out.println(degrees);
    }
}
