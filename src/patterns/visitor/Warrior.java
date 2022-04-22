package patterns.visitor;

public class Warrior implements ICharacter{

    private String weapon;

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void accept(IVisitor visitor) {
         if (visitor.getClass().equals(EquipWeapon.class)){
             visitor.visit(this);
         }
    }
}
