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
public class BeachesFragment extends Fragment {
    public BeachesFragment() {

    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.guide_list, container, false);

        final ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour(R.drawable.halfmoon,R.string.Beach_Name1, R.string.city1));
        tours.add(new Tour( R.drawable.farasan,R.string.Beach_Name2, R.string.city2));
        tours.add(new Tour( R.drawable.fanateer,R.string.Beach_Name3, R.string.city3));
        tours.add(new Tour( R.drawable.uquir,R.string.Beach_Name4, R.string.city4));
        tours.add(new Tour( R.drawable.alremal,R.string.Beach_Name5, R.string.city6));

        final TourAdapter adapter = new TourAdapter(getActivity(), tours);


        // guide_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;    }

}