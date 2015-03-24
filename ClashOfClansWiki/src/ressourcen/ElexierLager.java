package ressourcen;

import java.util.ArrayList;

import ressourcenTabs.ElexierLagerLevelFragment;
import ressourcenTabs.ElexierLagerTabelleFragment;
import truppen.Ballon.SectionsPagerAdapter;
import truppenTabs.BallonLevelFragment;
import truppenTabs.BallonTabelleFragment;

import com.niklas.clashofclanswiki.R;
import com.niklas.clashofclanswiki.R.id;
import com.niklas.clashofclanswiki.R.layout;
import com.niklas.clashofclanswiki.R.menu;

import android.app.ActionBar;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.app.ActionBar.Tab;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;

public class ElexierLager extends FragmentActivity implements ActionBar.TabListener{
	
	SectionsPagerAdapter sectionsPagerAdapter;
	ViewPager viewPager;
	int selected = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		


		setContentView(R.layout.activity_elexier_lager);
		// Create the adapter that will return a fragment for each of the pages
		sectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

		// Set up the action bar for tab navigation
		final ActionBar actionBar = getActionBar();
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

		// add the sectionsPagerAdapter
		viewPager = (ViewPager) findViewById(R.id.elexierLager_pager);
		viewPager.setAdapter(sectionsPagerAdapter);

		viewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {

			@Override
			public void onPageSelected(int position) {
				// select the tab that represents the current page
				actionBar.setSelectedNavigationItem(position);

			}
		});

		// Create the tabs for the screen
		for (int i = 0; i < sectionsPagerAdapter.getCount(); i++) {
			ActionBar.Tab tab = actionBar.newTab();
			tab.setText(sectionsPagerAdapter.getPageTitle(i));
			tab.setTabListener(this);
			actionBar.addTab(tab);
		}

		
	}

	@Override
	public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		// When the given tab is selected, switch to the corresponding page in
				// the ViewPager.
				viewPager.setCurrentItem(tab.getPosition());
				selected = tab.getPosition();
				// invalidate the options menu so it can be updated
				invalidateOptionsMenu();
				// history fragment is at position zero so get this then refresh its
				// view
				
	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}
	
	public class SectionsPagerAdapter extends FragmentPagerAdapter {

		// Stores the instances of the pages
		private ArrayList<Fragment> fragments = null;

		/**
		 * Only Constructor, requires a the activity's fragment managers
		 * 
		 * @param fragmentManager
		 */
		public SectionsPagerAdapter(FragmentManager fragmentManager) {
			super(fragmentManager);
			fragments = new ArrayList<Fragment>();
			// create the history view, passes the client handle as an argument
			// through a bundle
			

			fragments.add(new ElexierLagerLevelFragment());
			fragments.add(new ElexierLagerTabelleFragment());
			
			
		}

		/**
		 * @see android.support.v4.app.FragmentPagerAdapter#getItem(int)
		 */
		@Override
		public Fragment getItem(int position) {
			return fragments.get(position);
		}

		/**
		 * @see android.support.v4.view.PagerAdapter#getCount()
		 */
		@Override
		public int getCount() {
			return fragments.size();
		}

		/**
		 * 
		 * @see FragmentPagerAdapter#getPageTitle(int)
		 */
		@Override
		public CharSequence getPageTitle(int position) {
			switch (position) {
			case 0:
				return getString(R.string.level).toUpperCase();
			case 1:
				return getString(R.string.tabelle).toUpperCase();
			
			
			
			}
			// return null if there is no title matching the position
			return null;
		}

	}

}