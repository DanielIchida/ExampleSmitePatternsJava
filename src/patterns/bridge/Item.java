package patterns.bridge;

public abstract class Item {
    private final int pointsAttack;
    private final int pointsDefend;

    Item(int pointsAttack,int pointsDefend){
       this.pointsAttack = pointsAttack;
       this.pointsDefend = pointsDefend;
    }

    public int getPointsAttack() {
        return pointsAttack;
    }

    public int getPointsDefend() {
        return pointsDefend;
    }

    public abstract void skill();
}
