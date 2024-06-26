import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Pokemon implements Serializable {
    
    private String nome;
    private String status;
    private int hp;
    private int hp_max;
    private int lvl;
    private List<Moves> move;


    public Pokemon(String nome, String status , int hp, int lvl, List<Moves> move) {

        this.nome = nome;
        this.status = status;
        this.hp = hp;
        hp_max = hp;
        this.move = move.size() > 4 ? move.subList(0, 4) : move;
        this.lvl = lvl;
    }

    public int getLvl() {
        return this.lvl;
    }
    
    public String getNome() {
        return this.nome;
    }

    public String getStatus(){
        return this.status;
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
    
    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setStatus(String status){
        this.status = status;
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