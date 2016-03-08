package behavioural.chainofresponsibility;

public abstract class AbstractLogger {

   protected LogLevels level;

   //next element in chain or responsibility
   protected AbstractLogger nextLogger;

   public void setNextLogger(final AbstractLogger nextLogger){
      this.nextLogger = nextLogger;
   }

   public void logMessage(final LogLevels level, final String message){
      if(this.level.getLevelCode() <= level.getLevelCode()){
         write(message);
      }
      if(nextLogger !=null){
         nextLogger.logMessage(level, message);
      }
   }

   protected abstract void write(final String message);
}
