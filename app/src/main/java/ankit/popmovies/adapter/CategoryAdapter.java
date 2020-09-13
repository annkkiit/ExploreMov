package ankit.popmovies.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import ankit.popmovies.R;
import ankit.popmovies.fragments.FavouritesFragment;
import ankit.popmovies.fragments.PopularFragment;
import ankit.popmovies.fragments.TopRatedFragment;


public class CategoryAdapter extends FragmentPagerAdapter
{
    private final Context mContext;

    public CategoryAdapter(Context context, FragmentManager fragmentManager) {
        super(fragmentManager);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // Populate the fragments to the correct locations for popular and top rated movies in the view pager
        switch (position)
        {
            case 0:
                return new PopularFragment();
            case 1:
                return new TopRatedFragment();
            case 2:
                return new FavouritesFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        // Set the tab title based on the respective positions of the fragments
        switch (position)
        {
            case 0:
                return mContext.getString(R.string.tab_title_popular);
            case 1:
                return mContext.getString(R.string.tab_title_top_rated);
            case 2:
                return mContext.getString(R.string.tab_title_favourites);
            default:
                return null;
        }
    }
}
