import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\033[H\033[2J");

      String asciiArt =
                ".____                 .__        \n" +
                "|    |    ____   ____ |__| ____  \n" +
                "|    |   /  _ \\ / ___\\|  |/    \\ \n" +
                "|    |__(  <_> ) /_/  >  |   |  \\\n" +
                "|_______ \\____/\\___  /|__|___|  /\n" +
                "              /_____/         \\/ ";
        
            

        System.out.println("==============================================================================");
        System.out.println(asciiArt);
        System.out.println("==============================================================================");

        System.out.print("Password: ");
        String password = scanner.nextLine();

        if (password.equals("admin")) {
            System.out.print("\033[H\033[2J");
            Dashboard dash = new Dashboard();
            dash.main(null); 
        } else {
            System.out.println("Access Denied");
        }

        scanner.close();
    }
}
