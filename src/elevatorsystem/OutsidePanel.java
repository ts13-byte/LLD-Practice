package elevatorsystem;

import java.util.ArrayList;
import java.util.List;

public class OutsidePanel implements ControlPanel {
    private List<DirectionButton> hallButtons;

    public OutsidePanel() {
        hallButtons = new ArrayList<>();
        hallButtons.add(new DirectionButton(false,Direction.UP));
        hallButtons.add(new DirectionButton(false,Direction.DOWN));
        hallButtons.add(new DirectionButton(false,Direction.IDLE));
    }

    public void moveUp(){

    }
    public void moveDown(){

    }
}
