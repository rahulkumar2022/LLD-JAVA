package Elevator_System_LLD;

import Elevator_System_LLD.enums.Direction;

import java.util.ArrayList;
import java.util.List;

public class OutSidePannel implements Pannel{
    private List<HallButton> hallButtons;

    public OutSidePannel(){
        hallButtons = new ArrayList<>();
        hallButtons.add(new HallButton(false, Direction.UP));
        hallButtons.add(new HallButton(false,Direction.DOWN));
        hallButtons.add(new HallButton(false,Direction.IDLE));
    }

    public void moveUp(){
        System.out.println("Moving upward called");
    }

    public void moveDown(){
        System.out.println("Moving in downward direction called");
    }
}
