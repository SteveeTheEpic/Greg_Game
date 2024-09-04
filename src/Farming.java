import java.util.Scanner;

public class Farming {

    private static final Scanner scanner = new Scanner(System.in);
    private static final int selected = scanner.nextInt();

    public static void init() {
        System.out.println("1. Cobblestone");
        System.out.println("2. Wood");

        Farm(Items.Cobblestone, 1, 1);

    }

    public static void Farm(Item item, int quantity, int id) {
        if (selected == id)
            item.addQuantity(quantity);
    }

}
