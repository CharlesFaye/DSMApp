package com.example.diaysunumbayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Citrons extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_citrons);
        getSupportActionBar().hide();
    }
    public void mamadoumbengue(View view) {
        Intent nom_intent = new Intent(this, com.example.sunumbaybis.MamadouMbengue.class);
        startActivity(nom_intent);
    }

}