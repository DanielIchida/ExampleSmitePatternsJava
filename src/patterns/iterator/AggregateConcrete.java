package patterns.iterator;

import java.util.Vector;

public class AggregateConcrete implements Aggregate{

    protected Vector<String> gods = new Vector<String>();

    public AggregateConcrete() {
        this.fill();
    }

    @Override
    public Iterator getIterator() {
        return new IteratorConcrete(this);
    }

    public void fill(){
        gods.add("ZEUS");
        gods.add("VULCANO");
        gods.add("FREYA");
        gods.add("TANATOS");
    }
}
