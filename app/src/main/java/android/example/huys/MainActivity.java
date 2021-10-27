package android.example.huys;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setStatusBarColor(ContextCompat.getColor(MainActivity.this, R.color.status_bar_color));
        getWindow().setNavigationBarColor(ContextCompat.getColor(MainActivity.this, R.color.status_bar_color));


        // Find the View that shows the Museums
        TextView museums = findViewById(R.id.museums);

        // Set a click listener on that View
        // The code in this method will be executed when the museums View is clicked on.
        museums.setOnClickListener(view -> {
            Intent museumsIntent = new Intent(MainActivity.this, Museums.class);
            startActivity(museumsIntent);
        });
        // Find the View that shows the hotels
        TextView Hotels = findViewById(R.id.hotels);

        // Set a click listener on that View
        // The code in this method will be executed when the hotels View is clicked on.
        Hotels.setOnClickListener(view -> {
            Intent hotelsIntent = new Intent(MainActivity.this, Hotels.class);
            startActivity(hotelsIntent);
        });

        TextView tashkentMap = findViewById(R.id.map);
        tashkentMap.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D0%A2%D0%B0%D1%88%D0%BA%D0%B5%D0%BD%D1%82/@41.2825125,69.1392828,11z/data=!3m1!4b1!4m5!3m4!1s0x38ae8b0cc379e9c3:0xa5a9323b4aa5cb98!8m2!3d41.2994958!4d69.24007340000000000000000000000000000000000000000000000000000000000000000000000000000000000"));
            startActivity(intent);
        });
        // Find the View that shows the restaurants
        TextView restaurants = findViewById(R.id.resturants);

        // Set a click listener on that View
        // The code in this method will be executed when the restaurants View is clicked on.
        restaurants.setOnClickListener(view -> {
            Intent restaurantsIntent = new Intent(MainActivity.this, Restaurants.class);
            startActivity(restaurantsIntent);
        });

    }
}