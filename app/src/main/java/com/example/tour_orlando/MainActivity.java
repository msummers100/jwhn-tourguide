package com.example.tour_orlando;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the restaurants activity
        TextView restaurants = (TextView) findViewById(R.id.restaurants_text_view);
        // Set a click listener on that View
        restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {  // Create a new intent to open the {@link NumbersActivity}
                Intent restaurantsIntent = new Intent(MainActivity.this, Restaurants.class);

                // Start the new activity
                startActivity(restaurantsIntent);
        }

        });
// Find the View that shows the restaurants activity
         TextView themeparks = (TextView) findViewById(R.id.theme_parks_text_view);
        // Set a click listener on that View
        themeparks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {  // Create a new intent to open the {@link NumbersActivity}
                Intent themeparksIntent = new Intent(MainActivity.this, ThemeParks.class);

                // Start the new activity
                startActivity(themeparksIntent);
            }

        });

        // Find the View that shows the restaurants activity
        TextView golf = (TextView) findViewById(R.id.golf_text_view);
        // Set a click listener on that View
       golf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {  // Create a new intent to open the {@link NumbersActivity}
                Intent golfIntent = new Intent(MainActivity.this, Golf.class);

                // Start the new activity
                startActivity(golfIntent);
            }

        });

        // Find the View that shows the restaurants activity
        TextView things = (TextView) findViewById(R.id.things_to_do_text_view);
        // Set a click listener on that View
        things.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {  // Create a new intent to open the {@link NumbersActivity}
                Intent thingsIntent = new Intent(MainActivity.this, ThingsToDo.class);

                // Start the new activity
                startActivity(thingsIntent);
            }

        });

}

}
