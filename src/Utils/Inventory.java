package Utils;

import Items.*;
import Items.Items;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Inventory {

    public static void init() {
        Items.Items_List.forEach((item) -> {
            if (item.showing && !(item instanceof Tool)) {
                System.out.println(item.name + ": " + item.quantity);
            } else if (item.showing && (item instanceof Tool tool)){
                System.out.printf("%s's Tier: %d", tool.name, tool.tier);
            }
        });
    }


    public static ArrayList<String> getMatches(HashMap<String, ?> list, String match) {
        StringBuilder regex = new StringBuilder();
        for (char c : match.toLowerCase().toCharArray()) {
            regex.append(Pattern.quote(Character.toString(c))).append(".*");
        }

        String finalRegex = regex.toString();
        Pattern pattern = Pattern.compile(finalRegex);

        ArrayList<String> possible = new ArrayList<>();
        for (String s : list.keySet()) {
            Matcher matcher = pattern.matcher(s);
            if (matcher.find()) possible.add(s);
            if (s == match) {
                possible.clear();
                possible.add(s);
                break;
            }
        }

        return possible;
    }

    public static void showChange(ArrayList<Item> before, ArrayList<Item> after) {
        for (Item item : before) {
            if (item.quantity - after.get(after.indexOf(item)).quantity > 0) {
                System.out.printf("%s:  %d -> %d", item.name, item.quantity, after.get(after.indexOf(item)).quantity);
            }
        }

        for (Item item : before) {
            if (!(item instanceof Tool tool)) continue;
            if (!(after.get(after.indexOf(tool)) instanceof Tool tool1)) continue;
            if (tool.getTier() - tool1.getTier() > 0) {
                System.out.printf("%s's Tier:  %d -> %d", tool.name, tool.getTier(), after.get(after.indexOf(tool)).quantity);
            }
        }
    }
}
