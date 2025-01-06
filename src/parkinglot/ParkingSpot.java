package parkinglot;

//persistence entity
public class ParkingSpot {
    private final String spotId;
    private final VehicleType size;
    private boolean isOccupied;
    private Vehicle currentVehicle;

    public ParkingSpot(String spotId, VehicleType size) {
        this.spotId = spotId;
        this.size = size;
        this.isOccupied = false;
    }


    public String getSpotId() {
        return spotId;
    }

    public VehicleType getSize() {
        return size;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public Vehicle getCurrentVehicle() {
        return currentVehicle;
    }

    public void setCurrentVehicle(Vehicle currentVehicle) {
        this.currentVehicle = currentVehicle;
    }

    public void parkVehicle(Vehicle vehicle) {
        if (isOccupied) {
            throw new IllegalStateException("Parking spot is already occupied!");
        }
        if (vehicle.getVehicleType() != size) {
            throw new IllegalArgumentException("Vehicle type does not match spot size!");
        }
        this.isOccupied = true;
        this.currentVehicle = vehicle;
    }

    public void vacateSpot() {
        if (!isOccupied) {
            throw new IllegalStateException("Parking spot is already empty!");
        }
        this.isOccupied = false;
        this.currentVehicle = null;
    }

}
