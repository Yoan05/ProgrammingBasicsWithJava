package Lab;

import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countFloors = Integer.parseInt(scanner.nextLine());
        int countRooms = Integer.parseInt(scanner.nextLine());

        //обхождаме вс етажи от посл към първия
        for (int floor = countFloors; floor >= 1; floor--) {
            // обхождаме вс номера на стаи -> 0 до бр. стаите-1
            for (int roomNumber = 0; roomNumber <= countRooms - 1; roomNumber++) {
                //печатам името на стаята ->зависи от етажа
                //после етаж = L{floor}{roomNumber}
                //четен етаж -> О{floor}{roomNumber}
                //нечетен етаж -> А{floor}{roomNumber}
                if (floor == countFloors) {
                    //System.out.println("L" + floor + roomNumber + " ");
                    System.out.printf("L%d%d ", floor, roomNumber);
                } else if (floor % 2 == 0) {
                    //System.out.println("O" + floor + roomNumber + " ");
                    System.out.printf("O%d%d ", floor, roomNumber);
                } else {
                    //System.out.println("A" + floor + roomNumber + " ");
                    System.out.printf("A%d%d ", floor, roomNumber);
                }
            }
            System.out.println();
        }

    }
}
