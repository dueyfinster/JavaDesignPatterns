package creational.abstractfactory;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class AbstractFactoryTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    
    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @Ignore
    @Test
    public void clone_and_change_prototype_properties() throws CloneNotSupportedException{
    	
    	 System.out.println(HouseFactory.buildHouse(HouseType.DETACHED) + "\n");
         System.out.println(HouseFactory.buildHouse(HouseType.SEMI) + "\n");
         System.out.println(HouseFactory.buildHouse(HouseType.BUNGALOW) + "\n");
         System.out.println(HouseFactory.buildHouse(HouseType.COTTAGE));
         
         // TODO - Validate 
    }

}
