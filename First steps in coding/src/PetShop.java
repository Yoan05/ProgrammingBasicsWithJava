import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //цена на храна за кучета = 2.50
        //цена за храна на котки = 4.0
        int dogFood = Integer.parseInt(scanner.nextLine());
        int catFood = Integer.parseInt(scanner.nextLine());
        double priceForDogFood = dogFood * 2.5;
        double priceForCatFood = catFood * 4.0;
        double wholePrice = priceForDogFood + priceForCatFood;
        System.out.println(wholePrice + " lv.");
    }
}
