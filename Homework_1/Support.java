public class Support extends BaseHero{

    int mana;
    

    public Support(String name, String role, int attack, int defence, int[] damage, int health, int speed,int mana) 
    {
        super(name, role, attack, defence, damage, health, speed);
        this.mana=mana;
    }
    public String toString() {
        return super.toString() + ", Mana: "+ mana;
    }
}