package vendingmachinesystem;

public class IdleState implements VendingMachineState {
    private VendingMachine machine;

    public IdleState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void selectItem(int itemId) {
        Item item = machine.getInventory().getItem(itemId);
        if (item == null || item.getQuantity() <= 0) {
            System.out.println("Item out of stock.");
        } else {
            System.out.println("Item selected: " + item.getName() + " Price: " + item.getPrice());
            machine.setSelectedItem(item);
            machine.setCurrentState(machine.getAwaitingPaymentState());
        }
    }

    @Override
    public void insertMoney(double amount) {
        System.out.println("Please select an item first.");
    }

    @Override
    public void dispenseItem() {
        System.out.println("Please select an item and pay first.");
    }

    @Override
    public void cancelTransaction() {
        System.out.println("No transaction to cancel.");
    }
}
