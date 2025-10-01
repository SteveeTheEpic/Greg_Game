package Items;

public class Item {

    public String name;
    public boolean showing;
    public int quantity;
    public int farm;

    public Item(String name) {
        this.name = name;
        this.quantity = 0;
        this.farm = 0;
        this.showing = false;
        Items.Items_List.add(this);
    }

    public Item(String name, boolean showing) {
        this.name = name;
        this.quantity = 0;
        this.farm = 0;
        this.showing = showing;
        Items.Items_List.add(this);
    }

    public Item(String name, boolean showing, int farm) {
        this.name = name;
        this.quantity = 0;
        this.farm = farm;
        this.showing = showing;
        Items.Items_List.add(this);

    }

    public void addQuantity(int Quantity) {
        quantity += Quantity;
    }

    public void subQuantity(int Quantity) {
        quantity -= Quantity;
    }

    public void setFarm(int count) {
        this.farm = count;
    }

    public void setShowing(boolean showing) {
        this.showing = showing;
    }

    public void update() {
        if (quantity != 0 || showing) showing = true;
    }
}
