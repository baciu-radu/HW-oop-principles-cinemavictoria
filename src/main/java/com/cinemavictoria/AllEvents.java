package com.cinemavictoria;

import java.util.ArrayList;
import java.util.List;

public class AllEvents {
    private List<Event> eventList = new ArrayList<>();

    public AllEvents() {
    }

    public Event findeventByDate(String date) {
        for(Event c: eventList) {
            if(c.getDate().equals(date)){
                return c;
            }
        }
        System.out.println("Name not found! Try again.");
        return null;
    }

    public List<Event> addEventToEvents(Event event) {
        eventList.add(event);
        return eventList;
    }

    public void listEvents() {
        for(Event event: eventList) {
            System.out.println(event);
        }
    }

    public List<Event> getEventList() {
        return eventList;
    }

}
