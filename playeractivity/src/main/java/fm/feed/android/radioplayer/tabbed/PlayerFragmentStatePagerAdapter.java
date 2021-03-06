package fm.feed.android.radioplayer.tabbed;

/**
 * Created by ericlambrecht on 6/19/15.
 * Copyright Feed Media, 2016
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import fm.feed.android.playersdk.model.Station;

/**
 *
 * This adapter returns PlayerFragment instances.
 *
 */

public class PlayerFragmentStatePagerAdapter extends FragmentStatePagerAdapter {

    private Station[] mStations;
    private PlayerFragment.PlayerFragmentEventListener mPlayerFragmentEventListener;

    public PlayerFragmentStatePagerAdapter(FragmentManager fm, Station[] stations, PlayerFragment.PlayerFragmentEventListener spListener) {
        super(fm);

        mStations = stations;
        mPlayerFragmentEventListener = spListener;
    }

    @Override
    public Fragment getItem(int position) {
        return PlayerFragment.newInstance(mStations[position].getName(), mPlayerFragmentEventListener);
    }

    @Override
    public int getCount() {
        return mStations.length;
    }
}
