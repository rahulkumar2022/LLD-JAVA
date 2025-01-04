package Elevator_System_LLD;

import Elevator_System_LLD.enums.DoorAction;

public class DoorButton implements Button{
    private boolean status;
    private DoorAction doorAction;

    public DoorButton(boolean status,DoorAction doorAction){
        this.status = status;
        this.doorAction = doorAction;
    }
    public DoorButton(){

    }

    public DoorAction getDoorAction(){
        return doorAction;
    }

    public void setDoorAction(DoorAction doorAction){
        this.doorAction = doorAction;
    }

    public boolean setStatus(boolean status){
        return status;
    }

    @Override
    public boolean isPressed() {
        return status;
    }

    @Override
    public boolean press() {
        status = !status;
        return status;
    }
}
