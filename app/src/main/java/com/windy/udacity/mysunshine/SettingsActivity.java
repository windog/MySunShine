package com.windy.udacity.mysunshine;

import android.app.FragmentManager;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by windog on 2016/6/10.
 */
public class SettingsActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_setting);

        final SettingFragment settingFragment = new SettingFragment();

        if (savedInstanceState == null) {
            // getFragmentManager() 和 getSupportFragmentManager()的区别
            getFragmentManager()
                    .beginTransaction()
                    .replace(R.id.setting_container, settingFragment)

            // TODO,SettingFragment blank
                    // http://stackoverflow.com/questions/35933440/android-preferencefragment-loaded-with-no-errors-but-screen-is-blank
            /*Adding to the backStack here and then setting a backStack Listener
            *on the next step made it add the fragment then immediately take it
            *off, giving my empty activity layout.*/

                    .addToBackStack(null)
                    .commit();
            getFragmentManager().addOnBackStackChangedListener(
                    new FragmentManager.OnBackStackChangedListener() {
                        @Override
                        public void onBackStackChanged() {
                            getFragmentManager()
                                    .beginTransaction()
                                    .remove(settingFragment)
                                    .commit();
                        }
                    });
        }
    }


    public static class SettingFragment extends PreferenceFragment implements Preference.OnPreferenceChangeListener{

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.pref_general);

            // For all preferences, attach an OnPreferenceChangeListener so the UI summary can be
            // updated when the preference changes.
            bindPreferenceSummaryToValue(findPreference(getString(R.string.pref_location_key)));

        }


        /**
         * Attaches a listener so the summary is always updated with the preference value.
         * Also fires the listener once, to initialize the summary (so it shows up before the value
         * is changed.)
         */
        private void bindPreferenceSummaryToValue(Preference preference) {
            // Set the listener to watch for value changes.
            preference.setOnPreferenceChangeListener(this);

            // Trigger the listener immediately with the preference's
            // current value.
            onPreferenceChange(preference, PreferenceManager.getDefaultSharedPreferences(preference.getContext())
                    .getString(preference.getKey(), ""));
        }

        @Override
        public boolean onPreferenceChange(Preference preference, Object newValue) {
            String stringValue = newValue.toString();

            if (preference instanceof ListPreference) {
                // For list preferences, look up the correct display value in
                // the preference's 'entries' list (since they have separate labels/values).
                ListPreference listPreference = (ListPreference) preference;
                int prefIndex = listPreference.findIndexOfValue(stringValue);
                if (prefIndex >= 0) {
                    preference.setSummary(listPreference.getEntries()[prefIndex]);
                }
            } else {
                // For other preferences, set the summary to the value's simple string representation.
                preference.setSummary(stringValue);
            }
            return true;
        }
    }
}
