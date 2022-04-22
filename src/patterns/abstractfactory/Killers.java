package patterns.abstractfactory;

import java.util.ArrayList;
import java.util.List;

public class Killers implements Items {

    @Override
    public List<AttackTool> createAttacks() {
        List<AttackTool> attackTools = new ArrayList<>();
        attackTools.add(new AttackPhysical(20));
        attackTools.add(new LifeTheft(30));
        return attackTools;
    }

    @Override
    public List<DefenseTool> createDefends() {
        List<DefenseTool> defenseTools = new ArrayList<>();
        defenseTools.add(new DefendPhysical(5));
        return defenseTools;
    }
}
