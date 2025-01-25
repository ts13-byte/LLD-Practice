package vendingmachinesystem;

public class VendingMachine {
    private VendingMachineInventory inventory;
    private VendingMachineState idleState;
    private VendingMachineState awaitingPaymentState;
    private VendingMachineState dispensingState;
    private VendingMachineState currentState;
    private Item selectedItem;
    private double balance;

    public VendingMachine() {
        this.inventory = new VendingMachineInventory();
        this.idleState = new IdleState(this);
        this.awaitingPaymentState = new AwaitingPaymentState(this);
        this.dispensingState = new DispensingState(this);
        this.currentState = idleState;
    }

    public void selectItem(int itemId) {
        currentState.selectItem(itemId);
    }

    public void insertMoney(double amount) {
        currentState.insertMoney(amount);
    }

    public void dispenseItem() {
        currentState.dispenseItem();
    }

    public void cancelTransaction() {
        currentState.cancelTransaction();
    }

    // Getters and Setters
    public VendingMachineState getIdleState() {
        return idleState;
    }

    public VendingMachineState getAwaitingPaymentState() {
        return awaitingPaymentState;
    }

    public VendingMachineState getDispensingState() {
        return dispensingState;
    }

    public void setCurrentState(VendingMachineState currentState) {
        this.currentState = currentState;
    }

    public VendingMachineInventory getInventory() {
        return inventory;
    }

    public Item getSelectedItem() {
        return selectedItem;
    }

    public void setSelectedItem(Item selectedItem) {
        this.selectedItem = selectedItem;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
