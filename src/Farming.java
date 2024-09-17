import Items.Item;
import Items.Items;

import java.util.ArrayList;
import java.util.Scanner;

public class Farming {

    private static ArrayList<Item> Farm_List = new ArrayList<>();
    private static ArrayList<Integer> Farm_List_C = new ArrayList<>();

    public static void run() {
        System.out.println("1. Cobblestone");
        System.out.println("2. Wood");

        Scanner scanner = new Scanner(System.in);
        int selected = scanner.nextInt();

        Farm_List.get(selected - 1).addQuantity(Farm_List_C.get(selected - 1));
    }


    // Items and count must be added in a row
    public static void init() {
        Farm_List.add(Items.Cobblestone);    Farm_List_C.add(1);
        Farm_List.add(Items.Wood);           Farm_List_C.add(1);
    }
}
