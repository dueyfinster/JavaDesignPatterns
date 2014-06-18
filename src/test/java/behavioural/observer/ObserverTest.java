package behavioural.observer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ObserverTest {
    Observer doubleObserver;
    Observer tripleObserver;
    Subject subject;
    
    @Before
    public void setUpObserver () {
        doubleObserver = new DoubleObserver();
        tripleObserver = new TripleObserver();
        subject = new DefaultSubject();
        subject.attach(doubleObserver);
        subject.attach(tripleObserver);
    }
          
    @Test
    public void checkDoubleObserver ()
    {
        subject.setState (1);
        Assert.assertEquals(2, doubleObserver.getState());
        
        subject.setState(2);
        Assert.assertEquals(4, doubleObserver.getState());
    }
    
    @Test
    public void checkTripleObserver ()
    {
        subject.setState (1);
        Assert.assertEquals(3, tripleObserver.getState());
        
        subject.setState(2);
        Assert.assertEquals(6, tripleObserver.getState());
    }
}
