import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import uzb.aminasaidakhmedova.government.entity.*;

public class Tests {
    private Country country;
    private Population population;

    @BeforeClass
    public void setUp() {
        country = Country.getCountry("Greatland", "Greatcapital");
        population = new Population();

        State state1 = new State("New Rolly", 1250, "RollyCenter");
        City city1 = new City("London");
        Street street1 = new Street("MyStreet");
        city1.addStreet(street1);
        state1.addCity(city1);
        country.addState(state1);

        State state2 = new State("Yorkes", 4000, "YorkCenter");
        City city2 = new City("Tashkent");
        Street street2 = new Street("YourStreet");
        city2.addStreet(street2);
        state2.addCity(city2);
        country.addState(state2);

        for (int i = 0; i < 5; i++) {
            Citizen citizen = new Citizen(country);
            population.addCitizens(citizen);
        }
    }

    @Test
    public void testGetCapital() {
        Assert.assertEquals(country.getCapital(), "Greatcapital");
    }

    @Test
    public void testGetAmountStates() {
        Assert.assertEquals(country.getAmountStates(), 2);
    }

    @Test
    public void testGetTotalArea() {
        Assert.assertEquals(country.getTotalArea(), 5250);
    }

    @Test
    public void testGetAverageAge() {
        int averageAge = population.getAverageAge();
        Assert.assertTrue(averageAge >= 16 && averageAge <= 80);
    }
}

