import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.rmi.server.ExportException;
import java.util.Scanner;

import static com.sun.deploy.util.SessionState.save;

/**
 * Created by VeryBarry on 9/14/16.
 */
public class Game {
    static Scanner scanner = new Scanner(System.in);
    static Player player = new Player();
    static final String FILE_NAME = "SaveGame.json";

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
                case "/save":
                    saveGame();
                    break;
                case "/load":
                    loadGame();
                    break;
                default:
                    System.out.println("Uh uh uh, that's not the magic word.");
            }
            line = scanner.nextLine();
        }
        return line;
    }

    static void saveGame()  {
        JsonSerializer serializer = new JsonSerializer();
        String json = serializer.deep(true).serialize(player);
        File f = new File("SaveGame.json");
        try {
            FileWriter fw = new FileWriter(f);
            fw.write(json);
            fw.close();
        }catch (Exception e) {
            System.out.println("Couldn't save to file!");
        }
    }

    static void loadGame() {
        File f = new File(FILE_NAME);
        try{
            FileReader fr = new FileReader(f);
            int fileSize = (int) f.length();
            char[] contents = new char[fileSize];
            fr.read(contents, 0, fileSize);
            JsonParser parser = new JsonParser();
            player = parser.parse(contents, Player.class);
        } catch (Exception e) {
            System.out.println("Couldn't load file!");
        }
    }
}