import java.util.Scanner;

public class ProjectCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Време за 1 проект = 3 часа
        String name = scanner.nextLine();
        int numberOfProjects = Integer.parseInt(scanner.nextLine());
        int hours = (numberOfProjects * 3);
        System.out.println("The architect " + name + " will need " + hours + " hours to complete " + numberOfProjects + " project/s.");

    }
}
