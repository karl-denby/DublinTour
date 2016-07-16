package com.example.android.dublintour;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;

/**
 * Created by karld on 16/07/2016.
 */
public class HistoryActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        // Create an ArrayList of TouristLocation objects
        ArrayList<TouristLocation> touristLocations = new ArrayList<TouristLocation>();

        touristLocations.add(new TouristLocation(
                getString(R.string.hist1_name),
                getString(R.string.hist1_desc),
                getString(R.string.hist1_geo),
                R.mipmap.ic_launcher));
        touristLocations.add(new TouristLocation(
                getString(R.string.hist2_name),
                getString(R.string.hist2_desc),
                getString(R.string.hist2_geo)));
                // no icon
        touristLocations.add(new TouristLocation(
                getString(R.string.hist3_name),
                getString(R.string.hist3_desc),
                getString(R.string.hist3_geo),
                R.mipmap.ic_launcher));

        // Create an {@link AndroidFlavorAdapter}, whose data source is a list of
        // {@link AndroidFlavor}s. The adapter knows how to create list item views for each item
        // in the list.
        TouristLocationAdapter locationAdapter = new TouristLocationAdapter(this, touristLocations);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(locationAdapter);
    }

}
