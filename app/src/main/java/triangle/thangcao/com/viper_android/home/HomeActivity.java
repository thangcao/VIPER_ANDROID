package triangle.thangcao.com.viper_android.home;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;;
import java.util.LinkedHashMap;

import triangle.thangcao.com.viper_android.R;
import triangle.thangcao.com.viper_android.common.BaseActivity;
import triangle.thangcao.com.viper_android.home.playpoker.PlayPokerFragment;
import triangle.thangcao.com.viper_android.home.setting.SettingsFragment;
import triangle.thangcao.com.viper_android.home.timer.TimerFragment;

public class HomeActivity extends BaseActivity {

    private static final int LIMIT_PAGE_NUMBER = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void initToolBar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    protected void mappingUI() {
        ViewPager viewPager = (ViewPager) findViewById(R.id.activity_main_view_pager);
        TabViewPagerAdapter adapter = new TabViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(LIMIT_PAGE_NUMBER);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.activity_main_tab);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    protected void initEvents() {

    }

    @Override
    protected void initView() {
        setContentView(R.layout.activity_home);
    }

    private class TabViewPagerAdapter extends FragmentPagerAdapter {
        private LinkedHashMap<String, Fragment> pages = new LinkedHashMap<>();

        TabViewPagerAdapter(FragmentManager fm) {
            super(fm);
            pages.put(getString(R.string.title_tab_play_pocker), new PlayPokerFragment());
            pages.put(getString(R.string.title_tab_timer), new TimerFragment());
            pages.put(getString(R.string.title_tab_settings), new SettingsFragment());
        }

        @Override
        public Fragment getItem(int position) {
            return (Fragment) pages.values().toArray()[position];
        }

        @Override
        public int getCount() {
            return pages.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return (CharSequence) pages.keySet().toArray()[position];
        }
    }
}
