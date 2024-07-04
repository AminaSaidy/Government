package uzb.aminasaidakhmedova.government.entity;

import java.util.ArrayList;
import java.util.List;

public class Population {
    private List<Citizen> citizens;

    public Population() {
        this.citizens = new ArrayList<>();
    }

    public void addCitizens(Citizen citizen) {
        citizens.add(citizen);
    }

    public List<Citizen> getCitizens() {
        return citizens;
    }

    public List<Citizen> getCitizenByNameLength(int length) {
        List<Citizen> result = new ArrayList<>();
        for (Citizen citizen : citizens) {
            if (citizen.getFirstName().length() == length) {
                result.add(citizen);
            }
        }
        return result;
    }

    public List<Citizen> getCitizenByFirstChar(char firstLetter) {
        List<Citizen> result = new ArrayList<>();
        for (Citizen citizen : citizens) {
            if (citizen.getFirstName().charAt(0) == firstLetter) {
                result.add(citizen);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return citizens.toString();
    }
}
