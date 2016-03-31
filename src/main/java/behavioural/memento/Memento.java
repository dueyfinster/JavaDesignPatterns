package behavioural.memento;

public class Memento {
   private String state;

   public Memento(final String state){
      this.state = state;
   }

   public String getState(){
      return state;
   }

}
