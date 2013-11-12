package creational.objectpool;

public class ObjectPoolRunner {
	public static void main(String[] args) {
		ObjectPoolImpl opi = new ObjectPoolImpl(); // create a new pool
		PoolObject po = (PoolObject) opi.checkOut(); // check out from the pool
		System.out.println("Does it validate? : " + opi.validate(po)); // Validate it's still good
		opi.checkIn(po); // check back in to the pool (we're finished our work)
		PoolObject po1 = (PoolObject) opi.checkOut(); // check out from the pool (get object checked in)
		PoolObject po2 = (PoolObject) opi.checkOut(); // check out from the pool (get new object as pool is depleted)
	}
}
