package creational.objectpool;

public class PoolObject {
    private int i;
    
    PoolObject(final int i){
        this.i = i;
    }
    
    public int getValue(){
        return this.i;
    }

    public void close() {
        this.i = 0;
        
    }
}
