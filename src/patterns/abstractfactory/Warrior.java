package patterns.abstractfactory;

import java.util.ArrayList;
import java.util.List;

public class Warrior implements Items {
    @Override
    public List<AttackTool> createAttacks() {
        List<AttackTool> attackTools = new ArrayList<>();
        attackTools.add(new AttackPhysical(20));
        return attackTools;
    }

    @Override
    public List<DefenseTool> createDefends() {
        List<DefenseTool> defenseTools = new ArrayList<>();
        defenseTools.add(new DefendPhysical(20));
        defenseTools.add(new Health(10));
        return defenseTools;
    }
}
