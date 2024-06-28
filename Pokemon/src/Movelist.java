public class Movelist {
    

    //Lista de ataques

        //Tipo normal
        Moves tackle = new Moves("Tackle", "normal", 40, 100, 35);
        Moves hyperBeam = new Moves("Hyper Beam", "normal", 150, 90, 5);
        Moves bodySlam = new Moves("Body Slam", "normal", 85, 100, 15);
        Moves doubleEdge = new Moves("Double-Edge", "normal", 120, 100, 15);
        Moves quickAttack = new Moves("Quick Attack", "normal", 40, 100, 30);

        //Tipo planta
        Moves leafBlade = new Moves("Leaf Blade", "grass", 90, 100, 15);
        Moves razorLeaf = new Moves("Razor Leaf", "grass", 55, 95, 25);
        Moves solarBeam = new Moves("Solar Beam", "grass", 120, 100, 10);
        Moves vineWhip = new Moves("Vine Whip", "grass", 45, 100, 25);
        Moves energyBall = new Moves("Energy Ball", "grass", 90, 100, 10);

        //Tipo agua
        Moves waterGun = new Moves("Water Gun", "water", 40, 100, 25);
        Moves hydroPump = new Moves("Hydro Pump", "water", 110, 80, 5);
        Moves surf = new Moves("Surf", "water", 90, 100, 15);
        Moves bubbleBeam = new Moves("Bubble Beam", "water", 65, 100, 20);
        Moves aquaTail = new Moves("Aqua Tail", "water", 90, 90, 10);

        //Tipo fogo
        Moves ember = new Moves("Ember", "fire", 40, 100, 25);
        Moves flamethrower = new Moves("Flamethrower", "fire", 90, 100, 15);
        Moves fireBlast = new Moves("Fire Blast", "fire", 110, 85, 5);
        Moves flameWheel = new Moves("Flame Wheel", "fire", 60, 100, 25);
        Moves fireSpin = new Moves("Fire Spin", "fire", 35, 85, 15);

        //Tipo psiquico
        Moves confusion = new Moves("Confusion", "psychic", 50, 100, 25);
        Moves psychic = new Moves("Psychic", "psychic", 90, 100, 10);
        Moves psybeam = new Moves("Psybeam", "psychic", 65, 100, 20);
        Moves futureSight = new Moves("Future Sight", "psychic", 120, 100, 10);
        Moves psyshock = new Moves("Psyshock", "psychic", 80, 100, 10);

        //Tipo sombrio
        Moves crunch = new Moves("Crunch", "dark", 80, 100, 15);
        Moves darkPulse = new Moves("Dark Pulse", "dark", 80, 100, 15);
        Moves foulPlay = new Moves("Foul Play", "dark", 95, 100, 15);
        Moves nightSlash = new Moves("Night Slash", "dark", 70, 100, 15);
        Moves suckerPunch = new Moves("Sucker Punch", "dark", 70, 100, 5);

        //Tipo gelo
        Moves iceBeam = new Moves("Ice Beam", "ice", 90, 100, 10);
        Moves blizzard = new Moves("Blizzard", "ice", 110, 70, 5);
        Moves icyWind = new Moves("Icy Wind", "ice", 55, 95, 15);
        Moves icePunch = new Moves("Ice Punch", "ice", 75, 100, 15);
        Moves auroraBeam = new Moves("Aurora Beam", "ice", 65, 100, 20);

        //Tipo pedra
        Moves rockSlide = new Moves("Rock Slide", "rock", 75, 90, 10);
        Moves stoneEdge = new Moves("Stone Edge", "rock", 100, 80, 5);
        Moves rockThrow = new Moves("Rock Throw", "rock", 50, 90, 15);
        Moves powerGem = new Moves("Power Gem", "rock", 80, 100, 20);
        Moves ancientPower = new Moves("Ancient Power", "rock", 60, 100, 5);

        //Tipo terrestre
        Moves earthquake = new Moves("Earthquake", "ground", 100, 100, 10);
        Moves bulldoze = new Moves("Bulldoze", "ground", 60, 100, 20);
        Moves earthPower = new Moves("Earth Power", "ground", 90, 100, 10);
        Moves dig = new Moves("Dig", "ground", 80, 100, 10);
        Moves bonemerang = new Moves("Bonemerang", "ground", 50, 90, 10);

        //Tipo dragão
        Moves dragonClaw = new Moves("Dragon Claw", "dragon", 80, 100, 15);
        Moves dragonPulse = new Moves("Dragon Pulse", "dragon", 85, 100, 10);
        Moves outrage = new Moves("Outrage", "dragon", 120, 100, 10);
        Moves dracoMeteor = new Moves("Draco Meteor", "dragon", 130, 90, 5);
        Moves dragonRush = new Moves("Dragon Rush", "dragon", 100, 75, 10);

        //Tipo veneno
        Moves sludgeBomb = new Moves("Sludge Bomb", "poison", 90, 100, 10);
        Moves poisonJab = new Moves("Poison Jab", "poison", 80, 100, 20);
        Moves venoshock = new Moves("Venoshock", "poison", 65, 100, 10);
        Moves acidSpray = new Moves("Acid Spray", "poison", 40, 100, 20);

        //Tipo fantasma
        Moves shadowBall = new Moves("Shadow Ball", "ghost", 80, 100, 15);
        Moves shadowClaw = new Moves("Shadow Claw", "ghost", 70, 100, 15);
        Moves shadowPunch = new Moves("Shadow Punch", "ghost", 60, 100, 20);
        Moves hex = new Moves("Hex", "ghost", 65, 100, 10);

        //Tipo fada
        Moves dazzlingGleam = new Moves("Dazzling Gleam", "fairy", 80, 100, 10);

        //Tipo inseto
        Moves bugBuzz = new Moves("Bug Buzz", "bug", 90, 100, 10);
        Moves xScissor = new Moves("X-Scissor", "bug", 80, 100, 15);
        Moves megahorn = new Moves("Megahorn", "bug", 120, 85, 10);
        Moves uTurn = new Moves("U-turn", "bug", 70, 100, 20);
        Moves leechLife = new Moves("Leech Life", "bug", 80, 100, 10);

        //Tipo aço
        Moves ironHead = new Moves("Iron Head", "steel", 80, 100, 15);
        Moves meteorMash = new Moves("Meteor Mash", "steel", 90, 90, 10);
        Moves flashCannon = new Moves("Flash Cannon", "steel", 80, 100, 10);
        Moves steelWing = new Moves("Steel Wing", "steel", 70, 90, 25);
        Moves gyroBall = new Moves("Gyro Ball", "steel", 0, 100, 5);

        //Tipo eletrico
        Moves thunderbolt = new Moves("Thunderbolt", "electric", 90, 100, 15);
        Moves thunder = new Moves("Thunder", "electric", 110, 70, 10);
        Moves voltSwitch = new Moves("Volt Switch", "electric", 70, 100, 20);
        Moves thunderPunch = new Moves("Thunder Punch", "electric", 75, 100, 15);
        Moves discharge = new Moves("Discharge", "electric", 80, 100, 15);

        //Tipo lutador
        Moves closeCombat = new Moves("Close Combat", "fighting", 120, 100, 5);
        Moves highJumpKick = new Moves("High Jump Kick", "fighting", 130, 90, 10);
        Moves machPunch = new Moves("Mach Punch", "fighting", 70, 100, 30);
        Moves drainPunch = new Moves("Drain Punch", "fighting", 75, 100, 10);
        Moves focusBlast = new Moves("Focus Blast", "fighting", 120, 70, 5);

        //Tipo voador
        Moves braveBird = new Moves("Brave Bird", "flying", 120, 100, 15);
        Moves hurricane = new Moves("Hurricane", "flying", 110, 70, 10);
        Moves aerialAce = new Moves("Aerial Ace", "flying", 60, 100, 20);
        Moves airSlash = new Moves("Air Slash", "flying", 75, 95, 15);
}
