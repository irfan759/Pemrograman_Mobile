package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("My Profile");
        }
    }
}
