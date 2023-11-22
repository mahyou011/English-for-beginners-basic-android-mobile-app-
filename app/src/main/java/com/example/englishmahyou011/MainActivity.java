package com.example.englishmahyou011;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the family category
        TextView alphabetp = (TextView) findViewById(R.id.basics);

        // Set a click listener on that View
        alphabetp.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent  alphabetPIntent = new Intent(MainActivity.this, Basics.class);

                // Start the new activity
                startActivity(alphabetPIntent);
            }
        });
        // Find the View that shows the family category
        TextView commonw = (TextView) findViewById(R.id.common_words);

        // Set a click listener on that View
        commonw.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent  commonWIntent = new Intent(MainActivity.this, Common_words.class);

                // Start the new activity
                startActivity(commonWIntent);
            }
        });
        // Find the View that shows the family category
        TextView commonph = (TextView) findViewById(R.id.common_phrases);

        // Set a click listener on that View
        commonph.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent  commonphIntent = new Intent(MainActivity.this, Common_phrases.class);

                // Start the new activity
                startActivity(commonphIntent);
            }
        });
        // Find the View that shows the family category
        TextView conversation = (TextView) findViewById(R.id.conversation);

        // Set a click listener on that View
        conversation.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent  conversationIntent = new Intent(MainActivity.this, ConversationActivity.class);

                // Start the new activity
                startActivity(conversationIntent);
            }
        });
    }
}

