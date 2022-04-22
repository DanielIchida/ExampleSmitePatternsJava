package patterns.strategy;

public class Main {
    public static void main(String[] args) {
        Skill skill;
        skill = new Skill(new Support());
        int support = skill.execute(2,30,50);
        System.out.println(support);

        skill = new Skill(new Killer());
        int killer = skill.execute(30,5,30);
        System.out.println(killer);
    }
}
