import java.util.Scanner;

public class Crafting {

    public static void init() {
        Scanner scanner = new Scanner(System.in);
        int selected = scanner.nextInt();
        System.out.println("1. Basics");
        switch (selected) {
            case 1:
                System.out.println("1. Basics");

                int selected1 = scanner.nextInt();
                switch (selected1) {
                    case 1:
                        craft(Items.Furnace, 1, Items.Cobblestone, 8);
                }
        }
    }

    private static void craft(Item item, int count, Item item1, int count1) {
        if ((item1.quantity - count1) >= 0) {
            item.addQuantity(count);
            item1.subQuantity(count1);

            System.out.println("Crafted " + count + " " + item.name);
        } else {
            System.out.println("Insufficient resources");
            System.out.println("Requires " + count1 + item1.name + "s");
        }
    }


}
