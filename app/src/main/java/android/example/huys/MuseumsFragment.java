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
public class MuseumsFragment extends androidx.fragment.app.Fragment {

    public MuseumsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of Museums
        final ArrayList<Location> museum = new ArrayList<>();
        museum.add(new Location("National Art Museum", "Beautiful, national art works", R.drawable.art_museum, "9am-7pm", "Street RakatBoshi, Chorsu"));
        museum.add(new Location("National Museum", "National history", R.drawable.national_museum, "8am-8pm", "Street Ulugbek, Chilonzor"));
        museum.add(new Location("Polytechnic Museum", "History of Auto industry", R.drawable.polytechnical_museum, "9am-8pm", "Street Niyoziy, Chorsu"));
        museum.add(new Location("Timurlane Museum", "Great Timur dynasty museum", R.drawable.temur_museum, "9am-9pm", "Street Olmazor, Sergeli"));

        LocationAdapter adapter = new LocationAdapter(getActivity(), R.layout.list_item, museum, R.color.primary_color);


        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;

    }
}