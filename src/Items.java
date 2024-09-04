import java.util.ArrayList;

public class Items {

    static ArrayList<Item> Items_List = new ArrayList<Item>();

    public static Item Cobblestone = new Item("Cobblestone");
    public static Item Wood = new Item("Wood");
    public static Item Furnace = new Item("Furnace");

    public static void init() {
        Items_List.add(Cobblestone);
        Items_List.add(Wood);
        Items_List.add(Furnace);
    }
}