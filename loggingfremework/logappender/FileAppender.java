package loggingfremework.logappender;

import java.io.FileWriter;
import java.io.IOException;

import loggingfremework.LogMessage;

public class FileAppender implements LogAppender {
    private final String logFilePath;

    public FileAppender(String logFilePath) {
        this.logFilePath = logFilePath;
    }

    @Override
    public void append(LogMessage logMessage) {
        // TODO Auto-generated method stub
        //System.out.println(logMessage);
        try(FileWriter fileWriter = new FileWriter(logFilePath, true)) {
            fileWriter.write(logMessage.toString() + "\n");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
