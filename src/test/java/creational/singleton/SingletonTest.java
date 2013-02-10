package creational.singleton;

import static org.junit.Assert.*;

import org.junit.Test;

import creational.singleton.Singleton;

public class SingletonTest {

	@Test
	public void testSingletonIsTheSame() {
		Singleton once = Singleton.INSTANCE;
		Singleton twice = Singleton.INSTANCE;
		
		assertEquals(once, twice);
		
	}

}
