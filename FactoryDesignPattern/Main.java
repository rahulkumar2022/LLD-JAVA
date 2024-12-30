package FactoryDesignPattern;

public class Main {
    public static void main(String[] args) {
        OperatingSystem windows = OperatingSystemFactory.getInstace("windows", "10", "64-bit");
        OperatingSystem linux = OperatingSystemFactory.getInstace("linux", "Ubuntu", "64-bit");
        windows.changeDir("C:\\");
        linux.removeDir("Desktop");
    }
}
