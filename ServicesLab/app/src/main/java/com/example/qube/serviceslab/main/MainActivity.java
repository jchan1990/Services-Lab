package com.example.qube.serviceslab.main;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.qube.serviceslab.R;
import com.example.qube.serviceslab.service.MediaService;

public class MainActivity extends AppCompatActivity {
    ImageView mPlay, mPause, mStop;
    MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPlay = (ImageView) findViewById(R.id.button_play);
        mPause = (ImageView) findViewById(R.id.button_pause);
        mStop = (ImageView) findViewById(R.id.button_stop);
    }

//        mPlay.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, MediaService.class);
//                startService(intent);
//            }
//        });
//
//        mPause.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                MediaService.pause();
//            }
//        });
//
//        mStop.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                MediaService.stop();
//                stopService(new Intent(MainActivity.this, MediaService.class));
//            }
//        });
//
//    }

    public void ButtonClickListener(View view) {
        switch (view.getId()) {
            case R.id.button_play:
                Intent intent = new Intent(MainActivity.this, MediaService.class);
                startService(intent);
                break;

            case R.id.button_pause:
                MediaService.pause();
                break;

            case R.id.button_stop:
                MediaService.stop();
                stopService(new Intent(MainActivity.this, MediaService.class));
                break;


        }

    }
}
