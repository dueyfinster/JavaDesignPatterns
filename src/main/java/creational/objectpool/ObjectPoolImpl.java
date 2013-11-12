package creational.objectpool;

public class ObjectPoolImpl extends ObjectPool{

	@Override
	Object create() {
		return new PoolObject(5);
	}

	@Override
	boolean validate(PoolObject o) {
		if(o.getValue() == 5){
			System.out.println("The object: " + o + " validates");
			return true;
		}else{
			System.out.println("The object: " + o + " fails validation. \n Value is: " + o.getValue() + " but should be " + 5);
			return false;
		}
	}
	

	@Override
	void expire(PoolObject o) {
		System.out.println("Expiring object: " + o);
		o.close(); 
		
	}

}
