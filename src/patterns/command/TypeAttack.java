package patterns.command;

import java.util.ArrayList;

public class TypeAttack {

    private final ArrayList<ITypeAttack> typeAttacks = new ArrayList<>();

    public void add(ITypeAttack typeAttack){
        this.typeAttacks.add(typeAttack);
    }

    public ITypeAttack get(int option){
        return this.typeAttacks.get(option);
    }

}
