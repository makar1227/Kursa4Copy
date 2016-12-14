package com.example.makar1227.egida.dog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.example.makar1227.egida.R;
import com.example.makar1227.egida.database.Pet;
import com.example.makar1227.egida.database.PetAdapter;

import java.util.ArrayList;

public class DogListActivity extends AppCompatActivity {
   private Intent myIntent;

    public static TextView all_dog;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog_list);

        all_dog=(TextView)findViewById(R.id.all_dog);



//        myIntent = getIntent();
//        String gender = myIntent.getStringExtra("gender");
//        int size= myIntent.getIntExtra("size",0);
//
//
//
//
//
//        ArrayList<Pet> pet_list = new ArrayList<Pet>();
//
//        PetAdapter petAdapter = new PetAdapter(this, pet_list);
//
//        // Get a reference to the ListView, and attach the adapter to the listView.
//        ListView listView = (ListView) findViewById(R.id.listview_pet);
//        listView.setAdapter(petAdapter);

    }
}
