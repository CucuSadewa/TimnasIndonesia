package com.example.timnasindonesia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    TextView tvName, tvPosisi, tvTl, tvKlub;
    ImageView imgPhoto;

    public static String EXTRA_NAME = "extra_name";
    public static String EXTRA_POSISI = "extra_posisi";
    public static String EXTRA_TL = "extra_tl";
    public static String EXTRA_KLUB = "extra_klub";
    public static String EXTRA_PHOTO = "extra_photo";
    String title = "Detail";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }

        tvName = findViewById(R.id.tv_name_detail);
        tvPosisi = findViewById(R.id.tv_posisi_detail);
        tvTl = findViewById(R.id.tv_tl_detail);
        tvKlub = findViewById(R.id.tv_klub_detail);
        imgPhoto = findViewById(R.id.image_item_photo_detail);

        Pemain mPemain = getIntent().getParcelableExtra(EXTRA_NAME);
        tvName.setText(": "+mPemain.getName());
        tvPosisi.setText(": "+mPemain.getPosisi());
        tvTl.setText(": "+mPemain.getTl());
        tvKlub.setText(": "+mPemain.getKlub());

        Glide.with(this).load(mPemain.getPhoto()).into(imgPhoto);

    }
}
