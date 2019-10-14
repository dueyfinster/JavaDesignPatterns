package behavioural.mediator;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class MediatorTest {
    final String john_username = "John";
    final String roberts_username = "Robert";
    final String johnsMessage = "Hi! Robert!";
    final String robertsMessage = "Hello! John!";
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @Test
    public void testChatMessagesSent() {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage(robertsMessage);
        john.sendMessage(johnsMessage);

        final String johnChatLine = messageFormatter(john_username, johnsMessage);
        assertTrue(outContent.toString().contains(johnsMessage));

        final String robertChatLine = messageFormatter(roberts_username, robertsMessage);
        assertTrue(outContent.toString().contains(robertsMessage));

    }

    private String messageFormatter(final String username, final String message) {
        return new Date().toString() + " [" + username + "] : " + message;
    }

}
