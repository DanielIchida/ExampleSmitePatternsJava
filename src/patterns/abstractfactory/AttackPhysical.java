package patterns.abstractfactory;

public class AttackPhysical extends AttackTool{

    AttackPhysical(int initialPoints) {
        super(initialPoints);
    }

    @Override
    public void damage(int attackPower) {
        System.out.println(AttackPhysical.class.getName() + " = " + (getInitialPoints() + attackPower));
    }
}
