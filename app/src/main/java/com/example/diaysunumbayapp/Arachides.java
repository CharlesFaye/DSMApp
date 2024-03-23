package com.example.diaysunumbayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Arachides extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arachides);
        getSupportActionBar().hide();
    }
    public void mamadoudiouf(View view) {
        Intent nom_intent = new Intent(this, com.example.sunumbaybis.MamadouDiouf.class);
        startActivity(nom_intent);
    }
    public void falloupaye(View view) {
        Intent nom_intent = new Intent(this, com.example.sunumbaybis.FallouPaye.class);
        startActivity(nom_intent);
    }
    public void madsene(View view) {
        Intent nom_intent = new Intent(this, com.example.sunumbaybis.MadSene.class);
        startActivity(nom_intent);
    }
}