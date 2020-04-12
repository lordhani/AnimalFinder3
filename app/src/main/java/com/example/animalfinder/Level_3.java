package com.example.animalfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Level_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_3);
    }

    public void send4(View view) {
        Intent d = new Intent(getApplicationContext(), Level_4.class);
        startActivity(d);

    }

    public void sendLose(View view) {
        Intent z = new Intent(getApplicationContext(), Lose.class);
        startActivity(z);
    }
}
