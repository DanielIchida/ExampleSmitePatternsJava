package patterns.adapter;

public class Main {
    public static void main(String[] args) {
        AdapterWarrior adapterWarrior = new AdapterWarrior(200,10,20);
        adapterWarrior.damageReceive(10);
        adapterWarrior.attack();
        adapterWarrior.defend(20);

        System.out.println(adapterWarrior.getPointAttack());
        System.out.println(adapterWarrior.getHealth());
        System.out.println(adapterWarrior.getLevel());

    }
}
