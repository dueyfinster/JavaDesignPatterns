package creational.objectpool;

public class ObjectPoolImpl extends ObjectPool{

	@Override
	Object create() {
		return new PoolObject(5);
	}

	@Override
	boolean validate(PoolObject o) {
		if(o.getValue() == 5){
			return true;
		}else{
			return false;
		}
	}

	@Override
	void expire(PoolObject o) {
		o.close(); 
		
	}

}
