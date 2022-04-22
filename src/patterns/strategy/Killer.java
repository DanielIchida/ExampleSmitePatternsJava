package patterns.strategy;

public class Killer implements ISkill{
    @Override
    public int calculatePower(int damage, int defend, int health) {
        return (damage * 2) + (defend - 1) - health;
    }
}
