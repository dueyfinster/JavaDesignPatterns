package behavioural.strategy;

import junit.framework.TestCase;

public class AddTest extends TestCase {
    private Add add;
    private final static int A = 5;
    private final static int B = 7;
    private final static int EXPECTED = 12;


    public void setUp() throws Exception {
        add = new Add();
    }

    public void testExecute() throws Exception {
        int result = add.execute(A, B);
        assertEquals(EXPECTED, result);
    }
}