package Craft;

import Items.Item;
import Machine.Machine;

import java.util.ArrayList;

public class Craft {

    ArrayList<Item> Ingredients = new ArrayList<>();
    ArrayList<Integer> Ingredients_Count = new ArrayList<>();
    ArrayList<Item> Products = new ArrayList<>();
    ArrayList<Integer> Products_Count = new ArrayList<>();


    public Machine required;
    public boolean machine = true;
    public boolean refund = false;
    public int last;



    public Craft(String id) {
        Craftings.crafting_ids.add(id.toLowerCase());
        Craftings.craftings.add(this);
    }


    public Craft craft() {

        Ingredients.forEach((n) -> {
            var Ing_c = Ingredients_Count.get(Ingredients.indexOf(n));


            // Checks if the Items.Item is Craftable or the Machine.Machine is available
            if ((n.quantity - Ing_c) >= 0 && machine) {
                n.subQuantity(Ing_c);
            } else if ((n.quantity - Ing_c) < 0){
                System.out.println("Insufficient " + n.name);
                refund = true;
                last = Ingredients.indexOf(n);
            } else if (!machine) {
                System.out.println(required.getName() + " is required!");
            }
        });

        if (refund || !machine) {

            // refunds every item used in the recipe
            // if the craft is unavailable
            for (int i = 0; i < last; i++) {

                Ingredients.get(i).addQuantity(Ingredients_Count.get(i));

            }

            refund = false;

            // adds the products
        } else {
            Products.forEach((n) -> {
                n.addQuantity(Products_Count.get(Products.indexOf(n)));
            });
        }

        return this;
    }

    public Craft addItem(Item item, int quantity) {
        Ingredients.add(item);
        Ingredients_Count.add(quantity);
        return this;
    }

    public Craft addProduct(Item item, int quantity) {
        Products.add(item);
        Products_Count.add(quantity);
        return this;
    }

    public Craft requireMachine(Machine machine) {
        required = machine;

        if (machine.getAcquired())
            this.machine = true;
        else
            this.machine = false;

        return this;
    };

}
