package com.example.diaysunumbayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.diaysunumbayapp.FallouPaye;

public class Mais extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mais);
        getSupportActionBar().hide();
    }
    public void falloupaye(View view) {
        Intent nom_intent = new Intent(this, FallouPaye.class);
        startActivity(nom_intent);
    }
    public void sanesene(View view) {
        Intent nom_intent = new Intent(this, com.example.sunumbaybis.SaneSene.class);
        startActivity(nom_intent);
    }
    public void omarngom(View view) {
        Intent nom_intent = new Intent(this, com.example.sunumbaybis.OmarNgom.class);
        startActivity(nom_intent);
    }

}