package patterns.factory;

public class Main {
    public static void main(String[] args) {
        System.out.println("FACTORY METHOD");
        GodsMagic magic = new GodsMagic("Zeus",50,30);
        magic.create();

        HunterGods hunterGods = new HunterGods("Artemisa",50,10);
        hunterGods.create();
    }
}

