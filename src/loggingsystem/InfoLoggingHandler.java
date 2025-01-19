package loggingsystem;

public class InfoLoggingHandler extends LoggingHandler{

    public InfoLoggingHandler(LoggingHandler nextLoggingHandler) {
        super(nextLoggingHandler);
    }

    public void log(int loggingLevel , String message) {
        if(loggingLevel == LoggingHandler.INFO) {
            System.out.println("INFO : " + message);
        } else {
            super.log(loggingLevel,message);
        }
    }
}
