package patterns.prototype;

public class Main {
    public static void main(String[] args) {
        SkillGenerate skillGenerate = new SkillGenerate();
        Skill skill;
        skill = skillGenerate.execute(AttackMagic.NAME);
        skill.execute();
        System.out.println();
        skill = skillGenerate.execute(DefendMagic.NAME);
        skill.execute();
    }
}
