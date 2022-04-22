package patterns.factory;

public class Magic extends Gods{

    public Magic(String name, int power, int health) {
        super(name, power, health);
    }

    @Override
    public void attack() {
        System.out.println(getName()+" attack");
    }

    @Override
    public void defend() {
        System.out.println(getName()+" defend");
    }
}
