package patterns.memento;

public class Health {

    private int damage;
    private int theftLife;

    public Health(int damage, int theftLife) {
        this.damage = damage;
        this.theftLife = theftLife;
    }

    public void setMemento(Memento memento){
        this.damage = memento.getDamage();
        this.theftLife = memento.getTheftLife();
    }

    public Memento createMemento(){
        return new Memento(this.damage,this.theftLife);
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
