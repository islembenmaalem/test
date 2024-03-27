package com.example.conversionmonnaie_temperature;
import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.view.MenuItem;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class ConversionMonnaie extends AppCompatActivity {

    private EditText editTextMontant;
    private RadioButton radioButtonEuroToDinar;
    private RadioButton radioButtonDinarToEuro;
    private TextView textViewResultat;
    private Button buttonConvertir;

    private static final double TAUX_EURO_TND = 3.25; // Taux de change fixe

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);


        radioButtonEuroToDinar = findViewById(R.id.eurodinar);
        radioButtonDinarToEuro = findViewById(R.id.dinareuro);
        textViewResultat = findViewById(R.id.resultat);
        buttonConvertir =findViewById((R.id.convertir));
        radioButtonEuroToDinar.setOnCreateContextMenuListener(this);
        radioButtonDinarToEuro.setOnCreateContextMenuListener(this);
        buttonConvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextMontant = findViewById(R.id.valeur);
                String montantString = editTextMontant.getText().toString();
                if (montantString.isEmpty()) {
                    // Si le champ est vide, afficher une boîte de dialogue d'alerte
                    AlertDialog.Builder builder = new AlertDialog.Builder(ConversionMonnaie.this);
                    builder.setMessage("Veuillez entrer un montant avant de convertir")
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    // Fermer la boîte de dialogue
                                }
                            });
                    builder.create().show();
                } else {

                    convertir();
                }
            }});
        buttonConvertir.setOnCreateContextMenuListener(this);
    }

    public void convertir() {
        double montant = Double.parseDouble(editTextMontant.getText().toString());
        double resultat;

        if (radioButtonEuroToDinar.isChecked()) {

            // Conversion de l'euro vers le dinar tunisien
            resultat = montant * TAUX_EURO_TND;;
            textViewResultat.setText(String.format("%.2f € = %.2f TND", montant, resultat));
        } else if (radioButtonDinarToEuro.isChecked()) {
            // Conversion du dinar tunisien vers l'euro
            resultat = montant / TAUX_EURO_TND;
            textViewResultat.setText(String.format("%.2f TND = %.2f €", montant, resultat));
        } else {
            textViewResultat.setText("Sélectionnez une option");
        }
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.add(0, 1, 0,"Taux Euro -> Dinars");
        menu.add(0, 2, 0,"Taux Dinars -> Euro");
    }
    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case 1:
                Toast.makeText(this, "Taux de conversion d'Euros en Dinars : 3.2", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(this, "Taux de conversion de Dinars en Euros : 0.31", Toast.LENGTH_SHORT).show();
                break;
            default: return super.onContextItemSelected(item);
        }
        return super.onOptionsItemSelected(item);

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (item.getItemId())
        {
            case R.id.action_conversion:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                return true;
            case R.id.action_quit:
                finishAffinity();
                return true;

        }

        return super.onOptionsItemSelected(item);
    }


    public static class MainActivity {
    }
}

