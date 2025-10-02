package Craft;

import Items.Item;
import Items.Tool;

import java.util.ArrayList;

public class Upgrade extends Craft{

    public Tool Product;

    public Upgrade(String id) {
        super(id);
    }

    @Override
    public void craft() {
        Product = (Tool) Products.get(0);
        Ingredients.forEach((item) -> {
            var Ing_c = Ingredients_Count.get(Ingredients.indexOf(item));

            // Checks if the Tool is Upgradeable and the Machine is available
            if ((item.quantity - Ing_c) >= 0 && machine) {
                item.subQuantity(Ing_c);
            } else if ((item.quantity - Ing_c) < 0){
                System.out.println("Insufficient " + item.name);
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

    }
}
