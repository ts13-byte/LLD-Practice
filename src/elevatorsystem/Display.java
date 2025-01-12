package elevatorsystem;

public class Display {
    private Integer weight;
    private Direction direction;
    private FloorNumber floorNumber;

    public Display(Integer weight, Direction direction, FloorNumber floorNumber) {
        this.weight = weight;
        this.direction = direction;
        this.floorNumber = floorNumber;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public FloorNumber getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(FloorNumber floorNumber) {
        this.floorNumber = floorNumber;
    }
}
