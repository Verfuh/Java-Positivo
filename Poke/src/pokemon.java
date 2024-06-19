import java.util.List;
import java.util.ArrayList;

public class pokemon {

    private String nome;
    private int hp;
    private int hp_max;
    private int lvl;
    private List<moves> move;


    public pokemon(String nome, int hp, int lvl, List<moves> move) {

        this.nome = nome;
        this.hp = hp;
        hp_max = hp;
        this.move = move.size() > 4 ? move.subList(0, 4) : move;
        this.lvl = lvl;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public String getNome() {
        return nome;
    }


    public int getHp() {

        return hp;
    }

    public List<moves> getMoves() {

        return move;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setHp(int hp) {

        this.hp = hp;
    }

    public List<moves> getMove() {

        return move;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("| >> Pokemon: ").append(getNome())
                .append("\n| >> HP: ").append(getHp())
                .append("\n| >> Lvl: ").append(getLvl())
                .append("\n| >> Moves: ");

        for (moves m : move) {
            sb.append("\n  - ").append(m.toString());
        }

        return sb.toString();
    }


    }