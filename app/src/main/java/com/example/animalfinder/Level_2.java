package com.example.animalfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Level_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_2);
    }

    public void send3(View view) {
        Intent c = new Intent(getApplicationContext(), Level_3.class);
        startActivity(c);
    }

    public void sendLose(View view) {
        Intent z = new Intent(getApplicationContext(), Lose.class);
        startActivity(z);
    }
    }


