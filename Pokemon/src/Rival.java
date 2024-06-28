import java.io.Serializable;
import java.util.ArrayList;

import java.util.List;

public class Rival extends Pokedex implements Serializable {
    
    protected String nome;
    protected int pokemonsrestantes;
    protected List<Pokemon> pokemonsRival = new ArrayList<>();
    static String space = "          ";

    Rival(String nome, int pokemonsrestantes, int dificuldade){//DIFICULDADE: |1 - FACIL |2 - MEDIANO |3 - DIFICIL
        this.nome = nome;
        this.pokemonsrestantes = pokemonsrestantes;
        switch (dificuldade) {
            case 1:
                pokemonsRival.add(pokedex.get(11));
                pokemonsRival.add(pokedex.get(13));
                pokemonsRival.add(pokedex.get(14));
                pokemonsRival.add(pokedex.get(15));
                pokemonsRival.add(pokedex.get(16));
                pokemonsRival.add(pokedex.get(17));
                break;
            case 2:
                pokemonsRival.add(pokedex.get(3));
                pokemonsRival.add(pokedex.get(4));
                pokemonsRival.add(pokedex.get(22));
                pokemonsRival.add(pokedex.get(2));
                pokemonsRival.add(pokedex.get(24));
                pokemonsRival.add(pokedex.get(2));
                break;
            case 3:
                pokemonsRival.add(pokedex.get(5));
                pokemonsRival.add(pokedex.get(9));
                pokemonsRival.add(pokedex.get(18));
                pokemonsRival.add(pokedex.get(19));
                pokemonsRival.add(pokedex.get(20));
                pokemonsRival.add(pokedex.get(21));
                break;
            default:
                System.out.println("Opção invalida!");
                break;
        }
    }



    String getNome(){
        return this.nome;
    }

    int getRestantes(){
        return this.pokemonsrestantes;
    }

    void setNome(String nome){
        this.nome = nome;
    }

    void setRestantes(int restantes){
        this.pokemonsrestantes = restantes;
    }

    public void vidapokemon(int pokeatual) {
        System.out.println("\n|\u001B[36m" + pokemonsRival.get(pokeatual).getNome() + "\u001B[0m     Lv" + pokemonsRival.get(pokeatual).getLvl() + "|");
        System.out.println("|    HP:|\u001B[42m          \u001B[0m|");
        System.out.println("|" + space + "  " + pokemonsRival.get(pokeatual).getHp() + "/" + pokemonsRival.get(pokeatual).getMaxHp() + "|");
    }
}
