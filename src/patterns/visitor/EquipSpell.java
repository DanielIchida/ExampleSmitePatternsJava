package patterns.visitor;

import java.util.List;

public class EquipSpell implements IVisitor{
    @Override
    public void visit(Wizard wizard) {
         if(wizard.getLevelMagic() > 5){
            wizard.setSpell("fireball");
         }else {
            wizard.setSpell("Ice ray");
         }
    }

    @Override
    public void visit(Warrior warrior) {

    }

    @Override
    public void visit(List<ICharacter> characters) {
        for (ICharacter c : characters){
            c.accept(this);
        }
    }
}
