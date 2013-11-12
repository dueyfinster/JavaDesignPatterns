package creational.objectpool;

public class PoolObject {
	private int i;
	
	PoolObject(int i){
		this.i = i;
	}
	
	public int getValue(){
		return this.i;
	}

	public void close() {
		System.out.println("Closed");
		
	}
}
