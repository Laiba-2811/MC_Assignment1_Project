package com.example.learnalphabetsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class TwinkleTwinkle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twinkle_twinkle);
        VideoView videoView=findViewById(R.id.videoView4);
        videoView.setVideoPath("android.resource://"+ getPackageName()+"/"+R.raw.twinkle);
        MediaController mediaController=new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
    }
}