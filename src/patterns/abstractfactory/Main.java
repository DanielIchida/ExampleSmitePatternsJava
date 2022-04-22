package patterns.abstractfactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("GODS GAME");
        Gods loki = new Gods("LOKI");
        Killers killers = new Killers();
        loki.createItems(killers);
        System.out.println();
        Gods odin = new Gods("ODIN");
        Warrior warrior = new Warrior();
        odin.createItems(warrior);
    }
}

