package com.example.musica;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button play_pause;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Conectar la parte grafica con la logica
        play_pause = findViewById(R.id.play_pause);

        mp = MediaPlayer.create(this,R.raw.musica);
        play_pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp.isPlaying()){
                    mp.pause();
                    play_pause.setBackgroundResource(R.drawable.play);
                    Toast.makeText(MainActivity.this,"Pausa",Toast.LENGTH_SHORT).show();
                }else{
                    mp.start();
                    play_pause.setBackgroundResource(R.drawable.pause);
                    Toast.makeText(MainActivity.this,"Play",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}