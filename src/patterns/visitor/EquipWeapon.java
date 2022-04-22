package patterns.visitor;

import java.util.List;

public class EquipWeapon implements IVisitor{
    @Override
    public void visit(Wizard wizard) {
        wizard.setWeapon("magic bar");
    }

    @Override
    public void visit(Warrior warrior) {
        warrior.setWeapon("sword");
    }

    @Override
    public void visit(List<ICharacter> characters) {
        for (ICharacter c : characters){
            c.accept(this);
        }
    }
}
