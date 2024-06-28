import java.io.Serializable;
import java.util.List;

public class Pokemon implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome;
    private List<String> tipo;
    private int lvl;
    private int hp;
    private int hp_max;
    private List<Moves> move;

    public Pokemon(String nome, int hp, int lvl, List<String> tipo ,List<Moves> move) {

        this.nome = nome;
        this.tipo = tipo;
        this.hp = hp;
        hp_max = hp;
        this.lvl = lvl;
        this.tipo = tipo.size() > 2 ? tipo.subList(0, 2) : tipo;
        this.move = move.size() > 4 ? move.subList(0, 4) : move;
    }

    public int getLvl() {
        return this.lvl;
    }

    public String getNome() {
        return this.nome;
    }

    public int getHp() {
        return this.hp;
    }

    public int getMaxHp(){
        return this.hp_max;
    }

    public String getMoveName(int tec) {

        return move.get(tec).getNome();
    }

    public int getMovePower(int tec) {
        return move.get(tec).getPower();

    }

    public int getMoveAcu(int tec) {
        return move.get(tec).getAccuracy();

    }

    public int getMovePP(int tec) {
        return move.get(tec).getPp();

    }

    public int getMoveMaxPP(int tec) {
        return move.get(tec).getMaxPp();

    }

    public String getMoveType(int tec) {
        return move.get(tec).getTipagem();

    }


    public String getTipo(int tipo){
        return this.tipo.get(tipo);
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setHp(int hp) {
        this.hp = hp;
        if(this.hp < 0){
            this.hp = 0;
        }
    }

    public void setMaxHp(int maxhp){
        this.hp_max = maxhp;
    }

    public void setMovePP(int tec) {
        move.get(tec).setPp((move.get(tec).getPp()-1));

    }

    public void curarPoke(int hpCurado){

        this.hp = hp + hpCurado;
        if(this.hp > this.hp_max){
            this.hp = 0;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("| >> Pokemon: ").append(getNome())
                .append("\n| >> HP: ").append(getHp())
                .append("\n| >> Lvl: ").append(getLvl())
                .append("\n| >> Moves: ");

        for (Moves m : move) {
            sb.append("\n  - ").append(m.toString());
        }

        return sb.toString();
    }

}