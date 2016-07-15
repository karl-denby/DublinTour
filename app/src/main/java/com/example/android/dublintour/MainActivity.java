package com.example.android.dublintour;

import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create an ArrayList of TouristLocation objects
        ArrayList<TouristLocation> touristLocations = new ArrayList<TouristLocation>();

        touristLocations.add(new TouristLocation("Kilmainham Jail", "Prison telling stories of Ireland's past", "geo: 53.3419423,-6.310682", R.mipmap.ic_launcher));
        touristLocations.add(new TouristLocation("Guiness Storehouse", "Immersive brand experience & rooftop bar", "geo: 53.3418772,-6.288898"));
        touristLocations.add(new TouristLocation("Collins Baracks", "Museum", "53.3479397,-6.2881163"));
        touristLocations.add(new TouristLocation("Dublin Castle", "Museums, state rooms and Gothic chapel", "geo: 53.3445466,-6.2709349", R.mipmap.ic_launcher));

        // Create an {@link AndroidFlavorAdapter}, whose data source is a list of
        // {@link AndroidFlavor}s. The adapter knows how to create list item views for each item
        // in the list.
        TouristLocationAdapter locationAdapter = new TouristLocationAdapter(this, touristLocations);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(locationAdapter);

    }

    public void showMap(View v) {
        Uri geoLocation = Uri.parse("geo:47.6,-122.3");

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(geoLocation);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

}
