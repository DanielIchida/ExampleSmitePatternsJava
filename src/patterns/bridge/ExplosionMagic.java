package patterns.bridge;

public class ExplosionMagic extends Item{

    ExplosionMagic(int pointsAttack, int pointsDefend) {
        super(pointsAttack, pointsDefend);
    }

    @Override
    public void skill() {
        System.out.println("attack: "+this.getPointsAttack()+" - defend: "+this.getPointsDefend());
    }
}
