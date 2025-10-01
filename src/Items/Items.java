package Items;

import Craft.Craft;
import Machine.Machines;

import java.util.ArrayList;
import java.util.HashMap;

import static Machine.Machines.*;

public class Items {
    public static HashMap<String, Item> FarmList = new HashMap<>();
    public static ArrayList<Item> Items_List = new ArrayList<Item>();

    public static Item Cobblestone = new Item("Cobblestone", true, 1);
    public static Item Wood = new Item("Wood", true, 1);
    public static Item Planks = new Item("Planks");
    public static Tool Omnitool = new Tool("Omni Tool", 0);


    public static void init_craft() {
        new Craft("Planks").addItem(Wood, 1).addOutput(Planks, 4);
        new Craft("Crafting Table").addItem(Planks, 4).addOutput(Crafting_table, 1);
        new Craft("Furnace").addItem(Cobblestone, 8).addOutput(Furnace, 1).requireMachine(Crafting_table);
        new Craft("Omnitool").addItem(Planks, 5).addOutput(Omnitool, 1).requireMachine(Crafting_table);
    }

    public static void init_farm() {
        for (Item item : Items_List) {
            if (item.farm != 0) {
                FarmList.put(item.name.toLowerCase(), item);
            }
        }
    }

    public static void update() {
        for (Item item : Items_List) {
            item.update();
        }
    }
}