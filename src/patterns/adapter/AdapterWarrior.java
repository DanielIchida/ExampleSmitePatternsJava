package patterns.adapter;

public class AdapterWarrior extends Warrior implements CalculateSkillAdapter{

    AdapterWarrior(int health, int level,int pointAttack) {
        super(health, level, pointAttack);
    }

    @Override
    public void attack() {
        pointAttack();
    }

    @Override
    public void damage(int point) {
       damageReceive(this.health - point);
    }

    @Override
    public void defend(int receiveDamage) {
       damageReceive(this.health - receiveDamage);
    }
}
