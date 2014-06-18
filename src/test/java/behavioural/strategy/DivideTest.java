package behavioural.strategy;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class DivideTest extends TestCase {
    private Divide divide;
    private final static int A = 10;
    private final static int B = 5;
    private final static int EXPECTED = 2;

    @Before
    public void setUp() throws Exception {
        divide = new Divide();
    }

    @Test
    public void testExecute() throws Exception {
        int result = divide.execute(A, B);
        assertEquals(EXPECTED, result);
    }

}