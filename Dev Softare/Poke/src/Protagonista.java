import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Protagonista extends Pokedex implements Serializable {

    private static final long serialVersionUID = 1L;
    private String nome;
    private int pokemonsrestantes;
    protected List<Pokemon> pokemons = new ArrayList<>();
    static String space = "          ";
    transient Scanner leitor = new Scanner(System.in);

    Protagonista(String nome, int pokemonsrestantes){

        this.nome = nome;
        this.pokemonsrestantes = pokemonsrestantes;

        System.out.println("\n\nOlá, Treinador " + this.nome + "!\nEscolha seus Pokemons: ");
        for(int i=0;i<6;i++){
            listarPokedex();
            System.out.println("\n" + (i+1) + "° Pokemon: ");
            System.out.print("\u001B[92m>>\u001B[0m ");
            String opcao = leitor.nextLine();
            for(int j=0;j<pokedex.size();j++){
                if(opcao.toLowerCase().equals(pokedex.get(j).getNome().toLowerCase())){
                    pokemons.add(pokedex.get(j));
                    System.out.println("\nPokemon registrado!");
                    j=pokedex.size();
                }else if((j+1)==pokedex.size()){
                    System.out.println("Pokemon não registrado! Digite Novamente: ");
                    i--;
                }
            }    
        }
        System.out.println("\nEquipe Formada!");
    }

    void vidapokemon(int pokeatual){
        System.out.println("\n" + space + space + space + "|\u001B[36m" + pokemons.get(pokeatual).getNome() + "\u001B[0m     Lv" + pokemons.get(pokeatual).getLvl() + "|");
        System.out.println(space + space + space + "|    HP:|\u001B[42m          \u001B[0m|");
        System.out.println(space + space + space + "|" + space + "  " + pokemons.get(pokeatual).getHp() + "/" + pokemons.get(pokeatual).getMaxHp() + "|");
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

    void listarPokemons(){
        System.out.print("POKEMONS: \n");
        for(int i=0;i<pokemons.size();i++){
            System.out.print("\u001B[107m\u001B[30m" + pokemons.get(i).getNome() + " - LV" + + pokemons.get(i).getLvl() + "\u001B[0m|");

        }
    }
}