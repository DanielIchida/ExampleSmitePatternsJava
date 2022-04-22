package patterns.abstractfactory;

abstract public class DefenseTool {
    private final int initialPoints;

    protected DefenseTool(int initialPoints) {
        this.initialPoints = initialPoints;
    }

    public int getInitialPoints() {
        return initialPoints;
    }

    public abstract void protection(int receivePower);
}
