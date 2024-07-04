package uzb.aminasaidakhmedova.government.entity;

import java.util.ArrayList;
import java.util.List;

public class Country {
    private static Country country;
    private String name;
    private String capital;
    private List<State> states;

    //пэттерн синглтон
    private Country(String name, String capital) {
        this.name = name;
        this.capital = capital;
        this.states = new ArrayList<>();
    }

    public static Country getCountry(String name, String capital) {
        if (country == null) {
            country = new Country(name, capital);
        }
        return country;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    //добавить штат
    public void addState(State state) {
        states.add(state);
    }

    @Override
    public String toString() {
        return "Country " + name + " with capital " + capital + " " + states;
    }
}
