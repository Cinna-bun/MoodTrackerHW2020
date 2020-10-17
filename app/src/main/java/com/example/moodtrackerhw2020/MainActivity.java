package com.example.moodtrackerhw2020;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view) {
        EditText userNameText = (EditText)findViewById(R.id.usernameField);
        String userName = userNameText.getText().toString();
        EditText passwordText = (EditText)findViewById(R.id.passwordField);
        String password = userNameText.getText().toString();
    }

}
