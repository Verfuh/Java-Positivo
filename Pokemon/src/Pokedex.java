
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Pokedex extends Movelist{

    List<Pokemon> pokedex = new ArrayList<>();

    Pokedex(){
        pokedex.add(new Pokemon("Charizard",  200, 60, Arrays.asList("fire", "flying"), Arrays.asList(hyperBeam, flamethrower, aerialAce, dragonClaw)));
        pokedex.add(new Pokemon("Blastoise", 180, 50, Arrays.asList("water"), Arrays.asList(surf, hydroPump, iceBeam, earthquake)));
        pokedex.add(new Pokemon("Gengar", 150, 70, Arrays.asList("ghost", "poison"), Arrays.asList(psychic, shadowBall, sludgeBomb, darkPulse)));
        pokedex.add(new Pokemon("Machamp", 170, 80, Arrays.asList("fighting"), Arrays.asList(machPunch, earthquake, bodySlam, thunderPunch)));
        pokedex.add(new Pokemon("Venusaur",190, 60, Arrays.asList("grass", "poison"), Arrays.asList(leafBlade, solarBeam, sludgeBomb, earthquake)));
        pokedex.add(new Pokemon("Dragonite", 210, 80, Arrays.asList("dragon", "flying"), Arrays.asList(dragonClaw, hyperBeam, thunderbolt, iceBeam)));
        pokedex.add(new Pokemon("Alakazam", 120, 90, Arrays.asList("psychic"),  Arrays.asList(psychic, shadowBall, focusBlast, energyBall)));
        pokedex.add(new Pokemon("Snorlax", 220, 70, Arrays.asList("normal"), Arrays.asList(bodySlam, earthquake, crunch, hyperBeam)));
        pokedex.add(new Pokemon("Gyarados", 200, 70, Arrays.asList("water", "flying"), Arrays.asList(blizzard, hydroPump, iceBeam, earthquake)));
        pokedex.add(new Pokemon("Lucario", 160, 90, Arrays.asList("fighting", "steel"), Arrays.asList(focusBlast, closeCombat, dragonPulse, shadowBall)));
        pokedex.add(new Pokemon("Arcanine", 190, 70, Arrays.asList("fire"), Arrays.asList(thunderbolt, shadowBall, thunder, tackle)));
        pokedex.add(new Pokemon("Lapras", 180, 60, Arrays.asList("water", "ice"), Arrays.asList(surf, iceBeam, psychic, thunderbolt)));
        pokedex.add(new Pokemon("Vaporeon", 210, 65, Arrays.asList("water"), Arrays.asList(surf, iceBeam, shadowBall, quickAttack)));
        pokedex.add(new Pokemon("Flareon", 130, 95, Arrays.asList("fire"), Arrays.asList(flamethrower, shadowBall, quickAttack, hyperBeam)));
        pokedex.add(new Pokemon("Espeon", 130, 70, Arrays.asList("psychic"), Arrays.asList(psychic, shadowBall, quickAttack, dazzlingGleam)));
        pokedex.add(new Pokemon("Umbreon", 160, 65, Arrays.asList("dark"), Arrays.asList(darkPulse, psychic, shadowBall, quickAttack)));
        pokedex.add(new Pokemon("Sylveon", 170, 60, Arrays.asList("fairy"), Arrays.asList(quickAttack, shadowBall, psyshock, dazzlingGleam)));
        pokedex.add(new Pokemon("Tyranitar", 200, 60, Arrays.asList("rock", "dark"), Arrays.asList(rockSlide, earthquake, crunch, hyperBeam)));
        pokedex.add(new Pokemon("Metagross", 180, 70, Arrays.asList("steel", "psychic"), Arrays.asList(meteorMash, psychic, earthquake, thunderPunch)));
        pokedex.add(new Pokemon("Salamence", 190, 100, Arrays.asList("dragon", "flying"), Arrays.asList(dragonClaw, airSlash, earthquake, flamethrower)));
        pokedex.add(new Pokemon("Garchomp", 200, 70, Arrays.asList("dragon", "ground"), Arrays.asList(dragonClaw, earthquake, stoneEdge, airSlash)));
        pokedex.add(new Pokemon("Gardevoir", 140, 80, Arrays.asList("psychic", "fairy"), Arrays.asList(psychic, dazzlingGleam, shadowBall, thunderbolt)));
        pokedex.add(new Pokemon("Togekiss", 170, 80, Arrays.asList("fairy", "flying"), Arrays.asList(airSlash, focusBlast, dazzlingGleam, flamethrower)));
        pokedex.add(new Pokemon("Infernape", 160, 70, Arrays.asList("fire", "fighting"), Arrays.asList(flamethrower, closeCombat, thunderPunch, machPunch)));
    }

    void listarPokedex(){
        System.out.println("\nPOKEMONS: ");
        for(int i=0;i<pokedex.size();i++){
            if(i%3==2){
            System.out.print("\u001B[107m \u001B[30m|[" + (i+1) + "] - " + pokedex.get(i).getNome() + "         \u001B[0m\n");
            }else{
                System.out.print("\u001B[107m \u001B[30m|[" + (i+1) + "] - " + pokedex.get(i).getNome() + "\u001B[0m");
            }
        }
    }

    public abstract void vidapokemon(int pokeatual);
}