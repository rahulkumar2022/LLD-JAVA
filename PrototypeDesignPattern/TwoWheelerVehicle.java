package PrototypeDesignPattern;

public class TwoWheelerVehicle extends Vehicle {
    private String type;
    private boolean isElectric;

    public TwoWheelerVehicle(String engine, String model, long price, String type,boolean isElectric) {
        super(engine, model, price);
        this.type = type;
        this.isElectric = isElectric;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    @Override
    protected TwoWheelerVehicle clone() throws CloneNotSupportedException {
        return (TwoWheelerVehicle) super.clone();
    }
    
}
