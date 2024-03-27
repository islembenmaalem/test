package com.example.listvientp4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
ListView ls;
ArrayList <HashMap<String,String>> values = new ArrayList<HashMap<String,String>>();
HashMap<String,String> map;
String s,a,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ls= findViewById(R.id.listview);

        map = new HashMap<String,String>();
        map.put("ville","sfax");
        map.put("type","Gare");
        map.put("img",String.valueOf(R.mipmap.ic_launcher_round));
        map.put("adresse", "adresse gare de sfax");
        values.add(map);

        map = new HashMap<String,String>();
        map.put("ville","Sejnane");
        map.put("type","gare");
        map.put("img",String.valueOf(R.mipmap.ic_launcher_round));
        map.put("adresse", "adresse gare de Sejnane ");
        values.add(map);




        SimpleAdapter adapter=new SimpleAdapter(MainActivity.this,values,R.layout.item,
               new String[]{"ville","type","img"},new int[]{R.id.textView,R.id.textView2,R.id.img} );
        ls.setAdapter(adapter);
        ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        HashMap<String,String> m=new HashMap<String, String>();
        ls.getAdapter().getItem(position);
        HashMap<String,String> item = (HashMap<String,String>) ls.getItemAtPosition(position);
        String adresse = item.get("adresse");
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("ville",item.get("ville"));
        intent.putExtra("adresse", adresse);
        startActivity(intent);
    }
});

        ls.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                HashMap<String,String> item = (HashMap<String,String>) ls.getItemAtPosition(position);
                a = item.get("adresse");
                b = item.get("ville");

                return false;
            }
        });
        ls.setOnCreateContextMenuListener(this);



    }


    public void onCreateContextMenu(ContextMenu menu, View v,ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu , v,menuInfo);
        menu.add(0, 1, 0,"visiter le site web");
        menu.add(0, 2, 0,"Allez au gare activity");
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case 1:
                Intent siteIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sncft.com.tn/ar/"));
                startActivity(siteIntent);
                Toast.makeText(this, "site", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Intent intent = new Intent(MainActivity.this, GareActivity.class);
                intent.putExtra("ville",b);
                intent.putExtra("adresse", a);
                startActivity(intent);
                break;
            default: return super.onContextItemSelected(item);
        }
        return super.onOptionsItemSelected(item);

    }




}