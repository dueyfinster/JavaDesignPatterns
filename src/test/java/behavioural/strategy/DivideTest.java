package behavioural.strategy;

import junit.framework.TestCase;

public class DivideTest extends TestCase {
    private Divide divide;
    private final static int A = 10;
    private final static int B = 5;
    private final static int EXPECTED = 2;


    public void setUp() throws Exception {
        divide = new Divide();
    }

    public void testExecute() throws Exception {
        int result = divide.execute(A, B);
        assertEquals(EXPECTED, result);
    }

}