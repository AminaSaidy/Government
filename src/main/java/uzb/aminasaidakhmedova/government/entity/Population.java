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

    @Override
    public String toString () {
        return citizens.toString();
    }
}
