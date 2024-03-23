package com.example.diaysunumbayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Mandarines extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mandarines);
        getSupportActionBar().hide();

    }
    public void iboundiaye(View view) {
        Intent nom_intent = new Intent(this,IbouNdiaye.class);
        startActivity(nom_intent);
    }
    public void fatousylla(View view) {
        Intent nom_intent = new Intent(this,FatouSylla.class);
        startActivity(nom_intent);
    }
}