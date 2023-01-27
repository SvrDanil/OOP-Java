import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;


public abstract class BaseHero implements BaseInterface  {
    String name, role;
    int attack, defence, maxHealth, speed,health;
    int[] damage;

    Random rand = new Random();

    public BaseHero(String name,String role, int attack, int defence, int[] damage, int maxHealth, int speed) {
        this.name = name;
        this.role = role;
        this.attack = attack;
        this.defence = defence;
        this.damage = damage;
        this.maxHealth = maxHealth;
        this.health = maxHealth - rand.nextInt(maxHealth);
        this.speed = speed;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + ", Type: " + getInfo() + ", Attack: " + attack + ", Defence: "
                 + defence + ", Damage: " + Arrays.toString(damage) + ", Health: "
                 + health + ", Speed: " + speed;
    }
    
    @Override
    public void step(ArrayList<BaseHero> heroList) {

    }

    @Override
    public String getInfo() {
        return this.getClass().getName() + " " + String.valueOf(maxHealth) + " " + String.valueOf(health);
    }
}