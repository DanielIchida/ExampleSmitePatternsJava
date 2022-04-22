package patterns.builder;

public class AttackPhysical extends Skill{

    public AttackPhysical() {
        super(30, 10, 4, 10);
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
