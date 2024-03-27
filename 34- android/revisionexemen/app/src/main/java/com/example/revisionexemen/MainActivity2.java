package com.example.revisionexemen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView mNomEditText;
    private TextView mPhoneEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mNomEditText = findViewById(R.id.nom);
        mPhoneEditText = findViewById(R.id.phone);

        Button ajouterButton = findViewById(R.id.b);
        ajouterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nom = mNomEditText.getText().toString();
                String phone = mPhoneEditText.getText().toString();

                // Créez un nouvel Intent pour renvoyer les données à l'activité MainActivity
                Intent returnIntent = new Intent();
                returnIntent.putExtra("nom", nom);
                returnIntent.putExtra("phone", phone);
                setResult(RESULT_OK, returnIntent);
                finish();
            }
        });
    }
}



//nom=findViewById(R.id.nom);
//        phone=findViewById(R.id.phone);