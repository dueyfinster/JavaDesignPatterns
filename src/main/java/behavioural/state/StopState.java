package behavioural.state;
public class StopState implements State {

   public void doAction(final Context context) {
      System.out.println("Player is in stop state");
      context.setState(this);
   }

   public String toString(){
      return "Stop State";
   }
}

