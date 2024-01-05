import java.util.*;
public class Dashboard {
    
    public static void main(String[] args) 
    {
        System.out.print("\033[H\033[2J");
        
        
        String art = "=============================================================================\n" +
            " ________                .__   ___.                          .___           \n" +
            " \\______ \\ _____    _____|  |__\\_ |__   _________ _______  __| _/           \n" +
            " |    |  \\__  \\  /  ___/  |  \\| __ \\ /  _ \\__  \\\\__  __ \\/ __ |            \n" +
            " |    `   \\/ __ \\_\\___ \\|   Y  \\   \\_\\ (  <_> ) __ \\|  | \\/ /_/ |            \n" +
            " _______  (____  /____  >___|  /___  / \\____(____  /__|  \\____ |            \n" +
            "        \\/     \\/     \\/     \\/    \\/           \\/           \\/            \n" +
            "=============================================================================";

        System.out.println(art);

         
        System.out.println("1.Register a Resident");
        System.out.println("2.View Register Information");
        System.out.println("3.Update Resident Information");
        System.out.println("4.Delete Resident Information");
        System.out.println("5.Room Occupance Checker");
        System.out.println("6.Fee Management ");
        System.out.println();
        System.out.println("Press the Related Key to Continue or Press \"X\" to Exit: " );



         }
}
        
    
    
