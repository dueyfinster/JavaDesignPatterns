package creational.objectpool;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Object pools are primarily used for performance.
 * 
 * You can check-in & check-out objects as needed and the pool will manage
 * lifecycle of objects: ie. expiry of objects, creating new objects, etc. etc.
 */
public class ObjectPoolTest {
    ObjectPool pool;

    @Before
    public void setUp() {
        pool = new ObjectPoolImpl(); // create a new pool
    }

    @Test
    public void checkout_valid_pool_object() throws CloneNotSupportedException {
        PoolObject po = pool.checkOut(); // check out from the pool
        assertTrue(pool.validate(po)); // Validate it's still good
    }

    @Test
    public void checkin_invalid_pool_object() throws CloneNotSupportedException {
        PoolObject po = new PoolObject(0); // create invalid pool object, not from our pool

        pool.checkIn(po); // check wrong value in

        assertFalse(pool.validate(po));
    }

    @Test
    public void validate_expired_pool_object() throws CloneNotSupportedException {
        PoolObject po = pool.checkOut(); // check out from the pool

        pool.expire(po); // Expire the object

        assertFalse(pool.validate(po));
    }

    @Ignore
    @Test
    public void timed_out_pool_object() throws CloneNotSupportedException, InterruptedException {
        PoolObject po = pool.checkOut(); // check out from the pool
        assertTrue(po.getValue() == 5); // Value is valid

        Thread.sleep(12000); // Test expiration

        assertFalse(po.getValue() == 0); // Value is invalid after timeout
    }

}
