package ParkingLot;

import ParkingLot.Vehicle.Vehicle;
import ParkingLot.Vehicle.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Level {
    private final int floor;
    private final List<ParkingSpot> parkingSpotList;

    public Level(int floor,int numSpots){
        this.floor = floor;
        parkingSpotList = new ArrayList<>(numSpots);

        // Assign spots in ration, 50-> bike, 40->car, 10->car
        double spotsForBikes = 0.50;
        double spotsForCar = 0.40;

        int numBikes = (int) (numSpots*spotsForBikes);
        int numCars = (int) (numSpots * spotsForCar);

        for(int i=1;i<=numBikes;i++){
            parkingSpotList.add(new ParkingSpot(i, VehicleType.MOTORCYCLE));
        }

        for(int i=numBikes+1;i<=numBikes+numCars;i++){
            parkingSpotList.add(new ParkingSpot(i,VehicleType.CAR));
        }

        for (int i=numBikes+numCars+1;i<=numSpots;i++){
            parkingSpotList.add(new ParkingSpot(i,VehicleType.TRUCK));
        }

    }

    public synchronized boolean parkVehicle(Vehicle vehicle){
        for (ParkingSpot spot:parkingSpotList){
            if(spot.isAvailable() && spot.getVehicleType()==vehicle.getType()){
                spot.parkVehicle(vehicle);
                return true;
            }
        }
        return false;
    }

    public synchronized boolean unparkVehicle(Vehicle vehicle){
        for(ParkingSpot spot:parkingSpotList){
            if(!spot.isAvailable() && spot.getParkedvehicle().equals(vehicle)){
                spot.unparkVehicle();
                return true;
            }
        }
        return false;

    }

    public void displayAvailability(){
        System.out.println("Level "+floor+" Availability : ");
        for (ParkingSpot spot:parkingSpotList){
            System.out.println("Spot "+spot.getSpotNumber()+" : "+(spot.isAvailable()?"Available for: ":"Occupied by : "+spot.getVehicleType()));
        }
    }
}
