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
        hotel.add(new Location("City Palace Hotel", "\u2605\u2605\u2605\u2606\u2606", R.drawable.city_palace_hotel, "$121+", "Amir Temur Street, 15, Tashkent"));
        hotel.add(new Location("Ichan Qala Premium", "\u2605\u2605\u2605\u2605\u2605", R.drawable.ichan_qala_premium, "$142+", "Tafakkur Street 68, Tashkent"));
        hotel.add(new Location("International Hotel Tashkent", "\u2605\u2605\u2605\u2605\u2605", R.drawable.international_hotel_tashkent, "$122+", "107A Amir Temur Avenue, Tashkent"));
        hotel.add(new Location("Le Grande Plaza", "\u2605\u2605\u2605\u2605\u2606", R.drawable.le_granda_plaza, "$58+", "2,Uzbekiston Ovozi Str., 2, Tashkent"));
        hotel.add(new Location("Ramada Tashkent", "\u2605\u2605\u2605\u2605\u2606", R.drawable.ramada_hotel, "$82+", "1 Abdullah Kodiry St, Tashkent"));

        LocationAdapter adapter = new LocationAdapter(getActivity(), R.layout.list_item, hotel, R.color.primary_color);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;

    }
}