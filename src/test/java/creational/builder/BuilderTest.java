package creational.builder;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class BuilderTest {
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
    	
    	HouseBuilder hb = new HouseBuilder(); // create a new builder
        hb.setHouseType(HouseType.DETACHED); // set attribute on builder
        hb.setNoOfDoors(3); // set attribute on builder
        hb.setNoOfWindows(3); // set attribute on builder
        House house = hb.getResult(); // only now do we create a house when all the pieces are in place
        System.out.println(house);
         
         // TODO - Validate 
    }

}
