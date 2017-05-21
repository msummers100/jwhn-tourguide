package com.example.tour_orlando;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Michael on 11/25/2016.
 */
public class EventAdapter extends ArrayAdapter<Event> {

    public EventAdapter(Context context, ArrayList<Event> events) {
        super(context, 0, events);
    }

    /**
     * Returns a list item view that displays information about the earthquake at the given postion
     * in the list of earthquakes.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Find the event at the given position in the list of events
        Event currentEvent = getItem(position);

        // Find the TextView with view ID location
        TextView locationView = (TextView) listItemView.findViewById(R.id.location);

        // Display the location of the current event in the TextView
        locationView.setText(currentEvent.getLocation());

        // Find the TextView with view ID location
        TextView descriptionView = (TextView) listItemView.findViewById(R.id.description);

        // Display the location of the current event in the TextView
        descriptionView.setText(currentEvent.getDescription());

        // Load up appropriate image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.icon_image);

        // Display image of the current event in an ImageView
        imageView.setImageResource(currentEvent.getIcon());

        return listItemView;
    }
}

