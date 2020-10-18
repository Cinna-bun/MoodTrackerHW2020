package com.example.moodtrackerhw2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.io.BufferedReader;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

public class HomeScreen extends AppCompatActivity {
    //TODO make fields for the four emotions
    private Spinner happyScale;
    private Spinner sadScale;
    private Spinner angryScale;
    private Spinner tiredScale;
    private Spinner stressScale;

    private static final String FILE_NAME = "emotions_data.txt";

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
     * @return the happy rating
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

    public boolean isHappyChecked() {
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

    public void submitEmotion(View view) {
        StringBuilder line = new StringBuilder();

        String happy = "happy:" + isHappyChecked() + ":" + getHappyRating() + ",";
        String anger = "anger:" + isAngerChecked() + ":" + getAngerRating() + ",";
        String sad = "sad:" + isSadChecked() + ":" + getSadRating() + ",";
        String tired = "tired:" + isTiredChecked() + ":" + getTiredRating() + ",";
        String stress = "stress:" + isStressChecked() + ":" + getStressRating() + ",";
        TextView description = (TextView) findViewById(R.id.editTextTextMultiLine);
        String d = description.getText().toString().trim();

        line.append(happy);
        line.append(anger);
        line.append(sad);
        line.append(tired);
        line.append(stress);
        line.append(d);
        String data = line.toString();

        FileOutputStream fos = null;
        PrintWriter pw = null;

        try {
            fos = openFileOutput(FILE_NAME, MODE_APPEND | MODE_PRIVATE);
            pw = new PrintWriter(fos);
            pw.println(data);
            System.out.println("I'm writing!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (pw != null) {
                pw.close();
            }
        }
    }


    public void load(View view) {
        FileInputStream fis = null;

        try {
            fis = openFileInput(FILE_NAME);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            StringBuilder sb = new StringBuilder();
            String text;

            while ((text = br.readLine()) != null) {
                sb.append(text).append("\n");
            }

            System.out.println(sb.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
}