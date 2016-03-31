package behavioural.template;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class TemplateTest {
        final String HURLING = "Hurling ";
        final String FOOTBALL = "Football ";
        final String GAME_INIT = "Game Initialized! Start playing.";
        final String GAME_STARTED = "Game Started. Enjoy the game!";
        final String GAME_FINISHED = "Game Finished!";
        private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

        @Before
        public void setUp() throws Exception {
            System.setOut(new PrintStream(outContent));
            System.setErr(new PrintStream(errContent));
        }
        
        @Test
        public void testStatePreserved(){
            Game game = new Hurling();
            game.play();
            assertTrue(outContent.toString().contains(HURLING + GAME_INIT));
            assertTrue(outContent.toString().contains(HURLING + GAME_STARTED));
            assertTrue(outContent.toString().contains(HURLING + GAME_FINISHED));
            
            
            game = new Football();
            game.play();
            assertTrue(outContent.toString().contains(FOOTBALL + GAME_INIT));
            assertTrue(outContent.toString().contains(FOOTBALL + GAME_STARTED));
            assertTrue(outContent.toString().contains(FOOTBALL + GAME_FINISHED));

        }
}
