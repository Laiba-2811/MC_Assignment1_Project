package com.example.learnalphabetsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AlphabetsActivity extends AppCompatActivity {
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabets);
    }

    public void ASound(View view) {
        ImageView imageView=findViewById(R.id.imageView1);
        imageView.animate().scaleX(0.9f).scaleY(0.9f).setDuration(500);
        mp = MediaPlayer.create(this, R.raw.a);
        mp.start();
    }

    public void ZSound(View view) {
        ImageView imageView=findViewById(R.id.imageView26);
        imageView.animate().scaleX(0.9f).scaleY(0.9f).setDuration(500);
        mp = MediaPlayer.create(this, R.raw.z);
        mp.start();
    }

    public void YSound(View view) {
        ImageView imageView=findViewById(R.id.imageView25);
        imageView.animate().scaleX(0.9f).scaleY(0.9f).setDuration(500);
        mp = MediaPlayer.create(this, R.raw.y);
        mp.start();
    }

    public void XSound(View view) {
        ImageView imageView=findViewById(R.id.imageView24);
        imageView.animate().scaleX(0.9f).scaleY(0.9f).setDuration(500);
        mp = MediaPlayer.create(this, R.raw.x);
        mp.start();
    }

    public void WSound(View view) {
        ImageView imageView=findViewById(R.id.imageView23);
        imageView.animate().scaleX(0.9f).scaleY(0.9f).setDuration(500);
        mp = MediaPlayer.create(this, R.raw.w);
        mp.start();
    }

    public void VSound(View view) {
        ImageView imageView=findViewById(R.id.imageView22);
        imageView.animate().scaleX(0.9f).scaleY(0.9f).setDuration(500);
        mp=MediaPlayer.create(this,R.raw.v);
        mp.start();
    }

    public void USound(View view) {
        ImageView imageView=findViewById(R.id.imageView21);
        imageView.animate().scaleX(0.9f).scaleY(0.9f).setDuration(500);
        mp=MediaPlayer.create(this,R.raw.u);
        mp.start();
    }

    public void TSound(View view) {
        ImageView imageView=findViewById(R.id.imageView20);
        imageView.animate().scaleX(0.9f).scaleY(0.9f).setDuration(500);
        mp=MediaPlayer.create(this,R.raw.t);
        mp.start();
    }

    public void SSound(View view) {
        ImageView imageView=findViewById(R.id.imageView19);
        imageView.animate().scaleX(0.9f).scaleY(0.9f).setDuration(500);
        mp=MediaPlayer.create(this,R.raw.s);
        mp.start();
    }

    public void RSound(View view) {
        ImageView imageView=findViewById(R.id.imageView18);
        imageView.animate().scaleX(0.9f).scaleY(0.9f).setDuration(500);
        mp=MediaPlayer.create(this,R.raw.r);
        mp.start();
    }

    public void QSound(View view) {
        ImageView imageView=findViewById(R.id.imageView17);
        imageView.animate().scaleX(0.9f).scaleY(0.9f).setDuration(500);
        mp=MediaPlayer.create(this,R.raw.q);
        mp.start();
    }

    public void PSound(View view) {
        ImageView imageView=findViewById(R.id.imageView16);
        imageView.animate().scaleX(0.9f).scaleY(0.9f).setDuration(500);
        mp=MediaPlayer.create(this,R.raw.p);
        mp.start();
    }

    public void OSound(View view) {
        ImageView imageView=findViewById(R.id.imageView15);
        imageView.animate().scaleX(0.9f).scaleY(0.9f).setDuration(500);
        mp=MediaPlayer.create(this,R.raw.o);
        mp.start();
    }

    public void NSound(View view) {
        ImageView imageView=findViewById(R.id.imageView14);
        imageView.animate().scaleX(0.9f).scaleY(0.9f).setDuration(500);
        mp=MediaPlayer.create(this,R.raw.n);
        mp.start();
    }

    public void MSound(View view) {
        ImageView imageView=findViewById(R.id.imageView13);
        imageView.animate().scaleX(0.9f).scaleY(0.9f).setDuration(500);
        mp=MediaPlayer.create(this,R.raw.m);
        mp.start();
    }

    public void LSound(View view) {
        ImageView imageView=findViewById(R.id.imageView12);
        imageView.animate().scaleX(0.9f).scaleY(0.9f).setDuration(500);
        mp=MediaPlayer.create(this,R.raw.l);
        mp.start();
    }

    public void KSound(View view) {
        ImageView imageView=findViewById(R.id.imageView11);
        imageView.animate().scaleX(0.9f).scaleY(0.9f).setDuration(500);
        mp=MediaPlayer.create(this,R.raw.k);
        mp.start();
    }

    public void JSound(View view) {
        ImageView imageView=findViewById(R.id.imageView10);
        imageView.animate().scaleX(0.9f).scaleY(0.9f).setDuration(500);
        mp=MediaPlayer.create(this,R.raw.j);
        mp.start();
    }

    public void ISound(View view) {
        ImageView imageView=findViewById(R.id.imageView9);
        imageView.animate().scaleX(0.9f).scaleY(0.9f).setDuration(500);
        mp=MediaPlayer.create(this,R.raw.i);
        mp.start();
    }

    public void HSound(View view) {
        ImageView imageView=findViewById(R.id.imageView8);
        imageView.animate().scaleX(0.9f).scaleY(0.9f).setDuration(500);
        mp=MediaPlayer.create(this,R.raw.h);
        mp.start();
    }

    public void GSound(View view) {
        ImageView imageView=findViewById(R.id.imageView7);
        imageView.animate().scaleX(0.9f).scaleY(0.9f).setDuration(500);
        mp=MediaPlayer.create(this,R.raw.g);
        mp.start();
    }

    public void FSound(View view) {
        ImageView imageView=findViewById(R.id.imageView6);
        imageView.animate().rotation(750).scaleX(0.5f).scaleY(0.5f).setDuration(500);
        mp=MediaPlayer.create(this,R.raw.f);
        mp.start();
    }

    public void ESound(View view) {
        ImageView imageView=findViewById(R.id.imageView5);
        imageView.animate().scaleX(0.9f).scaleY(0.9f).setDuration(500);
        mp=MediaPlayer.create(this,R.raw.e);
        mp.start();
    }

    public void DSound(View view) {
        ImageView imageView=findViewById(R.id.imageView4);
        imageView.animate().scaleX(0.9f).scaleY(0.9f).setDuration(500);
        mp=MediaPlayer.create(this,R.raw.d);
        mp.start();
    }

    public void CSound(View view) {
        ImageView imageView=findViewById(R.id.imageView3);
        imageView.animate().scaleX(0.9f).scaleY(0.9f).setDuration(500);
        mp=MediaPlayer.create(this,R.raw.c);
        mp.start();
    }

    public void BSound(View view) {
        ImageView imageView=findViewById(R.id.imageView2);
        imageView.animate().scaleX(0.9f).scaleY(0.9f).setDuration(500);
        mp=MediaPlayer.create(this,R.raw.b);
        mp.start();
    }

}