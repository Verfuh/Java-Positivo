import java.io.Serializable;
import java.util.ArrayList;
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
            int opcao =Integer.parseInt(leitor.nextLine());
            for(int j=0;j<pokedex.size();j++){
                if((opcao-1) == j){
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

    public List<Pokemon> getPokemons() {
        return pokemons;
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
        System.out.print("POKEMONS: ");
        for(int i=0;i<pokemons.size();i++){
            System.out.print("\u001B[107m\u001B[30m" + pokemons.get(i).getNome() + " - LV" + + pokemons.get(i).getLvl() + "\u001B[0m|");

        }
    }

    void listarCombate(){
        for(int i=0;i<pokemons.size();i++){
            if(pokemons.get(i).getHp() > 0){
                System.out.println("|(" + (i+1) + ")\u001B[31m" + pokemons.get(i).getNome() + "\u001B[0m     Lv" + pokemons.get(i).getLvl() + "|");
                System.out.println("|    HP:|\u001B[42m          \u001B[0m|");
                System.out.println("|" + space + "  " + pokemons.get(i).getHp() + "/" + pokemons.get(i).getMaxHp() + "|\n");
            }
        }
    }
    void listaMoves(int atual){
        System.out.println("\n|\u001B[107m \u001B[30m" + pokemons.get(atual).getMoveName(0) + " PP: " + pokemons.get(atual).getMovePP(0) + "/" + pokemons.get(atual).getMoveMaxPP(0) + "      " + pokemons.get(atual).getMoveName(1) + " PP: " + pokemons.get(atual).getMovePP(1) + "/" + pokemons.get(atual).getMoveMaxPP(1) + "\u001B[0m|");
        System.out.println("|\u001B[107m \u001B[30m                    \u001B[0m|");
        System.out.println("|\u001B[107m \u001B[30m" + pokemons.get(atual).getMoveName(2) + " PP: " + pokemons.get(atual).getMovePP(2) + "/" + pokemons.get(atual).getMoveMaxPP(2) + "      " + pokemons.get(atual).getMoveName(3) + " PP: " + pokemons.get(atual).getMovePP(3) + "/" + pokemons.get(atual).getMoveMaxPP(3) + "\u001B[0m|");
    }

    @Override
    public void vidapokemon(int pokeatual) {
        System.out.println("\n" + space + space + space + "|\u001B[31m" + pokemons.get(pokeatual).getNome() + "\u001B[0m     Lv" + pokemons.get(pokeatual).getLvl() + "|");
        System.out.println(space + space + space + "|    HP:|\u001B[42m          \u001B[0m|");
        System.out.println(space + space + space + "|" + space + "  " + pokemons.get(pokeatual).getHp() + "/" + pokemons.get(pokeatual).getMaxHp() + "|");
    }
    
}