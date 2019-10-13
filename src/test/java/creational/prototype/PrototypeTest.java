package creational.prototype;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class PrototypeTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    private static final String HOUSE_TYPE_SEMI = "HouseType: SEMI";
    private static final String HOUSE_TYPE_DTACH = "HouseType: DETACHED";
    
    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    
    @Test
    public void clone_and_change_prototype_properties() throws CloneNotSupportedException{
    	
    	House house = new House(); // Create a new house
        House house2 = house.clone(); // Clone from the house

        // make the house we cloned a mansion
        House mansion = new PrototypeRunner().makeHouseAMansion(house2);
        
        assertTrue(house.toString().contains(HOUSE_TYPE_SEMI));
        assertTrue(mansion.toString().contains(HOUSE_TYPE_DTACH));
    }

}
