package behavioural.strategy;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class SubtractTest extends TestCase {
    private Subtract subtract;
    private final static int A = 10;
    private final static int B = 5;
    private final static int EXPECTED = 5;

    @Before
    public void setUp() throws Exception {
        subtract = new Subtract();
    }

    @Test
    public void testExecute() throws Exception {
        int result = subtract.execute(A, B);
        assertEquals(EXPECTED, result);
    }

}