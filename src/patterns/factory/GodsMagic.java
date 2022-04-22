package patterns.factory;

public class GodsMagic extends TypeGods{

    protected GodsMagic(String name, int power, int health) {
        super(name, power, health);
    }

    @Override
    public Gods getGods() {
        return new Magic(getName(),getPower(),getHealth());
    }
}
