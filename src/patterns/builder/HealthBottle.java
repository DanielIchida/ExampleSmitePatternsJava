package patterns.builder;

public class HealthBottle extends Skill{

    public HealthBottle() {
        super(0,30,0,30);
    }

    @Override
    public void attack() {
        System.out.println("Attack "+this.getClass().getName());
    }

    @Override
    public void defend() {
        System.out.println("Defend"+this.getClass().getName());
    }
}
