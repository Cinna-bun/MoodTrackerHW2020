package com.example.moodtrackerhw2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view) {
        String button_text;
        button_text = ((Button)view).getText().toString();
        if(button_text.equals("login")) {
            Intent login = new Intent(this, HomeScreen.class);
            startActivity(login);
        }
    }
}
