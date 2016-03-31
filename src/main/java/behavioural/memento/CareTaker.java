package behavioural.memento;
import java.util.ArrayList;
import java.util.List;

public class CareTaker {
   private List<Memento> mementoList = new ArrayList<Memento>();

   public void add(final Memento state){
      mementoList.add(state);
   }

   public Memento get(final int index){
      return mementoList.get(index);
   }
}
