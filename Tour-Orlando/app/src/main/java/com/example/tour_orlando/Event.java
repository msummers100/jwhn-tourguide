package com.example.tour_orlando;

/**
 * Created by Michael on 11/24/2016.
 */
public class Event {
    private String location;
    private String description;
    private int icon;

    public Event(String location, String description, int icon) {
        this.location = location;
        this.description = description;
        this.icon = icon;
    }

    public String getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    public int getIcon() {
        return icon;
    }
}
