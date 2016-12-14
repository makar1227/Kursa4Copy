package com.example.makar1227.egida.database;

import android.app.Activity;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.makar1227.egida.R;

import java.util.ArrayList;

/**
 * Created by makar1227 on 12/13/2016.
 */

public class PetAdapter extends ArrayAdapter<Pet> {

    private static final String LOG_TAG = PetAdapter.class.getSimpleName();

    public PetAdapter(Activity context, ArrayList<Pet> androidFlavors) {
        super(context, 0, androidFlavors);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_adapter, parent, false);
        }
        Pet currentpet = getItem(position);

        ImageView image = (ImageView) listItemView.findViewById(R.id.pet_img);
//        Uri uri=currentpet.getImg().toString();
//        image.setImageURI();

        TextView pet_name = (TextView) listItemView.findViewById(R.id.pet_name);
        pet_name.setText(currentpet.getName());
        TextView pet_gender = (TextView) listItemView.findViewById(R.id.pet_gender_age);

        if (currentpet.isGender())
            pet_gender.setText("девочка" + ", " + currentpet.getAge());
        else
            pet_gender.setText("мальчик" + ", " + currentpet.getAge());


        TextView pet_steril = (TextView) listItemView.findViewById(R.id.pet_steril);
        if (currentpet.isSterile())
            pet_steril.setText("стелилизован(-а)");
        else
            pet_steril.setText("не стелилизован(-а)");


        TextView pet_sise = (TextView) listItemView.findViewById(R.id.pet_size);
        pet_sise.setText(currentpet.getSize());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView pet_description = (TextView) listItemView.findViewById(R.id.pet_description);
        pet_description.setText(currentpet.getDescription());

        return listItemView;
    }
}
