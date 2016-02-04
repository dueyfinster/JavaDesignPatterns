package creational.singleton;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SingletonTest {

    @Test
    public void testSingletonIsTheSame() {
        Singleton once = Singleton.INSTANCE;
        Singleton twice = Singleton.INSTANCE;

        assertEquals(once, twice);
    }

}
