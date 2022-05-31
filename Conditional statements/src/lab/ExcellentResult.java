package lab;


import java.util.Scanner;

public class ExcellentResult {

    public static void main(String[] args) {
        //1. прочитаме вход
        //2. проверка дали оценката е >= 5.00 -> "Excellent!"
        Scanner scanner = new Scanner(System.in);
        int grade = Integer.parseInt(scanner.nextLine());
        if (grade >= 5) {
            System.out.println("Excellent!");
        } else {
            System.out.println("Not Excellent!");
        }
    }
}

