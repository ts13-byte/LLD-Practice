package loggingsystem;

public class LoggingSystemTest {
    public static void main(String[] args) {
        LoggingHandler loggingHandler = new InfoLoggingHandler(new ErrorLoggingHandler
                (new DebugLoggingHandler(null)));
        loggingHandler.log(LoggingHandler.ERROR , "message 1");
        loggingHandler.log(LoggingHandler.DEBUG,"message 2");
        loggingHandler.log(LoggingHandler.INFO, "message 3");
    }
}
