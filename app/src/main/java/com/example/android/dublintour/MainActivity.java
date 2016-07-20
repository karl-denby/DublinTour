package com.example.android.dublintour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Button object and onclick listener to open the appropriate activity
        Button bHistory = (Button) findViewById(R.id.btn_history);
        bHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent history_intent = new Intent(MainActivity.this, HistoryActivity.class);

                startActivity(history_intent);
            }
        });

        // Button object and onclick listener to open the appropriate activity
        Button bFood = (Button) findViewById(R.id.btn_food);
        bFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent food_intent = new Intent(MainActivity.this, FoodActivity.class);

                startActivity(food_intent);
            }
        });

        // Button object and onclick listener to open the appropriate activity
        Button bFamily = (Button) findViewById(R.id.btn_family);
        bFamily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent family_intent = new Intent(MainActivity.this, FamilyActivity.class);

                startActivity(family_intent);
            }
        });

        // Button object and onclick listener to open the appropriate activity
        Button bLandmark = (Button) findViewById(R.id.btn_landmark);
        bLandmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent landmark_intent = new Intent(MainActivity.this, LandmarkActivity.class);

                startActivity(landmark_intent);
            }
        });
        // Anything else we need to do OnCreate

    }
}
