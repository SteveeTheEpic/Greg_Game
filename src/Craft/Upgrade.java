package Craft;

import Items.Item;
import Items.Tool;

import java.util.ArrayList;

import static Utils.Inventory.showChange;

public class Upgrade extends Craft{

    public Tool Product;

    public Upgrade(String id) {
        super(id);
    }

    @Override
    public void craft() {
        ArrayList<Item> temp = Ingredients;
        Ingredients.forEach((n) -> {
            var Ing_c = Ingredients_Count.get(Ingredients.indexOf(n));

            // Checks if the Tool is Upgradeable and the Machine is available
            if ((n.quantity - Ing_c) >= 0 && machine) {
                n.subQuantity(Ing_c);
            } else if ((n.quantity - Ing_c) < 0){
                System.out.println("Insufficient " + n.name);
                refund = true;
            } else if (!machine) {
                System.out.println(required.getName() + " is required!");
            }
        });

        if (refund || !machine) {
            // refunds every item used in the recipe if the upgrade is refunded
            for (int i = 0; i < Ingredients.size(); i++) {
                Ingredients.get(i).addQuantity(Ingredients_Count.get(i));
            }
        } else {
            // adds an tier
            Product.addTier(1);
        }

        showChange(temp, Ingredients);
    }
}
