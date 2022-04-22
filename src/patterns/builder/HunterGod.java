package patterns.builder;

import java.util.ArrayList;
import java.util.List;

public class HunterGod implements Gods {
    @Override
    public List<Skill> items() {
        List<Skill> items = new ArrayList<>();
        items.add(new AttackPhysical());
        items.add(new TheftLife());
        items.add(new DefendMagic());
        return items;
    }
}
