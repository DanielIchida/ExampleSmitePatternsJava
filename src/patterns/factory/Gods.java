package patterns.factory;

public abstract class Gods {

    private final String name;
    private final int power;
    private final int health;

    public Gods(String name, int power, int health) {
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

    public abstract void attack();
    public abstract void defend();
}
