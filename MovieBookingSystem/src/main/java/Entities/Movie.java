package Entities;

import Enums.Genre;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title, description, language;
    private List<Genre> genreList = new ArrayList<Genre>();
    private int durationInMin;
    private List<Show> shows = new ArrayList<Show>();

    public Movie(String title, String description, String language, List<Genre> genreList, int durationInMin) {
        this.title = title;
        this.description = description;
        this.language = language;
        this.genreList = genreList;
        this.durationInMin = durationInMin;
    }
}
