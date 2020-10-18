package com.example.moodtrackerhw2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MoodHistory extends AppCompatActivity {
    private final String FILE_NAME = "emotions_data.txt";
    private ArrayList<MoodEntry> moodHistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood_history);

        moodHistory = new ArrayList<>();

        load();

        TextView t = (TextView) findViewById(R.id.moodHistoryView);
        StringBuilder sb = new StringBuilder();

        for (MoodEntry m : moodHistory) {
            sb.append(m.toString());
        }

        t.setText(sb.toString());
    }

    public void goBack(View view) {
        Intent intent = new Intent(this, HomeScreen.class);
        startActivity(intent);
    }


    public void load() {
        FileInputStream fis = null;

        try {
            fis = openFileInput(FILE_NAME);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            String text;

            while ((text = br.readLine()) != null) {
                MoodEntry me = new MoodEntry(text);
                moodHistory.add(me);
            }
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