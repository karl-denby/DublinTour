package com.example.android.dublintour;

public class TouristLocation {
    private final int NO_LOCATION_IMAGE = -1;

    private String mPlaceName;
    private String mPlaceDescription;
    private String mLocationCoordinates;
    private int mPlaceThumbnail = NO_LOCATION_IMAGE;


    public TouristLocation(String placeName, String placeDescription, String locationCoordinates) {
        mPlaceName = placeName;
        mPlaceDescription = placeDescription;
        mLocationCoordinates = locationCoordinates;
    }

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

    public boolean hasImage() {
        return mPlaceThumbnail != NO_LOCATION_IMAGE;
    }
}
