package android.example.huys;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter{
    private Context mcontext;
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mcontext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MuseumsFragment();
        } else if (position == 1) {
            return new RestaurantsFragment();
        } else{
            return new HotelsFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mcontext.getString(R.string.museums);
        } else if (position == 1) {
            return mcontext.getString(R.string.restaurants);
        } else {
            return mcontext.getString(R.string.hotels);
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
