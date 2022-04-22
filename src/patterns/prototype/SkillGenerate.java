package patterns.prototype;

public class SkillGenerate {

    public Skill execute(String title){
        Skill skill = Skill.getSkill(title);
        return skill.copy();
    }

}
