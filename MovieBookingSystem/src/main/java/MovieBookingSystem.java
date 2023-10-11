import Entities.Address;
import Entities.Movie;
import Entities.MovieHall;
import Entities.TheaterCompany;
import Enums.Genre;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MovieBookingSystem {

    public void setup() {
    }

    public static void main(String[] args) {
        System.out.println("Welcome to BookMyShow");

        TheaterCompany pvrImax = new TheaterCompany("1", "PVR IMAX",new Address("Ambience Mall","Gurugram", "HR","122001","India"));

        MovieHall audi1 = new MovieHall(pvrImax, "AUDI 1");

        pvrImax.addMovieHall(audi1);

        Movie superMarioMovie = new Movie("Super Mario Bros", "epic movie", "English", new ArrayList<Genre>(Genre.ANIMATION,Genre.ADVENTURE));
    }
}
