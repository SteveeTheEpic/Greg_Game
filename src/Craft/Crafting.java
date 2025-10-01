package Craft;

import java.util.ArrayList;
import java.util.Scanner;

import static Utils.Crafts.*;
import static Utils.Inventory.getMatches;

public class Crafting {

    public static void init() {
        System.out.println("Choice: ");
        System.out.println("Hint: just start with a random letter");

        Scanner scanner = new Scanner(System.in);
        String selected = scanner.next().toLowerCase();

        ArrayList<String> possible = getMatches(crafts, selected);

        if (possible.size() > 1) {
            System.out.println("All possibilities have been listed: ");
            for (String s : possible) {
                System.out.println(s);
            }
            System.out.println("Try again.");
        } else if (crafts.containsKey(selected) || possible.size() == 1) {
            crafts.get(possible.get(0)).craft();

        } else {
            System.out.println("Crafting recipe doesn't exist!");
        }

        possible.clear();
    }
}
