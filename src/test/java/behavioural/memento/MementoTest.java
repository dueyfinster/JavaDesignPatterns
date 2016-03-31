package behavioural.memento;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class MementoTest {
        final String state1 = "State #1";
        final String state2 = "State #2";
        final String state3 = "State #3";
        final String state4 = "State #4";
        private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

        @Before
        public void setUp() throws Exception {
            System.setOut(new PrintStream(outContent));
            System.setErr(new PrintStream(errContent));
        }
        
        @Test
        public void testStatesSaved(){
            Originator originator = new Originator();
            CareTaker careTaker = new CareTaker();
            
            originator.setState(state1);
            originator.setState(state2);
            careTaker.add(originator.saveStateToMemento());
            
            originator.setState(state3);
            careTaker.add(originator.saveStateToMemento());
            
            originator.setState(state4);
            System.out.println("Current State: " + originator.getState());
            
            originator.getStateFromMemento(careTaker.get(0));
            System.out.println("First saved State: " + originator.getState());
            assertTrue(outContent.toString().contains(state2));

            originator.getStateFromMemento(careTaker.get(1));
            System.out.println("Second saved State: " + originator.getState());
            assertTrue(outContent.toString().contains(state3));

        }

}
