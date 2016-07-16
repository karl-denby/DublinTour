package com.example.android.dublintour;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by karld on 16/07/2016.
 */
public class FoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        // Create an ArrayList of TouristLocation objects
        ArrayList<TouristLocation> touristLocations = new ArrayList<TouristLocation>();

        touristLocations.add(new TouristLocation(
                getString(R.string.food1_name),
                getString(R.string.food1_desc),
                getString(R.string.food1_geo)));
                // no icon

        // Create an {@link AndroidFlavorAdapter}, whose data source is a list of
        // {@link AndroidFlavor}s. The adapter knows how to create list item views for each item
        // in the list.
        TouristLocationAdapter locationAdapter = new TouristLocationAdapter(this, touristLocations);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(locationAdapter);
    }

}
