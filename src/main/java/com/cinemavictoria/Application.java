package com.cinemavictoria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    static Scanner in = new Scanner(System.in);
    static ReservationList reservationList = new ReservationList();
    static CurrentMovies currentMovies = new CurrentMovies();

    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>();
        List<Movie> movieList = new ArrayList<>();
        boolean isNewStart = true;
        String option = "start";

        while (isNewStart == true && option != "exit") {
            System.out.println("available options: [newReservation, addMovie, addEvent, listCustomers, listMovies, exit]");
            System.out.print("option=");
            option = in.next();

            switch (option) {
                case "newReservation":
                    Customer customer = createCustomer();
                    reservationList.addCustomerToReservations(customer);
                    break;
                case "addMovie":
                    Movie movie = createMovie();
                    currentMovies.addMovieToMovies(movie);
                    break;
                case "listCustomers":
                    listCustomers(reservationList);
                    break;
                case "listMovies":
                    listMovies(currentMovies);
                    break;
                case "exit":
                    System.exit(0);
                    break;
                default:
                    System.err.println("Invalid option");

            }
        }
    }

    //----------------creates new Customer--------------------

    private static Customer createCustomer() {
        System.out.println("Provide personal details:");
        //read name
        System.out.print("name=");
        String name = in.next();
        //read email
        System.out.print("email=");
        String email = in.next();
        //read telephone
        System.out.print("telephone=");
        Integer telephone = in.nextInt();
        System.out.print("movie=");
        String movie = in.next();
        return new Customer(name, email, telephone, movie);
    }

    private static void listCustomers(ReservationList reservationList) {
        System.out.println("List all reservations:");
        reservationList.listCustomers();
        System.out.println("------");
    }
    private static void listMovies(CurrentMovies currentMovies) {
        System.out.println("List all available movies:");
        currentMovies.listMovies();
        System.out.println("------");
    }

    //    private static void checkAvailability() {
//        System.out.println("check");
//        Car car;
//        do {
//            System.out.print("carId=");
//            String id = in.next();
//            car = carMarket.findCarById(id);
//        }
//        while (car == null);
//
//
//    }
    //----------------creates new Movie--------------------

    private static Movie createMovie() {
        System.out.println("Provide movie details:");
        //read name
        System.out.print("name=");
        String movieName = in.next();
        //read director
        System.out.print("director=");
        String director = in.next();
        //read date
        System.out.print("date=");
        String date = in.next();
        //read hour
        System.out.print("hour=");
        Integer hour = in.nextInt();
        //read sala
        System.out.print("sala=");
        Integer sala = in.nextInt();

        return new Movie(movieName, director, date, hour, sala);
    }

}
