package Exercise;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = Double.parseDouble(scanner.nextLine());
        sum = Math.round(sum * 100);
        int coins = 0;
        //200 100 50 20 10 5 2 1
        while (sum > 0){
            if (sum >=200){
                sum-=200;
                coins++;
            }else if (sum >=100){
                sum-=100;
                coins++;
            }else if (sum>=50){
                sum-=50;
                coins++;
            }else if (sum>=20){
                sum-=20;
                coins++;
            }else if (sum>=10){
                sum-=10;
                coins++;
            }else if (sum>=5){
                sum-=5;
                coins++;
            }else if (sum >=2){
                sum-=2;
                coins++;
            }else {
                sum-=1;
                coins++;
            }
        }
        System.out.println(coins);
    }
}
