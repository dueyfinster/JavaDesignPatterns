package behavioural.chainofresponsibility;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class ChainOfRespTest {
        private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
        private final String INFO_CONTENT = "Standard Console::Logger: This is an information.\n";
        private final String DEBUG_CONTENT = "Error Console::Logger: This is an debug level information.\nFile::Logger: This is an debug level information.\nStandard Console::Logger: This is an debug level information.\n";
        private final String ERROR_CONTENT = "Error Console::Logger: This is an error information.\nStandard Console::Logger: This is an error information.\n";

        @Before
        public void setUp() throws Exception {
            System.setOut(new PrintStream(outContent));
            System.setErr(new PrintStream(errContent));
        }
        
        
        
        @Test
        public void test_info_logs_correct_levels(){
            AbstractLogger loggerChain = getChainOfLoggers();
            loggerChain.logMessage(LogLevels.INFO, "This is an information.");
            final String outMessage = outContent.toString();
            assertTrue(outMessage.equals(INFO_CONTENT));
        }
        
        @Test
        public void test_debug_logs_correct_levels(){
            AbstractLogger loggerChain = getChainOfLoggers();
            loggerChain.logMessage(LogLevels.DEBUG, "This is an debug level information.");
            final String outMessage = outContent.toString();
            assertTrue(outMessage.equals(DEBUG_CONTENT));
        }
        
        @Test
        public void test_error_logs_correct_levels(){
            AbstractLogger loggerChain = getChainOfLoggers();
            loggerChain.logMessage(LogLevels.ERROR, "This is an error information.");
            final String outMessage = outContent.toString();
            assertTrue(outMessage.equals(ERROR_CONTENT));
        }
        
        
        private AbstractLogger getChainOfLoggers(){

            AbstractLogger errorLogger = new ErrorLogger(LogLevels.ERROR);
            AbstractLogger fileLogger = new FileLogger(LogLevels.DEBUG);
            AbstractLogger consoleLogger = new ConsoleLogger(LogLevels.INFO);

            errorLogger.setNextLogger(fileLogger);
            fileLogger.setNextLogger(consoleLogger);

            return errorLogger;
         }

}
