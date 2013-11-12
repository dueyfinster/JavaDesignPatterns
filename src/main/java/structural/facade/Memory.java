package structural.facade;

public class Memory {
	public void load(long position, byte[] data) {
		System.out.println("Memory is loading from position: " + position + " with data " + data);
	}
}
