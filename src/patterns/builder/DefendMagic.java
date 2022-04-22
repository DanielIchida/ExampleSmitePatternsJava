package patterns.builder;

public class DefendMagic extends Skill{

    public DefendMagic() {
        super(0, 20, 5, 20);
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
