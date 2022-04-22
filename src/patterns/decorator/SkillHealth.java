package patterns.decorator;

public class SkillHealth extends DecoratorSkill{

    public SkillHealth(ISkill skill) {
        super(skill);
    }

    @Override
    public void generate(int points) {
        super.generate(points);
        health(points*2);
    }

    public void health(int defend){
        System.out.println("Health: "+defend);
    }
}
