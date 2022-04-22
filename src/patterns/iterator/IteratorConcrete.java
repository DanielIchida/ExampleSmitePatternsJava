package patterns.iterator;

public class IteratorConcrete implements Iterator{

    private final AggregateConcrete aggregateConcrete;
    private int positionCurrent = 0;

    public IteratorConcrete(AggregateConcrete aggregateConcrete) {
        this.aggregateConcrete = aggregateConcrete;
    }

    @Override
    public Object first() {
        Object obj = null;
        if (!this.aggregateConcrete.gods.isEmpty()) {
            this.positionCurrent = 0;
            obj = this.aggregateConcrete.gods.firstElement();
        }
        return obj;
    }

    @Override
    public Object next() {
        Object obj = null;
        if((this.positionCurrent) < this.aggregateConcrete.gods.size()){
            obj = this.aggregateConcrete.gods.elementAt(this.positionCurrent);
            this.positionCurrent = this.positionCurrent + 1;
        }
        return obj;
    }

    @Override
    public boolean isMore() {
        return (this.positionCurrent) < this.aggregateConcrete.gods.size();
    }

    @Override
    public Object current() {
        Object obj = null;
        if((this.positionCurrent) < this.aggregateConcrete.gods.size()){
            obj = this.aggregateConcrete.gods.elementAt(this.positionCurrent);
        }
        return obj;
    }
}
