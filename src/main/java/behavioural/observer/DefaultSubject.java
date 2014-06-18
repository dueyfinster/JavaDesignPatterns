package behavioural.observer;

import java.util.Collection;
import java.util.HashSet;

public class DefaultSubject implements Subject {
    Collection<Observer> observers = new HashSet<Observer>();
    int state;

    @Override
    public void attach(final Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(final Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyOservers() {
        for (Observer observer: observers) {
            observer.update(this);
        }
    }
    
    @Override
    public int getState() {
        return this.state;
    }
    
    @Override
    public void setState(final int state) {
        this.state = state;
        this.notifyOservers();
    }
}
