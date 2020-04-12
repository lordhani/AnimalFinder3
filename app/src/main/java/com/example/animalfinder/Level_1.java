package com.example.animalfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Level_1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_1);
    }

    public void send2(View view) {
        Intent b = new Intent(getApplicationContext(), Level_2.class);
        startActivity(b);
    }

    public void sendLose(View view) {
        Intent z = new Intent(getApplicationContext(), Lose.class);
        startActivity(z);

    }
}

