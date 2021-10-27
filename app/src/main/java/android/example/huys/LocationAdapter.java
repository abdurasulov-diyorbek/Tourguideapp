package android.example.huys;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;

import java.util.List;

public class LocationAdapter extends ArrayAdapter<Location> {

    private final int mColorResourceId;

    public LocationAdapter(@NonNull Context context, int resource, @NonNull List<Location> objects, int ColorResourceId) {
        super(context, resource, objects);
        mColorResourceId = ColorResourceId;
    }

    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {
        View listView = convertView;

        if(listView == null){
            listView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Location currentNumberPosition = getItem(position);



        TextView locationName = listView.findViewById(R.id.location_name);
        locationName.setText(currentNumberPosition.getLocationName());

        TextView locationDesc = listView.findViewById(R.id.locationDesc);
        locationDesc.setText(currentNumberPosition.getLocationDescription());

        TextView address = listView.findViewById(R.id.address);
        address.setText(currentNumberPosition.getLocationAddress());

        TextView time = listView.findViewById(R.id.price);
        time.setText(currentNumberPosition.getLocationPrice());


        ImageView images = listView.findViewById(R.id.image);


        // Check if an image is provided for this word or not
        if (currentNumberPosition.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            images.setImageResource(currentNumberPosition.getLocationImage());
            // Make sure the view is visible
            images.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            images.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listView.findViewById(R.id.linearLayout);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);



        return listView;
    }
}
