package behavioural.command;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class LightBulbTest extends TestCase {
    private LightBulb lightBulb;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUp() throws Exception {
        lightBulb = new LightBulb();
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void tearDown() throws Exception {
        lightBulb = null;
    }

    @Test
    public void testTurnOn() throws Exception {
        lightBulb.turnOn();
        assertEquals("Light is now on\n", outContent.toString());
    }

    @Test
    public void testTurnOff() throws Exception {
        lightBulb.turnOff();
        assertEquals("Light is now off\n", outContent.toString());
    }
}