package patterns.strategy;

public class Skill {

    private final ISkill iSkill;

    public Skill(ISkill iSkill) {
        this.iSkill = iSkill;
    }

    public int execute(int damage,int defend,int health){
        return iSkill.calculatePower(damage,defend,health);
    }
}
