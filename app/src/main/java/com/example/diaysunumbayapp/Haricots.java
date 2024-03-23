package com.example.diaysunumbayapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Haricots extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haricots);
        getSupportActionBar().hide();
        Button editTextTextPersonName = findViewById(R.id.button2);
        Button Voir_détails = findViewById(R.id.button2);
        Voir_détails.setOnClickListener(view -> {
            String text = editTextTextPersonName.getText().toString();
            ShowAlertDialog("Texte SVP");
        });
    }


    private Void ShowAlertDialog(String message) {
        AlertDialog alertDialog = new AlertDialog.Builder(Haricots.this).create();
        alertDialog.setTitle("Stock épuisé");
        alertDialog.setMessage("Le stock de cette productrice est momentanément indisponible. Vous serez informés au plus tôt dès la disponibilité de ce produit");
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK", new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        alertDialog.show();
        return null;
    }

    public void mamadoudiouf(View view) {
        Intent nom_intent = new Intent(this, com.example.diaysunumbayapp.MamadouDiouf.class);
        startActivity(nom_intent);
    }
    public void benoitcoly(View view) {
        Intent nom_intent = new Intent(this,BenoitColy.class);
        startActivity(nom_intent);
    }

}