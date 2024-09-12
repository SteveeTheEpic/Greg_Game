package Craft;

import java.util.Scanner;

public class Crafting {

    public static void init() {
        System.out.println("Choice: ");
        System.out.println("Hint: Look in the code to find the names of the crafting recipes");

        Scanner scanner = new Scanner(System.in);
        String selected = scanner.next().toLowerCase();

        if (Craftings.crafting_ids.contains(selected)) {
            int id = Craftings.crafting_ids.indexOf(selected);

            Craft craft = Craftings.craftings.get(id);

            //  do the crafty thingy
            craft.craft();


        } else {
            System.out.println("Craft.Crafting recipe doesn't exist!");
        }
    }
}
