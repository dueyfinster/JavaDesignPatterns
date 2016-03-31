package behavioural.memento;

public class Originator {
   private String state;

   public void setState(final String state){
      this.state = state;
   }

   public String getState(){
      return state;
   }

   public Memento saveStateToMemento(){
      return new Memento(state);
   }

   public void getStateFromMemento(final Memento Memento){
      state = Memento.getState();
   }
}
