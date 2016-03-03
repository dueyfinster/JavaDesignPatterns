package structural.decorator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

public class DecoratorTest {
    private static final String BORDER_COLOR_RED = "Border Color: Red";
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }
    
    @Test
    public void testUndecoratedCircle(){
        final Circle c = new Circle();
        c.draw();
        assertFalse(outContent.toString().contains(BORDER_COLOR_RED));
    }
    
    @Test
    public void testUndecoratedSquare(){
        final Square s = new Square();
        s.draw();
        assertFalse(outContent.toString().contains(BORDER_COLOR_RED));
    }
    
    
    @Test
    public void testRedCircle(){
        final Circle c = new Circle();
        final Shape sd = new RedShapeDecorator(c);
        sd.draw();
        assertTrue(outContent.toString().contains(BORDER_COLOR_RED));
    }
    
    @Test
    public void testRedSquare(){
        final Square s = new Square();
        final Shape sd = new RedShapeDecorator(s);
        sd.draw();
        assertTrue(outContent.toString().contains(BORDER_COLOR_RED));
    }

}
