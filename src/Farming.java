import Items.Item;

import java.util.HashMap;
import java.util.Scanner;

import static Items.Items.*;

public class Farming {

    private static HashMap<Integer, Item> FarmList = new HashMap<>();

    public static void run() {
        FarmList.forEach((key, item) -> {
            System.out.println(key + ". " + item.name);
        });

        Scanner scanner = new Scanner(System.in);
        int selected = scanner.nextInt();

        FarmList.get(selected).addQuantity(FarmList.get(selected).farm);

        System.out.println("Farmed: " + FarmList.get(selected).name);
    }

    // First the id for farming then the Item
    public static void init() {
        FarmList.put(1, Cobblestone);
        FarmList.put(2, Wood);
    }
}
