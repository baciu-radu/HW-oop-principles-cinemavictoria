package com.cinemavictoria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    static Scanner in = new Scanner(System.in);
    static AllReservations reservationList = new AllReservations();

    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>();
        boolean isNewStart=true;
        String option= "start";

        while (isNewStart ==true && option != "exit"){
            System.out.println("available options: [newReservation, addMovie, addEvent");
            System.out.print("option=");
            option = in.next();

            switch (option){
                case "newReservation":
                    Customer customer = createCustomer();
                    reservationList.add
            }
        }
    }
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
        Integer telephone = in.next();
    }
    public List<Customer> addReservationToList(Customer customer) {
        AllReservations.add(customer);
        return reservationList;


}
