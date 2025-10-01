package Items;

public class Tool extends Item{
    public int tier;

    public Tool(String name, int tier) {
        super(name);
        this.tier = tier;
    }

    public int getTier() {
        return this.tier;
    }

    public void addTier(int tiers) {
        this.tier += tiers;
    }
}
