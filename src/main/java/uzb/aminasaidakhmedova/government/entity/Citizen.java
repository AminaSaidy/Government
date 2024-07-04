package uzb.aminasaidakhmedova.government.entity;

public class Citizen {

    private static int newId = 1;
    private final int id;
    private String firstName;
    private String lastName;
    private int age;
    private Country country;

    public Citizen (String firstName, String lastName, int age, Country country) {
        this.id = newId++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
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

    @Override
    public String toString () {
        return "Citizen " + firstName + " " + lastName + ", ID: " + id + ", age: " + age + ", from " + country;
    }
}
