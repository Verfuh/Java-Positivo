import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Sistema emulacao = new Sistema();
        Scanner leitor = new Scanner(System.in);
        boolean fim = false;

        System.out.println("\nBem vindo ao simulador de batalhas POKEMON");
        System.out.println("------------------------------------------");

        do {
            System.out.println("\n[1]>> Treinadores\n[2]>> Batalhar\n[3]>> Sair\n");
            System.out.print("\u001B[92m>> \u001B[0m");

            if (Integer.parseInt(leitor.nextLine()) == 1) {
                emulacao.treinadores();
                    /*case 2:
                    System.out.println("Escolha a dificuldade do duelo: \n[1]>> Fácil\n[2]>> Mediano\n[3]>> Difícil");
                    System.out.print("\u001B[92m>> \u001B[0m");
                    emulacao.duelo(Integer.parseInt(leitor.nextLine()));
                    
                break; 
                case 3:
                    fim = true;
                break;
            }  */
            }
        }while (!fim);
    }
}
