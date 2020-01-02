package com.example.uts;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
    private RecyclerView rvLp;
    private ArrayList<Lp> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Daftar Personel Linkin Park");
        }
        rvLp = findViewById(R.id.rv_lp);
        rvLp.setHasFixedSize(true);

        list.addAll(LpData.getlistData());
        showRecylerList();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.biodata, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
public void setMode(int selectedMode){
        switch (selectedMode){
            case R.id.profil:
                Intent profile = new Intent (MainActivity.this, profile.class);
                    startActivity(profile);
                    break;

        }
}
    private void showRecylerList() {
        rvLp.setLayoutManager(new LinearLayoutManager(this));
        CardLpAdapter cardHmjAdapter = new CardLpAdapter(this, list);
        rvLp.setAdapter(cardHmjAdapter);
    }
}
