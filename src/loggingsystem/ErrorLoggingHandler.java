package loggingsystem;

public class ErrorLoggingHandler extends LoggingHandler{

    public ErrorLoggingHandler(LoggingHandler nextLoggingHandler) {
        super(nextLoggingHandler);
    }

    public void log(int loggingLevel , String message) {
        if(loggingLevel == LoggingHandler.ERROR) {
            System.out.println("ERROR : " + message);
        } else {
            super.log(loggingLevel,message);
        }
    }
}
