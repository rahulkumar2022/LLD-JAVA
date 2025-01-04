package Elevator_System_LLD;

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
}
