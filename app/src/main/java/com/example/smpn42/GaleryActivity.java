package com.example.smpn42;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GaleryActivity extends AppCompatActivity {

    CardView cvUpacara;
    CardView cvPerjusa;
    CardView cvSenam;
    CardView cvArtshow;
    CardView cvSpiritspada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galery);
        cvUpacara = findViewById(R.id.Upacara);
        cvPerjusa = findViewById(R.id.Perjusa);
        cvSenam = findViewById(R.id.Senam);
        cvArtshow = findViewById(R.id.Artshow);
        cvSpiritspada = findViewById(R.id.Spiritspada);

        cvUpacara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GaleryActivity.this,UpacaraActivity.class);
                startActivity(intent);
            }
        });

        cvPerjusa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GaleryActivity.this,PerjusaActivity.class);
                startActivity(intent);
            }
        });

        cvSenam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GaleryActivity.this,SenamActivity.class);
                startActivity(intent);
            }
        });

        cvArtshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GaleryActivity.this,ArtshowActivity.class);
                startActivity(intent);
            }
        });

        cvSpiritspada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GaleryActivity.this,SpiritspadaActivity.class);
                startActivity(intent);
            }
        });
    }
}