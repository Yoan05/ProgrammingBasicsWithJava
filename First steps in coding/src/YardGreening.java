import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Прочитане на вход
        Double squareMeters = Double.parseDouble(scanner.nextLine()) * 1.0;
        //Пресмятане на цената за озеленяване
        double price = squareMeters * 7.61;
        double discount = price * 0.18;
        double finalPrice = price - discount;
        //Принт
        System.out.println("The final price is: " + finalPrice + " lv.");
        System.out.println("The discount is: " + discount + " lv.");
    }
}
