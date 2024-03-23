package com.example.diaysunumbayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Accueil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);
        getSupportActionBar().hide();
    }
    public void coordonnée1(View view) {
        Intent nom_intent = new Intent(this, com.example.diaysunumbayapp.CoordonneeProducteur.class);
        startActivity(nom_intent);
    }
    public void coordonnee2(View view) {
        Intent nom_intent = new Intent(this, com.example.diaysunumbayapp.CoordonneeConsommateur.class);
        startActivity(nom_intent);
    }
    public void contact(View view) {
        Intent nom_intent = new Intent(this, com.example.diaysunumbayapp.Contact.class);
        startActivity(nom_intent);
    }
}