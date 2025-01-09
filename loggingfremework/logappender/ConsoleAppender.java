package loggingfremework.logappender;

import loggingfremework.LogMessage;

public class ConsoleAppender implements LogAppender{

    @Override
    public void append(LogMessage logMessage) {
        // TODO Auto-generated method stub
        System.out.println(logMessage);}
    
}
