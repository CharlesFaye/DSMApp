package com.example.diaysunumbayapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CoordonneeConsommateur extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordonnee_consommateur);
        getSupportActionBar().hide();
    }
    public void produits (View view) {
        Intent new_intent = new Intent(this, com.example.sunumbaybis.Produits.class);
        startActivity(new_intent);
    }
    public void inscrire (View view) {
        Intent new_intent = new Intent(this, com.example.sunumbaybis.Inscription.class);
        startActivity(new_intent);
    }
}



