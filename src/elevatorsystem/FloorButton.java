package elevatorsystem;

public class FloorButton implements Button{
    private boolean status;
    private FloorNumber floorNumber;

    public FloorButton(boolean status, FloorNumber floorNumber) {
        this.status = status;
        this.floorNumber = floorNumber;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public FloorNumber getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(FloorNumber floorNumber) {
        this.floorNumber = floorNumber;
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
