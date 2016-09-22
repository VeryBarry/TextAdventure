import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by VeryBarry on 9/22/16.
 */
public class GameTest {
    @Test
    public void testSaveAndLoad(){
        Player player = new Player();
        player.name = "Test Player";
        player.location = "telly";
        player.weapon = "lightsaber";
        player.items.add("Mana Potion");
        player.items.add("MOAB");
        player.items.add("Health Potion");
        Game.saveGame(player, "testSave.json");
        Player player2 = Game.loadGame("testSave.json");
        assertTrue(player.equals(player2));

    }
}
