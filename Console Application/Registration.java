import java.util.*;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DbFunctions db=new DbFunctions();
        db.connect_to_db("resident_info","postgres","admin123");





        int counter = 0;
        String[] resident_id = new String[50];
        String[] first_name = new String[50];
        String[] last_name = new String[50];
        String[] parents_contact = new String[50];
        String[] food_preference = new String[50];
        String[] contact = new String[50];
        String[] address = new String[50];
        String[] room_no = new String[50];




        System.out.println("===============================================================================================");
        String asciiArt = "__________              .__          __                 __  .__               \n" +
                           "\\______   \\ ____   ____ |__| _______/  |_____________ _/  |_|__| ____   ____  \n" +
                           " |       _// __ \\ / ___\\|  |/  ___/\\   __\\_  __ \\__  \\\\   __\\  |/  _ \\ /    \\ \n" +
                           " |    |   \\  ___// /_/  >  |\\___ \\  |  |  |  | \\// __ \\|  | |  (  <_> )   |  \\\n" +
                           " |____|_  /\\___  >___  /|__/____  > |__|  |__|  (____  /__| |__|\\____/|___|  /\n" +
                           "        \\/     \\/_____/         \\/                   \\/                    \\/ ";
        System.out.println(asciiArt);
        System.out.println("===============================================================================================");
        System.out.println();
        


        System.out.print("Enter your first name: ");
        first_name[counter] = scanner.nextLine();


        System.out.print("Enter your last name: ");
        last_name[counter] = scanner.nextLine();


        System.out.println("Hello, " + first_name[counter] + " " + last_name[counter] + "!");
    }
}
