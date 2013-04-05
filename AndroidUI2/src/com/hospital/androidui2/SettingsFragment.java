package com.hospital.androidui2;

import android.annotation.TargetApi;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.preference.EditTextPreference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class SettingsFragment extends PreferenceFragment {

	private SharedPreferences sharedPref;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.user_preference);
		sharedPref = PreferenceManager
				.getDefaultSharedPreferences(getActivity());
		EditTextPreference rootAddrPref = (EditTextPreference) findPreference("root_address");
		rootAddrPref.setDefaultValue(sharedPref.getString("root_address",
				"www.example.com"));
	}

}
