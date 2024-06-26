import java.util.List;
import java.util.Scanner;

public class Batalha{


    Batalha(){
    } 

    void duelo(int dificuldade){

        Scanner leitor = new Scanner(System.in);
        int atualProta = 0;
        int atualRival = 0;
        String space = "          ";

        Personagem protagonista = new Personagem();
        Personagem rival = new Personagem("Rival", 6, dificuldade);
        System.out.println("=======================================================");
        System.out.println(rival.getNome() + "te desafia para uma batalha!");
        do{
            System.out.println(rival.getNome() + " enviou " + rival.pokemonsRival.get(atualRival).getNome() + "!");
            System.out.println("Vai " + protagonista.pokemons.get(atualProta).getNome() + "!");
            do{
                //vida do pokemon inimigo
                System.out.println("|" + rival.pokemonsRival.get(atualRival).getNome() + "     Lv" + rival.pokemonsRival.get(atualRival).getLvl() + "|");
                System.out.println("|    HP:|\u001B[42m          \u001B[0m|");
                System.out.println("|" + space + "  " + rival.pokemonsRival.get(atualRival).getHp() + "/" + rival.pokemonsRival.get(atualRival).getMaxHp() + "|");

                //vida do seu pokemon
                System.out.println(space + space + space + "|" + protagonista.pokemons.get(atualProta).getNome() + "     Lv" + protagonista.pokemons.get(atualProta).getLvl() + "|");
                System.out.println(space + space + space + "|    HP:|\u001B[42m           \u001B[0m|");
                System.out.println(space + space + space + "|" + space + "  " + protagonista.pokemons.get(atualProta).getHp() + "/" + protagonista.pokemons.get(atualProta).getMaxHp() + "|");

                //menus de interações 
                System.out.println("Oque \n" + protagonista.pokemons.get(atualProta).getNome() + " ira fazer?");
                System.out.println("|\u001B[107m \u001B[30m LUTA      MOCHILA  \u001B[0m|");
                System.out.println("|\u001B[107m \u001B[30m                    \u001B[0m|");
                System.out.println("|\u001B[107m \u001B[30m POKEMON   FUGIR    \u001B[0m|\n");
                switch (leitor.nextLine().toLowerCase()) {
                    case "luta":
                        //menu de habilidades
                        System.out.println("\n|\u001B[107m \u001B[30m" + protagonista.pokemons.get(atualProta).getMoveName(0) + "      " + protagonista.pokemons.get(atualProta).getMoveName(1) + "\u001B[0m|");
                        System.out.println("|\u001B[107m \u001B[30m                    \u001B[0m|");
                        System.out.println("|\u001B[107m \u001B[30m" + protagonista.pokemons.get(atualProta).getMoveName(2) + "      " + protagonista.pokemons.get(atualProta).getMoveName(3) + "\u001B[0m|\n");
                            String opcao = leitor.nextLine();
                            for(int i=0;i<4;i++){
                                if(opcao.toLowerCase().equals(protagonista.pokemons.get(atualProta).getMoveName(i).toLowerCase())){
                                    System.out.println(protagonista.pokemons.get(atualProta).getNome() + " usou " + protagonista.pokemons.get(atualProta).getMoveName(i));
                                    rival.pokemonsRival.get(atualRival).setHp(rival.pokemonsRival.get(atualRival).getHp() - protagonista.pokemons.get(atualProta).getMovePower(i));
                                }
                            }
                        break;
                    case "mochila":
                            //menu mochila
                        break;
                    case "pokemon":
                    //menu troca de pokemon
                        System.out.println("\nRetorne " + protagonista.pokemons.get(atualProta).getNome() + "!\n");
                        for(int i=0;i<protagonista.pokemons.size();i++){
                            if(protagonista.pokemons.get(i).getStatus().toLowerCase().equals("vivo")){
                                System.out.println("|(" + (i+1) + ")" + protagonista.pokemons.get(i).getNome() + "     Lv" + protagonista.pokemons.get(i).getLvl() + "|");
                                System.out.println("|    HP:|\u001B[42m          \u001B[0m|");
                                System.out.println("|" + space + "  " + protagonista.pokemons.get(i).getHp() + "/" + protagonista.pokemons.get(i).getMaxHp() + "|\n");
                            }
                        }
                        System.out.println("Escolha o pokemon(Numero): ");
                        atualProta = Integer.parseInt(leitor.nextLine())-1;
                        System.out.println("Vai " + protagonista.pokemons.get(atualProta).getNome() + "!");
                        break;
                        case "fugir":
                        System.out.println("\u001B[91mNão tem como fugir!\u001B[0m");
                        break;
                        default:
                        System.out.println("Escolha invalida! Tente Novamente!");
                        break;
                    }
                
            }while(rival.pokemonsRival.get(atualRival).getHp() > 0 && protagonista.pokemons.get(atualProta).getHp() > 0);
            
            if(protagonista.pokemons.get(atualProta).getHp() == 0){
                //mudando o status do pokemon que acabou de perde
                protagonista.setRestantes(protagonista.getRestantes()-1);
                System.out.println(protagonista.pokemons.get(atualProta).getNome() + " desmaiou");
                protagonista.pokemons.get(atualProta).setStatus("Desmaiado");
                
                //se o protagonista ainda tive pokemons disponivel, escolhe o proximo
                if(protagonista.getRestantes() > 0){
                    System.out.println("Escolha seu proximo Pokemon:");
                    for(int i=0;i<6;i++){
                        if(protagonista.pokemons.get(i).getStatus().toLowerCase().equals("vivo")){
                            System.out.println("|(" + i+1 + ")" + protagonista.pokemons.get(i).getNome() + "     Lv" + protagonista.pokemons.get(i).getLvl() + "|");
                            System.out.println("|    HP:|\u001B[42m          \u001B[0m|");
                            System.out.println("|" + space + "  " + protagonista.pokemons.get(i).getHp() + "/" + protagonista.pokemons.get(i).getMaxHp() + "|/n");
                        }
                    }
                }
                System.out.println("Escolha o pokemon(Numero): ");
                atualProta = Integer.parseInt(leitor.nextLine())-1;
                
            }
            if(rival.pokemonsRival.get(0).getHp() == 0){
                //colocando o proximo pokemon do rival
                rival.setRestantes(rival.getRestantes()-1);
                System.out.println(rival.pokemonsRival.get(atualRival).getNome() + " desmaiou ");
                rival.pokemonsRival.get(atualRival).setStatus("Desmaiado");
                atualRival++;

                //opcao de troca seu pokemon apos a troca do rival
                System.out.println(rival.getNome() + " ira manda " + rival.pokemonsRival.get(atualRival).getNome() + "!");
                System.out.println("Deseja troca seu pokemon?(S/N)");
                if(leitor.nextLine().toLowerCase().equals("s") || leitor.nextLine().toLowerCase().equals("sim")){
                    for(int i=0;i<protagonista.pokemons.size();i++){
                        if(protagonista.pokemons.get(i).getStatus().toLowerCase().equals("vivo")){
                            System.out.println("|(" + (i+1) + ")" + protagonista.pokemons.get(i).getNome() + "     Lv" + protagonista.pokemons.get(i).getLvl() + "|");
                            System.out.println("|    HP:|\u001B[42m          \u001B[0m|");
                            System.out.println("|" + space + "  " + protagonista.pokemons.get(i).getHp() + "/" + protagonista.pokemons.get(i).getMaxHp() + "|/n");
                        }
                    }
                    System.out.println("Escolha o pokemon(Numero): ");
                    atualProta = Integer.parseInt(leitor.nextLine())-1;
                    System.out.println("\nRetorne " + protagonista.pokemons.get(atualProta).getNome() + "!\n");
                }
            }
        }while(protagonista.getRestantes() > 0 || rival.getRestantes() > 0);
    }
}
