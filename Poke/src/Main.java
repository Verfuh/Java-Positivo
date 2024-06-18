import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        moves tackle = new moves("Tackle", "normal", 40, 100, 35);
        moves hyperBeam = new moves("Hyper Beam", "normal", 150, 150, 5);
        moves flamethrower = new moves("Flamethrower", "fire", 90, 90, 15)

        pokemon charizard = new pokemon(160, 160, 60);

        charizard.adicionarAtaque(hyperBeam);


    }
}