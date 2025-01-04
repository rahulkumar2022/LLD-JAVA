package Elevator_System_LLD;

import Elevator_System_LLD.enums.Direction;
import Elevator_System_LLD.enums.FloorNumber;

import java.util.List;

public class ElevatorSystem {
    private List<Elevator> elevators;
    private List<Floor> floors;
    private static volatile ElevatorSystem elevatorSystem;

    private ElevatorSystem(){

    }

    public List<Elevator> getElevators() {
        return elevators;
    }

    public void setElevators(List<Elevator> elevators) {
        this.elevators = elevators;
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }

    public static ElevatorSystem getInstance(){
        if(elevatorSystem == null){
            synchronized(ElevatorSystem.class){
                if(elevatorSystem==null){
                    return elevatorSystem = new ElevatorSystem();
                }
            }
        }
        return elevatorSystem;
    }
    public Elevator requestElevator(Direction direction,Floor floor){
        
        return null;
    }
    public void openDoor(Elevator elevator){
        elevator.getDoor().openDoor();
    }
    public void closeDoor(Elevator elevator){
        elevator.getDoor().closeDoor();
    }

    public void selectFloor(FloorNumber floorNumber,Elevator elevator){
        elevator.getInsidePannel().pressFloorButton(floorNumber.ordinal());
    }


}
