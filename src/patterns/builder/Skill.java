package patterns.builder;

abstract public class Skill {
    private int power;
    private int resistance;
    private int theftOfLife;
    private int health;

    public Skill(int power, int resistance, int theftOfLife, int health) {
        this.power = power;
        this.resistance = resistance;
        this.theftOfLife = theftOfLife;
        this.health = health;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getResistance() {
        return resistance;
    }

    public void setResistance(int resistance) {
        this.resistance = resistance;
    }

    public int getTheftOfLife() {
        return theftOfLife;
    }

    public void setTheftOfLife(int theftOfLife) {
        this.theftOfLife = theftOfLife;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public abstract void attack();
    public abstract void defend();
}
