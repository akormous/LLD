package Entities;

import java.util.HashSet;
import java.util.Set;

public class MovieHall {
    private TheaterCompany theaterCompany;
    private String name;
    private Set<Show> shows = new HashSet<Show>();
    private Set<Movie> nowPlaying = new HashSet<Movie>();

    public MovieHall(TheaterCompany theaterCompany, String name) {
        this.theaterCompany = theaterCompany;
        this.name = name;
    }

    public void addShow(Show show) {
        shows.add(show);
    }

    public void addMovie(Movie movie) {
        nowPlaying.add(movie);
    }

    public void removeShow(Show show) {
        shows.remove(show);
    }

    public void removeMovie(Movie movie) {
        nowPlaying.remove(movie);
    }
}
