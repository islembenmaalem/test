package com.example.myapplicationrevisionpourexemen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
RadioButton r1,r2;
CheckBox c1,c2;
Button verif,b,edit;
EditText nom,password;
String message="";
    String m="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1=findViewById(R.id.rad1);
        r2=findViewById(R.id.rad2);
        c1=findViewById(R.id.c1);
        c2=findViewById(R.id.c2);
        b=findViewById(R.id.b);
        verif=findViewById(R.id.verif);
        edit=findViewById(R.id.edit);
        nom=findViewById(R.id.nom);
        password=findViewById(R.id.password);
        message="";
       b.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if (c1.isChecked()){
                   message +=" "+ c1.getText().toString();
               }
               if (c2.isChecked()){
                   message+=" "+c2.getText().toString();
               }
               if (r1.isChecked()){
                   message +=" "+r1.getText().toString();
               }
               if (r2.isChecked()){
                   message +=" "+r2.getText().toString();
               }
               Toast.makeText(MainActivity.this,message,Toast.LENGTH_SHORT).show();

           }
       });
       m="";
       verif.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v){
               if (nom.getText().toString().equals("")||!(nom.getText().toString().equals("islem"))){
                   m+="verifier le nom";

               }
               if (password.getText().toString().equals("")||!(password.getText().toString().equals("islem"))){
                   m+="verifier le password";

               }
               Toast.makeText(MainActivity.this,m,Toast.LENGTH_SHORT).show();
               if (m.equals("")){
                   AlertDialog.Builder alert =new AlertDialog.Builder(MainActivity.this);
                   alert.setTitle("verif");
                   alert.setMessage("verifier le password");
                   alert.setPositiveButton("verif", new DialogInterface.OnClickListener() {
                               @Override
                               public void onClick(DialogInterface dialog, int which) {
                                   Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                                   intent.putExtra("nom",nom.getText().toString());
                                   intent.putExtra("password",password.getText().toString());
                                   startActivity(intent);
                               }
                           });
                   alert.show();


               }
           }
       });
edit.setOnCreateContextMenuListener(this);
edit.setOnLongClickListener(new View.OnLongClickListener() {
    @Override
    public boolean onLongClick(View v) {
        Toast.makeText(MainActivity.this,"long",Toast.LENGTH_SHORT).show();

        return false;
    }
});


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,1,0,"menu1");
        menu.add(0,2,0,"menu2");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case 1:{
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
                startActivity(i);
        }
            case 2:
                finishAffinity();
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        menu.add(0,1,0,"menu1");

        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case 1:{
                Toast.makeText(MainActivity.this,"wow",Toast.LENGTH_SHORT).show();

            }
        }
        return super.onContextItemSelected(item);

    }

}