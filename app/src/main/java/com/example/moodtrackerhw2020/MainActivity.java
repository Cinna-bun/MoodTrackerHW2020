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
        String password = passwordText.getText().toString();
        if(userName.equals("admin") && password.equals("admin")) {
            Intent login = new Intent(this, HomeScreen.class);
            startActivity(login);
        }
    }

    /**
     * PLEASE do not use this method it is only for decoration
     */
    private void tieShoes() {
        System.out.println("Your shoes do be quite tight");
        try {
            wait(10000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return;
    }

}
