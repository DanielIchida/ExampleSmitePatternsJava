package patterns.mediator;

import java.util.ArrayList;

public class Mediator implements IMediator{

    private final ArrayList<Gods> gods;

    public Mediator(){
        gods = new ArrayList<>();
    }

    public void add(Gods god){
        this.gods.add(god);
    }

    @Override
    public void attack(int points, Gods god) {
        for (Gods g : gods) {
            if(g != god){
                g.receive(points);
            }
        }
    }
}
