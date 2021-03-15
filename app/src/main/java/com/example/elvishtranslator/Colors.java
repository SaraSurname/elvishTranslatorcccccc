package com.example.elvishtranslator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Colors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
    }

    public void activityColors(){
        Intent i = new Intent( this, Colors.class);
        startActivity(i);
    }
}