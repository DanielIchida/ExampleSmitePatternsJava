package patterns.decorator;

public class SkillAttack extends DecoratorSkill{

    public SkillAttack(ISkill skill) {
        super(skill);
    }

    @Override
    public void generate(int points) {
        this.getSkill().generate(points);
        this.attack();
    }

    private void attack(){
        System.out.println("Attack");
    }
}
