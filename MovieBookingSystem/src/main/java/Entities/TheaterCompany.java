package Entities;

import java.util.HashSet;
import java.util.Set;

public class TheaterCompany {
    private String companyId;
    private String name;
    private Set<MovieHall> movieHalls;
    private Address address;

    public TheaterCompany(String companyId, String name, Address address) {
        this.companyId = companyId;
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void addMovieHall(MovieHall movieHall) {
        this.movieHalls.add(movieHall);
    }

    public void removeMovieHall(MovieHall movieHall) {
        this.movieHalls.removeAll(movieHalls);
    }
}
