import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by VeryBarry on 9/22/16.
 */
public class CharacterTest {
    @Test
    public void testBattle(){
        Player player = new Player();
        player.name = "Test Player";
        player.location = "telly";
        player.weapon = "lightsaber";
        Enemy enemy = new Enemy("Test Enemy", 10, 10);
        player.battle(enemy);
        assertTrue(player.health > 0);
        assertTrue(enemy.health <=0);
    }
}