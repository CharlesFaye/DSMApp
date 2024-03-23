package com.example.diaysunumbayapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;

public class CoordonneeProducteur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordonnee_producteur);
        getSupportActionBar().hide();
        Button editTextTextPersonName = findViewById(R.id.button4);
        Button Voir_détails = findViewById(R.id.button4);
        Voir_détails.setOnClickListener(view -> {
            String text = editTextTextPersonName.getText().toString();
            ShowAlertDialog("Texte SVP");
        });
    }

    private Void ShowAlertDialog(String message) {
        AlertDialog alertDialog = new AlertDialog.Builder(CoordonneeProducteur.this).create();
        alertDialog.setTitle("Demande prise en compte");
        alertDialog.setMessage("Bienvenue dans notre plateforme, votre demande d'adhésion à notre application a bien été prise en compte. Sous peu vous recevrez de la part de nos équipes les documents nécessaires à l'adhésion définitive à notre application.");
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK", new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        alertDialog.show();
        return null;

    }
}
