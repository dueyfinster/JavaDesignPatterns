package structural.facade;

public class HDD {
    private static final byte[] ZERO_LENGTH_ARRAY = new byte[0];

    public byte[] read(final long block, final int size) {
        System.out.println("HDD is loading from block: " + block + " with size " + size);
        
        return ZERO_LENGTH_ARRAY;
    }
}
