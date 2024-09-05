import java.util.ArrayList;

public class Craft {

    ArrayList<Item> Ingredients = new ArrayList<>();
    ArrayList<Integer> Ingredients_Count = new ArrayList<>();
    ArrayList<Item> Products = new ArrayList<>();
    ArrayList<Integer> Products_Count = new ArrayList<>();


    public boolean refund = false;
    public int last;


    public Craft(String id) {
        Craftings.crafting_ids.add(id.toLowerCase());
        Craftings.craftings.add(this);
    }


    public Craft craft() {

        Ingredients.forEach((n) -> {
            var Ing_c = Ingredients_Count.get(Ingredients.indexOf(n));

            System.out.println(Ingredients);

            if ((n.quantity - Ing_c) >= 0) {
                n.subQuantity(Ing_c);
            } else {
                System.out.println("Insufficient " + n.name);
                refund = true;
                last = Ingredients.indexOf(n);
            }
        });

        if (refund) {
            for (int i = 0; i < last; i++) {

                Ingredients.get(i).addQuantity(Ingredients_Count.get(i));

            }

            refund = false;
        } else {
            Products.forEach((n) -> {
                n.addQuantity(Products_Count.get(Products.indexOf(n)));
            });
        }

        return this;
    }

    public Craft addItem(Item item, int quanity) {
        Ingredients.add(item);
        Ingredients_Count.add(quanity);
        return this;
    }

    public Craft addProduct(Item item, int quantity) {
        Products.add(item);
        Products_Count.add(quantity);
        return this;
    }

}
