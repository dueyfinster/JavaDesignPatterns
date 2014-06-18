package structural.facade;

import java.util.Arrays;

public class Memory {
    public void load(final long position, final byte[] data) {
        System.out.println("Memory is loading from position: " + position + " with data " + Arrays.toString(data));
    }
}
