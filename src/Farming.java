import Items.Item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import static Items.Items.*;

public class Farming {

    private static HashMap<Integer, Item> Farm_List_N = new HashMap<>();

    public static void run() {
        Farm_List_N.forEach((key, item) -> {
            System.out.println(key + ". " + item.name);
        });

        Scanner scanner = new Scanner(System.in);
        int selected = scanner.nextInt();

        Farm_List_N.get(selected).addQuantity(Farm_List_N.get(selected).farm);

        System.out.println("Farmed: " + Farm_List_N.get(selected).name);
    }

    // First the id then the Item
    public static void init() {
        Farm_List_N.put(1, Cobblestone);
        Farm_List_N.put(2, Wood);
    }
}
