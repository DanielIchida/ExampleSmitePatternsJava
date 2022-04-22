package patterns.builder;

import java.util.ArrayList;
import java.util.List;

public class MagicGod implements Gods {
    @Override
    public List<Skill> items() {
        List<Skill> items = new ArrayList<>();
        items.add(new DefendMagic());
        items.add(new AttackMagic());
        items.add(new MagicBottle());
        return items;
    }
}
