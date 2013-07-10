package util.android.activity;

import java.lang.reflect.Field;

import util.android.roboguice.R;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ListView;

import com.actionbarsherlock.view.MenuItem;
import com.github.rtyley.android.sherlock.roboguice.activity.RoboSherlockFragmentActivity;

public class ADRoboSherlockFragmentActivity extends
		RoboSherlockFragmentActivity {

	private DrawerLayout mDrawerLayout;
	private ListView mDrawerList;
	private ActionBarDrawerToggle mDrawerToggle;

	private CharSequence mDrawerTitle;
	private CharSequence mTitle;

	/**
	 * When using the ActionBarDrawerToggle, you must call it during
	 * onPostCreate() and onConfigurationChanged()...
	 */

	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		// Sync the toggle state after onRestoreInstanceState has occurred.
		mDrawerToggle.syncState();
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		// Pass any configuration change to the drawer toggls
		mDrawerToggle.onConfigurationChanged(newConfig);
	}

	public ListView getMenuListView() {
		return mDrawerList;
	}

	public void showMenuDrawer() {
		mDrawerLayout.openDrawer(findViewById(R.id.left_drawer));
	}

	public void closeMenuDrawer() {
		mDrawerLayout.closeDrawer(findViewById(R.id.left_drawer));
	}

	public void setDrawerScrim(int color) {
		mDrawerLayout.setScrimColor(color);
		mDrawerLayout.setDrawerShadow(android.R.color.transparent,
				GravityCompat.START);
	}

	private android.view.MenuItem getMenuItem(final MenuItem item) {
		return new android.view.MenuItem() {
			@Override
			public int getItemId() {
				return item.getItemId();
			}

			public boolean isEnabled() {
				return true;
			}

			@Override
			public boolean collapseActionView() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean expandActionView() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public ActionProvider getActionProvider() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public View getActionView() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public char getAlphabeticShortcut() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int getGroupId() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public Drawable getIcon() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Intent getIntent() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ContextMenuInfo getMenuInfo() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public char getNumericShortcut() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int getOrder() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public SubMenu getSubMenu() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public CharSequence getTitle() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public CharSequence getTitleCondensed() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean hasSubMenu() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean isActionViewExpanded() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean isCheckable() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean isChecked() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean isVisible() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public android.view.MenuItem setActionProvider(
					ActionProvider actionProvider) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public android.view.MenuItem setActionView(View view) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public android.view.MenuItem setActionView(int resId) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public android.view.MenuItem setAlphabeticShortcut(char alphaChar) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public android.view.MenuItem setCheckable(boolean checkable) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public android.view.MenuItem setChecked(boolean checked) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public android.view.MenuItem setEnabled(boolean enabled) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public android.view.MenuItem setIcon(Drawable icon) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public android.view.MenuItem setIcon(int iconRes) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public android.view.MenuItem setIntent(Intent intent) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public android.view.MenuItem setNumericShortcut(char numericChar) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public android.view.MenuItem setOnActionExpandListener(
					OnActionExpandListener listener) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public android.view.MenuItem setOnMenuItemClickListener(
					OnMenuItemClickListener menuItemClickListener) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public android.view.MenuItem setShortcut(char numericChar,
					char alphaChar) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void setShowAsAction(int actionEnum) {
				// TODO Auto-generated method stub

			}

			@Override
			public android.view.MenuItem setShowAsActionFlags(int actionEnum) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public android.view.MenuItem setTitle(CharSequence title) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public android.view.MenuItem setTitle(int title) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public android.view.MenuItem setTitleCondensed(CharSequence title) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public android.view.MenuItem setVisible(boolean visible) {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.ad_robo_sherlock_activity);

		mTitle = mDrawerTitle = getTitle();

		mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
		mDrawerList = (ListView) findViewById(R.id.list);

		// enable ActionBar app icon to behave as action to toggle nav drawer
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);

		/**
		 * This may be debatable, but as per
		 * https://code.google.com/p/android/issues/detail?id=38013 on ICS (4+)
		 * devices with a hardware menu key, show the menu as an overflow item
		 * in the ActionBar anyway, to indicate that it is available.
		 * 
		 * It technically goes against the design guidelines, but Google do this
		 * in their own apps.
		 */
		try {
			ViewConfiguration config = ViewConfiguration.get(this);
			Field menuKeyField = ViewConfiguration.class
					.getDeclaredField("sHasPermanentMenuKey");
			if (menuKeyField != null) {
				menuKeyField.setAccessible(true);
				menuKeyField.setBoolean(config, false);
			}
		} catch (Exception ex) {
			// Ignore
		}

		// ActionBarDrawerToggle ties together the the proper interactions
		// between the sliding drawer and the action bar app icon
		mDrawerToggle = new ActionBarDrawerToggle(this, /* host Activity */
		mDrawerLayout, /* DrawerLayout object */
		R.drawable.ic_drawer, /* nav drawer image to replace 'Up' caret */
		R.string.drawer_open, /* "open drawer" description for accessibility */
		R.string.drawer_close /* "close drawer" description for accessibility */
		) {
			public void onDrawerClosed(View view) {
				// getSupportActionBar().setTitle(mTitle);
				supportInvalidateOptionsMenu(); // creates call to
												// onPrepareOptionsMenu()
			}

			public void onDrawerOpened(View drawerView) {
				// getSupportActionBar().setTitle(mDrawerTitle);
				supportInvalidateOptionsMenu(); // creates call to
												// onPrepareOptionsMenu()
			}
		};
		mDrawerLayout.setDrawerListener(mDrawerToggle);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// The action bar home/up action should open or close the drawer.
		// ActionBarDrawerToggle will take care of this.
		if (mDrawerToggle.onOptionsItemSelected(getMenuItem(item))) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
