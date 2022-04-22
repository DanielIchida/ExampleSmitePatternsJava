package patterns.decorator;

public class Main {
    public static void main(String[] args) {

        Skill skill = new Skill();
        skill.generate(100);
        System.out.println();
        ISkill killer = new SkillAttack(new Skill());
        killer.generate(300);
        System.out.println();
        ISkill warrior = new SkillAttack(new SkillDefend(new Skill()));
        warrior.generate(200);
        System.out.println();
        ISkill support = new SkillHealth(new SkillDefend(new SkillAttack(new Skill())));
        support.generate(100);

    }
}
