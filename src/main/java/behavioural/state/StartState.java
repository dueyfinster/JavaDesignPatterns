package behavioural.state;
public class StartState implements State {

   public void doAction(final Context context) {
      System.out.println("Player is in start state");
      context.setState(this);
   }

   public String toString(){
      return "Start State";
   }

}
