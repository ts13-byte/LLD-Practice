package vendingmachinesystem;

public class DispensingState implements VendingMachineState {
    private VendingMachine machine;

    public DispensingState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void selectItem(int itemId) {
        System.out.println("Currently dispensing item. Please wait.");
    }

    @Override
    public void insertMoney(double amount) {
        System.out.println("Currently dispensing item. Cannot accept money.");
    }

    @Override
    public void dispenseItem() {
        Item item = machine.getSelectedItem();
        if (item != null) {
            if(machine.getBalance() > 0) {
                System.out.println("Returning change: Rs." + machine.getBalance());
            }
            System.out.println("Dispensing: " + item.getName());
            machine.getInventory().decrementItem(item.getId());
            machine.setSelectedItem(null);
            machine.setCurrentState(machine.getIdleState());
        } else {
            System.out.println("Error: No item selected to dispense.");
            machine.setCurrentState(machine.getIdleState());
        }
    }

    @Override
    public void cancelTransaction() {
        System.out.println("Cannot cancel. Dispensing in progress.");
    }
}
