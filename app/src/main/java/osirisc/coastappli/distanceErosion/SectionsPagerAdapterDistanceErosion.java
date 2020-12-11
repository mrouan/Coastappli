package osirisc.coastappli.distanceErosion;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import osirisc.coastappli.R;


public class SectionsPagerAdapterDistanceErosion extends FragmentPagerAdapter {

    // We first define the titles of the tabs
    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_method_name, R.string.tab_input_name}; // Put as many as you the number of tabs you want

    private final Context mContext;

    /**
     * We initialize the FragmentPageAdapter
     * @param context
     * @param fm
     */
    public SectionsPagerAdapterDistanceErosion(Context context, FragmentManager fm) {
        super(fm);
        this.mContext = context;
    }

    /**
     * This function retrieves the wanted fragment depending on its position
     * @param position
     * @return
     */
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new TabMethodFragment();
            case 1:
                return new TabInputFragment();
            default:
                return null;
        }
    }

    /**
     * This function retrieves the correct title for each tab corresponding to its position
     * @param position
     * @return
     */
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    /**
     * This function returns the number of tabs
     */
    @Override
    public int getCount() {
        // Show 2 total pages.
        return 2;
    }
}
