package Items;

import java.util.ArrayList;

public class Item {

    public String name;
    public int quantity;

    public ArrayList<Item> Items_List = new ArrayList<Item>();

    public Item(String name) {
        this.name = name;
        this.quantity = 0;
    }

    public void addQuantity(int Quantity) {
        quantity += Quantity;
    }

    public void subQuantity(int Quantity) {
        quantity -= Quantity;
    }

    public void setName(String Name) {
        name = Name;
    }

}
