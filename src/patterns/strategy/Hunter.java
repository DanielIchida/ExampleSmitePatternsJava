package patterns.strategy;

public class Hunter implements ISkill{
    @Override
    public int calculatePower(int damage, int defend, int health) {
        return (damage + 5) + damage - (defend - 2);
    }
}
