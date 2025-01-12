package elevatorsystem;

public class Elevator {
    private ElevatorNumber elevatorNumber;
    private Display display;
    private InsidePanel insidePanel;
    private Door door;
    private FloorNumber currentFloorNumber;
    private Direction direction;

    public Elevator(ElevatorNumber elevatorNumber, Display display, InsidePanel insidePanel, Door door, FloorNumber currentFloorNumber, Direction direction) {
        this.elevatorNumber = elevatorNumber;
        this.display = display;
        this.insidePanel = insidePanel;
        this.door = door;
        this.currentFloorNumber = currentFloorNumber;
        this.direction = direction;
    }

    public ElevatorNumber getElevatorNumber() {
        return elevatorNumber;
    }

    public void setElevatorNumber(ElevatorNumber elevatorNumber) {
        this.elevatorNumber = elevatorNumber;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public InsidePanel getInsidePanel() {
        return insidePanel;
    }

    public void setInsidePanel(InsidePanel insidePanel) {
        this.insidePanel = insidePanel;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public FloorNumber getCurrentFloorNumber() {
        return currentFloorNumber;
    }

    public void setCurrentFloorNumber(FloorNumber currentFloorNumber) {
        this.currentFloorNumber = currentFloorNumber;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
