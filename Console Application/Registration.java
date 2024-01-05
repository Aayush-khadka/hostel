import java.util.*; // Importing all Including Scanner 

public class Registration { // public class created 
    public static void main(String[] args) { // This is main method 
        Scanner scanner = new Scanner(System.in);
        int counter = 0;

        String[] f_name = new String[50];
        String[] l_name = new String[50];

        System.out.print("Enter your first name: "); // This is the first name input taken from user
        f_name[counter] = scanner.nextLine();

        System.out.print("Enter your last name: ");  // This is the last name input taken from user 
        l_name[counter] = scanner.nextLine();

        System.out.println("Hello, " + f_name[counter] + " " + l_name[counter] + "!"); // This shows combination and provides your full name 
        
    }
}
