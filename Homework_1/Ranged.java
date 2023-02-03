
import java.util.ArrayList;

public class Ranged extends BaseHero {
    Integer shoots;
    public Ranged(String name,String role, int attack, int defence, int[] damage, int maxHealth, int speed, int shoots) {
        super(name, role, attack, defence, damage, maxHealth, speed);
        this.shoots = shoots;
    }

    @Override
    public String toString() {
        return super.toString() + ", Shoots " + shoots;
    }

    @Override
    public void step(ArrayList<BaseHero> heroList) {
        for (BaseHero hero : heroList) {
            if (hero.supply == 1) {
                hero.supply = 0;
                this.shoots += 1;
                break;
            }
        }
        if (this.shoots > 0) {
            this.shoots -= 1;
        } else {
            System.out.println("\nСтрел нет");
        }
    }

    @Override
    public String getInfo() {
        return this.getClass().getName().split("\\.")[1] + " H" + String.valueOf(health * 100/maxHealth) + "%" + " Sh" + shoots;
    }
}
