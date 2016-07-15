package com.example.android.dublintour;

        import android.app.Activity;
        import android.util.Log;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.widget.ImageView;
        import android.widget.TextView;

        import java.util.ArrayList;

/*
* {@link TouristLocationAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
* based on a data source, which is a list of {@link TouristLocation} objects.
* */
public class TouristLocationAdapter extends ArrayAdapter<TouristLocation> {

    private static final String LOG_TAG = TouristLocationAdapter.class.getSimpleName();

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param touristLocations A List of TouristLocation objects to display in a list
     */
    public TouristLocationAdapter(Activity context, ArrayList<TouristLocation> touristLocations) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, touristLocations);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.listview_location, parent, false);
        }

        // Get the {@link TouristLocation} object located at this position in the list
        TouristLocation currentTouristLocation = getItem(position);

        // Find the ImageView in the listview_location.xml layout with the ID placeImage
        ImageView placeImageView = (ImageView) listItemView.findViewById(R.id.placeImage);

        // Get the place name from the current TouristLocation object and
        // set this text on the name TextView
        if (currentTouristLocation.hasImage()) {
            placeImageView.setImageResource(currentTouristLocation.getPlaceThumbnail());
            placeImageView.setVisibility(View.VISIBLE);
        } else{
            placeImageView.setVisibility(View.GONE);
        }

        // Find the TextView in the listview_location.xml layout with the ID placeName
        TextView placeTextView = (TextView) listItemView.findViewById(R.id.placeName);
        placeTextView.setText(currentTouristLocation.getPlaceName());

        // Find the TextView in the listview_location.xml layout with the ID placeDescription
        TextView placeDescriptionView = (TextView) listItemView.findViewById(R.id.placeDescription);
        placeDescriptionView.setText(currentTouristLocation.getPlaceDescription());

        // Find the ImageView in the listview_location.xml layout with the ID placeLocation
        ImageView placeLocationView = (ImageView) listItemView.findViewById(R.id.placeLocation);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}