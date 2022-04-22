package patterns.proxy;

public class God {

    private final String name;
    private int points;

    private AttackProxy attackProxy;

    public God(String name,int points) {
        this.name = name;
        this.points = points;
        this.loadSkill();
        this.showSkill();
    }

    public String getName() {
        return name;
    }

    public void loadSkill(){
        this.points = 10;
        this.attackProxy = new AttackProxy("Magic");
    }

    public void showSkill(){
        System.out.println("Attack: "+this.points);
    }

    public void executeSkill(){
        System.out.println("EXECUTE SKILL");
        this.attackProxy.generate();
    }
}
