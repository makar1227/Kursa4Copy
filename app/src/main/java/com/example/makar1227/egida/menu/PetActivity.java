package com.example.makar1227.egida.menu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.makar1227.egida.R;
import com.example.makar1227.egida.dog.DogSearchActivity;

public class PetActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView dog, puppy, cat, kitten;
    private Intent pet = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pet);

        dog = (ImageView) findViewById(R.id.dog);
        dog.setOnClickListener(this);
        puppy = (ImageView) findViewById(R.id.puppy);
        puppy.setOnClickListener(this);
        cat = (ImageView) findViewById(R.id.cat);
        cat.setOnClickListener(this);
        kitten = (ImageView) findViewById(R.id.kitten);
        kitten.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == dog) {
            pet = new Intent(PetActivity.this, DogSearchActivity.class);
            startActivity(pet);
        }
        if (v == puppy) {

        }
        if (v == cat) {

        }
        if (v == kitten) {

        }
    }
}
