package loggingfremework;

import loggingfremework.logappender.ConsoleAppender;

public class Logger {
    private static final Logger instance = new Logger();
    private LoggerConfig config;
    private Logger() {
        config = new LoggerConfig(LogLevel.INFO,new ConsoleAppender());
    }
}
