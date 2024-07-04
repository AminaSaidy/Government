package uzb.aminasaidakhmedova.government.entity;

import java.util.ArrayList;
import java.util.List;

public class State {
    private String name;
    private int area;
    private List<City> cities;

    public State(String name, int area) {
        this.name = name;
        this.area = area;
        this.cities = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getArea() {
        return area;
    }

    //добавить город в штат
    public void addCity (City city) {
        cities.add(city);
    }

    @Override
    public String toString() {
        return "State " + name + " that has " + cities;
    }
}
