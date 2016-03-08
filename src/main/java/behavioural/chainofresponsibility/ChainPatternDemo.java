package behavioural.chainofresponsibility;

public final class ChainPatternDemo {
    
    private ChainPatternDemo(){}

   private static AbstractLogger getChainOfLoggers(){

      AbstractLogger errorLogger = new ErrorLogger(LogLevels.ERROR);
      AbstractLogger fileLogger = new FileLogger(LogLevels.DEBUG);
      AbstractLogger consoleLogger = new ConsoleLogger(LogLevels.INFO);

      errorLogger.setNextLogger(fileLogger);
      fileLogger.setNextLogger(consoleLogger);

      return errorLogger;
   }

   public static void main(final String[] args) {
      AbstractLogger loggerChain = getChainOfLoggers();

      loggerChain.logMessage(LogLevels.INFO, 
         "This is an information.");

      loggerChain.logMessage(LogLevels.DEBUG, 
         "This is an debug level information.");

      loggerChain.logMessage(LogLevels.ERROR, 
         "This is an error information.");
   }
}
