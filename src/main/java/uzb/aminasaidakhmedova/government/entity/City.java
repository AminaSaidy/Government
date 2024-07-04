package uzb.aminasaidakhmedova.government.entity;

import java.util.ArrayList;

public class City{
    private String name;
    private ArrayList<Street> streets;

    public City(String name) {
        this.name = name;
        this.streets = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //добавить улицу в город
    public void addStreet(Street street) {
        streets.add(street);
    }

    @Override
    public String toString () {
        return "City " + name + " with " + streets;
    }
}
