package com.cinemavictoria;

public class Customer {
    private String name;
    private String email;
    private Integer telephone;
    private String movie;

    public Customer(String name, String email, int telephone, String movie) {
        this.name = name;
        this.email = email;
        this.telephone = telephone;
        this.movie = movie;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Integer getTelephone() {
        return telephone;
    }
    public String getMovie() {
        return movie;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", movie=" + movie + '\''+
                ", telephone='" + telephone + '\'' +
                '}';
    }

}
