package patterns.decorator;

public class Skill implements ISkill{

    public Skill(){}

    @Override
    public void generate(int points) {
        System.out.println("Skill points = "+points);
    }
}
