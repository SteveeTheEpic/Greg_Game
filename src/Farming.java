import java.util.ArrayList;
import java.util.Scanner;

public class Farming {

    private static ArrayList<Item> Farm_List = new ArrayList<>();

    public static void run() {
        System.out.println("1. Cobblestone");
        System.out.println("2. Wood");

        Scanner scanner = new Scanner(System.in);
        int selected = scanner.nextInt();

        Farm_List.get(selected - 1).addQuantity(1);
    }

    public static void init() {
        Farm_List.add(Items.Cobblestone);
        Farm_List.add(Items.Wood);
    }

    public static void Farm(Item item, int quantity) {
            item.addQuantity(quantity);
    }

}
