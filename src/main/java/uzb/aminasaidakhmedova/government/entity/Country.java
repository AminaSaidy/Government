package uzb.aminasaidakhmedova.government.entity;

import java.util.ArrayList;

public class Country {

    private static Country country;
    private String name;
    private ArrayList<State> states;

    //пэттерн синглтон
    private Country(String name) {
        this.name = name;
        this.states = new ArrayList<>();
    }

    public static Country getCountry(String name) {
        if (country == null) {
            country = new Country(name);
        }
        return country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //добавить штат
    public void addState (State state) {
        states.add(state);
    }

    @Override
    public String toString () {
        return "Country " + name + " includes " + states;
    }
}
