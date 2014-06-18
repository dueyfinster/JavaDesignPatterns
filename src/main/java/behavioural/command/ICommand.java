/**
 * 
 */
package behavioural.command;

/**
 * @author Neil Grogan
 * 
 * The Command Interface which gives all commands common methods.
 * 
 */
public interface ICommand {
    
    public void execute();
    
    public void rollback();

}
