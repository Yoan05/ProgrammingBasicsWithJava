package Lab;

public class Clock {
    public static void main(String[] args) {
        for (int hour = 0; hour <= 23; hour++) {
            for (int minute = 0; minute <= 59; minute++) {
                for (int second = 0; second <=59; second++){
                    System.out.println(hour + ":" + minute + ":" + second);
                }
            }
        }
    }
}
