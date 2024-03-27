package com.example.tp3ex3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView ls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ls=findViewById(R.id.lst);
        String[] values=new String[]{"sfax","paris","new york"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this, R.layout.item,R.id.ville,values);
        ls.setAdapter(adapter);

    }
}