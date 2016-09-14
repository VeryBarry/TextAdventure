import java.util.Scanner;

/**
 * Created by VeryBarry on 9/14/16.
 */
public class Game {
    public static void main(String[] args) throws Exception {
        System.out.println("Wattup, yo");
        System.out.println("What's your name?");
        Scanner scanner = new Scanner(System.in);
        //taking an input and saving it as a variable
        String name = scanner.nextLine();
        System.out.println("Welcome, "+ name);
        System.out.println("Do you want a lightsaber or a lasergunzz");
        String weapon = scanner.nextLine();
        if (weapon.equalsIgnoreCase("lightsaber")){
            System.out.println("Good choice!");
        }
        else if (weapon.equalsIgnoreCase("lasergunzz")){
            System.out.println("That's ok, be a fool.");
        }
        else {
            throw new Exception("ERRRRR! Choose again.");
        }
        System.out.println("Wanna take the cruiser or a telly?");
        String location = scanner.nextLine();
        if (location.equalsIgnoreCase("cruiser")){
            System.out.println("Fine go the long way.");
        }
        else if (location.equalsIgnoreCase("telly")){
            System.out.println("OK, but not all good things come the fast way.");
        }
        else {
            throw new Exception("Why you gotta be a pain?");
        }

    }
}
