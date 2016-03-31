package behavioural.mediator;
import java.util.Date;

public final class ChatRoom {
    
    private ChatRoom() {};
    
   public static void showMessage(final User user, final String message){
      System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
   }
}
