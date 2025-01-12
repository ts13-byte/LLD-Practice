package elevatorsystem;

public class DirectionButton implements Button {
    private boolean status;
    private Direction direction;

    public DirectionButton(boolean status, Direction direction) {
        this.status = status;
        this.direction = direction;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
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
