import java.util.Scanner;

/**
 * Created by VeryBarry on 9/14/16.
 */
public class Game {
    static Scanner scanner = new Scanner(System.in);
    static Player player = new Player();

    public static void main(String[] args) throws Exception {
        System.out.println("Wattup, yo");

        boolean keepRunning = true;

        player.chooseName();
        player.chooseWeapon();
        player.chooseTransport();

        Enemy ogre = new Enemy("ogre", 10, 10);

        player.battle(ogre);

        while (keepRunning) {



            player.findItem("shield");
            player.findItem("potion");

            System.out.println("You're on your way.");
            System.out.println("Wanna try again? Yes or No");
            String answer = customLine();
            if (answer.equalsIgnoreCase("No")){
                keepRunning = false;
            }

        }
        System.out.println("You died.");
    }

    static String customLine(){
        String line = scanner.nextLine();
       // if (line.charAt(0) == '/');
        if (line.startsWith("/")){
            switch (line) {
                case "/exit":
                    System.exit(0);
                    break;
                case "/inv":
                    for (String item : player.items) {
                        System.out.println(item);
                    }
                    if (player.items.isEmpty()) {
                        System.out.println("You don't have anything yet.");
                    }
                    break;
                default:
                    System.out.println("Uh uh uh, that's not the magic word.");
            }
            line = scanner.nextLine();
        }
        return line;
    }

}