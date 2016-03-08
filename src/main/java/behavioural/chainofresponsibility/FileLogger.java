package behavioural.chainofresponsibility;

public class FileLogger extends AbstractLogger {

   public FileLogger(final LogLevels level){
      this.level = level;
   }

   @Override
   protected void write(final String message) {
      System.out.println("File::Logger: " + message);
   }
}
