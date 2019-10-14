package structural.facade;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Facades hide complexities to the user. For example here, we just want a
 * computer - no need to know the specs of CPU, Processor etc.
 */
public class FacadeTest {

    @Test
    public void call_facade_verify_dependents_called() {
        ComputerFacade cf = new ComputerFacade(); // Hide low-level details with facade
        cf.start();

        // TODO: Verify dependents called - mocking framework?
    }

}
