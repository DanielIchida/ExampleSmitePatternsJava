package patterns.proxy;

public class Attack implements Skill{

    private final String name;

    public Attack(String name) {
        this.name = name;
    }

    @Override
    public void generate() {
        System.out.println("Attack of "+this.name);
    }
}
