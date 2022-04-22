package patterns.observer;

import java.util.ArrayList;

public abstract class Observer {

    private final ArrayList<IObserver> observers = new ArrayList<>();

    public void add(IObserver observer){
        observers.add(observer);
    }

    public void remove(IObserver observer){
        observers.remove(observer);
    }


    public void notifications(Object value){
        for (IObserver observer:observers) {
             observer.update(this,value);
        }
    }

}
