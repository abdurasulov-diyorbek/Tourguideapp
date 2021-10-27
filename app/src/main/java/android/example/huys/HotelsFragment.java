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
public class HotelsFragment extends androidx.fragment.app.Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of hotels
        final ArrayList<Location> hotel = new ArrayList<>();
        hotel.add(new Location(getResources().getString(R.string.palace), "\u2605\u2605\u2605\u2606\u2606", R.drawable.city_palace_hotel, "$121+", getResources().getString(R.string.palace_loc)));
        hotel.add(new Location(getResources().getString(R.string.premium), "\u2605\u2605\u2605\u2605\u2605", R.drawable.ichan_qala_premium, "$142+", getResources().getString(R.string.premiumloc)));
        hotel.add(new Location(getResources().getString(R.string.international), "\u2605\u2605\u2605\u2605\u2605", R.drawable.international_hotel_tashkent, "$122+", getResources().getString(R.string.internationalloc)));
        hotel.add(new Location(getResources().getString(R.string.plaza), "\u2605\u2605\u2605\u2605\u2606", R.drawable.le_granda_plaza, "$58+", getResources().getString(R.string.plazaloc)));
        hotel.add(new Location(getResources().getString(R.string.ramada), "\u2605\u2605\u2605\u2605\u2606", R.drawable.ramada_hotel, "$82+", getResources().getString(R.string.ramadaloc)));

        LocationAdapter adapter = new LocationAdapter(getActivity(), R.layout.list_item, hotel, R.color.primary_color);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;

    }
}