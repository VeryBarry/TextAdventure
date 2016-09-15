import java.util.ArrayList;

/**
 * Created by VeryBarry on 9/14/16.
 */
public class Player {
    String name;
    String weapon;
    String location;
    ArrayList<String> items = new ArrayList<>();

    void chooseName(){
        System.out.println("What's your name?");
        name = Game.scanner.nextLine();
        System.out.println("Welcome, "+ name);
    }
    void chooseWeapon() throws Exception {
        System.out.println("Do you want a lightsaber or a lasergunzz");
        weapon = Game.scanner.nextLine();
        if (weapon.equalsIgnoreCase("lightsaber")){
            System.out.println("Good choice!");
        }
        else if (weapon.equalsIgnoreCase("lasergunzz")){
            System.out.println("That's ok, be a fool.");
        }
        else {
           // throw new Exception("ERRRRR! Choose again.");
            System.out.println("ERRRRR! Choose again.");
            chooseWeapon();
        }
    }
    void chooseTransport() throws Exception {
        System.out.println("Wanna take the cruiser or a telly?");
        location = Game.scanner.nextLine();
        if (location.equalsIgnoreCase("cruiser")){
            System.out.println("Fine go the long way.");
        }
        else if (location.equalsIgnoreCase("telly")){
            System.out.println("OK, but not all good things come the fast way.");
        }
        else {
            //throw new Exception("Why you gotta be a pain?");
            System.out.println("Why you gotta be a pain?");
            chooseTransport();
        }
    }

    void findItem(String item) {
        System.out.println("You found a "+ item +"! Press y to pick up.");
        String answer = Game.scanner.nextLine();
        if (answer.equalsIgnoreCase("y")){
            items.add(item);
            System.out.println("You picked it up!");
        }
        else {
            System.out.println("So wasteful.");
        }
    }
}
