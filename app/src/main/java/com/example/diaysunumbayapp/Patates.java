package com.example.diaysunumbayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Patates extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patates);
        getSupportActionBar().hide();
    }
    public void aminadiawara(View view) {
        Intent nom_intent = new Intent(this,AminaDiawara.class);
        startActivity(nom_intent);
    }
    public void awasenghor(View view) {
        Intent nom_intent = new Intent(this,AwaSenghor.class);
        startActivity(nom_intent);
    }
}