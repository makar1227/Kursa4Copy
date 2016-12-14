package com.example.makar1227.egida.dog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.makar1227.egida.R;

public class DogSearchActivity extends AppCompatActivity implements View.OnClickListener {

    String url_get_all = "http://127.0.0.1/read_all.php";


    private RadioGroup gender;
    private Spinner size;
    private int positionSize;
    private String selectedGender = "";
    private RadioButton checkedRadioButton;

    private Button select;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog_search);
        gender = (RadioGroup) findViewById(R.id.gender);
        gender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup arg0, int id) {
                switch (id) {
                    case R.id.gender_boy:

                        checkedRadioButton = (RadioButton) gender.findViewById(id);
                        selectedGender = checkedRadioButton.getText().toString();
                        break;
                    case R.id.gender_girl:
                        checkedRadioButton = (RadioButton) gender.findViewById(id);
                        selectedGender = checkedRadioButton.getText().toString();
                        break;
                    default:
                        break;
                }
            }
        });

        size = (Spinner) findViewById(R.id.size);
        size.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent,
                                       View itemSelected, int selectedItemPosition, long selectedId) {
                String[] choose = getResources().getStringArray(R.array.sizes);
                ArrayAdapter adapter = (ArrayAdapter) size.getAdapter();
                positionSize = adapter.getPosition(choose[selectedItemPosition]);
            }

            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        select = (Button) findViewById(R.id.select);
        select.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent dogIntent = new Intent(this, DogListActivity.class);
        dogIntent.putExtra("gender", selectedGender);
        dogIntent.putExtra("size", positionSize);
        startActivity(dogIntent);
    }
}
