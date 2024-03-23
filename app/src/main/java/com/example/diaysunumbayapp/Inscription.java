
package com.example.diaysunumbayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Inscription extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);
        getSupportActionBar().hide();
    }
    public void produits (View view) {
        Intent new_intent = new Intent(this, com.example.sunumbaybis.Produits.class);
        startActivity(new_intent);
    }
}