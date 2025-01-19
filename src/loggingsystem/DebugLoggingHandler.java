package loggingsystem;

public class DebugLoggingHandler extends LoggingHandler {
    public DebugLoggingHandler(LoggingHandler nextLoggingHandler) {
        super(nextLoggingHandler);
    }

    public void log(int loggingLevel , String message) {
        if(loggingLevel == LoggingHandler.DEBUG) {
            System.out.println("DEBUG : " + message);
        } else {
            super.log(loggingLevel,message);
        }
    }
}
