import java.util.ArrayList;

/**
 * Created by VeryBarry on 9/14/16.
 */
public class Player extends Character{

    String weapon;
    String location;

    ArrayList<String> items = new ArrayList<>();

    public Player(){
        this.health = 100;
        this.damage = 20;
    }

    void chooseName(){
        System.out.println("What's your name?");
        name = Game.customLine();
        System.out.printf("Welcome, %s\n", name);

    }
    void chooseWeapon() throws Exception {
        System.out.println("Do you want a lightsaber or a lasergunzz");
        weapon = Game.customLine();
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
        location = Game.customLine();
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
        System.out.printf("You found a %s! Press y to pick it up.", item);
        String answer = Game.customLine();
        if (answer.equalsIgnoreCase("y")){
            items.add(item);
            System.out.printf("You picked %s up!", item);
        }
        else {
            System.out.println("So wasteful.");
        }
    }

    public String getWeapon() {
        return weapon;
    }

    public String getLocation() {
        return location;
    }

    public ArrayList<String> getItems() {
        return items;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Player player = (Player) o;

        if (weapon != null ? !weapon.equals(player.weapon) : player.weapon != null) return false;
        if (location != null ? !location.equals(player.location) : player.location != null) return false;
        return items != null ? items.equals(player.items) : player.items == null;

    }

    @Override
    public int hashCode() {
        int result = weapon != null ? weapon.hashCode() : 0;
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (items != null ? items.hashCode() : 0);
        return result;
    }
}
