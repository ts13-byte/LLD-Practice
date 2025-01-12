package elevatorsystem;

public class DoorButton implements Button {

    private boolean status;
    private DoorAction doorAction;

    public DoorButton(boolean status, DoorAction doorAction) {
        this.status = status;
        this.doorAction = doorAction;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public DoorAction getDoorAction() {
        return doorAction;
    }

    public void setDoorAction(DoorAction doorAction) {
        this.doorAction = doorAction;
    }

    @Override
    public boolean isPressed() {
        return status;
    }

    @Override
    public boolean press() {
        return status != status;
    }
}
