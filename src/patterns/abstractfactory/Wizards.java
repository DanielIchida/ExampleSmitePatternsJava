package patterns.abstractfactory;

import java.util.ArrayList;
import java.util.List;

public class Wizards implements Items {

    @Override
    public List<AttackTool> createAttacks() {
        List<AttackTool> attackTools = new ArrayList<>();
        attackTools.add(new AttackMagic(10));
        return attackTools;
    }

    @Override
    public List<DefenseTool> createDefends() {
        List<DefenseTool> defenseTools = new ArrayList<>();
        defenseTools.add(new DefendMagic(5));
        return defenseTools;
    }
}
