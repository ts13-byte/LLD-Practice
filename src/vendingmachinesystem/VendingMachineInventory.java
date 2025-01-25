package vendingmachinesystem;

import java.util.HashMap;
import java.util.Map;

public class VendingMachineInventory {
    private Map<Integer, Item> items;

    public VendingMachineInventory() {
        items = new HashMap<>();
    }

    public void addItem(Item item, int quantity) {
        items.put(item.getId(), item);
        item.setQuantity(quantity);
    }

    public Item getItem(int itemId) {
        return items.get(itemId);
    }

    public void decrementItem(int itemId) {
        Item item = items.get(itemId);
        if (item != null && item.getQuantity() > 0) {
            item.setQuantity(item.getQuantity() - 1);
        }
    }
}
