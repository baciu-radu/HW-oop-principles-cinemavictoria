package com.cinemavictoria;

import java.util.ArrayList;
import java.util.List;

public class CurrentMovies {
    private List<Movie> movieList = new ArrayList<>();

    public CurrentMovies() {
    }

    public Movie findMovieByName(String movieName) {
        for(Movie c: movieList) {
            if(c.getMovieName().equals(movieName)){
                return c;
            }
        }
        System.out.println("Name not found! Try again.");
        return null;
    }

    public List<Movie> addMovieToMovies(Movie movie) {
        movieList.add(movie);
        return movieList;
    }

    public void listMovies() {
        for(Movie movie: movieList) {
            System.out.println(movie);
        }
    }

    public List<Movie> getMovieListList() {
        return movieList;
    }
}
