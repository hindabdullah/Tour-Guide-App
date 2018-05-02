package com.example.android.theguidesaudi;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PlacesFragment extends Fragment {


    public PlacesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.guide_list, container, false);

        final ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour( R.drawable.madain_saleh,R.string.Place_Name1, R.string.Place1_desc));
        tours.add(new Tour(R.drawable.farasan,R.string.Place_Name2, R.string.Place2_desc));
        tours.add(new Tour( R.drawable.sudwapark,R.string.Place_Name, R.string.Place3_desc));

        final TourAdapter adapter = new TourAdapter(getActivity(), tours);


        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
