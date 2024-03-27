package com.example.contactlistqlite;

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
    ContactAdapter adapter;

    private FloatingActionButton addButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dao = new MyDao(this);
        dao.open();

        // Ajouter des contacts pour tester
       // dao.insert("islem", "1234567890");
      //  dao.insert("islem", "0987654321");
        addButton=findViewById(R.id.add_button);
        contacts = dao.getAllContacts();
        listView = findViewById(R.id.list_view);
        adapter = new ContactAdapter(this, contacts);

        listView.setAdapter( new ContactAdapter(this, contacts));
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
                            alert.setTitle("Error");
                            alert.setMessage("Veuillez remplir vos données");
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

                            if (dao.isPhoneNumberExists(phone)) {
                            // Afficher un message d'erreur si le numéro de téléphone existe déjà dans la base de données
                            AlertDialog.Builder alertBuilder = new AlertDialog.Builder(v.getContext());
                            alertBuilder.setTitle("Contact déjà existant");
                            alertBuilder.setMessage("Le numéro de téléphone existe déjà dans la base de données");
                            alertBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    // Do nothing
                                }
                            });
                            alertBuilder.show();}
                            else{
                                if (phone.length() != 8) {
                                    AlertDialog.Builder alertBuilder = new AlertDialog.Builder(v.getContext());
                                    alertBuilder.setTitle("Invalid Phone Number");
                                    alertBuilder.setMessage("Phone number must be exactly 8 digits");
                                    alertBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialog, int which) {
                                            // Do nothing
                                        }
                                    });
                                    alertBuilder.show();
                                    return;
                                }
                                else{
                                    Contact newContact = new Contact(name, phone);
                                    dao.insert(name, phone);
                                    contacts.clear();
                                    contacts.addAll(dao.getAllContacts());
                                    ((ContactAdapter)listView.getAdapter()).notifyDataSetChanged();
                                }
                            }



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
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item, menu);
        MenuItem menuItem = menu.findItem(R.id.SearchViewid);
        androidx.appcompat.widget.SearchView searchView = (androidx.appcompat.widget.SearchView) menuItem.getActionView();
        searchView.setMaxWidth(Integer.MIN_VALUE);
        searchView.setQueryHint("Search Here");


        searchView.setOnQueryTextListener(new androidx.appcompat.widget.SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            public boolean onQueryTextChange(String s) {
                users=dao.getContactsByName(s);
                adapter = new ContactAdapter(MainActivity.this, users);
                listView.setAdapter(adapter);
                return false;
            }


        });


        return super.onCreateOptionsMenu(menu);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        dao.close();
    }
}
