package patterns.observer;

public class Gods implements IObserver{

    private final String name;

    public Gods(String name) {
        this.name = name;
    }

    @Override
    public void update(Observer observer,Object value) {
        System.out.println("Gods "+this.name+" is receive Power "+value);
    }
}
