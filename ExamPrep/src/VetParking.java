import java.util.Scanner;

public class VetParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int hoursPerDay = Integer.parseInt(scanner.nextLine());
        //обхождаме всички дни -> първия до последния
        double sumAllDays = 0;
        for (int day =1; day <= days; day++){
            //обхождаме всички часове
            double sumPerDay = 0; // сумата за всеки един ден
            for (int hour = 1; hour <= hoursPerDay; hour++){
                    //цена за час
                    // четен ден и нечетен час = 2,50
                    if (day%2 == 0 && hour % 2 == 1){
                        sumPerDay += 2.50;
                    }
                    // нечетен ден четен час = 1.25
                    else if (day% 2 == 1 && hour%2 == 0){
                        sumPerDay += 1.25;
                    }
                    // четен ден и четен час или неч. ден и неч. час = 1
                    else {
                        sumPerDay +=1;
                    }

            }
            sumAllDays+= sumPerDay;
            System.out.printf("Day: %d - %.2f leva\n", day, sumPerDay);
        }
        System.out.printf("Total: %.2f leva", sumAllDays);
    }
}
