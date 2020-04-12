package com.example.animalfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Level_5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_5);
    }

    public void sendwin(View view) {
        Intent f = new Intent(getApplicationContext(), Win.class);
        startActivity(f);
    }

    public void sendLose(View view) {
        Intent z = new Intent(getApplicationContext(), Lose.class);
        startActivity(z);
    }
}

