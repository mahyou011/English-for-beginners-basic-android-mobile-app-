package com.example.englishmahyou011;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash_Screen extends AppCompatActivity {
    MediaPlayer ourSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);
        ImageView imgview=(ImageView)findViewById(R.id.icon_splash);
        Animation animationimg= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.anim_splash);
        imgview.startAnimation(animationimg);

        TextView txtview=(TextView) findViewById(R.id.text_splash);
        Animation animationtxt= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.anim_splash);
        txtview.startAnimation(animationtxt);

        ourSound= MediaPlayer.create(this,R.raw.welcom_splash);
        ourSound.start();

        Thread thread=new Thread(){
            @Override
            public void run() {
                super.run();
                try {
                    sleep(6000);
                    Intent intent= new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        ourSound.release();
        finish();
    }
}
