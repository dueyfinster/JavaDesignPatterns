package behavioural.observer;

public final class ObserverRunner {
    
    private ObserverRunner(){
        
    }
    
    public static void main(final String[] args) {
        Observer doubleObserver = new DoubleObserver();
        Observer tripleObserver = new TripleObserver();
        Subject subject = new DefaultSubject();
        
        subject.attach(doubleObserver);
        subject.attach(tripleObserver);
        subject.setState(1);
        subject.setState(2);
    }
}
