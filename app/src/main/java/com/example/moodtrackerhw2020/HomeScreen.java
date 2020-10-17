package com.example.moodtrackerhw2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;

public class HomeScreen extends AppCompatActivity {
    //TODO make fields for the four emotions
    private Spinner happyScale;
    private Spinner sadScale;
    private Spinner angryScale;
    private Spinner tiredScale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        //making the spinners to get the numbers from the users
        happyScale = (Spinner) findViewById(R.id.happySpinner);
        sadScale = (Spinner) findViewById(R.id.sadSpinner);
        angryScale = (Spinner) findViewById(R.id.angrySpinner);
        tiredScale = (Spinner) findViewById(R.id.tiredSpinner);

        //this activates the spinners above
        ArrayAdapter<String> numberRatingAdapter = new ArrayAdapter<String>(HomeScreen.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.numbers));
        numberRatingAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        happyScale.setAdapter(numberRatingAdapter);
        sadScale.setAdapter(numberRatingAdapter);
        angryScale.setAdapter(numberRatingAdapter);
        tiredScale.setAdapter(numberRatingAdapter);
    }

    /**
     * Gets the user's current happy rating
     * @return the
     */
    public int getHappyRating() {
        String text = happyScale.getSelectedItem().toString();
        int result = Integer.parseInt(text);

        return result;
    }

    public void submitEmotion() {

    }

    
}