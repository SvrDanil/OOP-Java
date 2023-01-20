import java.util.ArrayList;


public class Main {

    public static void main(String[] args) { 
        
        ArrayList<BaseHero> peasant = new ArrayList<>();
        String[] peasantNames = {"Имя1", "Имя2", "Имя3", "Имя4", "Имя5"};
        for (String name : peasantNames) {
            peasant.add(new Peasant(name));
        }
        for (BaseHero character : peasant) {
            System.out.println(character);
        }
        System.out.println("====================");

        ArrayList<BaseHero> rogue = new ArrayList<>();
        String[] rogueNames = {"Имя1", "Имя2", "Имя3", "Имя4", "Имя5"};
        for (String name : rogueNames) {
            rogue.add(new Rogue(name));
        }
        for (BaseHero character : rogue) {
            System.out.println(character);
        }
        System.out.println("====================");

        ArrayList<BaseHero> sniper = new ArrayList<>();
        String[] sniperNames = {"Имя1", "Имя2", "Имя3", "Имя4", "Имя5"};
        for (String name : sniperNames) {
            sniper.add(new Sniper(name));
        }
        for (BaseHero character : sniper) {
            System.out.println(character);
        }
        System.out.println("====================");

        ArrayList<BaseHero> crossbowman = new ArrayList<>();
        String[] crossbowmanNames = {"Имя1", "Имя2", "Имя3", "Имя4", "Имя5"};
        for (String name : crossbowmanNames) {
            crossbowman.add(new Crossbowman(name));
        }
        for (BaseHero character : crossbowman) {
            System.out.println(character);
        }
        System.out.println("====================");

        ArrayList<BaseHero> spearman = new ArrayList<>();
        String[] spearmanNames = {"Имя1", "Имя2", "Имя3", "Имя4", "Имя5"};
        for (String name : spearmanNames) {
            spearman.add(new Spearman(name));
        }
        for (BaseHero character : spearman) {
            System.out.println(character);
        }
        System.out.println("====================");

        ArrayList<BaseHero> wizzard = new ArrayList<>();
        String[] wizzardNames = {"Имя1", "Имя2", "Имя3", "Имя4", "Имя5"};
        for (String name : wizzardNames) {
            wizzard.add(new Wizzard(name));
        }
        for (BaseHero character : wizzard) {
            System.out.println(character);
        }
        System.out.println("====================");

        ArrayList<BaseHero> monk = new ArrayList<>();
        String[] monkNames = {"Имя1", "Имя2", "Имя3", "Имя4", "Имя5"};
        for (String name : monkNames) {
            monk.add(new Monk(name));
        }
        for (BaseHero character : monk) {
            System.out.println(character);
        }
        System.out.println("====================");
    
    }
}