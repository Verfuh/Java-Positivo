import java.util.Scanner;

public class Main implements Inicio {

    private Scanner leitor;
    Sistema emulacao = new Sistema();
    public Main() {
        this.leitor = new Scanner(System.in);
    }

    @Override
    public void treinadores() {

        System.out.println("Implementação dos treinadores...");
        emulacao.treinadores();
    }

    @Override
    public void duelo(int dificuldade) {

        System.out.println("Implementação do duelo com dificuldade: " + dificuldade);
        emulacao.duelo(dificuldade);
    }

    public static void main(String[] args) {
        Main programa = new Main();
        programa.executar();
    }

    public void executar() {
        boolean fim = false;

        System.out.println("\nBem vindo ao simulador de batalhas POKEMON");
        System.out.println("------------------------------------------");

        do {
            System.out.println("\n[1]>> Treinadores\n[2]>> Batalhar\n[3]>> Sair\n");
            System.out.print("\u001B[92m>> \u001B[0m");

            switch (Integer.parseInt(leitor.nextLine())){

                case 1:
                    treinadores();
                    break;

                case 2:
                    System.out.println("Escolha a dificuldade do duelo: \n[1]>> Fácil\n[2]>> Mediano\n[3]>> Difícil");
                    System.out.print("\u001B[92m>> \u001B[0m");
                    duelo(Integer.parseInt(leitor.nextLine()));
                    break;

                case 3:
                    fim = true;
                    break;
            }
        } while (!fim);

        leitor.close();
    }
}
