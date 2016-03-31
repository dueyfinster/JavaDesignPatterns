package behavioural.visitor;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Date;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class VisitorTest {
        final String DISPLAY_MOUSE = "Displaying Mouse.";
        final String DISPLAY_KB = "Displaying Keyboard.";
        final String DISPLAY_MON = "Displaying Monitor.";
        final String DISPLAY_COMP = "Displaying Computer.";
        private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

        @Before
        public void setUp() throws Exception {
            System.setOut(new PrintStream(outContent));
            System.setErr(new PrintStream(errContent));
        }
        
        @Test
        public void testStatePreserved(){
            ComputerPart computer = new Computer();
            computer.accept(new ComputerPartDisplayVisitor());
            assertTrue(outContent.toString().contains(DISPLAY_MOUSE));
            assertTrue(outContent.toString().contains(DISPLAY_KB));
            assertTrue(outContent.toString().contains(DISPLAY_MON));
            assertTrue(outContent.toString().contains(DISPLAY_COMP));

        }
}
