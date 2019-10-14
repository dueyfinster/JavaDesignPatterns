package creational.abstractfactory;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Abstract Factories will do the heavy lifting (through other factories) of
 * creating objects we need in a certain way.
 * 
 * For example, I want all of my Houses to be type "House" but some are in the
 * form of a Bungalow, Semi-Detached etc etc. It's also abstracted to me that
 * the houses are in the suburbs.
 * 
 */
public class AbstractFactoryTest {

    @Test
    public void factory_will_build_detached_house() {

        House h = HouseFactory.buildHouse(HouseType.DETACHED);

        assertTrue(h instanceof House);
        assertTrue(h instanceof DetachedHouse);
        assertFalse(h instanceof SemiDetachedHouse);
    }

    @Test
    public void factory_will_build_semid_house() {

        House h = HouseFactory.buildHouse(HouseType.SEMI);

        assertTrue(h instanceof House);
        assertTrue(h instanceof SemiDetachedHouse);
        assertFalse(h instanceof DetachedHouse);
    }

    @Test
    public void factory_will_build_bungalow_house() {

        House h = HouseFactory.buildHouse(HouseType.BUNGALOW);

        assertTrue(h instanceof House);
        assertTrue(h instanceof BungalowHouse);
        assertFalse(h instanceof CottageHouse);
    }

    @Test
    public void factory_will_build_cottage_house() {

        House h = HouseFactory.buildHouse(HouseType.COTTAGE);

        assertTrue(h instanceof House);
        assertTrue(h instanceof CottageHouse);
        assertFalse(h instanceof BungalowHouse);
    }
}
