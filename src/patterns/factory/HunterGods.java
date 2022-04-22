package patterns.factory;

public class HunterGods extends TypeGods{

    protected HunterGods(String name, int power, int health) {
        super(name, power, health);
    }

    @Override
    public Gods getGods() {
        return new Hunter(getName(),getPower(),getHealth());
    }
}
