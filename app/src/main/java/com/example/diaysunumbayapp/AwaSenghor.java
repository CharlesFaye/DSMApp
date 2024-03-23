package com.example.diaysunumbayapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AwaSenghor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_awa_senghor);
        getSupportActionBar().hide();

    }

    public void commander (View view)
    {
        Intent new_intent = new Intent(this, com.example.sunumbaybis.Commande.class);
        startActivity(new_intent);
    }
}
