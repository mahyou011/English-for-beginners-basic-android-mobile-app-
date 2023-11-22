package com.example.englishmahyou011;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Basics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basics);

        // Find the View that shows the alphabet category
        TextView alphabet = (TextView) findViewById(R.id.alphabet);

        // Set a click listener on that View
        alphabet.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the alphabet category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AlphabetActivity}
                Intent alphabetIntent = new Intent(Basics.this, AlphabetActivity.class);

                // Start the new activity
                startActivity(alphabetIntent);
            }
        });

        // Find the View that shows the pronouns category
        TextView pronouns = (TextView) findViewById(R.id.pronouns);

        // Set a click listener on that View
        pronouns.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the pronouns category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent  pronounsIntent = new Intent(Basics.this, PronounsActivity.class);

                // Start the new activity
                startActivity(pronounsIntent);
            }
        });

        // Find the View that shows the numbers category
        TextView numbers = (TextView) findViewById(R.id.numbers);

        // Set a click listener on that View
        numbers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent  numbersIntent = new Intent(Basics.this, NumbersActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });

        // Find the View that shows the colors category
        TextView colors = (TextView) findViewById(R.id.colors);

        // Set a click listener on that View
        colors.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ColorsActivity}
                Intent  colorsIntent = new Intent(Basics.this, ColorsActivity.class);

                // Start the new activity
                startActivity(colorsIntent);
            }
        });
        // Find the View that shows the colors category
        TextView time = (TextView) findViewById(R.id.time);

        // Set a click listener on that View
        time.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ColorsActivity}
                Intent  timeIntent = new Intent(Basics.this, TimeActivity.class);

                // Start the new activity
                startActivity(timeIntent);
            }
        });
        // Find the View that shows the colors category
        TextView yearp = (TextView) findViewById(R.id.year_parts);

        // Set a click listener on that View
        yearp.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ColorsActivity}
                Intent  yearpIntent = new Intent(Basics.this, Parts_YearActivity.class);

                // Start the new activity
                startActivity(yearpIntent);
            }
        });
    }
}
