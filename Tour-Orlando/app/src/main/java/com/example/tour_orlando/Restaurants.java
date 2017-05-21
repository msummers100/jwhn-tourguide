package com.example.tour_orlando;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Restaurants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_list);

        // create list of events

        ArrayList<Event> events = new ArrayList<Event>();
        events.add(new Event(getString(R.string.category_restaurants_loc1), getString(R.string.category_restaurants_desc1), R.drawable.charlie));
        events.add(new Event(getString(R.string.category_restaurants_loc2), getString(R.string.category_restaurants_desc2), R.drawable.capital));
        events.add(new Event(getString(R.string.category_restaurants_loc3), getString(R.string.category_restaurants_desc3), R.drawable.roys));

        // Adapter
        EventAdapter adapter = new EventAdapter(this, events);
        ListView listView = (ListView) findViewById(R.id.eventList);
        listView.setAdapter(adapter);

    }

}
