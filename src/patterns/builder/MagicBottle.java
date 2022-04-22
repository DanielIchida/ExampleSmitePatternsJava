package patterns.builder;

public class MagicBottle extends Skill{

    public MagicBottle() {
        super(20, 0, 2, 10);
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
