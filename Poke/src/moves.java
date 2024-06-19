import java.util.ArrayList;

public class moves {

    private String nome;
    private String tipagem;
    private int power;
    private int accuracy;
    private int pp;
    private int pp_max;

    public moves(String nome, String tipagem, int power, int accuracy, int pp) {
        this.nome = nome;
        this.tipagem = tipagem;
        this.power = power;
        this.accuracy = accuracy;
        this.pp = pp;
        this.pp_max = pp;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipagem() {
        return tipagem;
    }

    public void setTipagem(String tipagem) {
        this.tipagem = tipagem;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public int getPp() {
        return pp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }

    public static void imprimirMoves(ArrayList<moves> listaMoves, String tipagemDesejada) {
        System.out.println("Moves do tipo " + tipagemDesejada + ":");

        for (moves move : listaMoves) {
            if (move.getTipagem().equalsIgnoreCase(tipagemDesejada)) {
                System.out.println(move.toString());
            }
        }
    }

    @Override
    public String toString() {
        return nome + " (Tipo: " + tipagem + ", Power: " + power + ", Accuracy: " + accuracy + "%, PP: " + pp + "/" + pp_max + ")";
    }

}
