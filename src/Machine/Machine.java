package Machine;

public class Machine {

    String name;
    Boolean acquired;

    public Machine(String name) {
        this.name = name;
        this.acquired = false;
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
}
