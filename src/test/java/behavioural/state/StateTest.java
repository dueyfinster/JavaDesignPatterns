package behavioural.state;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class StateTest {
        final String START_STATE = "Start State";
        final String STOP_STATE = "Stop State";
        final String START_MESSAGE = "Player is in start state";
        final String STOP_MESSAGE = "Player is in stop state";
        private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

        @Before
        public void setUp() throws Exception {
            System.setOut(new PrintStream(outContent));
            System.setErr(new PrintStream(errContent));
        }
        
        @Test
        public void testStatePreserved(){
            Context context = new Context();

            StartState startState = new StartState();
            startState.doAction(context);
            assertTrue(outContent.toString().contains(START_MESSAGE));

            System.out.println(context.getState().toString());
            assertTrue(outContent.toString().contains(START_STATE));

            StopState stopState = new StopState();
            stopState.doAction(context);
            assertTrue(outContent.toString().contains(STOP_MESSAGE));

            System.out.println(context.getState().toString());
            assertTrue(outContent.toString().contains(START_STATE));

        }
}
