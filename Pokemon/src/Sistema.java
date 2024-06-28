import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Sistema extends Efetividade{

    List<Protagonista> Treinadores = new ArrayList<>();
    String space = "          ";
    transient Scanner leitor = new Scanner(System.in);
    boolean fim = false;
    Random aleat = new Random();
    int precisao;
    Efetividade calculador = new Efetividade();
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
                System.out.println("\n[1]>> Listar\n[2]>> Registrar\n[3]>> Apagar\n[4]>> Sair");
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
                        apagarTreinador();
                        break;
                    case 4:
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

    void apagarTreinador() {
        if (Treinadores.isEmpty()) {
            System.out.println("\nNenhum treinador encontrado para apagar!");
            return;
        }

        System.out.println("TREINADORES: ");
        for (int i = 0; i < Treinadores.size(); i++) {
            System.out.println("[" + (i + 1) + "] " + Treinadores.get(i).getNome());
        }

        System.out.println("\nQual treinador deseja apagar? (Digite o número correspondente)");
        System.out.print("\u001B[92m>> \u001B[0m");
        int index = Integer.parseInt(leitor.nextLine()) - 1;

        if (index >= 0 && index < Treinadores.size()) {
            System.out.println("Tem certeza que deseja apagar o treinador " + Treinadores.get(index).getNome() + "? (s/n)");
            System.out.print("\u001B[92m>> \u001B[0m");
            String confirmacao = leitor.nextLine();

            if (confirmacao.equalsIgnoreCase("s") || confirmacao.equalsIgnoreCase("sim")) {
                Treinadores.remove(index);
                System.out.println("Treinador apagado com sucesso!");
                salvarTreinadores();
            } else {
                System.out.println("Operação cancelada.");
            }
        } else {
            System.out.println("Opção inválida.");
        }
    }

    void duelo(int dificuldade){

        Scanner leitor = new Scanner(System.in);
        int atualProta = 0;
        int pokeatualProta = 0;
        int pokeatualRival = 0;
        String escolha;
        fim = false;

        carregarTreinadores();

        if(Treinadores.isEmpty()){
            System.out.println("\nNenhum treinador encontrado! Registre um novo!");
            System.out.println("\nQual o nome do novo Treinador?");
            System.out.print("\u001B[92m>> \u001B[0m");
            Protagonista protagonista = new Protagonista(leitor.nextLine(), 6);
            Treinadores.add(protagonista);
            System.out.println("Treinador registrado!");
        }else{
            System.out.println("Escolha o seu treinador: ");
            for(int i=0;i<Treinadores.size();i++){
                System.out.print("\n[" + (i+1) + "]>> \u001B[91m" + Treinadores.get(i).getNome() + "\u001B[0m\n" + "     >>");
                Treinadores.get(i).listarPokemons();
            }

            System.out.print("\n\u001B[92m>> \u001B[0m");
            atualProta = Integer.parseInt(leitor.nextLine())-1;
            System.out.println("\u001B[31m" + Treinadores.get(atualProta).getNome() + "\u001B[0m! sua jornada começa agora!");
        }

        Rival rival = new Rival("Amy", 6, dificuldade);
        System.out.println("=======================================================");
        System.out.println("\u001B[34m" + rival.getNome() + "\u001B[0m te desadia para um duelo!");
        System.out.println("\u001B[34m" + rival.getNome() + "\u001B[0m enviou \u001B[36m" + rival.pokemonsRival.get(pokeatualRival).getNome() + "\u001B[0m!");
        System.out.println("Vai \u001B[31m" + Treinadores.get(atualProta).pokemons.get(pokeatualProta).getNome() + "\u001B[0m!");

        do{
            do{
                //vida do pokemon inimigo
                rival.vidapokemon(pokeatualRival);

                //vida do seu pokemon
                Treinadores.get(atualProta).vidapokemon(pokeatualProta);

                //menus de interações
                System.out.println("OQUE \n\u001B[31m" + Treinadores.get(atualProta).pokemons.get(pokeatualProta).getNome() + "\u001B[0m IRA FAZER?");
                System.out.println("|\u001B[107m \u001B[30m [1]LUTA        [3]CURAR POKEMON  \u001B[0m|");
                System.out.println("|\u001B[107m \u001B[30m                                  \u001B[0m|");
                System.out.println("|\u001B[107m \u001B[30m [2]POKEMON        [4]FUGIR       \u001B[0m|\n");
                System.out.print("\u001B[92m>> \u001B[0m");
                switch (Integer.parseInt(leitor.nextLine())) {
                    case 1:
                        //menu de habilidades
                        Treinadores.get(atualProta).listaMoves(pokeatualProta);
                        System.out.print("\u001B[92m>> \u001B[0m");
                        String opcao = leitor.nextLine();

                        do{
                            for(int i=0;i<4;i++){
                                //usando a habilidade
                                if(opcao.toLowerCase().equals(Treinadores.get(atualProta).pokemons.get(pokeatualProta).getMoveName(i).toLowerCase())){
                                    //calcula se tem PP suficiente para usar o golpe
                                    if(Treinadores.get(atualProta).pokemons.get(pokeatualProta).getMovePP(i) > 0){
                                        //precição do golpe
                                        precisao=aleat.nextInt(100);
                                        if(precisao <=  Treinadores.get(atualProta).pokemons.get(pokeatualProta).getMoveAcu(i)){
                                            System.out.println("\n\u001B[31m" + Treinadores.get(atualProta).pokemons.get(pokeatualProta).getNome() + "\u001B[0m usou " + Treinadores.get(atualProta).pokemons.get(pokeatualProta).getMoveName(i) + "!");
                                            rival.pokemonsRival.get(pokeatualRival).setHp(rival.pokemonsRival.get(pokeatualRival).getHp() - (int) (Treinadores.get(atualProta).pokemons.get(pokeatualProta).getMovePower(i) * (calculador.efetividade(Treinadores.get(atualProta).pokemons.get(pokeatualProta).getMoveType(i),rival.pokemonsRival.get(pokeatualRival).getTipo(0)))));
                                            //mostra a efetividade do golpe
                                            if(calculador.efetividade(Treinadores.get(atualProta).pokemons.get(pokeatualProta).getMoveType(i),  rival.pokemonsRival.get(pokeatualRival).getTipo(0)) == 2f){
                                                System.out.println("Foi muito efetivo!");
                                            }else if(calculador.efetividade(Treinadores.get(atualProta).pokemons.get(pokeatualProta).getMoveType(i),  rival.pokemonsRival.get(pokeatualRival).getTipo(0)) < 1.0f){
                                                System.out.println("Não foi muito efetivo!");
                                            }
                                            fim=true;
                                        }else{
                                            System.out.println("\n\u001B[31m" + Treinadores.get(atualProta).pokemons.get(pokeatualProta).getNome() + "\u001B[0m errou " + Treinadores.get(atualProta).pokemons.get(pokeatualProta).getMoveName(i) + "!");
                                        }
                                    }else{
                                        System.out.println("Golpe invalido(PP baixo)!");
                                    }
                                }
                            }
                        }while(!fim);
                        break;

                    case 2:
                        //menu troca de pokemon
                        System.out.println("\nRetorne \u001B[31m" + Treinadores.get(atualProta).pokemons.get(pokeatualProta).getNome() + "\u001B[0m!\n");
                        Treinadores.get(atualProta).listarCombate();

                        System.out.println("Escolha o pokemon(Numero): ");
                        System.out.print("\u001B[92m>> \u001B[0m");
                        pokeatualProta = Integer.parseInt(leitor.nextLine())-1;
                        System.out.println("\nVai \u001B[31m" + Treinadores.get(atualProta).pokemons.get(pokeatualProta).getNome() + "\u001B[0m!");
                        break;

                    case 3:
                        //curar pokemon
                        Pokemon pokemonAtual = Treinadores.get(atualProta).pokemons.get(pokeatualProta);
                        int hpAtual = pokemonAtual.getHp();
                        int hpMaximo = pokemonAtual.getMaxHp(); // Supondo que você tenha um método para obter o HP máximo do Pokémon
                        int hpCurado = Math.min(hpAtual + 20, hpMaximo);

                        pokemonAtual.setHp(hpCurado);
                        System.out.println("\n\u001B[31m" + pokemonAtual.getNome() + "\u001B[0m foi curado em 20 pontos de HP!");
                        System.out.println("HP atual: " + pokemonAtual.getHp() + "/" + hpMaximo);
                        break;

                    case 4:
                        System.out.println("\n\u001B[91mNÃO TEM COMO FUGIR!\u001B[0m\n");
                        break;

                    default:
                        System.out.println("Escolha invalida! Tente Novamente!");
                        break;
                }
                //ação rival
                if(rival.pokemonsRival.get(pokeatualRival).getHp() > 0){
                    //rival usa mochila
                    if(rival.pokemonsRival.get(pokeatualRival).getHp() < (rival.pokemonsRival.get(pokeatualRival).getHp() * 0.30)){

                    }else{
                        //rival ataca
                        do{
                            int r = aleat.nextInt(3);
                            if(rival.pokemonsRival.get(pokeatualRival).getMovePP(r) > 0){
                                precisao=aleat.nextInt(100);
                                if(precisao <= rival.pokemonsRival.get(pokeatualRival).getMoveAcu(pokeatualRival)){
                                    System.out.println("\n\u001B[36m" + rival.pokemonsRival.get(pokeatualRival).getNome() + "\u001B[0m usou " + rival.pokemonsRival.get(pokeatualRival).getMoveName(r) + "!");
                                    Treinadores.get(atualProta).pokemons.get(pokeatualProta).setHp(Treinadores.get(atualProta).pokemons.get(pokeatualProta).getHp() - (int) (rival.pokemonsRival.get(pokeatualRival).getMovePower(r) * (calculador.efetividade(rival.pokemonsRival.get(pokeatualRival).getMoveType(r), Treinadores.get(atualProta).pokemons.get(pokeatualProta).getTipo(0)))));
                                    if(calculador.efetividade(rival.pokemonsRival.get(pokeatualRival).getMoveType(r), Treinadores.get(atualProta).pokemons.get(pokeatualProta).getTipo(0)) == 2f){
                                        System.out.println("Foi muito efetivo!");
                                    }else if(calculador.efetividade(rival.pokemonsRival.get(pokeatualRival).getMoveType(r), Treinadores.get(atualProta).pokemons.get(pokeatualProta).getTipo(0)) < 1.0f){
                                        System.out.println("Não foi muito efetivo");
                                    }
                                    fim=true;
                                }else{
                                    System.out.println("\n\u001B[36m" + rival.pokemonsRival.get(pokeatualRival).getNome() + "\u001B[0m errou " + rival.pokemonsRival.get(pokeatualRival).getMoveName(r) + "!");
                                }
                            }
                        }while(fim == false);
                    }
                }

            }while(rival.pokemonsRival.get(pokeatualRival).getHp() > 0 && Treinadores.get(atualProta).pokemons.get(pokeatualProta).getHp() > 0);

            if(Treinadores.get(atualProta).pokemons.get(pokeatualProta).getHp() == 0){
                //mudando o status do pokemon que acabou de perde
                Treinadores.get(atualProta).setRestantes(Treinadores.get(atualProta).getRestantes()-1);
                System.out.println("\u001B[31m" + Treinadores.get(atualProta).pokemons.get(pokeatualProta).getNome() + "\u001B[0m desmaiou");

                //se o protagonista ainda tive pokemons disponivel, escolhe o proximo
                if(Treinadores.get(atualProta).getRestantes() > 0){
                    System.out.println("\nRetorne \u001B[31m" + Treinadores.get(atualProta).pokemons.get(pokeatualProta).getNome() + "\u001B[0m!\n");
                    Treinadores.get(atualProta).listarCombate();

                }
                System.out.println("Escolha o pokemon(Numero): ");
                System.out.print("\u001B[92m>> \u001B[0m");
                pokeatualProta = Integer.parseInt(leitor.nextLine())-1;

            }
            //colocando o proximo pokemon do rival
            if(rival.pokemonsRival.get(0).getHp() == 0){
                rival.setRestantes(rival.getRestantes()-1);
                System.out.println("\u001B[36m" + rival.pokemonsRival.get(pokeatualRival).getNome() + "\u001B[0m desmaiou! Pokemons restantes: " + rival.getRestantes());
                pokeatualRival++;

                //opcao de troca seu pokemon apos a troca do rival
                if(rival.getRestantes() > 0){
                    System.out.println("\u001B[34m" + rival.getNome() + "\u001B[0m ira manda \u001B[36m" + rival.pokemonsRival.get(pokeatualRival).getNome() + "\u001B[0m!");
                    System.out.println("\nDeseja troca seu pokemon?(S/N)");
                    System.out.print("\u001B[92m>> \u001B[0m");
                    escolha = leitor.nextLine();

                    if(escolha.toLowerCase().equals("s") || escolha.toLowerCase().equals("sim")){
                        System.out.println("\nRetorne \u001B[36m" + Treinadores.get(atualProta).pokemons.get(pokeatualProta).getNome() + "\u001B[0m!\n");
                        Treinadores.get(atualProta).listarCombate();
                    }
                    System.out.println("Escolha o pokemon(Numero): ");
                    System.out.print("\u001B[92m>> \u001B[0m");
                    pokeatualProta = Integer.parseInt(leitor.nextLine())-1;
                }
            }
        }while(rival.getRestantes() > 1 && Treinadores.get(atualProta).getRestantes() > 1);
        if(Treinadores.get(atualProta).getRestantes() == 0){
            System.out.println("\n\u001B[91m" + rival.getNome() + " VENCEU A BATALHA!\u001B[0m\n");
        }
        if(rival.getRestantes() == 0){
            System.out.println("\n\u001B[91m" + Treinadores.get(atualProta).getNome() + "VENCEU A BATALHA!\u001B[0m\n");
        }
    }
}