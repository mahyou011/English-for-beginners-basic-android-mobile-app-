package com.example.englishmahyou011;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Common_words extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_words);

        // Find the View that shows the alphabet category
        TextView animals = (TextView) findViewById(R.id.animals);

        // Set a click listener on that View
       animals.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the alphabet category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AlphabetActivity}
                Intent animalstIntent = new Intent(Common_words.this, AnimalsActivity.class);

                // Start the new activity
                startActivity(animalstIntent);
            }
        });

        // Find the View that shows the pronouns category
        TextView body = (TextView) findViewById(R.id.body);

        // Set a click listener on that View
        body.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the pronouns category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent  bodyIntent = new Intent(Common_words.this, BodyActivity.class);

                // Start the new activity
                startActivity(bodyIntent);
            }
        });

        // Find the View that shows the numbers category
        TextView clothes = (TextView) findViewById(R.id.clothes);

        // Set a click listener on that View
        clothes.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent  clothesIntent = new Intent(Common_words.this, ClothesActivity.class);

                // Start the new activity
                startActivity(clothesIntent);
            }
        });

        // Find the View that shows the colors category
        TextView education = (TextView) findViewById(R.id.education);

        // Set a click listener on that View
        education.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ColorsActivity}
                Intent  educationIntent = new Intent(Common_words.this, EducationActivity.class);

                // Start the new activity
                startActivity(educationIntent);
            }
        });
        // Find the View that shows the family category
        TextView family = (TextView) findViewById(R.id.family);

        // Set a click listener on that View
        family.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent familyIntent = new Intent(Common_words.this, FamilyActivity.class);

                // Start the new activity
                startActivity(familyIntent);
            }
        });
        // Find the View that shows the family category
        TextView jobs = (TextView) findViewById(R.id.jobs_professions);

        // Set a click listener on that View
       jobs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent jobsIntent = new Intent(Common_words.this, JobsActivity.class);

                // Start the new activity
                startActivity(jobsIntent);
            }
        });
        // Find the View that shows the family category
        TextView feelings = (TextView) findViewById(R.id.feelings);

        // Set a click listener on that View
        feelings.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent feelingsIntent = new Intent(Common_words.this, FeelingsActivity.class);

                // Start the new activity
                startActivity(feelingsIntent);
            }
        });
        // Find the View that shows the family category
        TextView vegetables = (TextView) findViewById(R.id.vegetables);

        // Set a click listener on that View
        vegetables.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent vegetablesIntent = new Intent(Common_words.this, VegetablesActivity.class);

                // Start the new activity
                startActivity(vegetablesIntent);
            }
        });
        // Find the View that shows the family category
        TextView fruits = (TextView) findViewById(R.id.fruits);

        // Set a click listener on that View
        fruits.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent fruitsIntent = new Intent(Common_words.this, FruitsActivity.class);

                // Start the new activity
                startActivity(fruitsIntent);
            }
        });
    }
}
