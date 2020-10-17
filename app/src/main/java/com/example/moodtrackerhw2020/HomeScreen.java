package com.example.moodtrackerhw2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        //making the spinners to get the numbers from the users
        Spinner happyScale = (Spinner) findViewById(R.id.happySpinner);
        Spinner sadScale = (Spinner) findViewById(R.id.sadSpinner);
        Spinner angryScale = (Spinner) findViewById(R.id.angrySpinner);
        Spinner tiredScale = (Spinner) findViewById(R.id.tiredSpinner);

        ArrayAdapter<String> numberRatingAdapter = new ArrayAdapter<String>(HomeScreen.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.numbers));
        numberRatingAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        happyScale.setAdapter(numberRatingAdapter);
        sadScale.setAdapter(numberRatingAdapter);
        angryScale.setAdapter(numberRatingAdapter);
        tiredScale.setAdapter(numberRatingAdapter);
    }


}