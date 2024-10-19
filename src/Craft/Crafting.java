package Craft;

import java.util.Scanner;

public class Crafting {

    public static void init() {
        System.out.println("Choice: ");
        System.out.println("Hint: Look in the code to find the names of the crafting recipes");

        Scanner scanner = new Scanner(System.in);
        String selected = scanner.next().toLowerCase();

        if (Craftings.crafts.containsKey(selected)) {
            Craftings.crafts.get(selected).craft();

        } else {
            System.out.println("Crafting recipe doesn't exist!");
        }
    }
}
