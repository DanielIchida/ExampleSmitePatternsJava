package patterns.abstractfactory;

public class AttackMagic extends AttackTool{

    AttackMagic(int initialPoints) {
        super(initialPoints);
    }

    @Override
    public void damage(int attackPower) {
        System.out.println(AttackMagic.class.getName() + " = " + (getInitialPoints() + attackPower));
    }
}
