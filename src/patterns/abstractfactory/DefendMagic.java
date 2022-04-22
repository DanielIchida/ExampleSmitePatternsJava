package patterns.abstractfactory;

public class DefendMagic extends  DefenseTool{

    protected DefendMagic(int initialPoints) {
        super(initialPoints);
    }

    @Override
    public void protection(int receivePower) {
        System.out.println(DefenseTool.class.getName() + " = " + (getInitialPoints() - receivePower));
    }
}
