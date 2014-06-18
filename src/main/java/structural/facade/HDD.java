package structural.facade;

public class HDD {
    public byte[] read(final long block, final int size) {
        System.out.println("HDD is loading from block: " + block + " with size " + size);
        
        return null;
    }
}
