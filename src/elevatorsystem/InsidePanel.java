package elevatorsystem;

import java.util.ArrayList;
import java.util.List;

public class InsidePanel implements ControlPanel{
    private List<FloorButton> elevatorButtonList;
    private List<DoorButton> doorButtons;

     public InsidePanel() {
        elevatorButtonList=new ArrayList<>();
        doorButtons=new ArrayList<>();
        for (int i = 0; i <15 ; i++) {
            elevatorButtonList.add(new FloorButton(false, FloorNumber.values()[i]));
        }

        for (int i = 0; i <3 ; i++) {
            doorButtons.add(new DoorButton(false, DoorAction.values()[i]));
        }
    }

    public boolean pressFloorButton(int floorNumber) {
        return elevatorButtonList.get(floorNumber).press();
    }
    public boolean pressDoorButton(int doorNumber) {
        return doorButtons.get(doorNumber).press();
    }
}
