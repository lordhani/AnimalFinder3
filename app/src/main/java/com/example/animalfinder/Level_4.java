package com.example.animalfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Level_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_4);
    }

    public void send5(View view) {
        Intent e = new Intent(getApplicationContext(), Level_5.class);
        startActivity(e);
    }

    public void sendLose(View view) {
        Intent z = new Intent(getApplicationContext(), Lose.class);
        startActivity(z);
    }
}

