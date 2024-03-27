package com.example.revisionexemen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private MonAdapter mAdapter;
    private List<Element> mListeElements;
   Button deleteButton,editButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle extras = getIntent().getExtras();
        String nom = "";
        String phone = "";
        if (extras != null) {
            nom = extras.getString("nom");
            phone = extras.getString("phone");
        }

        mRecyclerView = findViewById(R.id.recyclerView);

        // Initialisez la liste des éléments à afficher dans la RecyclerView
        mListeElements = new ArrayList<>();
        mListeElements.add(new Element("Elément 1", "Description 1"));
        mListeElements.add(new Element("Elément 2", "Description 2"));
        mListeElements.add(new Element("Elément 3", "Description 3"));
        if (extras != null){
            mListeElements.add(new Element(nom, phone));
        }

        mAdapter = new MonAdapter(mListeElements);

        mRecyclerView.setAdapter(mAdapter);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        FloatingActionButton fab = findViewById(R.id.fab_add);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivityForResult(intent, 1);
            }
        });
    }

    // Cette méthode est appelée lorsque l'activité MainActivity2 est terminée
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                // Obtenez les données renvoyées par l'activité MainActivity2
                String nom = data.getStringExtra("nom");
                String phone = data.getStringExtra("phone");
                // Ajoutez les données à la liste des éléments et actualisez l'adapter
                mListeElements.add(new Element(nom, phone));
                mAdapter.notifyDataSetChanged();
            }
        }
    }
}
