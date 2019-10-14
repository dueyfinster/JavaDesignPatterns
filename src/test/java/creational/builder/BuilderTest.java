package creational.builder;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Similar to Factory (it builds objects for us), but we can build our objects
 * incrementally.
 * 
 * We set each property we want, and when we are ready we can return the
 * finished object.
 */
public class BuilderTest {

    @Test
    public void build_a_house_specifying_what_we_need() {

        HouseBuilder hb = new HouseBuilder(); // create a new builder
        hb.setHouseType(HouseType.DETACHED); // set attribute on builder
        hb.setNoOfDoors(3); // set attribute on builder
        hb.setNoOfWindows(7); // set attribute on builder
        House h = hb.getResult(); // only now do we create a house when all the pieces are in place

        assertTrue(h instanceof House);
        assertEquals(HouseType.DETACHED, h.getHouseType());
        assertEquals(3, h.getNoOfDoors());
        assertEquals(7, h.getNoOfWindows());
    }

}
