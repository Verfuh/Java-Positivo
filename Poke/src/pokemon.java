import java.util.List;
import java.util.ArrayList;

public class pokemon {

    private int hp;
    private int hp_max;
    private int lvl;
    private List<moves> move;


    public pokemon(int hp, int hp_max, int lvl) {
        this.hp = hp;
        this.hp_max = hp_max;
        this.move = new ArrayList<>();
        this.lvl = lvl;
    }

    public void adicionarAtaque(moves move) {
        if (moves.size() < 4) {
            moves.add(move);
        } else {
            System.out.println("Este Pokémon já tem 4 ataques.");
        }
    }

    public int getHp() {

        return hp;
    }

    public int getHp_max() {

        return hp_max;
    }

    public int getMoves() {

        return moves;
    }

    public void setHp(int hp) {

        this.hp = hp;
    }

    public void setHp_max(int hp_max) {

        this.hp_max = hp_max;
    }

    public List<moves> getMove() {
        return move;
    }



}


