package patterns.command;

public class MagicAttack implements ITypeAttack{

    private final Attacks attacks;

    public MagicAttack(Attacks attacks) {
        this.attacks = attacks;
    }

    @Override
    public void execute() {
        attacks.execute("MAGIC");
    }
}
