package com.example.myapplicationrevisionpourexemen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
ListView ls;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView t=findViewById(R.id.textView);
        TextView tt=findViewById(R.id.textView2);
        Bundle extras =getIntent().getExtras();

        t.setText(extras.getString("nom"));
        tt.setText(extras.getString("password"));
        ls= findViewById(R.id.ls);
        String [] s=new String[]{"islem","ben","maalem"};
        ArrayAdapter<String > adapter=new ArrayAdapter<String>(MainActivity2.this,R.layout.item,R.id.textView3,s);
        ls.setAdapter(adapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }
}