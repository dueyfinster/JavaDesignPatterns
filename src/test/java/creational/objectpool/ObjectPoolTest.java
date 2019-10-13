package creational.objectpool;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class ObjectPoolTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    
    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @Ignore
    @Test
    public void clone_and_change_prototype_properties() throws CloneNotSupportedException{
    	
    	 ObjectPoolImpl opi = new ObjectPoolImpl(); // create a new pool
         PoolObject po = opi.checkOut(); // check out from the pool
         opi.validate(po); // Validate it's still good
         opi.checkIn(po); // check back in to the pool (we're finished our work)
         PoolObject po1 = opi.checkOut(); // check out from the pool (get object checked in)
         //Thread.sleep(12000); //TODO test expiration
         PoolObject po2 = opi.checkOut();
         opi.checkIn(po1); // check back in to the pool (we're finished our work)
         po2 = new PoolObject(0); // overwrite with wrong value
         opi.checkIn(po2); // check wrong value in
         opi.validate(po2); // Validation fails
         
         // TODO - Validate 
    }

}
