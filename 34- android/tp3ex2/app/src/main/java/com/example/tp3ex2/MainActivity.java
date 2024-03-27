package com.example.tp3ex2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
RadioGroup Gender ;
RadioButton Female , Male ;
Button display ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gender = findViewById(R.id.gender) ;
        Female = findViewById(R.id.female) ;
        Male = findViewById(R.id.male) ;
        display= findViewById(R.id.display) ;
        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = Gender.getCheckedRadioButtonId();
                RadioButton rb=findViewById(x);
                Toast.makeText(MainActivity.this,rb.getText()+" button is checked",Toast.LENGTH_SHORT).show();
            }
        });
        display.setOnLongClickListener(new View.OnLongClickListener(){
            public boolean onLongClick(View view){
                return false;
            }
        });
        display.setOnCreateContextMenuListener(this);
    }
           @Override
    public void onCreateContextMenu(ContextMenu menu, View v , ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.add(0, 1, 0,"F->M");
        menu.add(0, 2, 0,"M->F");
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case 1:
                RadioButton m=findViewById(R.id.male);
                m.setChecked(true);
                break;
            case 2:
                RadioButton f=findViewById(R.id.female);
                f.setChecked(true);
                break;

        }
                return super.onOptionsItemSelected(item);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 1, 0,"F->M");
        menu.add(0, 2, 0,"M->F");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId())
        {
            case 1:
                RadioButton m=findViewById(R.id.male);
                m.setChecked(true);
                break;
            case 2:
                RadioButton f=findViewById(R.id.female);
                f.setChecked(true);
                break;

        }

        return super.onOptionsItemSelected(item);
    }

}