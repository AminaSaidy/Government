package uzb.aminasaidakhmedova.government.entity;

public class Street {
    private String name;

    public Street(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Street " + name;
    }
}
