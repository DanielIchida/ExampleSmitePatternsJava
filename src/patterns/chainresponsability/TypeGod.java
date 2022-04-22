package patterns.chainresponsability;

public abstract class TypeGod {

    protected TypeGod next;

    public void setNext(TypeGod next) {
        this.next = next;
    }

    public TypeGod getNext() {
        return next;
    }

    public abstract void checking(String typeGod);
}
