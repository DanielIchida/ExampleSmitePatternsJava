package patterns.builder;

public class TheftLife extends Skill{

    public TheftLife() {
        super(15,3,30,10);
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
