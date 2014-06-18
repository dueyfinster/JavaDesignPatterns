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
interface ICommand {
    
    void execute();
    
    void rollback();

}
