package com.example.android.dublintour;

import android.location.Location;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create an ArrayList of TouristLocation objects
        ArrayList<TouristLocation> touristLocations = new ArrayList<TouristLocation>();

        touristLocations.add(new TouristLocation("Place1", "1st place", "Dublin", R.mipmap.ic_launcher));
        touristLocations.add(new TouristLocation("Place2", "2nd place", "Dublin"));
        touristLocations.add(new TouristLocation("Place3", "3rd place", "Dublin"));
        touristLocations.add(new TouristLocation("Place4", "4th place", "Dublin", R.mipmap.ic_launcher));

        // Create an {@link AndroidFlavorAdapter}, whose data source is a list of
        // {@link AndroidFlavor}s. The adapter knows how to create list item views for each item
        // in the list.
        TouristLocationAdapter locationAdapter = new TouristLocationAdapter(this, touristLocations);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(locationAdapter);

    }
}
