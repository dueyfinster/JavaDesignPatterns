package behavioural.observer;

public class TripleObserver implements Observer {
    int state = 0;
    
    @Override
    public void update(final Subject subject) {
        this.state = subject.getState() * THREE;
        System.out.println("Subject tripled: "+state);
    }
    
    @Override
    public int getState() {
        return this.state;
    }

    public static final int THREE = 3;
}
