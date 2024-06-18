import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        moves tackle = new moves("Tackle","normal",40,100,35);
        moves hyperBeam = new moves("Hyper Beam","normal",150,150,5);
        moves flamethrower = new moves("Flamethrower","fogo", 90,90,15);
        moves fly = new moves("Fly","voador",90,90,15);
        moves dragonBreath = new moves("Dragon Breath","Dragao",60,100,20);

        pokemon zard = new pokemon("Charizard", 200, 60, Arrays.asList(hyperBeam, flamethrower, fly, dragonBreath));
        pokemon toise = new pokemon("Blastoise", 230, 60, Arrays.asList(hyperBeam, flamethrower, fly, dragonBreath));

        System.out.println(zard);
        System.out.println(toise);

    }
}