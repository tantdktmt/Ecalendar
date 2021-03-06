package com.dmspro.ecalendar.data.prefs;

import android.content.Context;
import android.content.SharedPreferences;

import com.dmspro.ecalendar.EcalendarApplication;

/**
 * Created by tantd on 2/7/2020.
 */
public class AppPreferencesHelper {

    private static final String PREFS_FILE_NAME = "app_prefs";

    private static final String PREF_KEY_ACCESS_TOKEN = "PREF_KEY_ACCESS_TOKEN";

    private final SharedPreferences mPrefs;

    private static AppPreferencesHelper instance;

    public static AppPreferencesHelper getInstance() {
        if (instance == null) {
            instance = new AppPreferencesHelper();
        }
        return instance;
    }

    private AppPreferencesHelper() {
        mPrefs = EcalendarApplication.getInstance().getSharedPreferences(PREFS_FILE_NAME, Context.MODE_PRIVATE);
    }

    public String getAccessToken() {
        return mPrefs.getString(PREF_KEY_ACCESS_TOKEN, "");
    }
}
