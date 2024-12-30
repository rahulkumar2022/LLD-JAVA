package FactoryDesignPattern;

public class OperatingSystemFactory {

    public static OperatingSystem getInstace(String type,String version,String architecture){
        if(type.equalsIgnoreCase("windows")){
            return new WindowsOperatingSystem(version, architecture);
        } else if(type.equalsIgnoreCase("linux")){
            return new LinuxOperatingSystem(version, architecture);
        } else {
            throw new IllegalArgumentException("Invalid operating system type");
        }
    }
    
}
