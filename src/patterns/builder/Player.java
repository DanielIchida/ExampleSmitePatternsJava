package patterns.builder;

import java.util.List;

public class Player {

    public void selectGod(Gods gods){
        List<Skill> items = gods.items();
        for (Skill s: items) {
            s.attack();
            s.defend();
            System.out.println();
        }
    }

}
