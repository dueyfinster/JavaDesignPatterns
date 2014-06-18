package behavioural.strategy;

import junit.framework.TestCase;

public class SubtractTest extends TestCase {
    private Subtract subtract;
    private final static int A = 10;
    private final static int B = 5;
    private final static int EXPECTED = 5;


    public void setUp() throws Exception {
        subtract = new Subtract();
    }

    public void testExecute() throws Exception {
        int result = subtract.execute(A, B);
        assertEquals(EXPECTED, result);
    }

}