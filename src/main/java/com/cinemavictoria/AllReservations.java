package com.cinemavictoria;

import java.util.ArrayList;
import java.util.List;

public class AllReservations {
    private List<Customer> reservationList = new ArrayList<>();

    public AllReservations() {
    }

    public Customer findReservationByName(String Name) {
        for(Customer c: reservationList) {
            if(c.getName().equals(name)){
                return c;
            }
        }
        System.out.println("Name not found! Try again.");
        return null;
    }

    public List<Car> addCarToPark(Car car) {
        carList.add(car);
        return carList;
    }

    public void listCars() {
        for(Car car: carList) {
            System.out.println(car);
        }
    }

    public List<Car> getCarList() {
        return carList;
    }
}

}
