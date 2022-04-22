package patterns.abstractfactory;

import java.util.List;

public interface Items {
    List<AttackTool> createAttacks();
    List<DefenseTool> createDefends();
}
