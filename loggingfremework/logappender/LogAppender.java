package loggingfremework.logappender;

import loggingfremework.LogMessage;

public interface LogAppender {
    void append(LogMessage logMessage);
}
