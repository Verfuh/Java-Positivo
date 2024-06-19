import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Lista de ataques

        //Tipo normal
        moves tackle = new moves("Tackle", "normal", 40, 100, 35);
        moves hyperBeam = new moves("Hyper Beam", "normal", 150, 90, 5);
        moves bodySlam = new moves("Body Slam", "normal", 85, 100, 15);
        moves doubleEdge = new moves("Double-Edge", "normal", 120, 100, 15);
        moves quickAttack = new moves("Quick Attack", "normal", 40, 100, 30);

        //Tipo planta
        moves leafBlade = new moves("Leaf Blade", "grass", 90, 100, 15);
        moves razorLeaf = new moves("Razor Leaf", "grass", 55, 95, 25);
        moves solarBeam = new moves("Solar Beam", "grass", 120, 100, 10);
        moves vineWhip = new moves("Vine Whip", "grass", 45, 100, 25);
        moves energyBall = new moves("Energy Ball", "grass", 90, 100, 10);

        //Tipo agua
        moves waterGun = new moves("Water Gun", "water", 40, 100, 25);
        moves hydroPump = new moves("Hydro Pump", "water", 110, 80, 5);
        moves surf = new moves("Surf", "water", 90, 100, 15);
        moves bubbleBeam = new moves("Bubble Beam", "water", 65, 100, 20);
        moves aquaTail = new moves("Aqua Tail", "water", 90, 90, 10);

        //Tipo fogo
        moves ember = new moves("Ember", "fire", 40, 100, 25);
        moves flamethrower = new moves("Flamethrower", "fire", 90, 100, 15);
        moves fireBlast = new moves("Fire Blast", "fire", 110, 85, 5);
        moves flameWheel = new moves("Flame Wheel", "fire", 60, 100, 25);
        moves fireSpin = new moves("Fire Spin", "fire", 35, 85, 15);

        //Tipo psiquico
        moves confusion = new moves("Confusion", "psychic", 50, 100, 25);
        moves psychic = new moves("Psychic", "psychic", 90, 100, 10);
        moves psybeam = new moves("Psybeam", "psychic", 65, 100, 20);
        moves futureSight = new moves("Future Sight", "psychic", 120, 100, 10);
        moves psyshock = new moves("Psyshock", "psychic", 80, 100, 10);

        //Tipo sombrio
        moves crunch = new moves("Crunch", "dark", 80, 100, 15);
        moves darkPulse = new moves("Dark Pulse", "dark", 80, 100, 15);
        moves foulPlay = new moves("Foul Play", "dark", 95, 100, 15);
        moves nightSlash = new moves("Night Slash", "dark", 70, 100, 15);
        moves suckerPunch = new moves("Sucker Punch", "dark", 70, 100, 5);

        //Tipo gelo
        moves iceBeam = new moves("Ice Beam", "ice", 90, 100, 10);
        moves blizzard = new moves("Blizzard", "ice", 110, 70, 5);
        moves icyWind = new moves("Icy Wind", "ice", 55, 95, 15);
        moves icePunch = new moves("Ice Punch", "ice", 75, 100, 15);
        moves auroraBeam = new moves("Aurora Beam", "ice", 65, 100, 20);

        //Tipo pedra
        moves rockSlide = new moves("Rock Slide", "rock", 75, 90, 10);
        moves stoneEdge = new moves("Stone Edge", "rock", 100, 80, 5);
        moves rockThrow = new moves("Rock Throw", "rock", 50, 90, 15);
        moves powerGem = new moves("Power Gem", "rock", 80, 100, 20);
        moves ancientPower = new moves("Ancient Power", "rock", 60, 100, 5);

        //Tipo terrestre
        moves earthquake = new moves("Earthquake", "ground", 100, 100, 10);
        moves bulldoze = new moves("Bulldoze", "ground", 60, 100, 20);
        moves earthPower = new moves("Earth Power", "ground", 90, 100, 10);
        moves dig = new moves("Dig", "ground", 80, 100, 10);
        moves bonemerang = new moves("Bonemerang", "ground", 50, 90, 10);

        //Tipo dragão
        moves dragonClaw = new moves("Dragon Claw", "dragon", 80, 100, 15);
        moves dragonPulse = new moves("Dragon Pulse", "dragon", 85, 100, 10);
        moves outrage = new moves("Outrage", "dragon", 120, 100, 10);
        moves dracoMeteor = new moves("Draco Meteor", "dragon", 130, 90, 5);
        moves dragonRush = new moves("Dragon Rush", "dragon", 100, 75, 10);

        //Tipo veneno
        moves sludgeBomb = new moves("Sludge Bomb", "poison", 90, 100, 10);
        moves poisonJab = new moves("Poison Jab", "poison", 80, 100, 20);
        moves venoshock = new moves("Venoshock", "poison", 65, 100, 10);
        moves acidSpray = new moves("Acid Spray", "poison", 40, 100, 20);

        //Tipo fantasma
        moves shadowBall = new moves("Shadow Ball", "ghost", 80, 100, 15);
        moves shadowClaw = new moves("Shadow Claw", "ghost", 70, 100, 15);
        moves shadowPunch = new moves("Shadow Punch", "ghost", 60, 100, 20);
        moves hex = new moves("Hex", "ghost", 65, 100, 10);

        //Tipo fada
        moves dazzlingGleam = new moves("Dazzling Gleam", "fairy", 80, 100, 10);

        //Tipo inseto
        moves bugBuzz = new moves("Bug Buzz", "bug", 90, 100, 10);
        moves xScissor = new moves("X-Scissor", "bug", 80, 100, 15);
        moves megahorn = new moves("Megahorn", "bug", 120, 85, 10);
        moves uTurn = new moves("U-turn", "bug", 70, 100, 20);
        moves leechLife = new moves("Leech Life", "bug", 80, 100, 10);

        //Tipo aço
        moves ironHead = new moves("Iron Head", "steel", 80, 100, 15);
        moves meteorMash = new moves("Meteor Mash", "steel", 90, 90, 10);
        moves flashCannon = new moves("Flash Cannon", "steel", 80, 100, 10);
        moves steelWing = new moves("Steel Wing", "steel", 70, 90, 25);
        moves gyroBall = new moves("Gyro Ball", "steel", 0, 100, 5);

        //Tipo eletrico
        moves thunderbolt = new moves("Thunderbolt", "electric", 90, 100, 15);
        moves thunder = new moves("Thunder", "electric", 110, 70, 10);
        moves voltSwitch = new moves("Volt Switch", "electric", 70, 100, 20);
        moves thunderPunch = new moves("Thunder Punch", "electric", 75, 100, 15);
        moves discharge = new moves("Discharge", "electric", 80, 100, 15);

        //Tipo lutador
        moves closeCombat = new moves("Close Combat", "fighting", 120, 100, 5);
        moves highJumpKick = new moves("High Jump Kick", "fighting", 130, 90, 10);
        moves machPunch = new moves("Mach Punch", "fighting", 70, 100, 30);
        moves drainPunch = new moves("Drain Punch", "fighting", 75, 100, 10);
        moves focusBlast = new moves("Focus Blast", "fighting", 120, 70, 5);

        //Tipo voador
        moves braveBird = new moves("Brave Bird", "flying", 120, 100, 15);
        moves hurricane = new moves("Hurricane", "flying", 110, 70, 10);
        moves aerialAce = new moves("Aerial Ace", "flying", 60, 100, 20);
        moves airSlash = new moves("Air Slash", "flying", 75, 95, 15);

        //Lista de pokemons
        pokemon charizard = new pokemon("Charizard", 200, 60, Arrays.asList(hyperBeam, flamethrower, aerialAce, dragonClaw));
        pokemon blastoise = new pokemon("Blastoise", 230, 60, Arrays.asList(tackle, waterGun, crunch, blizzard));

        System.out.println(charizard);
        System.out.println(blastoise);

    }

}