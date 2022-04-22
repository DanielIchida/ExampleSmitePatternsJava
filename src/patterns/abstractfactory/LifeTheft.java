package patterns.abstractfactory;

public class LifeTheft extends  AttackTool{

    LifeTheft(int initialPoints) {
        super(initialPoints);
    }

    @Override
    public void damage(int attackPower) {
        System.out.println(LifeTheft.class.getName() + " = " + (getInitialPoints() + attackPower));
    }
}
