import java.util.*;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;

        String[] f_name = new String[50];
        String[] l_name = new String[50];

        System.out.print("Enter your first name: ");
        f_name[counter] = scanner.nextLine();

        System.out.print("Enter your last name: ");
        l_name[counter] = scanner.nextLine();

        System.out.println("Hello, " + f_name[counter] + " " + l_name[counter] + "!");
    }
}
