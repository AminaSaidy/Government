package uzb.aminasaidakhmedova.government.entity;

import java.util.Random;

public class Citizen {
    private static int newId = 1000;
    private final int id;
    private String firstName;
    private String lastName;
    private int age;
    private Country country;

    public Citizen(Country country) {
        this.id = newId++;
        this.firstName = generateRandomName(5 + new Random().nextInt(5));
        this.lastName = generateRandomName(5 + new Random().nextInt(5));
        this.age = 16 + new Random().nextInt(64);
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void getAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Country getCountry() {
        return country;
    }

    private static String generateRandomName(int length) {
        String possibleChars = "abcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        StringBuilder strBuild = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            strBuild.append(possibleChars.charAt(random.nextInt(possibleChars.length())));
        }
        return strBuild.toString();
    }

    @Override
    public String toString() {
        return "Citizen " + firstName + " " + lastName + ", ID: " + id + ", age: " + age + ", from " + country;
    }
}
