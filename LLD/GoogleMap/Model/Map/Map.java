package Model.Map;

public class Map {
    private String instance;

    public Map(String instance) {
        this.instance = instance;
    }

    public String getInstance() {
        return instance;
    }

    public void setInstance(String instance) {
        this.instance = instance;
    }

    @Override
    public String toString() {
        return "Map{" +
                "instance='" + instance + '\'' +
                '}';
    }
}
