package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView registerHere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        registerHere = findViewById(R.id.registerHere);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void move(View view) {
        Intent i = new Intent(getApplicationContext(), MainActivity2.class);
        startActivity(i);
    }
}