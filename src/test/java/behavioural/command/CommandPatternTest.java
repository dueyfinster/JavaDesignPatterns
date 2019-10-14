package behavioural.command;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Command Pattern groups "commands" (anything the implements ICommand) and
 * gives you the ability to execute them all or rollback with one method call.
 * 
 * Here we see we can wrap a light bulb class with commands, and then
 * selectively run or undo them as we wish.
 * 
 */
public class CommandPatternTest {

    @Test
    public void light_switched_on_and_undo_with_command() {
        LightBulb light = new LightBulb(); // Object we want to manipulate

        TurnOnLightCommand tonlc = new TurnOnLightCommand(light); // command we create to wrap object

        Switch sw = new Switch(); // command executor

        sw.run(tonlc);
        assertTrue(light.isLightOn());
        sw.undo(tonlc);
        assertFalse(light.isLightOn());
    }

    @Test
    public void light_switched_off_and_undo_with_command() {
        LightBulb light = new LightBulb(); // Object we want to manipulate

        TurnOffLightCommand tofflc = new TurnOffLightCommand(light); // command

        Switch sw = new Switch(); // command executor

        sw.run(tofflc);
        assertFalse(light.isLightOn());
        sw.undo(tofflc);
        assertTrue(light.isLightOn());
    }

    @Test
    public void test2() {
        LightBulb light = new LightBulb(); // Object we want to manipulate

        TurnOffLightCommand tofflc = new TurnOffLightCommand(light); // command
        TurnOnLightCommand tonlc = new TurnOnLightCommand(light); // command

        Switch sw = new Switch(); // command executor

        sw.run(tofflc);
        sw.run(tonlc);

        sw.undoAll();

        assertTrue(light.isLightOn());
    }

}
