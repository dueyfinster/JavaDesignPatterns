package behavioural.observer;

public class DoubleObserver implements Observer {
    int state = 0;
    
    @Override
    public void update (Subject subject) {
        this.state = subject.getState() * 2;
        System.out.println("Subject doubled: "+state);
    }
    
    @Override
    public int getState () {
        return this.state;
    }

}
