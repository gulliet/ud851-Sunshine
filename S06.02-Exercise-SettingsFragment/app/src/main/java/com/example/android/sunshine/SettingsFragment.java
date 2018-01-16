package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;

/**
 * Created by jean-marc on 16/01/18.
 */

// completed (4) Create SettingsFragment and extend PreferenceFragmentCompat

public class SettingsFragment extends PreferenceFragmentCompat {

    // Do steps 5 - 11 within SettingsFragment
    // TODO (10) Implement OnSharedPreferenceChangeListener from SettingsFragment

    // TODO (8) Create a method called setPreferenceSummary that accepts a Preference and an Object and sets the summary of the preference


    // TODO (13) Unregister SettingsFragment (this) as a SharedPreferenceChangedListener in onStop

    // TODO (12) Register SettingsFragment (this) as a SharedPreferenceChangedListener in onStart

    // TODO (11) Override onSharedPreferenceChanged to update non CheckBoxPreferences when they are changed

    // TODO (5) Override onCreatePreferences and add the preference xml file using addPreferencesFromResource
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        // Do step 9 within onCreatePreference
        // TODO (9) Set the preference summary on each preference that isn't a CheckBoxPreference

    }
}
