package PrototypeDesignPattern;

public class FourWheelerVehicle extends Vehicle {
    private String type;
    private boolean isElectric;
    private boolean isAutomatic;

    public FourWheelerVehicle(String engine, String model, long price, String type,boolean isElectric,boolean isAutmatic) {
        super(engine, model, price);
        this.type = type;
        this.isElectric = isElectric;
        this.isAutomatic = isAutmatic;
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

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean isAutomatic) {
        this.isAutomatic = isAutomatic;
    }

    @Override
    protected FourWheelerVehicle clone() throws CloneNotSupportedException {
        return (FourWheelerVehicle) super.clone();
    }
    
}
