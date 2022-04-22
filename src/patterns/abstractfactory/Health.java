package patterns.abstractfactory;

public class Health extends DefenseTool {

    protected Health(int initialPoints) {
        super(initialPoints);
    }

    @Override
    public void protection(int receivePower) {
        System.out.println(Health.class.getName() + " = " + (getInitialPoints() - receivePower));
    }
}
