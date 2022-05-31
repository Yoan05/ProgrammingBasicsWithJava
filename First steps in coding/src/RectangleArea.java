import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        //1, две променливи ( а и b) -> конзола
        //2. изчисля лицето = a * b
        //3. отпечатвам лицето
        Scanner scanner = new Scanner (System.in);
         int a = Integer.parseInt(scanner.nextLine());
         int b = Integer.parseInt(scanner.nextLine());

         int area = a * b;
         System.out.println(area);
    }
}
