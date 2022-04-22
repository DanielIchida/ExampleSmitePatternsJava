package patterns.command;

public class PhysicalAttack implements ITypeAttack {

    private final Attacks attacks;

    public PhysicalAttack(Attacks attacks) {
        this.attacks = attacks;
    }

    @Override
    public void execute() {
       attacks.execute("PHYSICAL");
    }
}
