package patterns.command;

public class Main {
    public static void main(String[] args) {
        TypeAttack typeAttack = new TypeAttack();
        Attacks attacks = new Attacks();
        MagicAttack magicAttack = new MagicAttack(attacks);
        PhysicalAttack physicalAttack = new PhysicalAttack(attacks);
        LongDistanceAttack longDistanceAttack = new LongDistanceAttack(attacks);

        typeAttack.add(magicAttack);
        typeAttack.add(physicalAttack);
        typeAttack.add(longDistanceAttack);

        typeAttack.get(0).execute();
        typeAttack.get(1).execute();
        typeAttack.get(2).execute();
    }
}
