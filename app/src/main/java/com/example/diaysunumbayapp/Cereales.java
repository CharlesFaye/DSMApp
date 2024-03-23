package com.example.diaysunumbayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Cereales extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cereales);
        getSupportActionBar().hide();
    }
    public void riz(View view) {
        Intent nom_intent = new Intent(this, com.example.sunumbaybis.Riz.class);
        startActivity(nom_intent);
    }
    public void mais(View view) {
        Intent nom_intent = new Intent(this, com.example.sunumbaybis.Mais.class);
        startActivity(nom_intent);
    }
    public void mil(View view) {
        Intent nom_intent = new Intent(this, com.example.sunumbaybis.Mil.class);
        startActivity(nom_intent);
    }
    public void sorgho(View view) {
        Intent nom_intent = new Intent(this, com.example.sunumbaybis.Sorgho.class);
        startActivity(nom_intent);
    }
    public void fruits(View view) {
        Intent nom_intent = new Intent(this, com.example.sunumbaybis.Fruits.class);
        startActivity(nom_intent);
    }
    public void légumes(View view) {
        Intent nom_intent = new Intent(this, com.example.sunumbaybis.Legumes.class);
        startActivity(nom_intent);
    }
    public void oléagineux(View view) {
        Intent nom_intent = new Intent(this, com.example.sunumbaybis.Oleagineux.class);
        startActivity(nom_intent);
    }
}