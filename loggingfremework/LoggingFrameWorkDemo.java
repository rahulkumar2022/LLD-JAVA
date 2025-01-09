package loggingfremework;

import loggingfremework.logappender.FileAppender;

public class LoggingFrameWorkDemo {

    public static void run(){
        Logger logger = Logger.getInstance();

        // Logging with default configuration
        logger.info("This is an information message");
        logger.warning("This is warning message");
        logger.error("This is error");


        LoggerConfig config = new LoggerConfig(LogLevel.DEBUG,new FileAppender("app.log"));
        logger.setConfig(config);

        logger.debug("This is debug in file");
        logger.info("This is an information message");
    }
}
