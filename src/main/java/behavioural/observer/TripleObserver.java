package behavioural.observer;

public class TripleObserver implements Observer {
    int state = 0;
    
    @Override
    public void update(Subject subject) {
        this.state = subject.getState() * 3;
        System.out.println("Subject tripled: "+state);
    }
    
    @Override
    public int getState () {
        return this.state;
    }

}
