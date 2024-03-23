package com.example.diaysunumbayapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MamadouDiouf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mamadou_diouf);
        getSupportActionBar().hide();

    }
    public void arachides (View view) {
        Intent nom_intent = new Intent(this,Arachides.class);
        startActivity(nom_intent);
    }
    public void commander (View view) {
        Intent nom_intent = new Intent(this,Commande.class);
        startActivity(nom_intent);
    }
}