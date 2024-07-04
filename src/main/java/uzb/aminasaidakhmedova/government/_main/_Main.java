package uzb.aminasaidakhmedova.government._main;

import uzb.aminasaidakhmedova.government.entity.*;

public class _Main {
    public static void main(String[] args) {
        Country country = Country.getCountry("Greatland", "Greatcapital");
        Citizen citizen = new Citizen("jack", "jackson", 12, country);

        State state1 = new State("New Rolly");
        State state2 = new State("Yorkes");

        City city1 = new City ("London");
        City city2 = new City ("Tashkent");

        Street street1 = new Street("MyStreet");
        Street street2 = new Street("YourStreet");

        city1.addStreet(street1);
        city2.addStreet(street2);
        state1.addCity(city1);
        state2.addCity(city2);
        country.addState(state1);
        country.addState(state2);

        System.out.println(country);
        System.out.println(citizen);
    }
}
