package creational.objectpool;

public class ObjectPoolRunner {
    public static void main(String[] args) throws InterruptedException {
        ObjectPoolImpl opi = new ObjectPoolImpl(); // create a new pool
        PoolObject po = (PoolObject) opi.checkOut(); // check out from the pool
        opi.validate(po); // Validate it's still good
        opi.checkIn(po); // check back in to the pool (we're finished our work)
        PoolObject po1 = (PoolObject) opi.checkOut(); // check out from the pool (get object checked in)
        //Thread.sleep(12000); //TODO test expiration
        PoolObject po2 = (PoolObject) opi.checkOut();
        opi.checkIn(po1); // check back in to the pool (we're finished our work)
        po2 = new PoolObject(0); // overwrite with wrong value
        opi.checkIn(po2); // check wrong value in
        opi.validate(po2); // Validation fails
    }
}
