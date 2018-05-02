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
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.guide_list, container, false);

        final ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour(R.drawable.globe,R.string.Restaurants_name1, R.string.Restaurants_Number1, R.string.city1));
        tours.add(new Tour(R.drawable.lusin,R.string.Restaurants_name2, R.string.Restaurants_Number2,R.string.city2));
        tours.add(new Tour(R.drawable.aromi,R.string.Restaurants_name3, R.string.Restaurants_Number3,R.string.city3));
        tours.add(new Tour(R.drawable.oceana,R.string.Restaurants_name4, R.string.Restaurants_Number4,R.string.city4));
        tours.add(new Tour(R.drawable.naranj,R.string.Restaurants_name5, R.string.Restaurants_Number5, R.string.city5));


        TourAdapter adapter = new TourAdapter(getActivity(),tours);


        ListView listView = (ListView) rootView.findViewById(R.id.list);


        listView.setAdapter(adapter);

        return rootView;    }

}
