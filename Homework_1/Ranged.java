import java.util.ArrayList;
public class Ranged extends BaseHero{

    int shoots;
    

    public Ranged(String name, String role, int attack, int defence, int[] damage, int maxHealth, int speed,int shoots) 
    {
        super(name, role, attack, defence, damage, maxHealth, speed);
        this.shoots=shoots;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Shoots: " + shoots;
    }
    @Override
    public void step(ArrayList<BaseHero> heroList) {

    }
}