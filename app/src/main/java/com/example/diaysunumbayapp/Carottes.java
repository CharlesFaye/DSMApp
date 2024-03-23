package com.example.diaysunumbayapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Carottes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carottes);
        getSupportActionBar().hide();
        Button editTextTextPersonName = findViewById(R.id.buttonamina1);
        Button Voir_détails = findViewById(R.id.buttonamina1);
        Voir_détails.setOnClickListener(view -> {
            String text = editTextTextPersonName.getText().toString();
            ShowAlertDialog("Texte SVP");
        });
    }


    private Void ShowAlertDialog(String message) {
        AlertDialog alertDialog = new AlertDialog.Builder(Carottes.this).create();
        alertDialog.setTitle("Stock épuisé");
        alertDialog.setMessage("Le stock de cette productrice est momentanément indisponible. Vous serez informés au plus tôt dès la disponibilité de son produit");
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK", new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        alertDialog.show();
        return null;
    }



    public void adamandiaye (View view) {
        Intent new_intent = new Intent(this,AdamaNdiaye.class);
        startActivity(new_intent);
    }
    public void bintousane (View view) {
        Intent new_intent = new Intent(this,BintouSane.class);
        startActivity(new_intent);
    }
}