package carrentalsystem;

import java.util.List;

public class Branch {
    private String branchId;
    private String branchName;
    private Location location;
    private List<Car> carList;

    public Branch(String branchId, String branchName, Location location, List<Car> carList) {
        this.branchId = branchId;
        this.branchName = branchName;
        this.location = location;
        this.carList = carList;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    //CRUD OPERATIONS
    public void addCar(Car car) {

    }

    public void getCar(Car car) {

    }

    public void removeCar(Car car) {

    }


}
