import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {

    List<Protagonista> Treinadores = new ArrayList<>();
    String space = "          ";
    transient Scanner leitor = new Scanner(System.in);
    boolean fim = false;
    String filename = "treinadores.dat";

    void treinadores() {
        carregarTreinadores();

        do {
            if (Treinadores.isEmpty()) {
                System.out.println("\nNenhum treinador encontrado! Registrar um?");
                System.out.print("\u001B[92m>> \u001B[0m");
                String opcao = leitor.nextLine();

                if (opcao.equalsIgnoreCase("s") || opcao.equalsIgnoreCase("sim")) {
                    System.out.println("\nQual o nome do novo Treinador?");
                    System.out.print("\u001B[92m>> \u001B[0m");
                    Protagonista protagonista = new Protagonista(leitor.nextLine(), 6);
                    Treinadores.add(protagonista);
                    System.out.println("Treinador registrado!");
                    salvarTreinadores();

                } else if (opcao.equalsIgnoreCase("n") || opcao.equalsIgnoreCase("não") || opcao.equalsIgnoreCase("nao")) {
                    fim = true;
                }
            }
            if (!Treinadores.isEmpty()) {
                System.out.println("\n[1]>> Listar\n[2]>> Registrar\n[3]>> Sair\n");
                System.out.print("\u001B[92m>> \u001B[0m");
                switch (Integer.parseInt(leitor.nextLine())) {
                    case 1:
                        System.out.println("TREINADORES: ");
                        for (Protagonista treinador : Treinadores) {
                            System.out.print("\n>>\u001B[91m" + treinador.getNome() + "\u001B[0m\n  >>");
                            treinador.listarPokemons();
                        }
                        break;
                    case 2:
                        System.out.println("Qual o nome do novo Treinador?");
                        System.out.print("\u001B[92m>> \u001B[0m");
                        Protagonista protagonista = new Protagonista(leitor.nextLine(), 6);
                        Treinadores.add(protagonista);
                        System.out.println("\nPersonagem salvo!");
                        salvarTreinadores();
                        break;
                    case 3:
                        fim = true;
                        break;
                }
                System.out.println();
            }
        } while (!fim);
    }

    void salvarTreinadores() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(Treinadores);
            System.out.println("Treinadores salvos com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao salvar os treinadores: " + e.getMessage());
        }
    }

    void carregarTreinadores() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            Treinadores = (List<Protagonista>) ois.readObject();
            System.out.println("Treinadores carregados com sucesso!");
        } catch (FileNotFoundException e) {
            System.out.println("Nenhum arquivo de treinadores encontrado. Iniciando com lista vazia.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erro ao carregar os treinadores: " + e.getMessage());
        }
    }

    /*void duelo(int dificuldade){

        Scanner leitor = new Scanner(System.in);
        int atualProta = 0;
        int pokeatualProta = 0;
        int pokeatualRival = 0;
        String escolha;

        System.out.println("Escolha o seu treinador: ");
            for(int i=0;i<Treinadores.size();i++){
            System.out.print("\n[" + (i+1) + "]>> \u001B[91m" + Treinadores.get(i).getNome() + "\u001B[0m\n" + "     >>");
            Treinadores.get(i).listarPokemons();
            }
            System.out.print("\n\u001B[92m>> \u001B[0m");
            atualProta = Integer.parseInt(leitor.nextLine())-1;
            System.out.println("\u001B[31m" + Treinadores.get(atualProta).getNome() + "\u001B[0m! Sua jornada começa agora!");

        Rival rival = new Rival("Amy", 6, dificuldade);
        System.out.println("=======================================================");
        System.out.println("\u001B[34m" + rival.getNome() + "\u001B[0m te desafia para uma batalha!");
        do{
            System.out.println("\u001B[34m" + rival.getNome() + "\u001B[0m enviou \u001B[36m" + rival.pokemonsRival.get(pokeatualRival).getNome() + "\u001B[0m!");
            System.out.println("Vai \u001B[31m" + Treinadores.get(atualProta).pokemons.get(pokeatualProta).getNome() + "\u001B[0m!");
            do{
                //vida do pokemon inimigo
                rival.vidapokemon(pokeatualRival);

                //vida do seu pokemon
                Treinadores.get(atualProta).vidapokemon(pokeatualProta);

                //menus de interações 
                System.out.println("Oque \n\u001B[31m" + Treinadores.get(atualProta).pokemons.get(pokeatualProta).getNome() + "\u001B[0m ira fazer?");
                System.out.println("|\u001B[107m \u001B[30m LUTA      MOCHILA  \u001B[0m|");
                System.out.println("|\u001B[107m \u001B[30m                    \u001B[0m|");
                System.out.println("|\u001B[107m \u001B[30m POKEMON   FUGIR    \u001B[0m|\n");
                System.out.print("\u001B[92m>> \u001B[0m");
                switch (leitor.nextLine().toLowerCase()) {
                    case "luta":
                        //menu de habilidades
                        System.out.println("\n|\u001B[107m \u001B[30m" + Treinadores.get(atualProta).pokemons.get(pokeatualProta).getMoveName(0) + "      " + Treinadores.get(atualProta).pokemons.get(pokeatualProta).getMoveName(1) + "\u001B[0m|");
                        System.out.println("|\u001B[107m \u001B[30m                    \u001B[0m|");
                        System.out.println("|\u001B[107m \u001B[30m" + Treinadores.get(atualProta).pokemons.get(pokeatualProta).getMoveName(2) + "      " + Treinadores.get(atualProta).pokemons.get(pokeatualProta).getMoveName(3) + "\u001B[0m|\n");
                        System.out.print("\u001B[92m>> \u001B[0m");
                        String opcao = leitor.nextLine();
                        for(int i=0;i<4;i++){
                            if(opcao.toLowerCase().equals(Treinadores.get(atualProta).pokemons.get(pokeatualProta).getMoveName(i).toLowerCase())){
                            System.out.println("\n\u001B[31m" + Treinadores.get(atualProta).pokemons.get(pokeatualProta).getNome() + "\u001B[0m usou " + Treinadores.get(atualProta).pokemons.get(pokeatualProta).getMoveName(i) + "!");
                            rival.pokemonsRival.get(pokeatualRival).setHp(rival.pokemonsRival.get(pokeatualRival).getHp() - Treinadores.get(atualProta).pokemons.get(pokeatualProta).getMovePower(i));
                            }
                        }
                        break;
                    case "mochila":
                            //menu mochila
                        break;
                    case "pokemon":
                    //menu troca de pokemon
                        System.out.println("\nRetorne \u001B[31m" + Treinadores.get(pokeatualProta).pokemons.get(pokeatualProta).getNome() + "\u001B[0m!\n");
                        for(int i=0;i<Treinadores.get(atualProta).pokemons.size();i++){
                            if(Treinadores.get(atualProta).pokemons.get(i).getStatus().toLowerCase().equals("vivo")){
                                System.out.println("|(" + (i+1) + ")\u001B[31m" + Treinadores.get(atualProta).pokemons.get(i).getNome() + "\u001B[0m     Lv" + Treinadores.get(atualProta).pokemons.get(i).getLvl() + "|");
                                System.out.println("|    HP:|\u001B[42m          \u001B[0m|");
                                System.out.println("|" + space + "  " + Treinadores.get(atualProta).pokemons.get(i).getHp() + "/" + Treinadores.get(atualProta).pokemons.get(i).getMaxHp() + "|\n");
                            }
                        }
                        System.out.println("Escolha o pokemon(Numero): ");
                        System.out.print("\u001B[92m>> \u001B[0m");
                        pokeatualProta = Integer.parseInt(leitor.nextLine())-1;
                        System.out.println("\nVai \u001B[31m" + Treinadores.get(atualProta).pokemons.get(pokeatualProta).getNome() + "\u001B[0m!");
                        break;
                        case "fugir":
                        System.out.println("\n\u001B[91mNÃO TEM COMO FUGIR!\u001B[0m\n");
                        break;
                        default:
                        System.out.println("Escolha invalida! Tente Novamente!");
                        break;
                    }
                
            }while(rival.pokemonsRival.get(pokeatualRival).getHp() > 0 && Treinadores.get(atualProta).pokemons.get(pokeatualProta).getHp() > 0);
            
            if(Treinadores.get(atualProta).pokemons.get(pokeatualProta).getHp() == 0){
                //mudando o status do pokemon que acabou de perde
                Treinadores.get(atualProta).setRestantes(Treinadores.get(atualProta).getRestantes()-1);
                System.out.println("\u001B[36m" + Treinadores.get(atualProta).pokemons.get(pokeatualProta).getNome() + "\u001B[0m desmaiou");
                Treinadores.get(atualProta).pokemons.get(pokeatualProta).setStatus("Desmaiado");
                
                //se o protagonista ainda tive pokemons disponivel, escolhe o proximo
                if(Treinadores.get(atualProta).getRestantes() > 0){
                    System.out.println("Escolha seu proximo Pokemon:");
                    for(int i=0;i<6;i++){
                        if(Treinadores.get(atualProta).pokemons.get(i).getStatus().toLowerCase().equals("vivo")){
                            System.out.println("|(" + i+1 + ")" + Treinadores.get(atualProta).pokemons.get(i).getNome() + "     Lv" + Treinadores.get(atualProta).pokemons.get(i).getLvl() + "|");
                            System.out.println("|    HP:|\u001B[42m          \u001B[0m|");
                            System.out.println("|" + space + "  " + Treinadores.get(atualProta).pokemons.get(i).getHp() + "/" + Treinadores.get(atualProta).pokemons.get(i).getMaxHp() + "|/n");
                        }
                    }
                }
                System.out.println("Escolha o pokemon(Numero): ");
                System.out.print("\u001B[92m>> \u001B[0m");
                pokeatualProta = Integer.parseInt(leitor.nextLine())-1;
                System.out.println("\nVai " + Treinadores.get(atualProta).pokemons.get(pokeatualProta).getNome() + "!");
                
            }
            //colocando o proximo pokemon do rival
            if(rival.pokemonsRival.get(0).getHp() == 0){
                rival.setRestantes(rival.getRestantes()-1);
                System.out.println("\u001B[36m" + rival.pokemonsRival.get(pokeatualRival).getNome() + "\u001B[0m desmaiou! Pokemons restantes: " + rival.getRestantes());
                rival.pokemonsRival.get(pokeatualRival).setStatus("Desmaiado");
                pokeatualRival++;

                //opcao de troca seu pokemon apos a troca do rival
                if(rival.getRestantes() > 0){
                    System.out.println("\u001B[34m" + rival.getNome() + "\u001B[0m ira manda \u001B[36m" + rival.pokemonsRival.get(pokeatualRival).getNome() + "\u001B[0m!");
                    System.out.println("\nDeseja troca seu pokemon?(S/N)");
                    System.out.print("\u001B[92m>> \u001B[0m");
                    escolha = leitor.nextLine();
                    if(escolha.toLowerCase().equals("s") || escolha.toLowerCase().equals("sim")){
                        for(int i=0;i<Treinadores.get(atualProta).pokemons.size();i++){
                            if(Treinadores.get(atualProta).pokemons.get(i).getStatus().toLowerCase().equals("vivo")){
                                System.out.println("|[" + (i+1) + "]\u001B[94m" + Treinadores.get(atualProta).pokemons.get(i).getNome() + "\u001B[0m     Lv" + Treinadores.get(atualProta).pokemons.get(i).getLvl() + "|");
                                System.out.println("|    HP:|\u001B[42m          \u001B[0m|");
                                System.out.println("|" + space + "  " + Treinadores.get(atualProta).pokemons.get(i).getHp() + "/" + Treinadores.get(atualProta).pokemons.get(i).getMaxHp() + "|/n");
                            }
                        }
                        System.out.println("Escolha o pokemon(Numero): ");
                        System.out.print("\u001B[92m>> \u001B[0m");
                        pokeatualProta = Integer.parseInt(leitor.nextLine())-1;
                        System.out.println("\nRetorne \u001B[36m" + Treinadores.get(atualProta).pokemons.get(pokeatualProta).getNome() + "\u001B[0m!\n");
                    }
                }
            }
        }while(rival.getRestantes() > 1 && Treinadores.get(atualProta).getRestantes() > 1);
        if(Treinadores.get(atualProta).getRestantes() == 0){
            System.out.println("\n\u001B[91m" + rival.getNome() + " VENCEU A BATALHA!\u001B[0m\n");
        }
        if(rival.getRestantes() == 0){
            System.out.println("\n\u001B[91m" + Treinadores.get(atualProta).getNome() + "VENCEU A BATALHA!\u001B[0m\n");
        }
    }*/
}
