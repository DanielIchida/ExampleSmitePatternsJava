package patterns.abstractfactory;

abstract public class AttackTool {

    private final int initialPoints;

    AttackTool(int initialPoints){
        this.initialPoints = initialPoints;
    }

    public int getInitialPoints() {
        return initialPoints;
    }

    public abstract void damage(int attackPower);
}
