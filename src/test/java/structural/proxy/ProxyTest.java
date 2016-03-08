package structural.proxy;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

public class ProxyTest {
        private static final String LOADING_SYS_OUT = "Loading test_10mb.jpg";
        private static final String DISPLAY_SYS_OUT = "Displaying test_10mb.jpg";
        private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

        @Before
        public void setUp() throws Exception {
            System.setOut(new PrintStream(outContent));
            System.setErr(new PrintStream(errContent));
        }
        
        @Test
        public void testFirstCallGetsProxy(){
            final Image image = new ProxyImage("test_10mb.jpg");
            image.display();
            assertTrue(outContent.toString().contains(LOADING_SYS_OUT));
            assertTrue(outContent.toString().contains(DISPLAY_SYS_OUT));
            outContent.reset();

            image.display();
            assertTrue(outContent.toString().contains(DISPLAY_SYS_OUT));
            assertFalse(outContent.toString().contains(LOADING_SYS_OUT));
        }

}
