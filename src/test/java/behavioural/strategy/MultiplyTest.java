package behavioural.strategy;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class MultiplyTest extends TestCase {
    private Multiply multiply;
    private final static int A = 5;
    private final static int B = 7;
    private final static int EXPECTED = 35;

    @Before
    public void setUp() throws Exception {
        multiply = new Multiply();
    }

    @Test
    public void testExecute() throws Exception {
        int result = multiply.execute(A, B);
        assertEquals(EXPECTED, result);
    }
}