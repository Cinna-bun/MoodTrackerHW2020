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
    private Spinner stressScale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        //making the spinners to get the numbers from the users
        happyScale = (Spinner) findViewById(R.id.happySpinner);
        sadScale = (Spinner) findViewById(R.id.sadSpinner);
        angryScale = (Spinner) findViewById(R.id.angrySpinner);
        tiredScale = (Spinner) findViewById(R.id.tiredSpinner);
        stressScale = (Spinner) findViewById(R.id.stressSpinner);

        //this activates the spinners above
        ArrayAdapter<String> numberRatingAdapter = new ArrayAdapter<String>(HomeScreen.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.numbers));
        numberRatingAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        happyScale.setAdapter(numberRatingAdapter);
        sadScale.setAdapter(numberRatingAdapter);
        angryScale.setAdapter(numberRatingAdapter);
        tiredScale.setAdapter(numberRatingAdapter);
        stressScale.setAdapter(numberRatingAdapter);
    }

    /**
     * Gets the user's current happy rating
     * @return the happy rating, or -1 if they have not selected anything
     */
    public int getHappyRating() {
        String text = happyScale.getSelectedItem().toString();
        int result = Integer.parseInt(text);

        return result;
    }

    public int getSadRating() {
        String text = sadScale.getSelectedItem().toString();
        int result = Integer.parseInt(text);

        return result;
    }

    public int getAngerRating() {
        String text = angryScale.getSelectedItem().toString();
        int result = Integer.parseInt(text);

        return result;
    }

    public int getTiredRating() {
        String text = tiredScale.getSelectedItem().toString();
        int result = Integer.parseInt(text);

        return result;
    }

    public int getStressRating() {
        String text = stressScale.getSelectedItem().toString();
        int result = Integer.parseInt(text);

        return result;
    }

    public boolean isHappyChecked(View view) {
        CheckBox box = (CheckBox) findViewById(R.id.happyBox);
        return box.isChecked();
    }

    public boolean isSadChecked() {
        CheckBox box = (CheckBox) findViewById(R.id.sadBox);
        return box.isChecked();
    }

    public boolean isAngerChecked() {
        CheckBox box = (CheckBox) findViewById(R.id.angryBox);
        return box.isChecked();
    }

    public boolean isTiredChecked() {
        CheckBox box = (CheckBox) findViewById(R.id.tiredBox);
        return box.isChecked();
    }

    public boolean isStressChecked() {
        CheckBox box = (CheckBox) findViewById(R.id.stressBox);
        return box.isChecked();
    }

    public void submitEmotion() {

    }

    
}