package patterns.prototype;

import java.util.HashMap;

public class Skill {

    private static HashMap<String,Skill> skills;

    static {
        Skill.skills = new HashMap<>();
        Skill.addSkill(new AttackMagic());
        Skill.addSkill(new DefendMagic());
    }

    protected String name;
    protected String description;
    protected int points;

    public Skill(String name, String description, int points) {
        this.name = name;
        this.description = description;
        this.points = points;
    }

    public static void addSkill(Skill skill){
        Skill.skills.put(skill.name,skill);
    }

    public static Skill getSkill(String name){
        return Skill.skills.get(name);
    }

    public Skill copy(){
        return new Skill(this.name,this.description,this.points);
    }

    public void execute(){
        System.out.println("Skill: "+this.name + " - "+ this.description + " - " + this.points);
    }

}
