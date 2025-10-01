import Items.Item;

import java.util.ArrayList;
import java.util.Scanner;

import static Items.Items.*;
import static Utils.Crafts.crafts;
import static Utils.Inventory.getMatches;
import static Utils.Inventory.showChange;

public class Farming {

    public static void run() {

        System.out.print("Choice: ");
        Scanner scanner = new Scanner(System.in);
        String selected = scanner.next();

        ArrayList<Item> temp = Items_List;

        ArrayList<String> possible = getMatches(FarmList, selected);
        if (possible.size() > 1) {
            System.out.println("All possibilities have been listed: ");
            for (String s : possible) {
                System.out.println(s);
            }
            System.out.println("Try again.");
        } else if (FarmList.containsKey(selected) || possible.size() == 1) {
            FarmList.get(possible.get(0)).addQuantity(FarmList.get(possible.get(0)).farm);

        } else {
            System.out.println("This cannot be farmed!\n(or doesn't exist)");
        }
        showChange(temp, Items_List);
    }
}
