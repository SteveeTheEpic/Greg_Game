package Machine;

import java.util.ArrayList;

public class Machines {

    public static ArrayList<Machine> machines = new ArrayList<>();

    public static Machine Crafting_table = new Machine("Craft.Crafting table");

    public static void init() {
        machines.add(Crafting_table);
    }

}
