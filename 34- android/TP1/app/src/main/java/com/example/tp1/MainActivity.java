package com.example.tp1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RadioButton radioButtonEuroToDinar;
    private RadioButton radioButtonDinarToEuro;
    private TextView textViewResultat;
    private Button buttonConvertir;
    RadioButton rad1=  findViewById(R.id.rad1);
    RadioButton rad2=  findViewById(R.id.rad1);
    EditText  nb=  findViewById(R.id.nbText);

    private static final double TAUX_EURO_TND = 3.25; // Taux de change fixe
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         rad1=  findViewById(R.id.rad1);
         rad2=  findViewById(R.id.rad1);
         nb=  findViewById(R.id.nbText);
        String nbString = nb.getText().toString();
        if(nbString.equals(""))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setMessage("Veuillez entrer un montant avant de convertir").setPositiveButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                    // Fermer la boîte de dialogue
                }
            });
            builder.create().show();
        }

    }
    public void convertir() {
        double montant = Double.parseDouble(nb.getText().toString());
        double resultat;

        if (rad1.isChecked()) {
            // Conversion de l'euro vers le dinar tunisien
            resultat = montant * TAUX_EURO_TND;;
            textViewResultat.setText(String.format("%.2f € = %.2f TND", montant, resultat));
        } else if (rad2.isChecked()) {
            // Conversion du dinar tunisien vers l'euro
            resultat = montant / TAUX_EURO_TND;
            textViewResultat.setText(String.format("%.2f TND = %.2f €", montant, resultat));
        } else {
            textViewResultat.setText("Sélectionnez une option");
        }
    }
}
