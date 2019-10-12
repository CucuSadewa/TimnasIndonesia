package com.example.timnasindonesia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {
    TextView tvNama, tvEmail;
    ImageView imgPhoto;
    String title = "Profile";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }

        tvNama = findViewById(R.id.tv_nama_profile);
        tvEmail = findViewById(R.id.tv_email_profile);
        imgPhoto = findViewById(R.id.img_photo_profile);
    }
}
