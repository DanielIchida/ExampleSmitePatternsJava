package patterns.strategy;

public class Support implements ISkill {
    @Override
    public int calculatePower(int damage, int defend, int health) {
        return (health * 2) + damage - defend;
    }
}
