package com.example.percolator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView rvalor1, rresultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        rvalor1 = findViewById(R.id.tvvalor1r);
        rresultado = findViewById(R.id.tvresultador);

        rvalor1.setText(getIntent().getStringExtra("evalor1"));
        rresultado.setText(getIntent().getStringExtra("eresultado"));

    }
}