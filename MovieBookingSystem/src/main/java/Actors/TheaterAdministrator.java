package Actors;

import Entities.Movie;
import Entities.MovieHall;
import Entities.Show;
import Entities.TheaterCompany;

public class TheaterAdministrator extends Member {
    private TheaterCompany theaterCompany;

    public TheaterAdministrator(String name, String email, String id, String phone, TheaterCompany theaterCompany) {
        super(name, email, id, phone);
        this.theaterCompany = theaterCompany;
    }

    public boolean addMovie(Movie movie, MovieHall theater) {
        theater.addMovie(movie);
        return true;
    }

    public boolean addShow(Show show, MovieHall theater) {
        theater.addShow(show);
        return true;
    }
}
