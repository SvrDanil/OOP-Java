public class Peasant extends BaseHero
{
    boolean supply;

    public Peasant(String name, String role, int attack, int defence, int[] damage, int health, int speed,boolean supply) {
        super(name, role, attack, defence, damage, health, speed);
        this.supply = supply;
    }
    public Peasant(String name){
        super(name, "Farmer", 1, 1, new int[] {1, 1}, 1, 3);
        this.supply = true;
    }

    @Override
    public String toString() {
        return super.toString() + ", Supply: "+ supply;
    }
}