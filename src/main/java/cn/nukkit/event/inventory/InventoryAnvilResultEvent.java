package cn.nukkit.event.inventory;

import cn.nukkit.event.Cancellable;
import cn.nukkit.event.HandlerList;
import cn.nukkit.inventory.AnvilInventory;
import cn.nukkit.item.Item;

public class InventoryAnvilResultEvent extends InventoryEvent implements Cancellable {

    private static final HandlerList handlers = new HandlerList();

    private Item result;

    public InventoryAnvilResultEvent(AnvilInventory inventory, Item result) {
        super(inventory);
        this.result = result;
    }

    public static HandlerList getHandlers() {
        return handlers;
    }

    public Item getResult() {
        return result;
    }
}
