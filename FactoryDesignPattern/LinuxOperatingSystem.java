package FactoryDesignPattern;

public class LinuxOperatingSystem extends OperatingSystem {

    public LinuxOperatingSystem(String version, String architecture) {
        super(version, architecture);
    }

    @Override
    public void changeDir(String dir) {
        // TODO Auto-generated method stub
        System.out.println("Linux Implementation for adding directory "+dir);
        //throw new UnsupportedOperationException("Unimplemented method 'changeDir'");
    }

    @Override
    public void removeDir(String dir) {
        // TODO Auto-generated method stub
        System.out.println("Linux Implementation for removing directory "+dir);
        //throw new UnsupportedOperationException("Unimplemented method 'removeDir'");
    }

    
    
}
