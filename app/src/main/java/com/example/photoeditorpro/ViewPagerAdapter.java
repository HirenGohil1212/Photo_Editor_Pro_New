package com.example.photoeditorpro;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

     public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Inspiring_Fragment();
        } else if (position == 1) {
            return new GenerateAI_Fragment();
        } else if (position == 2) {
            return new EditByMaster_Fragment();
        } else if (position == 3) {
            return new PopularStickers_Fragment();
        } else {
            return new TrendingReplays_Fragment();
        }

    }

    @Override
    public int getCount() {
        return 5;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0){
            return "Inspiring";
        } else if (position == 1) {
            return "Generated With AI";
        } else if (position == 2) {
            return "Edit By Masters";
        } else if (position == 3) {
            return "Popular Stickers";
        }else {
            return  "Trending Replays";
        }
    }
}
