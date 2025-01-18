package PrototypeDesignPattern.Ex2;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        Shape original = new Shape("Circle", "Red");
        System.out.println("Original Shape: "+original);
        Shape cloned =  original.getClone();
        System.out.println("Cloned Shape: "+cloned);
        cloned.setColor("Blue");
        System.out.println("Original Shape: "+original);
        System.out.println("Cloned Shape: "+cloned);
    }
}
