package com.example.android.dublintour;

import android.graphics.drawable.Drawable;
import android.location.Location;

/**
 * Created by karl_denby on 12/07/2016.
 */
public class TouristLocation {
    private String mPlaceName;
    private String mPlaceDescription;
    private String mLocationCoordinates;
    private int mPlaceThumbnail;

    public TouristLocation(String placeName, String placeDescription, String locationCoordinates, int placeThumbnail) {
        mPlaceName = placeName;
        mPlaceDescription = placeDescription;
        mLocationCoordinates = locationCoordinates;
        mPlaceThumbnail = placeThumbnail;
    }

    public String getPlaceName() {
        return mPlaceName;
    }

    public String getPlaceDescription() {
        return mPlaceDescription;
    }

    public String getLocationCoordinates() {
        return mLocationCoordinates;
    }

    public int getPlaceThumbnail() {
        return mPlaceThumbnail;
    }
}
