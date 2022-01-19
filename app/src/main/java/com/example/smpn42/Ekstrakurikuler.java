package com.example.smpn42;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Ekstrakurikuler extends AppCompatActivity {

    CardView cvPaskibra;
    CardView cvPramuka;
    CardView cvOsis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekstrakurikuler);

        cvPaskibra = (CardView) findViewById(R.id.Paskibra);
        cvPaskibra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ekstrakurikuler.this, PaskibraActivity.class);
                startActivity(intent);
            }
        });

        cvPramuka = (CardView) findViewById(R.id.Pramuka);
        cvPramuka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ekstrakurikuler.this, PramukaActivity.class);
                startActivity(intent);
            }
        });

        cvOsis = (CardView) findViewById(R.id.Osis);
        cvOsis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ekstrakurikuler.this, OsisActivity.class);
                startActivity(intent);
            }
        });

        getSupportActionBar().hide();
    }
}