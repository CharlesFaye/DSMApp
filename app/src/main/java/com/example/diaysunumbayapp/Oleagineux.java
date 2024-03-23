package com.example.diaysunumbayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.diaysunumbayapp.Arachides;
import com.example.diaysunumbayapp.Noix;

public class Oleagineux extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oleagineux);
        getSupportActionBar().hide();
    }
    public void arachides(View view) {
        Intent nom_intent = new Intent(this, Arachides.class);
        startActivity(nom_intent);
    }
    public void noix(View view) {
        Intent nom_intent = new Intent(this, Noix.class);
        startActivity(nom_intent);
    }

}