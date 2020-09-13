package ankit.popmovies;

import android.content.Context;
import android.util.DisplayMetrics;

public class MovieUtils
{

    /**
     * Intelligently calculates the number of grid columns to be displayed on screen with respect to
     * the available screen size
     * @param context The Application Context
     * @return int  The number of columns to be displayed
     */
    public static int calculateNoOfColumns(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float dpWidth = displayMetrics.widthPixels / displayMetrics.density;
        int columnWidth = 115;
        return (int) (dpWidth / columnWidth);
    }
}
