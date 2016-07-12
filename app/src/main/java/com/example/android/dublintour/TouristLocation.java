package com.example.android.dublintour;

import android.graphics.drawable.Drawable;
import android.location.Location;

/**
 * Created by karl_denby on 12/07/2016.
 */
public class TouristLocation {
    private String mPlaceName;
    private String mPlaceDescription;
    private Location mLocationCoordinates;
    private Drawable mPlaceThumbnail;

    public void TouristLocation(String placeName) {
        mPlaceName = placeName;
    }

    public String getPlaceName() {
        return mPlaceName;
    }

    public void setPlaceDescription(String placeDescription) {
        mPlaceDescription = placeDescription;
    }

    public String getPlaceDescriptiong() {
        return mPlaceDescription;
    }

    public void setLocationCoordinates(Location locationCoordinates) {
        mLocationCoordinates = locationCoordinates;
    }

    public Location getLocationCoordinates() {
        return mLocationCoordinates;
    }

    public void setPlaceThumbnail(Drawable placeThumbnail) {
        mPlaceThumbnail = placeThumbnail;
    }

    public Drawable getPlaceThumbnail() {
        return mPlaceThumbnail;
    }
}
