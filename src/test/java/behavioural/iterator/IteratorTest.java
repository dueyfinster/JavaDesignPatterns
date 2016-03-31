package behavioural.iterator;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

public class IteratorTest {
        final String[] names = {"Name: Robert", "Name: John", "Name: Julie", "Name: Lora"};
        private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

        @Before
        public void setUp() throws Exception {
            System.setOut(new PrintStream(outContent));
            System.setErr(new PrintStream(errContent));
        }
        
        @Test
        public void testNamesInOrder(){
            final NameRepository namesRepository = new NameRepository();
            int i = 0;
            for(final Iterator iter = namesRepository.getIterator(); iter.hasNext();){
                final String name = (String) iter.next();
                System.out.println("Name: " + name);
                assertTrue(outContent.toString().contains(names[i++]));
             }
        }

}
