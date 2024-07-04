package uzb.aminasaidakhmedova.government._main;

import uzb.aminasaidakhmedova.government.entity.*;

import java.util.Scanner;

public class _Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Country country = Country.getCountry("Greatland", "Greatcapital");
        Population population = new Population();
        State state1 = new State("New Rolly");
        State state2 = new State("Yorkes");
        City city1 = new City("London");
        City city2 = new City("Tashkent");
        Street street1 = new Street("MyStreet");
        Street street2 = new Street("YourStreet");

        city1.addStreet(street1);
        city2.addStreet(street2);
        state1.addCity(city1);
        state2.addCity(city2);
        country.addState(state1);
        country.addState(state2);

        for (int i = 0; i < 5; i++) {
            Citizen citizen = new Citizen(country);
            population.addCitizens(citizen);
        }

        while (true) {
            System.out.println("Choose the option: ");
            System.out.println("1.Print the capital.");
            System.out.println("2.Print amount of states.");
            System.out.println("3.Print the area of the country.");
            System.out.println("4.Print states' centres.");
            System.out.println("5.Print average age of citizens.");
            System.out.println("6.Print citizens with certain length of their first names.");
            System.out.println("7.Print citizens whose first names start with a certain character.");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Wrong input. Try again.");
            }
        }
    }
}
