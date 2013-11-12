package structural.facade;

public class HDD {
	public byte[] read(long block, int size) {
		System.out.println("HDD is loading from block: " + block + " with size " + size);
		
		return null;
	}
}
