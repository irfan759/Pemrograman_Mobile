package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
public class DetailListLP extends AppCompatActivity {
    private int lp_id;
    ImageView imgDetail;
    TextView tvName, tvDesc;
    private ArrayList<Lp> listlp = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_list_lp);
        lp_id = getIntent().getIntExtra( "lp_id", 0);
        tvName = findViewById(R.id.nama_lp);
        tvDesc = findViewById(R.id.desc_detail);
        imgDetail = findViewById(R.id.imgDetail);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Biodata Personel Linkin Park");
        }
        listlp.addAll(LpData.getlistData());
        getSupportActionBar().setTitle(listlp.get(lp_id).getName());
        setLayout();
    }

    void setLayout() {
        tvName.setText(listlp.get(lp_id).getName());
        tvDesc.setText(listlp.get(lp_id).getDescription());
        Glide.with(this)
                .load(listlp.get(lp_id).getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(imgDetail);
    }
    }

