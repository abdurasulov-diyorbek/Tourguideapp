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
        restaurant.add(new Location("Affresco", "Italian foods", R.drawable.affresco_res, "7am-11pm", "74, Amir Temur st"));
        restaurant.add(new Location("Afsona restaurant", "National foods", R.drawable.afsona_restaurant, "5am-12am", "122, Yunus Rajabiy st"));
        restaurant.add(new Location("Anhor restaurant", "National foods", R.drawable.anhor_res, "6am-10pm", "11 Huvaydo st"));
        restaurant.add(new Location("Caravan", "European foods", R.drawable.caravan_restaurant, "7.30am-10pm", "54 Malika st"));
        restaurant.add(new Location("La opera ristorante", "Italian foods", R.drawable.l_opera_ristorante, "9am-11pm", "111 Uvaysiy st"));
        restaurant.add(new Location("National foods", "Restaurant for family", R.drawable.restaurant, "5am-12am", "90, Jiyda st"));
        restaurant.add(new Location("Silk Road", "Asian foods", R.drawable.silk96_res, "6am-10pm", "88, Chorsu st"));

        LocationAdapter adapter = new LocationAdapter(getActivity(), R.layout.list_item, restaurant, R.color.primary_color);


        ListView listView = rootView.findViewById(R.id.list);


        listView.setAdapter(adapter);

        return rootView;

    }
}