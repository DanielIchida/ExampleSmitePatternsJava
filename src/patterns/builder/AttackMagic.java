package patterns.builder;

public class AttackMagic extends Skill{

    public AttackMagic() {
        super(30,0,0,10);
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
