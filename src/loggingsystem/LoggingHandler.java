package loggingsystem;

public abstract class LoggingHandler {
   public final static int INFO = 1;
   public final static int DEBUG = 2;
   public final static int ERROR = 3;

   private LoggingHandler nextLoggingHandler;

   public LoggingHandler(LoggingHandler loggingHandler) {
       this.nextLoggingHandler = loggingHandler;
   }

   public void log(int loggingLevel , String message) {
       if(nextLoggingHandler != null) {
           nextLoggingHandler.log(loggingLevel,message);
       }
   }
}
