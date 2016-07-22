package com.example.android.dublintour;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class FamilyFragment extends Fragment {


    public FamilyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_category, container, false);

        // Create an ArrayList of TouristLocation objects
        final ArrayList<TouristLocation> touristLocations = new ArrayList<>();

        touristLocations.add(new TouristLocation(
                getString(R.string.family1_name),
                getString(R.string.family1_desc),
                getString(R.string.family1_geo),
                R.drawable.dublin_zoo));
        touristLocations.add(new TouristLocation(
                getString(R.string.family2_name),
                getString(R.string.family2_desc),
                getString(R.string.family2_geo),
                R.drawable.wax_museum));

        // Create an {@link AndroidFlavorAdapter}, whose data source is a list of
        // {@link AndroidFlavor}s. The adapter knows how to create list item views for each item
        // in the list.
        TouristLocationAdapter locationAdapter = new TouristLocationAdapter(getActivity(), touristLocations);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) rootView.findViewById(R.id.listView);

        if (listView != null) {
            listView.setAdapter(locationAdapter);
        }

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                TouristLocation location = touristLocations.get(position);

                Uri geoLocation = Uri.parse(location.getLocationCoordinates());
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(geoLocation);
                startActivity(intent);
            }
        });

        return rootView;
    }

}
