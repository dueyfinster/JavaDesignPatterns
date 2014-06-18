package behavioural.command;

import junit.framework.TestCase;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class LightBulbTest extends TestCase {
    private LightBulb lightBulb;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    public void setUp() throws Exception {
        lightBulb = new LightBulb();
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    public void tearDown() throws Exception {
        lightBulb = null;

    }

    public void testTurnOn() throws Exception {
        lightBulb.turnOn();
        assertEquals("Light is now on\n", outContent.toString());
    }

    public void testTurnOff() throws Exception {
        lightBulb.turnOff();
        assertEquals("Light is now off\n", outContent.toString());
    }
}