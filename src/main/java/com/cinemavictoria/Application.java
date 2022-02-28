package com.cinemavictoria;

import com.cinemavictoria.controllers.Numeric;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Application {

    static Scanner in = new Scanner(System.in);
    static ReservationList reservationList = new ReservationList();
    static CurrentMovies currentMovies = new CurrentMovies();
    static AllEvents allEvents = new AllEvents();

    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>();
        List<Movie> movieList = new ArrayList<>();
        boolean isNewStart = true;
        String option = "start";

        while (isNewStart == true && option != "exit") {
            System.out.println("available options: [newReservation, addMovie, addEvent, listCustomers, listMovies, listEvents, exit]");
            System.out.print("option=");
            option = in.nextLine();

            switch (option) {
                case "newReservation":
                    Customer customer = createCustomer();
                    reservationList.addCustomerToReservations(customer);
                    break;
                case "addMovie":
                    Movie movie = createMovie();
                    currentMovies.addMovieToMovies(movie);
                    break;
                case "addEvent":
                    Event event = createEvent();
                    allEvents.addEventToEvents(event);
                    break;
                case "listCustomers":
                    listCustomers(reservationList);
                    break;
                case "listMovies":
                    listMovies(currentMovies);
                    break;
                case "listEvents":
                    listEvents(allEvents);
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
        String name = in.nextLine();
        //read email
        System.out.print("email=");
        String email = in.nextLine();
        //read telephone
        String telephone = null;
        Boolean x = false;
        System.out.print("telephone=");
        while(x==false)  {
            telephone = in.nextLine();
            if (Numeric.isNumeric(telephone)==false){
                System.out.println("Invalid phone number, please retry");
//                System.out.println(Numeric.isNumeric(telephone));
            }else x=true;


            boolean matches = telephone.matches("[0-9]+");
            if (telephone.matches("[0-9]+")==true){
                System.out.println("phone is good");
            }

        }
//        System.out.print("telephone=");
//        Integer telephone = in.nextInt();
        System.out.print("movie=");
        String movie = in.nextLine();
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
    private static void listEvents(AllEvents allEvents) {
        System.out.println("List all future events:");
        allEvents.listEvents();
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
        String movieName = in.nextLine();
        //read director
        System.out.print("director=");
        String director = in.nextLine();
        //read date
        System.out.print("date=");
        String date = in.nextLine();
        //read hour
        System.out.print("hour=");
        Integer hour = in.nextInt();
        //read sala
        System.out.print("sala=");
        Integer sala = in.nextInt();
        String buffer = in.nextLine();

        return new Movie(movieName, director, date, hour, sala);
    }
    private static Event createEvent() {
        System.out.println("Provide event details:");
        //read name
        System.out.print("name=");
        String eventName = in.nextLine();
        //read director
        System.out.print("contact=");
        String contact = in.nextLine();
        //read date
        System.out.print("date=");
        String date = in.nextLine();
        //read hour
        System.out.print("hour=");
        Integer hour = in.nextInt();
        //read sala
        System.out.print("sala=");
        Integer sala = in.nextInt();
        String buffer = in.nextLine();

        return new Event(eventName, contact, date, hour, sala);
    }

}
