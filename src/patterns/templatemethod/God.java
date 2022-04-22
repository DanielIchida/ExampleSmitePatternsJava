package patterns.templatemethod;

public abstract class God {

    public int attack(int point,int nLevel){
        int damage = damage(point);
        damage = damage * level(nLevel) + improvement(point);
        return damage;
    }

    public abstract int damage(int point);
    public abstract int level(int numberLevel);
    public abstract int improvement(int point);

}
