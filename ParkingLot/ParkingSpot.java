package ParkingLot;

import ParkingLot.Vehicle.Vehicle;
import ParkingLot.Vehicle.VehicleType;

public class ParkingSpot {
    private final int spotNumber;
    private final VehicleType vehicleType;

    private Vehicle parkedvehicle;

    public ParkingSpot(int spotNumber,VehicleType vehicleType){
        this.spotNumber = spotNumber;
        this.vehicleType = vehicleType;
    }

    public synchronized boolean isAvailable(){
        return parkedvehicle==null;
    }

    public synchronized void parkVehicle(Vehicle vehicle){
        if(isAvailable() && vehicle.getType()==vehicleType){
            parkedvehicle = vehicle;
        }
        else{
            throw new IllegalArgumentException("Invalid vehicle type or space already occupied. ");
        }
    }

    public synchronized void unparkVehicle(){
        parkedvehicle = null;
    }

    public VehicleType getVehicleType(){
        return vehicleType;
    }

    public Vehicle getParkedvehicle(){
        return parkedvehicle;
    }

    public int getSpotNumber(){
        return spotNumber;
    }
}
