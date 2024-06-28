
public class Efetividade {

    private String movetype;
    private String poketype;
    private float multiplicador;

    float efetividade(String moveType, String poketype){
        
        this.movetype = moveType;
        this.poketype = poketype;
        switch (movetype) {
            case "normal":
                switch (poketype) {
                    case "rock":
                        this.multiplicador = 0.5f;
                        break;
                    case "ghost":
                        this.multiplicador = 0;
                        break;
                    case "steel":
                        this.multiplicador = 0.5f;
                        break;
                }
                break;
            case "fire":
                switch (poketype) {
                    case "fire":
                        this.multiplicador = 0.5f;
                        break;
                    case "water":
                        this.multiplicador = 0.5f;
                        break;
                    case "grass":
                        this.multiplicador = 2f;
                        break;
                    case "ice":
                        this.multiplicador = 2f;
                        break;
                    case "bug":
                        this.multiplicador = 2f;
                        break;
                    case "rock":
                        this.multiplicador = 0.5f;
                        break;
                    case "dragon":
                        this.multiplicador = 0.5f;
                        break;
                    case "steel":
                        this.multiplicador = 2f;
                        break;
                }
                break;
            case "water":
                switch (poketype) {
                    case "fire":
                        this.multiplicador = 2f;
                        break;
                    case "water":
                        this.multiplicador = 0.5f;
                        break;
                    case "grass":
                        this.multiplicador = 0.5f;
                        break;
                    case "ground":
                        this.multiplicador = 2f;
                        break;
                    case "rock":
                        this.multiplicador = 2f;
                        break;
                    case "dragon":
                        this.multiplicador = 0.5f;
                        break;
                }
                break;
            case "eletric":
                switch (poketype) {
                    case "water":
                        this.multiplicador = 2f;
                        break;

                    case "eletric":
                        this.multiplicador = 0.5f;
                        break;

                    case "grass":
                        this.multiplicador = 0.5f;
                        break;

                    case "ground":
                        this.multiplicador = 0f;
                        break;

                    case "flying":
                        this.multiplicador = 2f;
                        break;

                    case "dragon":
                        this.multiplicador = 0.5f;
                        break;
                }
                break;
            case "grass":
                switch (poketype) {
                    case "fire":
                        this.multiplicador = 0.5f;
                        break;
                    case "water":
                        this.multiplicador = 2f;
                        break;
                    case "grass":
                        this.multiplicador = 0.5f;
                        break;
                    case "poison":
                        this.multiplicador = 0.5f;
                        break;
                    case "ground":
                        this.multiplicador = 2f;
                        break;
                    case "flying":
                        this.multiplicador = 0.5f;
                        break;
                    case "bug":
                        this.multiplicador = 0.5f;
                        break;
                    case "rock":
                        this.multiplicador = 2f;
                        break;
                    case "dragon":
                        this.multiplicador = 0.5f;
                        break;
                    case "steel":
                        this.multiplicador = 0.5f;
                        break;
                }
                break;
            case "ice":
                switch (poketype) {
                    case "fire":
                        this.multiplicador = 0.5f;
                        break;
                    case "water":
                        this.multiplicador = 0.5f;
                        break;
                    case "grass":
                        this.multiplicador = 2f;
                        break;
                    case "ice":
                        this.multiplicador = 0.5f;
                        break;
                    case "ground":
                        this.multiplicador = 2f;
                        break;
                    case "flyng":
                        this.multiplicador = 2f;
                        break;
                    case "dragon":
                        this.multiplicador = 2f;
                        break;
                    case "steel":
                        this.multiplicador = 0.5f;
                        break;
                }
                break;
            case "fighting":
                switch (poketype) {
                    case "normal":
                        this.multiplicador = 2f;
                        break;
                    case "ice":
                        this.multiplicador = 2f;
                        break;
                    case "poison":
                        this.multiplicador = 0.5f;
                        break;
                    case "flying":
                        this.multiplicador = 0.5f;
                        break;
                    case "psychic":
                        this.multiplicador = 0.5f;
                        break;
                    case "bug":
                        this.multiplicador = 0.5f;
                        break;
                    case "rock":
                        this.multiplicador = 2f;
                        break;
                    case "ghost":
                        this.multiplicador = 0f;
                        break;
                    case "dark":
                        this.multiplicador = 2f;
                        break;
                    case "steel":
                        this.multiplicador = 2f;
                        break;
                    case "fairy":
                        this.multiplicador = 0.5f;
                        break;
                }
                break;
            case "poison":
                switch (poketype) {
                    case "grass":
                        this.multiplicador = 2f;
                        break;
                    case "poison":
                        this.multiplicador = 0.5f;
                        break;
                    case "ground":
                        this.multiplicador = 0.5f;
                        break;
                    case "rock":
                        this.multiplicador = 0.5f;
                        break;
                    case "ghost":
                        this.multiplicador = 0.5f;
                        break;
                    case "steel":
                        this.multiplicador = 0f;
                        break;
                    case "fairy":
                        this.multiplicador = 2f;
                        break;
                }
                break;
            case "ground":
                switch (poketype) {
                    case "fire":
                        this.multiplicador = 2f;
                        break;
                    case "eletric":
                        this.multiplicador = 2f;
                        break;
                    case "grass":
                        this.multiplicador = 0.5f;
                        break;
                    case "poison":
                        this.multiplicador = 2f;
                        break;
                    case "flying":
                        this.multiplicador = 0f;
                        break;
                    case "bug":
                        this.multiplicador = 0.5f;
                        break;
                    case "rock":
                        this.multiplicador = 2f;
                        break;
                    case "steel":
                        this.multiplicador = 2f;
                        break;
                }
                break;
            case "flying":
                switch (poketype) {
                    case "eletric":
                        this.multiplicador = 0.5f;
                        break;
                    case "grass":
                        this.multiplicador = 2f;
                        break;
                    case "fighthing":
                        this.multiplicador = 2f;
                        break;
                    case "bug":
                        this.multiplicador = 2f;
                        break;
                    case "rock":
                        this.multiplicador = 0.5f;
                        break;
                    case "steel":
                        this.multiplicador = 0.5f;
                        break;
                }
                break;
            case "psychic":
                switch (poketype) {
                    case "fighthing":
                        this.multiplicador = 2f;
                        break;
                    case "poison":
                        this.multiplicador = 2f;
                        break;
                    case "psychic":
                        this.multiplicador = 0.5f;
                        break;
                    case "dark":
                        this.multiplicador = 0f;
                        break;
                    case "steel":
                        this.multiplicador = 0.5f;
                        break;
                }
                break;
            case "bug":
                switch (poketype) {
                    case "fire":
                        this.multiplicador = 0.5f;
                        break;
                    case "grass":
                        this.multiplicador = 2f;
                        break;
                    case "fighthing":
                        this.multiplicador = 0.5f;
                        break;
                    case "poison":
                        this.multiplicador = 0.5f;
                        break;
                    case "flying":
                        this.multiplicador = 0.5f;
                        break;
                    case "psychic":
                        this.multiplicador = 2f;
                        break;
                    case "ghost":
                        this.multiplicador = 0.5f;
                        break;
                    case "dark":
                        this.multiplicador = 2f;
                        break;
                    case "steel":
                        this.multiplicador = 0.5f;
                        break;
                    case "fairy":
                        this.multiplicador = 0.5f;
                        break;
                }
                break;
            case "rock":
                switch (poketype) {
                    case "fire":
                        this.multiplicador = 2f;
                        break;
                    case "ice":
                        this.multiplicador = 2f;
                        break;
                    case "fighthing":
                        this.multiplicador = 0.5f;
                        break;
                    case "ground":
                        this.multiplicador = 0.5f;
                        break;
                    case "flying":
                        this.multiplicador = 2f;
                        break;
                    case "bug":
                        this.multiplicador = 2f;
                        break;
                    case "steel":
                        this.multiplicador = 0.5f;
                        break;
                }
                break;
            case "ghost":
                switch (poketype) {
                    case "normal":
                        this.multiplicador = 0f;
                        break;
                    case "psychic":
                        this.multiplicador = 2f;
                        break;
                    case "ghost":
                        this.multiplicador = 2f;
                        break;
                    case "dark":
                        this.multiplicador = 0.5f;
                        break;
                }
                break;
            case "dragon":
                switch (poketype) {
                    case "dragon":
                        this.multiplicador = 2f;
                        break;
                    case "steel":
                        this.multiplicador = 0.5f;
                        break;
                    case "fairy":
                        this.multiplicador = 0f;
                        break;
                }
                break;
            case "dark":
                switch (poketype) {
                    case "fighting":
                        this.multiplicador = 0.5f;
                        break;
                    case "psychic":
                        this.multiplicador = 2f;
                        break;
                    case "ghost":
                        this.multiplicador = 2f;
                        break;
                    case "dark":
                        this.multiplicador = 0.5f;
                        break;
                    case "fairy":
                        this.multiplicador = 0.5f;
                        break;
                }
                break;
            case "steel":
                switch (poketype) {
                    case "fire":
                        this.multiplicador = 0.5f;
                        break;
                    case "water":
                        this.multiplicador = 0.5f;
                        break;
                    case "eletric":
                        this.multiplicador = 0.5f;
                        break;
                    case "ice":
                        this.multiplicador = 2f;
                        break;
                    case "rock":
                        this.multiplicador = 2f;
                        break;
                    case "steel":
                        this.multiplicador = 0.5f;
                        break;
                    case "fairy":
                        this.multiplicador = 2f;
                        break;
                }
                break;
            case "fairy":
                switch (poketype) {
                    case "fire":
                        this.multiplicador = 0.5f;
                        break;
                    case "fighting":
                        this.multiplicador = 2f;
                        break;
                    case "poison":
                        this.multiplicador = 0.5f;
                        break;
                    case "dragon":
                        this.multiplicador = 2f;
                        break;
                    case "dark":
                        this.multiplicador = 2f;
                        break;
                    case "steel":
                        this.multiplicador = 0.5f;
                        break;
                }
                break;

        }
        return this.multiplicador;
    }
}
