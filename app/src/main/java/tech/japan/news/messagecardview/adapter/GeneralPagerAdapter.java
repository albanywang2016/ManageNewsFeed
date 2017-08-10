package tech.japan.news.messagecardview.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import tech.japan.news.messagecardview.R;
import tech.japan.news.messagecardview.activity.MainActivity;
import tech.japan.news.messagecardview.activity.TabFragment;

/**
 * Created by lei.wang on 8/9/2017.
 */

public class GeneralPagerAdapter extends FragmentPagerAdapter {
    String tabTitles[] = new String[] { "Tab One", "Tab Two", "Tab Three" };

    public GeneralPagerAdapter(FragmentManager fm, MainActivity mainActivity) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new TabFragment();
            case 1:
                return new TabFragment();
            case 2:
                return new TabFragment();
            case 3:
                return new TabFragment();
            case 4:
                return new TabFragment();
            case 5:
                return new TabFragment();
            case 6:
                return new TabFragment();
            case 7:
                return new TabFragment();
            case 8:
                return new TabFragment();
            case 9:
                return new TabFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        return tabTitles[position];
    }

    public View getTabView(int position) {
        View tab = LayoutInflater.from(MainActivity.this).inflate(R.layout.custom_tab, null);
        TextView tv = (TextView) tab.findViewById(R.id.custom_text);
        tv.setText(tabTitles[position]);
        return tab;
    }
}
