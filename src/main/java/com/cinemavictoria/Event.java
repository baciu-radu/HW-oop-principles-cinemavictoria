package com.cinemavictoria;

public class Event {
    private String eventName;
    private String contact;
    private String date;
    private Integer hour;
    private Integer sala;

    public Event(String eventName, String contact, String date, int hour, int sala) {


        this.eventName = eventName;
        this.contact = contact;
        this.date = date;
        this.hour = hour;
        this.sala = sala;
    }
    public String getEventName() {
        return eventName;
    }

    public String getContact() {
        return contact;
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
        return "Event{" +
                "name='" + eventName + '\'' +
                ", contact='" + contact + '\'' +
                ", date='" + date + '\'' +
                ", hour=" + hour +
                ", sala=" + sala +
                '}';
    }
//    public Event(String eventName, String contact, String date, Integer hour, Integer sala) {
//    }
}
