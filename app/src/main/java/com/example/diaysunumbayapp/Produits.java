package com.example.diaysunumbayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Produits extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produits);
        getSupportActionBar().hide();
    }
    public void céréales(View view) {
        Intent nom_intent = new Intent(this,Cereales.class);
        startActivity(nom_intent);
    }
    public void fruits(View view) {
        Intent nom_intent = new Intent(this,Fruits.class);
        startActivity(nom_intent);
    }
    public void légumes(View view) {
        Intent nom_intent = new Intent(this,Legumes.class);
        startActivity(nom_intent);
    }
    public void oléagineux(View view) {
        Intent nom_intent = new Intent(this,Oleagineux.class);
        startActivity(nom_intent);
    }
}