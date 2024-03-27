package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    private CardView cardView;
    private ImageView imageView;
    private TextView titleText;
    private TextView descriptionText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}