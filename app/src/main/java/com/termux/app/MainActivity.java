package com.termux.app;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_nav);

        bottomNav.setOnItemSelectedListener(item -> {
            Fragment selectedFragment = null;

            if (item.getItemId() == R.id.nav_terminal)
                selectedFragment = new TerminalFragment();
            else if (item.getItemId() == R.id.nav_packages)
                selectedFragment = new PackagesFragment();
            else if (item.getItemId() == R.id.nav_files)
                selectedFragment = new FilesFragment();
            else if (item.getItemId() == R.id.nav_ssh)
                selectedFragment = new SSHFragment();
            else if (item.getItemId() == R.id.nav_settings)
                selectedFragment = new SettingsFragment();

            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, selectedFragment)
                    .commit();

            return true;
        });

        bottomNav.setSelectedItemId(R.id.nav_terminal);
    }
}
