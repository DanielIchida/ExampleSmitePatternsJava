package patterns.visitor;

import java.util.List;

public interface IVisitor {
    void visit(Wizard wizard);
    void visit(Warrior warrior);
    void visit(List<ICharacter> characters);
}
