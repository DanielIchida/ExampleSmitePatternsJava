package patterns.flyweight;


public class Gods implements IGods{

    private final String name;
    private final TypeGods typeGods;

    public Gods(String name,TypeGods typeGods) {
        this.name = name;
        this.typeGods = typeGods;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public TypeGods getTypeGods() {
        return this.typeGods;
    }

    @Override
    public void skill(int pointAttack, int pointDefend) {
        System.out.println("Attack: "+pointAttack+" - Defend"+ pointDefend);
    }
}
