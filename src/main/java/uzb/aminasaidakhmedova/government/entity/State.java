package uzb.aminasaidakhmedova.government.entity;

import java.util.ArrayList;
import java.util.List;

public class State {
    private String name;
    private int area;
    private String stateCenter;
    private List<City> cities;

    public State(String name, int area, String stateCenter) {
        this.name = name;
        this.area = area;
        this.stateCenter = stateCenter;
        this.cities = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getArea() {
        return area;
    }

    public void setStateCenter(String stateCenter) {
        this.stateCenter = stateCenter;
    }

    public String getStateCenter() {
        return stateCenter;
    }

    //добавить город в штат
    public void addCity(City city) {
        cities.add(city);
    }

    @Override
    public String toString() {
        return "State " + name + " that has " + cities;
    }
}
