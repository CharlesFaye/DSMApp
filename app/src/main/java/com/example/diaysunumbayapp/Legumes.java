package com.example.diaysunumbayapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class Legumes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legumes);
        getSupportActionBar().hide();
    }


    public void tomates(View view) {
        Intent nom_intent = new Intent(this, com.example.sunumbaybis.Tomates.class);
        startActivity(nom_intent);
    }
    public void haricots(View view) {
        Intent nom_intent = new Intent(this,Haricots.class);
        startActivity(nom_intent);
    }
    public void carottes(View view) {
        Intent nom_intent = new Intent(this,Carottes.class);
        startActivity(nom_intent);
    }
    public void pommes(View view) {
        Intent nom_intent = new Intent(this,Pommes.class);
        startActivity(nom_intent);
    }
    public void oignons(View view) {
        Intent nom_intent = new Intent(this,Oignons.class);
        startActivity(nom_intent);
    }
    public void patates(View view) {
        Intent nom_intent = new Intent(this,Patates.class);
        startActivity(nom_intent);
    }
    public void manioc(View view) {
        Intent nom_intent = new Intent(this,Manioc.class);
        startActivity(nom_intent);
    }
    public void aubergines(View view) {
        Intent nom_intent = new Intent(this,Aubergines.class);
        startActivity(nom_intent);
    }
    public void oléagineux (View view) {
        Intent new_intent = new Intent(this,Oleagineux.class);
        startActivity(new_intent);
    }

}