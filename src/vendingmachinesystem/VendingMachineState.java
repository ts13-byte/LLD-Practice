package vendingmachinesystem;

public interface VendingMachineState {
    void selectItem(int itemId);
    void insertMoney(double amount);
    void dispenseItem();
    void cancelTransaction();
}
