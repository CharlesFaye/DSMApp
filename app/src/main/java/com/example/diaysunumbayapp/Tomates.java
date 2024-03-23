package com.example.diaysunumbayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Tomates extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tomates);
        getSupportActionBar().hide();
    }
    public void awasenghor(View view) {
        Intent nom_intent = new Intent(this,AwaSenghor.class);
        startActivity(nom_intent);
    }
    public void adamandiaye(View view) {
        Intent nom_intent = new Intent(this,AdamaNdiaye.class);
        startActivity(nom_intent);
    }
    public void bintousane(View view) {
        Intent nom_intent = new Intent(this,BintouSane.class);
        startActivity(nom_intent);
    }
}