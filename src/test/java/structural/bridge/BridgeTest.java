package structural.bridge;

import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class BridgeTest {

    @Test
    public void testRedCircleImplementsBridgeAPI() {
        RedCircle rc = new RedCircle();
        assertTrue(rc instanceof DrawAPI);
    }
    
    @Test
    public void testGreenCircleImplementsBridgeAPI() {
        GreenCircle gc = new GreenCircle();
        assertTrue(gc instanceof DrawAPI);
    }
    
    @Test
    public void testCircleIsAShape() {
        Circle c = new Circle(10,10,2,new RedCircle());
        assertTrue(c instanceof Shape);
    }
}
