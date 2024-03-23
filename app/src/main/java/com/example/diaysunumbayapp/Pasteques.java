package com.example.diaysunumbayapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;

public class Pasteques extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasteques);
        getSupportActionBar().hide();
        Button editTextTextPersonName = findViewById(R.id.button);
        Button Voir_détails = findViewById(R.id.button);
        Voir_détails.setOnClickListener(view -> {
            String text = editTextTextPersonName.getText().toString();
            ShowAlertDialog("Texte SVP");
        });
    }

    private Void ShowAlertDialog(String message) {
        AlertDialog alertDialog = new AlertDialog.Builder(Pasteques.this).create();
        alertDialog.setTitle("Produit indisponible");
        alertDialog.setMessage("Les pastèques sont pour le moment indisponibles sur le marché local.");
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK", new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        alertDialog.show();
        return null;
    }
}
