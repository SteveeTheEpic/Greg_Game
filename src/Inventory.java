import Items.Items;

public class Inventory {

    public static void init() {
        Items.Items_List.forEach((n) -> System.out.println(n.name + ": " + n.quantity));
    }

}
