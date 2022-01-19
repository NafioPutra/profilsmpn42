package com.example.smpn42;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        PDFView pdfView = findViewById(R.id.pdf_view);
        pdfView.fromAsset("sambutan.pdf")
                .enableSwipe(true)
                .enableDoubletap(true)
                .load();
    }
}