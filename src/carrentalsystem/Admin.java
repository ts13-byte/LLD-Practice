package carrentalsystem;

import java.util.ArrayList;
import java.util.List;

public class Admin extends User {

    // Constructor
    public Admin(String id, String name, String email, String phone) {
        super(id, name, email, phone);
    }

    // Branch Management
    public void addBranch(Branch branch, List<Branch> branchList) {
        branchList.add(branch);
        System.out.println("Branch added: " + branch.getBranchName());
    }

    public void removeBranch(int branchId, List<Branch> branchList) {
        ;
    }

    public void viewAllBranches(List<Branch> branchList) {
    }

    // Car Management within Branches
    public void addCarToBranch(Car car, Branch branch) {

    }

    public void removeCarFromBranch(int carId, Branch branch) {

    }

    public void viewCarsInBranch(Branch branch) {

    }
}