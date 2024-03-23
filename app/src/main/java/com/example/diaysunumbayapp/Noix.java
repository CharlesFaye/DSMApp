package com.example.diaysunumbayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Noix extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noix);
        getSupportActionBar().hide();
    }
    public void francoisdiatta(View view) {
        Intent nom_intent = new Intent(this,FrancoisDiatta.class);
        startActivity(nom_intent);
    }
    public void adamacoly(View view) {
        Intent nom_intent = new Intent(this,AdamaColy.class);
        startActivity(nom_intent);
    }
    public void abdoulayendiaye(View view) {
        Intent nom_intent = new Intent(this,AbdoulayeNdiaye.class);
        startActivity(nom_intent);
    }

}