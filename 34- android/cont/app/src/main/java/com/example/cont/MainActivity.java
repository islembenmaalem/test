package com.example.cont;


import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private SearchView searchView;
    private MyDao dao;
    private ListView listView;
    private List<Contact> contacts;
    private List<Contact> users;
    MyAdapter adapter;

    private Button addButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dao = new MyDao(this);
        dao.open();

        // Ajouter des contacts pour tester
        // dao.insert("islem", "1234567890");
        //  dao.insert("islem", "0987654321");
        addButton=findViewById(R.id.add);
        contacts = dao.getAllContacts();
        listView = findViewById(R.id.list_view);
        adapter = new MyAdapter(this, contacts);

        listView.setAdapter( new MyAdapter(this, contacts));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Gérer le clic sur un élément de la liste
                Contact contact = (Contact) parent.getItemAtPosition(position);
                Toast.makeText(MainActivity.this, "Clic sur " + contact.getName(), Toast.LENGTH_SHORT).show();
            }
        });
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ouvrir une boîte de dialogue pour permettre à l'utilisateur d'entrer le nom et le numéro de téléphone
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Ajouter un contact");

                // Ajouter des champs d'entrée de texte pour le nom et le numéro de téléphone
                final EditText nameEditText = new EditText(MainActivity.this);
                nameEditText.setHint("Nom");
                final EditText phoneEditText = new EditText(MainActivity.this);
                phoneEditText.setHint("Numéro de téléphone");
                phoneEditText.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);
                LinearLayout layout = new LinearLayout(MainActivity.this);
                layout.setOrientation(LinearLayout.VERTICAL);
                layout.addView(nameEditText);
                layout.addView(phoneEditText);
                builder.setView(layout);

                // Ajouter les boutons "Ajouter" et "Annuler"
                builder.setPositiveButton("Ajouter", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Ajouter le contact à la base de données SQLite
                        String name = nameEditText.getText().toString();
                        String phone = phoneEditText.getText().toString();
                        if (name.equals("") || phone.equals("")) {
                            androidx.appcompat.app.AlertDialog.Builder alert = new androidx.appcompat.app.AlertDialog.Builder(MainActivity.this);
                            alert.setTitle("invalid input");
                            alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    // Create an intent to restart the MainActivity
                                    Intent intent = new Intent(MainActivity.this, MainActivity.class);
                                    startActivity(intent);
                                    finish();
                                }
                            });
                            alert.show();}else{
                                    Contact newContact = new Contact(name, phone);
                                    dao.insert(name, phone);
                                    contacts.clear();
                                    contacts.addAll(dao.getAllContacts());
                                    ((MyAdapter)listView.getAdapter()).notifyDataSetChanged();
                                }
                            }







                });
                builder.setNegativeButton("Annuler", null);

                // Afficher la boîte de dialogue
                builder.show();
            }
        });


    }



    @Override
    protected void onDestroy() {
        super.onDestroy();
        dao.close();
    }
}
