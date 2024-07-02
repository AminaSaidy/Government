package uzb.aminasaidakhmedova.government.entity;

import java.util.ArrayList;

public class State {
    private String name;
    private ArrayList<City> cities;

    public State(String name) {
        this.name = name;
        this.cities = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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
