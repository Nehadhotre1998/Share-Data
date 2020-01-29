package com.example.sharedata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    private TextView username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        username = findViewById(R.id.txt_username);
        password = findViewById(R.id.txt_password);

        Intent intent = getIntent();

        String USERNAME = intent.getStringExtra("username");
        username.setText("Welcome " + USERNAME);

        String PASSWORD = intent.getStringExtra("password");
        password.setText("Password is " + PASSWORD);
    }
}

