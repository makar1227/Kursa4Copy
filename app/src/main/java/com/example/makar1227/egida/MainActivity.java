package com.example.makar1227.egida;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.makar1227.egida.network.WebActivity;
import com.example.makar1227.egida.menu.DonationActivity;
import com.example.makar1227.egida.menu.NeedActivity;
import com.example.makar1227.egida.menu.PetActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private LinearLayout need, pets, donation, network;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        need = (LinearLayout) findViewById(R.id.need);
        pets = (LinearLayout) findViewById(R.id.pets);
        donation = (LinearLayout) findViewById(R.id.donation);
        network = (LinearLayout) findViewById(R.id.network);
        need.setOnClickListener(this);
        pets.setOnClickListener(this);
        donation.setOnClickListener(this);
        network.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == network) {
            intent = new Intent(MainActivity.this, WebActivity.class);
            startActivity(intent);
        }

        if (v == need) {
            intent = new Intent(MainActivity.this, NeedActivity.class);
            startActivity(intent);
        }
        if (v == pets) {
            intent = new Intent(MainActivity.this, PetActivity.class);
            startActivity(intent);
        }
        if (v == donation) {
            intent = new Intent(MainActivity.this, DonationActivity.class);
            startActivity(intent);
        }


    }
}
