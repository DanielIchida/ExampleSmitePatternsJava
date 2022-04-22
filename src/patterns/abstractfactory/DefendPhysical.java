package patterns.abstractfactory;

public class DefendPhysical extends DefenseTool{

    protected DefendPhysical(int initialPoints) {
        super(initialPoints);
    }

    @Override
    public void protection(int receivePower) {
        System.out.println(DefendPhysical.class.getName() + " = " + (getInitialPoints() - receivePower));
    }
}
