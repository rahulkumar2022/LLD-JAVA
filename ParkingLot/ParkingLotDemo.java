package ParkingLot;

import ParkingLot.Vehicle.Car;
import ParkingLot.Vehicle.MotorCycle;
import ParkingLot.Vehicle.Truck;
import ParkingLot.Vehicle.Vehicle;

public class ParkingLotDemo {

    public static void run(){
        ParkingLot parkingLot = ParkingLot.getInstance();
        parkingLot.addLevel(new Level(1,100));
        parkingLot.addLevel(new Level(2,80));


        Vehicle car = new Car("ABC123");
        Vehicle truck = new Truck("XYZ789");
        Vehicle motorCycle = new MotorCycle("Mt1234");

        // Park vehicle
        parkingLot.parkVehicle(car);
        parkingLot.parkVehicle(truck);
        parkingLot.parkVehicle(motorCycle);
        parkingLot.displayAvailability();

        parkingLot.unparkVehicle(motorCycle);
        parkingLot.displayAvailability();
    }
}
