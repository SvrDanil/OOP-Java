
import java.util.ArrayList;
public class Peasant extends BaseHero
{
    int supply;

    public Peasant(String name, String role, int attack, int defence, int[] damage, int maxHealth, int speed,int supply) {
        super(name, role, attack, defence, damage, maxHealth, speed);
        this.supply = 1;
    }
    public Peasant(String name){
        super(name, "Farmer", 1, 1, new int[] {1, 1}, 1, 3);
        this.supply = 1;
    }
    @Override
    public String toString() {
        if (this.supply == 1) {
            return super.toString() + ", Supply";
        } else {
            return super.toString();
        }
    }
    @Override
    public void step(ArrayList<BaseHero> heroList) {
        if (this.supply == 0) {
            this.supply = 1;
        }
    }
    @Override
    public String getInfo() {
        return this.getClass().getName().split("\\.")[1] + " H" + String.valueOf(health * 100/maxHealth) + "%" + " Sup" + this.supply;
    }
}