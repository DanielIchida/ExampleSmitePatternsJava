package patterns.visitor;

public class Wizard implements ICharacter{

    private int levelMagic = 1;
    private String weapon;
    private String spell;

    public int getLevelMagic() {
        return levelMagic;
    }

    public void setLevelMagic(int levelMagic) {
        this.levelMagic = levelMagic;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
