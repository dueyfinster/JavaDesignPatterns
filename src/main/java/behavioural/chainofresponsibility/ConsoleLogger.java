package behavioural.chainofresponsibility;

public class ConsoleLogger extends AbstractLogger {

   public ConsoleLogger(final LogLevels level){
      this.level = level;
   }

   @Override
   protected void write(final String message) {
      System.out.println("Standard Console::Logger: " + message);
   }
}
