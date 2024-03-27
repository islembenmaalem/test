package com.example.listvientp4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class GareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gare);
        String adresse = getIntent().getStringExtra("adresse");
        TextView textView = findViewById(R.id.txt1);
        textView.setText(adresse);

        String ville = getIntent().getStringExtra("ville");
        TextView textView2 = findViewById(R.id.txt2);
        textView2.setText("la ville est "+ville);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(Menu.NONE, 1, Menu.NONE, "Appeler");
        menu.add(Menu.NONE, 2, Menu.NONE, "Quitter");

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 1:
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + "71334444"));
                startActivity(intent);
                return true;
            case 2:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}