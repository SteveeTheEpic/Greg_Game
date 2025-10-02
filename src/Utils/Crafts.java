package Utils;

import Craft.*;

import java.util.HashMap;

import static Items.Items.*;
import static Machine.Machines.*;

public class Crafts {

    public static HashMap<String, Craft> crafts = new HashMap<>();

    public static Craft PlanksC = new Craft("Planks").addItem(Wood, 1).addOutput(Planks, 4);
    public static Craft CraftingTableC = new Craft("Crafting Table").addItem(Planks, 4).addOutput(Crafting_table, 1);
    public static Craft FurnaceC = new Craft("Furnace").addItem(Cobblestone, 8).addOutput(Furnace, 1).requireMachine(Crafting_table);
    public static Craft Omnitool_Wooden = new Upgrade("Omnitool Wooden").addItem(Planks, 5).addOutput(Omnitool, 1).requireMachine(Crafting_table);

}
