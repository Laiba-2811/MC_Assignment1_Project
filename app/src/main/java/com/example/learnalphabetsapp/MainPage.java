package com.example.learnalphabetsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
    }
    public void WordsWithAlphabets(View view)
    {
        Intent intent=new Intent(this,WordsWithAlphabets.class);
        startActivity(intent);
    }

    public void MoveAlphabets(View view) {
        Intent intent=new Intent(this,AlphabetsActivity.class);
        startActivity(intent);
    }

    public void MoveToPoems(View view) {
        Intent intent=new Intent(this,PoemActivity.class);
        startActivity(intent);
    }

    public void ShortStory(View view) {
        Intent intent=new Intent(this,MoralStory.class);
        startActivity(intent);
    }
}