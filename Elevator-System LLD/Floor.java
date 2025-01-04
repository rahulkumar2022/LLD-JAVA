package Elevator_System_LLD;

import Elevator_System_LLD.enums.FloorNumber;

public class Floor {
    private FloorNumber floorNumber;
    private OutSidePannel outSidePannel;

    public Floor(FloorNumber floorNumber, OutSidePannel outSidePannel) {
        this.floorNumber = floorNumber;
        this.outSidePannel = outSidePannel;
    }

    public Floor() {
    }

    public FloorNumber getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(FloorNumber floorNumber) {
        this.floorNumber = floorNumber;
    }

    public OutSidePannel getOutSidePannel() {
        return outSidePannel;
    }

    public void setOutSidePannel(OutSidePannel outSidePannel) {
        this.outSidePannel = outSidePannel;
    }
}
