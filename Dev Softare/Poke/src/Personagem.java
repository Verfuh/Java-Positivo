import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Personagem extends Pokedex implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome;
    private int dificuldade;
    private int pokemonsrestantes;
    protected List<Pokemon> pokemons = new ArrayList<>();
    protected List<Pokemon> pokemonsRival = new ArrayList<>();

    Personagem(){

        String arquivo = "personagem.ser";

        Scanner leitor = new Scanner(System.in);

        String nome;
        System.out.println("Qual o nome do Novo personagem?");
        nome = leitor.nextLine();

        this.nome = nome;
        this.pokemonsrestantes = 6;



        listarPokedex();
        System.out.println("\nOlá, Treinador " + this.nome + "!\nEscolha seus pokemons: ");
        for(int i=0;i<6;i++){
            System.out.println((i+1) + "* pokemon: ");
            String opcao = leitor.nextLine();
            for(int j=0;j<pokedex.size();j++){
                if(opcao.toLowerCase().equals(pokedex.get(j).getNome().toLowerCase())){
                    pokemons.add(pokedex.get(j));
                    System.out.println("Pokemon registrado!");
                    j=pokedex.size();
                }else if((j+1)==pokedex.size()){
                    System.out.println("Pokemon não registrado! Digite Novamente: ");
                    i--;
                }
            }
        }
        System.out.println("Equipe Formada!");
    }


    Personagem(String nome, int pokemonsrestantes, int dificuldade){//DIFICULDADE: |1 - FACIL |2 - MEDIANO |3 - DIFICIL
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

}