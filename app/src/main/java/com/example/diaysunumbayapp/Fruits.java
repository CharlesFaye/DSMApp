package com.example.diaysunumbayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Fruits extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits);
        getSupportActionBar().hide();
    }
    public void mangues(View view) {
        Intent nom_intent = new Intent(this, com.example.sunumbaybis.Mangues.class);
        startActivity(nom_intent);
    }
    public void bananes(View view) {
        Intent nom_intent = new Intent(this,Bananes.class);
        startActivity(nom_intent);
    }
    public void oranges(View view) {
        Intent nom_intent = new Intent(this, com.example.sunumbaybis.Oranges.class);
        startActivity(nom_intent);
    }
    public void mandarines(View view) {
        Intent nom_intent = new Intent(this, com.example.sunumbaybis.Mandarines.class);
        startActivity(nom_intent);
    }
    public void citrons(View view) {
        Intent nom_intent = new Intent(this,Citrons.class);
        startActivity(nom_intent);
    }
    public void pasteques(View view) {
        Intent nom_intent = new Intent(this, com.example.sunumbaybis.Pasteques.class);
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