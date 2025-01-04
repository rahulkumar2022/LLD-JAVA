package Elevator_System_LLD;

import Elevator_System_LLD.enums.Direction;
import Elevator_System_LLD.enums.FloorNumber;

public class Display {
    private FloorNumber floorNumber;
    private Direction direction;

    private Integer weight;

    public Display(FloorNumber floorNumber,Direction direction,Integer weight){
        this.floorNumber = floorNumber;
        this.direction = direction;
        this.weight = weight;
    }

    public Display(){

    }

    public FloorNumber getFloorNumber() {
        return floorNumber;
    }
    public void setFloorNumber(FloorNumber floorNumber){
        this.floorNumber = floorNumber;
    }

    public Direction getDirection(){
        return direction;
    }

    public void setDirection(Direction direction){
        this.direction = direction;
    }

    public void setWeight(Integer weight){
        this.weight  = weight;
    }

    public Integer getWeight(){
        return weight;
    }
}
