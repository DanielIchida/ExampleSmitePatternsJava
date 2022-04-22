package patterns.mediator;


public class Main {
    public static void main(String[] args) {

        Mediator m = new Mediator();

        Gods hunter = new Hunter(m);
        Gods support = new Support(m);
        Gods killer = new Killer(m);

        m.add(hunter);
        m.add(support);
        m.add(killer);

        System.out.println("Support Attack");
        support.communicate(2);

        System.out.println("Killer Attack");
        killer.communicate(10);

    }
}
