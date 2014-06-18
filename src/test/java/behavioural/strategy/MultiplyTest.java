package behavioural.strategy;

import junit.framework.TestCase;

public class MultiplyTest extends TestCase {
    private Multiply multiply;
    private final static int A = 5;
    private final static int B = 7;
    private final static int EXPECTED = 35;


    public void setUp() throws Exception {
        multiply = new Multiply();
    }

    public void testExecute() throws Exception {
        int result = multiply.execute(A, B);
        assertEquals(EXPECTED, result);
    }
}