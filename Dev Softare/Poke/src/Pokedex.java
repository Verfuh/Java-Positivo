import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pokedex extends Movelist{

    List<Pokemon> pokedex = new ArrayList<>();

    Pokedex(){
        pokedex.add(new Pokemon("a", "Vivo", 200, 60, Arrays.asList(hyperBeam, flamethrower, aerialAce, dragonClaw)));
        pokedex.add(new Pokemon("Blastoise", "Vivo", 180, 50, Arrays.asList(surf, hydroPump, iceBeam, earthquake)));
        pokedex.add(new Pokemon("Gengar", "Vivo", 150, 70, Arrays.asList(psychic, shadowBall, sludgeBomb, darkPulse)));
        pokedex.add(new Pokemon("Machamp", "Vivo", 170, 80, Arrays.asList(machPunch, earthquake, bodySlam, thunderPunch)));
        pokedex.add(new Pokemon("Venusaur", "Vivo", 190, 60, Arrays.asList(leafBlade, solarBeam, sludgeBomb, earthquake)));
        pokedex.add(new Pokemon("Dragonite", "Vivo", 210, 80, Arrays.asList(dragonClaw, hyperBeam, thunderbolt, iceBeam)));
        pokedex.add(new Pokemon("Alakazam", "Vivo", 120, 90, Arrays.asList(psychic, shadowBall, focusBlast, energyBall)));
        pokedex.add(new Pokemon("Snorlax", "Vivo", 220, 70, Arrays.asList(bodySlam, earthquake, crunch, hyperBeam)));
        pokedex.add(new Pokemon("Gyarados", "Vivo", 200, 70, Arrays.asList(blizzard, hydroPump, iceBeam, earthquake)));
        pokedex.add(new Pokemon("Lucario", "Vivo", 160, 90, Arrays.asList(focusBlast, closeCombat, dragonPulse, shadowBall)));
        pokedex.add(new Pokemon("Arcanine", "Vivo", 190, 80, Arrays.asList(flamethrower, hyperBeam, crunch, fireBlast)));
        pokedex.add(new Pokemon("Jolteon", "Vivo", 110, 70, Arrays.asList(thunderbolt, shadowBall, thunder, tackle)));
        pokedex.add(new Pokemon("Lapras", "Vivo", 180, 60, Arrays.asList(surf, iceBeam, psychic, thunderbolt)));
        pokedex.add(new Pokemon("Vaporeon", "Vivo", 210, 65, Arrays.asList(surf, iceBeam, shadowBall, quickAttack)));
        pokedex.add(new Pokemon("Flareon", "Vivo", 130, 95, Arrays.asList(flamethrower, shadowBall, quickAttack, hyperBeam)));
        pokedex.add(new Pokemon("Espeon", "Vivo", 130, 70, Arrays.asList(psychic, shadowBall, quickAttack, dazzlingGleam)));
        pokedex.add(new Pokemon("Umbreon", "Vivo", 160, 65, Arrays.asList(darkPulse, psychic, shadowBall, quickAttack)));
        pokedex.add(new Pokemon("Sylveon", "Vivo", 170, 60, Arrays.asList(quickAttack, shadowBall, psyshock, dazzlingGleam)));
        pokedex.add(new Pokemon("Tyranitar", "Vivo", 200, 60, Arrays.asList(rockSlide, earthquake, crunch, hyperBeam)));
        pokedex.add(new Pokemon("Metagross", "Vivo", 180, 70, Arrays.asList(meteorMash, psychic, earthquake, thunderPunch)));
        pokedex.add(new Pokemon("Salamence", "Vivo", 190, 100, Arrays.asList(dragonClaw, airSlash, earthquake, flamethrower)));
        pokedex.add(new Pokemon("Garchomp", "Vivo", 200, 70, Arrays.asList(dragonClaw, earthquake, stoneEdge, airSlash)));
        pokedex.add(new Pokemon("Gardevoir", "Vivo", 140, 80, Arrays.asList(psychic, dazzlingGleam, shadowBall, thunderbolt)));
        pokedex.add(new Pokemon("Togekiss", "Vivo", 170, 80, Arrays.asList(airSlash, focusBlast, dazzlingGleam, flamethrower)));
        pokedex.add(new Pokemon("Infernape", "Vivo", 160, 70, Arrays.asList(flamethrower, closeCombat, thunderPunch, machPunch)));
    }

    void listarPokedex(){
        System.out.println("\nPOKEMONS: ");
        for(int i=0;i<pokedex.size();i++){
            if(i%3==2){
            System.out.print("\u001B[107m \u001B[30m#00" + (i+1) + " - " + pokedex.get(i).getNome() + "         \u001B[0m\n");
            }else{
                System.out.print("\u001B[107m \u001B[30m#00" + (i+1) + " - " + pokedex.get(i).getNome() + "\u001B[0m");
            }
        }
    }
}