package elevatorsystem;

import java.util.List;

public class ElevatorControlSystem {
    private List<Elevator> elevators;
    private List<Floor> floors;



    private ElevatorControlSystem() {
    }

    public List<Elevator> getElevators() {
        return elevators;
    }

    public void setElevators(List<Elevator> elevators) {
        this.elevators = elevators;
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }
    private static volatile ElevatorControlSystem elevatorSystemInstance;


    public static ElevatorControlSystem getInstance() {
        if (elevatorSystemInstance == null) {
            synchronized (ElevatorControlSystem.class){
                if (elevatorSystemInstance == null) {
                    return elevatorSystemInstance = new ElevatorControlSystem();
                }
            }
        }
        return elevatorSystemInstance;
    }

    public Elevator requestElevator(Direction direction, Floor floor) {
        //TODO: returning elevator using smart dispatch, setting up the properties of the elevator
        return null;
    }

    public void openDoor(Elevator elevator) {
        elevator.getDoor().openDoor();

    }
    public void closeDoor(Elevator elevator) {
        elevator.getDoor().closeDoor();

    }
    public void selectFloor(FloorNumber floorNumber, Elevator elevator) {
        elevator.getInsidePanel().pressFloorButton(floorNumber.ordinal());
    }


}
