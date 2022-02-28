package com.cinemavictoria;

public class Movie {
    private String name;
    private String director;
    private String date;
    private Integer hour;
    private Integer sala;

    public Movie(String name, String director, String date, int hour, int sala);
        this.name =name;
        this.director =director;
        this.date =date;
        this.hour =hour;
        this.sala =sala;

    public String getName() {
        return name;
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
                "name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", date='" + date + '\'' +
                ", hour=" + hour +
                ", sala=" + sala +
                '}';
    }

}
