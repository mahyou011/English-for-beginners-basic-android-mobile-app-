package com.example.englishmahyou011;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ConversationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversation);

        // Find the View that shows the alphabet category
        TextView ph1 = (TextView) findViewById(R.id.phrases1);

        // Set a click listener on that View
        ph1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the alphabet category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AlphabetActivity}
                Intent ph1Intent = new Intent(ConversationActivity.this, Phrases1Activity.class);

                // Start the new activity
                startActivity(ph1Intent);
            }
        });
        // Find the View that shows the alphabet category
        TextView ph2 = (TextView) findViewById(R.id.phrases2);

        // Set a click listener on that View
        ph2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the alphabet category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AlphabetActivity}
                Intent ph2Intent = new Intent(ConversationActivity.this, Phrases2Activity.class);

                // Start the new activity
                startActivity(ph2Intent);
            }
        });
        // Find the View that shows the alphabet category
        TextView ph3 = (TextView) findViewById(R.id.phrases3);

        // Set a click listener on that View
        ph3.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the alphabet category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AlphabetActivity}
                Intent ph3Intent = new Intent(ConversationActivity.this, Phrases3Activity.class);

                // Start the new activity
                startActivity(ph3Intent);
            }
        });
        // Find the View that shows the alphabet category
        TextView ph4 = (TextView) findViewById(R.id.phrases4);

        // Set a click listener on that View
        ph4.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the alphabet category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AlphabetActivity}
                Intent ph4Intent = new Intent(ConversationActivity.this, Phrases4Activity.class);

                // Start the new activity
                startActivity(ph4Intent);
            }
        });





    }
}

