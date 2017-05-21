package com.example.tour_orlando;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ThemeParks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_list);

        // create list of events

        ArrayList<Event> events = new ArrayList<Event>();
        events.add(new Event(getString(R.string.category_theme_park_loc1), getString(R.string.category_theme_park_des1), R.drawable.universal));
        events.add(new Event(getString(R.string.category_theme_park_loc2), getString(R.string.category_theme_park_desc2), R.drawable.disney));
        events.add(new Event(getString(R.string.category_theme_park_loc3), getString(R.string.category_theme_park_desc3), R.drawable.seaworld));

        // Adapter
        EventAdapter adapter = new EventAdapter(this, events);
        ListView listView = (ListView) findViewById(R.id.eventList);
        listView.setAdapter(adapter);

    }

}