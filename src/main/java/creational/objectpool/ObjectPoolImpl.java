package creational.objectpool;

public class ObjectPoolImpl extends ObjectPool{
    private static final int OBJECT_NUMBER = 5;

    @Override
    Object create() {
        return new PoolObject(OBJECT_NUMBER);
    }

    @Override
    boolean validate(final PoolObject o) {
        if(o.getValue() == OBJECT_NUMBER){
            System.out.println("The object: " + o + " validates");
            return true;
        }else{
            System.out.println("The object: " + o + " fails validation. \n Value is: " + 
                    o.getValue() + " but should be " + OBJECT_NUMBER);
            return false;
        }
    }
    

    @Override
    void expire(final PoolObject o) {
        System.out.println("Expiring object: " + o);
        o.close(); 
        
    }

}
