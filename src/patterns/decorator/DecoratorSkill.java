package patterns.decorator;

public abstract class DecoratorSkill implements ISkill {

    protected ISkill skill;

    public DecoratorSkill(ISkill skill) {
        this.setSkill(skill);
    }

    public void setSkill(ISkill skill) {
        this.skill = skill;
    }

    public ISkill getSkill() {
        return skill;
    }

    @Override
    public void generate(int points) {
        this.getSkill().generate(points);
    }
}
