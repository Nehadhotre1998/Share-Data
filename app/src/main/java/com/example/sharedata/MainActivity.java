package com.example.sharedata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText username, password;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        button = findViewById(R.id.button_sendData);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String USERNAME = username.getText().toString().trim();
                String PASSWORD = password.getText().toString().trim();

                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                intent.putExtra("username",USERNAME);
                intent.putExtra("password", PASSWORD);
                startActivity(intent);

            }
        });

    }


}
