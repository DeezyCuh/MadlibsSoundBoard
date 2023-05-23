package com.example.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //all buttons
    private Button btnRoar;

    //all media players
    private MediaPlayer mpRoar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //buttons
        btnRoar = findViewById(R.id.btn_roar);


        //media players
        mpRoar = MediaPlayer.create(this,R.raw.sound_roar);


        btnRoar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpRoar.start();
            }
        });
    }
}