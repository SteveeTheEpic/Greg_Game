import Craft.Crafting;
import Items.*;
import Utils.Inventory;

import java.util.Scanner;

import static Utils.Inventory.showChanged;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Greg Game\n(aka GG)");

        System.out.println();

        int selected;
        boolean enabled = true;
        Items.update(); // Fixes a bug

        while (enabled) {
            System.out.println("1. Farm");
            System.out.println("2. Craft");
            System.out.println("3. Inventory");
            System.out.println("4. Quit");
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
                case 4:
                    enabled = false;
                    System.out.println("Bye!\n see you next time");
            }
            showChanged();
            Items.update();

        }
    }
}