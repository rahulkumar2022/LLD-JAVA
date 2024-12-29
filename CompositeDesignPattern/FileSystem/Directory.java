package CompositeDesignPattern.FileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    String directoryName;
    List<FileSystem> fileSystemList;

    public Directory(String DirectoryName){
        this.directoryName = DirectoryName;
        fileSystemList = new ArrayList<FileSystem>();
    }
    @Override
    public void ls() {
        // TODO Auto-generated method stub
        System.out.println("Directory: " + directoryName);
        for(FileSystem fileSystem: fileSystemList){
            fileSystem.ls();
        }
    }
    
}
