package com.example.diaysunumbayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FallouPaye extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fallou_paye);
        getSupportActionBar().hide();
    }

    public void commander (View view) {
        Intent nom_intent = new Intent(this,Commande.class);
        startActivity(nom_intent);
    }
}