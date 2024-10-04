package Items;

public class Item {

    public String name;
    public int quantity;
    public int farm;

    public Item(String name) {
        this.name = name;
        this.quantity = 0;
        this.farm = 0;
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
}
