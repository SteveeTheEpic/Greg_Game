package Items;

import Craft.Craft;
import Craft.Craftings;
import Machine.Machines;

import java.util.ArrayList;

public class Items {

    public static ArrayList<Item> Items_List = new ArrayList<Item>();

    public static Item Cobblestone = new Item("Cobblestone");
    public static Item Wood = new Item("Wood");
    public static Item Furnace = new Item("Furnace");

    public static void init_craft() {
        Craftings.craftings.add(new Craft("Furnace").addItem(Cobblestone, 8).addProduct(Furnace, 1).requireMachine(Machines.Crafting_table));
    }

    public static void init_farm() {
        Cobblestone.setFarm(1);
        Wood.setFarm(1);
    }
}