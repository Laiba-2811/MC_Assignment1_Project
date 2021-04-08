package com.example.learnalphabetsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PoemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poem);
    }

    public void TwoLittleHands(View view) {
        Intent intent=new Intent(this,TwoLittle.class);
        startActivity(intent);
    }

    public void TwinkleStar(View view) {
        Intent intent=new Intent(this,TwinkleTwinkle.class);
        startActivity(intent);
    }

    public void BabaBlackSheep(View view) {
        Intent intent=new Intent(this,BabaBlachSheep.class);
        startActivity(intent);
    }
}