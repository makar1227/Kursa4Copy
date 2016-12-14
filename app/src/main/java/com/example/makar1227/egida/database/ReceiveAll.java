package com.example.makar1227.egida.database;

import android.os.AsyncTask;
import android.support.annotation.IntegerRes;

import com.example.makar1227.egida.dog.DogListActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by makar1227 on 12/14/2016.
 */

public class ReceiveAll extends AsyncTask<String, IntegerRes, String> {
    StringBuffer buffer;
    ArrayList<Pet> p_arry;


    @Override
    protected String doInBackground(String... params) {

        buffer = new StringBuffer();
        p_arry = new ArrayList<>();

        HttpURLConnection connection = null;
        BufferedReader reader = null;
        try {
            URL url = new URL(params[0]);
            connection = (HttpURLConnection) url.openConnection();
            connection.connect();

            InputStream istream = connection.getInputStream();
            reader = new BufferedReader(new InputStreamReader(istream));
            String line = "";
            while ((line = reader.readLine()) != null) {
                buffer.append(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (reader != null)
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }

        return null;
    }

    @Override
    protected void onPostExecute(String s) {
        int success = 0;

        try {
            JSONObject object = new JSONObject(buffer.toString());
            success = object.getInt("success");

            if (success == 1) {
                JSONArray jsonArray = object.getJSONArray("pet"); //имя масива в файле php
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject js_pet = jsonArray.getJSONObject(i);
                    Pet p = new Pet(js_pet.getString("name"),
                            js_pet.getString("breed"),
                            js_pet.getInt("size"),
                            js_pet.getBoolean("sterile"),
                            js_pet.getBoolean("gender"),
                            js_pet.getDouble("age"),
                            js_pet.getString("image"),
                            js_pet.getString("description"));
                    p_arry.add(p);
                }

                String out = "";
                for (int i = 0; i < p_arry.size(); i++) {
                    out += p_arry.get(i);
                }

        DogListActivity.all_dog.setText(out);
            } else {
                String message = object.getString("message");
                DogListActivity.all_dog.setText(message);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }


        //MainActivity.textView.setText(buffer.toString());

        super.onPostExecute(s);
    }
}
