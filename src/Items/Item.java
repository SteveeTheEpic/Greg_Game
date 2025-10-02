package Items;

public class Item {

    public String name;
    public boolean showing;
    public int prev_quantity;
    public int quantity;
    public boolean farmable = false;
    public int requiredTier;

    public Item(String name) {
        this.name = name;
        this.quantity = 0;
        this.requiredTier = 0;
        this.showing = false;
        Items.Items_List.add(this);
    }

    public Item(String name, boolean showing) {
        this.name = name;
        this.quantity = 0;
        this.requiredTier = 0;
        this.showing = showing;
        Items.Items_List.add(this);
    }

    public Item(String name, boolean showing, int requiresTier) {
        this.name = name;
        this.quantity = 0;
        this.farmable = true;
        this.requiredTier = requiresTier;
        this.showing = showing;
        Items.Items_List.add(this);
        Items.FarmList.put(this.name.toLowerCase(), this);
    }

    public void addQuantity(int Quantity) {
        quantity += Quantity;
    }

    public void subQuantity(int Quantity) {
        quantity -= Quantity;
    }

    public void setRequiredTier(int count) {
        this.requiredTier = count;
    }

    public void setShowing(boolean showing) {
        this.showing = showing;
    }

    public void update() {
        prev_quantity = quantity;
        if (quantity != 0 || showing) showing = true;
    }
}
