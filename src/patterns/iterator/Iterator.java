package patterns.iterator;

public interface Iterator {
    Object first();
    Object next();
    boolean isMore();
    Object current();

}
