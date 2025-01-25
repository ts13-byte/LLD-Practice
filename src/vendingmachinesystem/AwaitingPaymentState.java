package vendingmachinesystem;

public class AwaitingPaymentState implements VendingMachineState {
    private VendingMachine machine;

    public AwaitingPaymentState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void selectItem(int itemId) {
        System.out.println("Transaction in progress. Please cancel first to select another item.");
    }

    @Override
    public void insertMoney(double insertedAmount) {
        machine.setBalance(insertedAmount);
        double amount = machine.getBalance();
        Item item = machine.getSelectedItem();
        if (amount >= item.getPrice()) {
            double change = amount - item.getPrice();
            System.out.println("Payment accepted. Dispensing item...");
            machine.setBalance(change);
            machine.setCurrentState(machine.getDispensingState());
        } else {
            System.out.println("Insufficient funds. Please insert at least: " + (item.getPrice() - amount));
        }
    }

    @Override
    public void dispenseItem() {
        System.out.println("Please complete payment first.");
    }

    @Override
    public void cancelTransaction() {
        System.out.println("Transaction cancelled. Returning to idle state.");
        machine.setSelectedItem(null);
        machine.setCurrentState(machine.getIdleState());
    }
}
