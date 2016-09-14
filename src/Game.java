import java.util.Scanner;

/**
 * Created by VeryBarry on 9/14/16.
 */
public class Game {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Wattup, yo");

        Player player = new Player();

        player.chooseName();

        player.chooseWeapon();

        player.chooseTransport();

    }
}
