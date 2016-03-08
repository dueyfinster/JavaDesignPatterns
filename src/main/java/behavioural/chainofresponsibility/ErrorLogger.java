package behavioural.chainofresponsibility;

public class ErrorLogger extends AbstractLogger {

   public ErrorLogger(final LogLevels error){
      this.level = error;
   }

   @Override
   protected void write(final String message) {
      System.out.println("Error Console::Logger: " + message);
   }
}
