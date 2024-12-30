package FactoryDesignPattern;

public class WindowsOperatingSystem extends OperatingSystem {
    
    public WindowsOperatingSystem(String version,String architecture){
        super(version, architecture);
    }

    @Override
    public void changeDir(String dir) {
        // TODO Auto-generated method stub
        System.out.println("Windows Implementation for adding directory "+dir);
        //throw new UnsupportedOperationException("Unimplemented method 'changeDir'");
    }

    @Override
    public void removeDir(String dir) {
        // TODO Auto-generated method stub
        System.out.println("Windows Implementation for removing directory "+dir);
        //throw new UnsupportedOperationException("Unimplemented method 'removeDir'");
    }

    
}
