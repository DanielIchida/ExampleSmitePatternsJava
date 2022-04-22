package patterns.adapter;

public class Warrior implements Gods {

    public final int level;
    public final int pointAttack;
    public final int health;

    Warrior(int health, int level, int pointAttack){
        this.level = level;
        this.health = health;
        this.pointAttack = pointAttack;
    }

    @Override
    public int pointAttack() {
        return this.level + this.pointAttack;
    }

    @Override
    public int damageReceive(int damage) {
        return this.health - damage;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    public int getPointAttack() {
        return pointAttack;
    }
}
