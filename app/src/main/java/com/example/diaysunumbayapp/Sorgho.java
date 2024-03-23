package com.example.diaysunumbayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Sorgho extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorgho);
        getSupportActionBar().hide();
    }
    public void nadegesambou(View view) {
        Intent nom_intent = new Intent(this,NadegeSambou.class);
        startActivity(nom_intent);
    }
    public void benoitcoly(View view) {
        Intent nom_intent = new Intent(this,BenoitColy.class);
        startActivity(nom_intent);
    }
}