package patterns.decorator;

public class SkillDefend  extends DecoratorSkill{

    public SkillDefend(ISkill skill) {
        super(skill);
    }

    @Override
    public void generate(int points) {
        this.getSkill().generate(points);
        this.defended();
    }

    private void defended(){
        System.out.println("Defend");
    }
}
