import Craft.Crafting;
import Items.Items;
import Machine.Machines;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Items.init();
        Items.init_craft();
        Farming.init();
        Machines.init();

        System.out.println("Welcome to Greg Game\n(aka GG)");

        System.out.println();

        int selected;
        boolean enabled = true;

        while (enabled) {
            System.out.println("1. Farm");
            System.out.println("2. Craft");
            System.out.println("3. Inventory");
            System.out.println("Choice: ");
            Scanner scanner = new Scanner(System.in);
            selected = scanner.nextInt();
            switch (selected) {
                case 1:
                    Farming.run();
                     break;
                case 2:
                    Crafting.init();
                    break;
                case 3:
                    Inventory.init();
                    break;
            }

        }
    }
}