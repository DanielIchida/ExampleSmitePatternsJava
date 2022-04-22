package patterns.memento;

public class Memento {

    private int damage;
    private int theftLife;

    public Memento(int damage, int theftLife) {
        this.damage = damage;
        this.theftLife = theftLife;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getTheftLife() {
        return theftLife;
    }

    public void setTheftLife(int theftLife) {
        this.theftLife = theftLife;
    }
}
