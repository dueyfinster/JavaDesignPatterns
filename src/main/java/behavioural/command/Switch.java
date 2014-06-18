package behavioural.command;

import java.util.ArrayList;
import java.util.List;

/* The Invoker class */
public class Switch {
   private List<ICommand> commandHistory = new ArrayList<ICommand>();
 
   public void run(final ICommand cmd) {
      this.commandHistory.add(cmd);
      cmd.execute();        
   }
   
   public void undo(final ICommand c) {
       c.rollback();
       this.commandHistory.remove(c);           
   }
   
   public void undoAll() {
       for(ICommand c: commandHistory){
              c.rollback();
              this.commandHistory.remove(c);
        }            
   }
}
