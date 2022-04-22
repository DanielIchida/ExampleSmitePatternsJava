package patterns.factory;

public abstract class TypeGods {

    private final String name;
    private final int power;
    private final int health;

    protected TypeGods(String name, int power, int health) {
        this.name = name;
        this.power = power;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getHealth() {
        return health;
    }

    public abstract Gods getGods();

    public void create(){
        Gods g = this.getGods();
        g.attack();
        g.defend();
    }

}
