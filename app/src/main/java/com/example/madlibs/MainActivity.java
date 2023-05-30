package com.example.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //all buttons
    private Button btnRoar;
    private Button btnArcadeSound;
    private Button btnWhistle;
    private Button btnOrchestra;
    private Button btnTrombone;
    private Button btnSword;
    private Button btnFart;
    private Button btnLaugh;
    private Button btnBoing;
    private Button btnBombDrop;
    private Button btnCowMoo;
    private Button btnSlotMachine;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //buttons
        btnRoar = findViewById(R.id.btn_roar);
        btnArcadeSound = findViewById(R.id.btn_arcadesound);
        btnWhistle = findViewById(R.id.btn_whistle);
        btnOrchestra = findViewById(R.id.btn_orchestra);
        btnTrombone = findViewById(R.id.btn_trombone);
        btnSword = findViewById(R.id.btn_sword);
        btnFart = findViewById(R.id.btn_fart);
        btnLaugh = findViewById(R.id.btn_laugh);
        btnBoing = findViewById(R.id.btn_boing);
        btnBombDrop = findViewById(R.id.btn_bombdrop);
        btnCowMoo = findViewById(R.id.btn_cowmoo);
        btnSlotMachine = findViewById(R.id.btn_slotmachine);










        //Set click
        btnRoar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playRoar();
            }
        });

        btnArcadeSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playArcadeSound();
            }
        });

        btnWhistle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playWhistle();
            }
        });

        btnOrchestra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playOrchestra();
            }
        });

        btnTrombone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playTrombone();
            }
        });

        btnSword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSword();
            }
        });

        btnFart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playFart();
            }
        });

        btnLaugh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playLaugh();
            }
        });

        btnBoing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playBoing();
            }
        });

        btnBombDrop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playBombDrop();
            }
        });

        btnCowMoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playCowMoo();
            }
        });

        btnSlotMachine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSlotMachine();
            }
        });
    }




    //private voids
    private void playRoar(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_deezy_roar);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playArcadeSound(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_deezy_arcadesound);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playWhistle(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_deezy_whistle);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playOrchestra(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_deezy_orchestra);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playTrombone(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_deezy_trombone);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playSword(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_deezy_sword);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playFart(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_deezy_fart);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playLaugh(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_deezy_laugh);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playBoing(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_deezy_boing);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playBombDrop(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_deezy_bomb);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playCowMoo(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_deezy_cowmoo);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playSlotMachine(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_deezy_slotmachine);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }
}