package com.example.timnasindonesia;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvPemain;
    private ArrayList<Pemain> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvPemain = findViewById(R.id.rv_pemain);
        rvPemain.setHasFixedSize(true);

        list.addAll(PemainData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvPemain.setLayoutManager(new LinearLayoutManager(this));
        PemainAdapter pemainAdapter = new PemainAdapter(list);
        rvPemain.setAdapter(pemainAdapter);

        pemainAdapter.setOnItemClickCallback(new PemainAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Pemain data) {
                showSelectedPemain(data);
            }
        });


    }

    private void showSelectedPemain(Pemain pemain) {
        Toast.makeText(this, "Anda Memilih " + pemain.getName(), Toast.LENGTH_SHORT).show();
        Pemain mPemain = new Pemain();
        mPemain.setName(pemain.getName());
        mPemain.setPosisi(pemain.getPosisi());
        mPemain.setTl(pemain.getTl());
        mPemain.setKlub(pemain.getKlub());
        mPemain.setPhoto(pemain.getPhoto());

        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra(DetailActivity.EXTRA_NAME, mPemain);
        intent.putExtra(DetailActivity.EXTRA_POSISI, mPemain);
        intent.putExtra(DetailActivity.EXTRA_TL, mPemain);
        intent.putExtra(DetailActivity.EXTRA_KLUB, mPemain);
        intent.putExtra(DetailActivity.EXTRA_PHOTO, mPemain);
        startActivity(intent);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setMode(int selectMode) {
        switch (selectMode) {
            case R.id.action_profile:
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent);

                break;
        }
//        if (selectMode == R.id.action_profile) {
//
//            Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
//            startActivity(intent);
//            finish();
//        }
    }
}
