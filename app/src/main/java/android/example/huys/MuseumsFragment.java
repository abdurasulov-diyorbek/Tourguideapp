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
        museum.add(new Location(getResources().getString(R.string.national_art_museum), getResources().getString(R.string.national_art_desc), R.drawable.art_museum, getResources().getString(R.string.art_museum_time), getResources().getString(R.string.art_museum_loc)));
        museum.add(new Location(getResources().getString(R.string.national_museum), getResources().getString(R.string.national_museum_desc), R.drawable.national_museum, getResources().getString(R.string.national_museum_time), getResources().getString(R.string.national_museum_loc)));
        museum.add(new Location(getResources().getString(R.string.polytechnic_museum), getResources().getString(R.string.polytechnic_museum_desc), R.drawable.polytechnical_museum, getResources().getString(R.string.polytechnical_museum_time), getResources().getString(R.string.polytechnical_museum_loc)));
        museum.add(new Location(getResources().getString(R.string.timurlane_museum), getResources().getString(R.string.timurlane_museum_desc), R.drawable.temur_museum, getResources().getString(R.string.temur_museum_time), getResources().getString(R.string.temur_museum_loc)));

        LocationAdapter adapter = new LocationAdapter(getActivity(), R.layout.list_item, museum, R.color.primary_color);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;

    }
}