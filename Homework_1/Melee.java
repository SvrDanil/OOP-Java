import java.util.ArrayList;
public class Melee extends BaseHero{
    public Melee(String name, String role, int attack, int defence, int[] damage, int maxHealth, int speed) 
    {
        super(name, role, attack, defence, damage, maxHealth, speed);
    }
    @Override
    public void step(ArrayList<BaseHero> heroList) {

    }
}