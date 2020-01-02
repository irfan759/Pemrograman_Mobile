package com.example.myviewandviews;

import androidx.appcompat.app.AppCompatActivity;



import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
Button btn_donation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_donation = findViewById(R.id.btnDonasi);
        btn_donation.setOnClickListener(this);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Donasi Pesawat R80");

        }
    }
    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.btnDonasi:
                Intent moveIntent = new Intent(MainActivity.this, DonationActivity.class);
            startActivity(moveIntent);
            break;
        }
    }
}
