package android.example.huys;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of number vocabulary words.
 */
public class RestaurantsFragment extends androidx.fragment.app.Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of restaurants
        final ArrayList<Location> restaurant = new ArrayList<>();
        restaurant.add(new Location(getResources().getString(R.string.Affresco), getResources().getString(R.string.Affresco_desc), R.drawable.affresco_res, getResources().getString(R.string.Affresco_time), getResources().getString(R.string.Affresco_loc)));
        restaurant.add(new Location(getResources().getString(R.string.afsona), getResources().getString(R.string.afsona_desc), R.drawable.afsona_restaurant, getResources().getString(R.string.afsona_time), getResources().getString(R.string.afsona_loc)));
        restaurant.add(new Location(getResources().getString(R.string.anhor), getResources().getString(R.string.anhor_desc), R.drawable.anhor_res, getResources().getString(R.string.anhor_time), getResources().getString(R.string.anhor_loc)));
        restaurant.add(new Location(getResources().getString(R.string.caravan), getResources().getString(R.string.caravan_desc), R.drawable.caravan_restaurant, getResources().getString(R.string.caravan_time), getResources().getString(R.string.caravan_loc)));
        restaurant.add(new Location(getResources().getString(R.string.opera), getResources().getString(R.string.opera_desc), R.drawable.l_opera_ristorante, getResources().getString(R.string.opera_time), getResources().getString(R.string.opera_loc)));
        restaurant.add(new Location(getResources().getString(R.string.national_foods), getResources().getString(R.string.national_desc), R.drawable.restaurant, getResources().getString(R.string.national_time), getResources().getString(R.string.national_loc)));
        restaurant.add(new Location(getResources().getString(R.string.silk_road), getResources().getString(R.string.silk_desc), R.drawable.silk96_res, getResources().getString(R.string.silk_time), getResources().getString(R.string.silk_loc)));

        LocationAdapter adapter = new LocationAdapter(getActivity(), R.layout.list_item, restaurant, R.color.primary_color);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;

    }
}