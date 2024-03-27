package com.example.dbsqllite;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Item> contactList = new ArrayList<>();
    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private FloatingActionButton addButton;
    private MyAdapter contactListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the RecyclerView
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Create the adapter and attach it to the RecyclerView
        contactListAdapter = new MyAdapter(contactList);
        recyclerView.setAdapter(contactListAdapter);

        // Add some dummy data
        contactList.add(new Item("islem ", "12345678"));
        contactList.add(new Item("islem ", "12345678"));
        contactList.add(new Item("islem ", "12345678"));

        // Notify the adapter that the data has changed
        contactListAdapter.notifyDataSetChanged();

        addButton = findViewById(R.id.addButton);

        adapter = new MyAdapter(contactList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAddItemDialog();
            }
        });
    }

    private void showAddItemDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Add Contact");

        // Create the dialog layout
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);

        final EditText nameEditText = new EditText(this);
        nameEditText.setHint("Name");
        layout.addView(nameEditText);

        final EditText phoneEditText = new EditText(this);
        phoneEditText.setHint("Phone");
        phoneEditText.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);
        layout.addView(phoneEditText);


        builder.setView(layout);

        // Add OK and Cancel buttons to the dialog
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String name = nameEditText.getText().toString();
                String phone = phoneEditText.getText().toString();
                if (name.equals("") || phone.equals("")) {
                    AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
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
                    alert.show();
                } else {
                    Item newItem = new Item(name, phone);
                    contactList.add(newItem);
                    adapter.notifyItemInserted(contactList.size() - 1);
                }

            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Do nothing
            }
        });

        // Show the dialog
        builder.show();
    }
}
