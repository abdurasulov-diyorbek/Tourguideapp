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
public class MallsFragment extends androidx.fragment.app.Fragment {

    public MallsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of Museums
        final ArrayList<Location> malls = new ArrayList<>();
        malls.add(new Location(getResources().getString(R.string.planet), getResources().getString(R.string.planetd), R.drawable.planet, getResources().getString(R.string.national_museum_time), getResources().getString(R.string.planetl)));
        malls.add(new Location(getResources().getString(R.string.samarkand), getResources().getString(R.string.samarkandd), R.drawable.samarkand, getResources().getString(R.string.polytechnical_museum_time), getResources().getString(R.string.samarkandl)));
        malls.add(new Location(getResources().getString(R.string.next), getResources().getString(R.string.nextd), R.drawable.next, getResources().getString(R.string.temur_museum_time), getResources().getString(R.string.nextl)));

        LocationAdapter adapter = new LocationAdapter(getActivity(), R.layout.list_item, malls, R.color.primary_color);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;

    }
}