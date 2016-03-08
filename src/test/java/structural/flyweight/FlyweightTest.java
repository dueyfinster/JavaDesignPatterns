package structural.flyweight;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class FlyweightTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final String RED = "Red";
    private final String BLUE = "Blue";
    
    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }
    
    @Test
    public void same_colour_circle_same_objects(){
        Circle c1 = (Circle) ShapeFactory.getCircle(RED);
        Circle c2 = (Circle) ShapeFactory.getCircle(RED);
        
        assertTrue(c1 == c2);
    }
    
    @Test
    public void different_colour_circle_different_objects(){
        Circle c1 = (Circle) ShapeFactory.getCircle(RED);
        Circle c2 = (Circle) ShapeFactory.getCircle(BLUE);
        
        assertFalse(c1 == c2);
    }
}
