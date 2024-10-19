package Machine;

public class Machine {

    String name;
    Boolean acquired;
    Integer count;


    public Machine(String name) {
        this.name = name;
        this.acquired = false;
        this.count = 0;
    }

    public Machine setAcquired(Boolean state) {
        this.acquired = state;
        return this;
    }

    public Boolean getAcquired() {
        return this.acquired;
    }
    public String getName() {
        return this.name;
    }
    public Integer getCount() {
        return this.count;
    }
    public Machine setCount(int count) {
        this.count = count;
        return this;
    }

    // added for "multithreading"
    public Machine addCount(int count) {
        this.count += count;
        return this;
    }
    public Machine subCount(int count) {
        this.count -= count;
        return this;
    }
}
