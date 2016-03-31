package behavioural.mediator;
public final class MediatorPatternDemo {
    
   private MediatorPatternDemo(){};
    
   public static void main(final String[] args) {
      User robert = new User("Robert");
      User john = new User("John");

      robert.sendMessage("Hi! John!");
      john.sendMessage("Hello! Robert!");
   }
}
