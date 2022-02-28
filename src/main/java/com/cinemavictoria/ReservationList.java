package com.cinemavictoria;

import java.util.ArrayList;
import java.util.List;

public class ReservationList {
    private List<Customer> customerList = new ArrayList<>();

    public ReservationList() {
    }

    public Customer findReservationByName(String name) {
        for (Customer c : customerList) {
            if (c.getName().equals(name)) {
                return c;
            }
        }
        System.out.println("Name not found! Try again.");
        return null;
    }

    public List<Customer> addCustomerToReservations(Customer customer) {
        customerList.add(customer);
        return customerList;
    }

    public void listCustomers() {
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    public List<Customer> getReservationListList() {
        return customerList;
    }
}


