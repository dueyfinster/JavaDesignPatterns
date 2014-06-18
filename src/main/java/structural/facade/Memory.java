package structural.facade;

public class Memory {
    public void load(final long position, final byte[] data) {
        System.out.println("Memory is loading from position: " + position + " with data " + data);
    }
}
