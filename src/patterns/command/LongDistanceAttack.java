package patterns.command;

public class LongDistanceAttack implements ITypeAttack{

    private final Attacks attacks;

    public LongDistanceAttack(Attacks attacks) {
        this.attacks = attacks;
    }

    @Override
    public void execute() {
        attacks.execute("LONG_DISTANCE");
    }
}
