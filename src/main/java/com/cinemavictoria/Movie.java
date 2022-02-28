package com.cinemavictoria;

public class Movie {

    private String movieName;
    private String director;
    private String date;
    private Integer hour;
    private Integer sala;

    public Movie(String movieName, String director, String date, int hour, int sala) {


        this.movieName = movieName;
        this.director = director;
        this.date = date;
        this.hour = hour;
        this.sala = sala;
    }
    public String getMovieName() {
        return movieName;
    }

    public String getDirector() {
        return director;
    }

    public String getDate() {
        return date;
    }

    public Integer getHour() {
        return hour;
    }

    public Integer getSala() {
        return sala;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + movieName + '\'' +
                ", director='" + director + '\'' +
                ", date='" + date + '\'' +
                ", hour=" + hour +
                ", sala=" + sala +
                '}';
    }

}
