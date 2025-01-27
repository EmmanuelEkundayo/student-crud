package models;
public abstract class Place {
    private final String name;

    public Place(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
