package behavioural.state;

public class Context {
   private State state;

   public Context(){
      state = null;
   }

   public void setState(final State state){
      this.state = state;
   }

   public State getState(){
      return state;
   }
}
