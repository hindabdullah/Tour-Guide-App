package com.example.android.theguidesaudi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by hind on 11/01/18.
 */

public class TourAdapter  extends ArrayAdapter<Tour> {
    public TourAdapter(Context context, ArrayList<Tour> tours) {
        super(context, 0, tours);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get the {@link Tour} object located at this position in the list
        Tour currentTour = getItem(position);
        // Find the TextView in the list_item.xml layout with the ID title.
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.Title);
        // Get the title of the Tour from the currentTour object and set this text on
        // the title TextView.
        titleTextView.setText(currentTour.getmTitle());
        // Find the TextView in the list_item.xml layout with the ID Address.
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.Address);
        // Get the Address from the currentTour object and set this text on
        // the desription TextView.
        addressTextView.setText(currentTour.getmAddress());

        // Find the TextView in the list_item.xml layout with the ID number
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.Number);
        // Check if an address is provided for this place or not
        if (currentTour.hasPhoneNumber()) {
            // If an number is available, display the provided number based on the resource ID
            numberTextView.setText(currentTour.getmPhoneNumber());
            // Make sure the view is visible
            // Get the number from the currentTour object and set this text on
            // the number TextView.
            numberTextView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the number (set visibility to GONE)
            numberTextView.setVisibility(View.GONE);
        }
        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Get the photo of the place from the currentTour object and set this image in
        // the photo ImageView.
        imageView.setImageResource(currentTour.getmImageResourceID());
        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}