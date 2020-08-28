package com.example.appwithsettings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SettingsActvity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_actvity);
    }getSupportFragmentManager().beginTransaction()
         .replace(android.R.id.content, new SettingsFragment())
            .commit();
}public static final String
        KEY_PREF_EXAMPLE_SWITCH = "example_switch";