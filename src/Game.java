import java.util.Scanner;

/**
 * Created by VeryBarry on 9/14/16.
 */
public class Game {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Wattup, yo");

        boolean keepRunning = true;

        while (keepRunning) {

            Player player = new Player();

            player.chooseName();
            player.chooseWeapon();
            player.chooseTransport();

            System.out.println("You're on your way.");
            System.out.println("Wanna choose again? Yes or No");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("No")){
                keepRunning = false;
            }

        }
        System.out.println("You died.");
    }
}