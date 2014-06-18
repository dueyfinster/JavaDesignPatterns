package behavioural.command;

/**
 * @author Neil Grogan
 * 
 * Class to run all the commands
 */
final class CommandRunner {

    private CommandRunner(){}

    public static void main(final String[] args) {
        
        LightBulb light = new LightBulb(); // Object we want to manipulate
        
        TurnOffLightCommand tofflc = new TurnOffLightCommand(light); // command
        TurnOnLightCommand tonlc = new TurnOnLightCommand(light); // command
        
        Switch sw = new Switch(); // command executor
        sw.run(tofflc);
        sw.run(tonlc);
        
        sw.undo(tofflc);
        sw.undo(tonlc);
        
        System.out.println("<-- Divide -->");
        
        TurnOffLightCommand tofflc2 = new TurnOffLightCommand(light); // command
        TurnOnLightCommand tonlc2 = new TurnOnLightCommand(light); // command
        
        sw.run(tofflc2);
        sw.run(tonlc2);
        
        sw.undoAll();
        

    }

}
