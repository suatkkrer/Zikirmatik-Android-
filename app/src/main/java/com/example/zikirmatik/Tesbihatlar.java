package com.example.zikirmatik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Tesbihatlar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tesbihatlar);

        TextView tesbihatText = findViewById(R.id.tesbihatText);

        Intent intent = getIntent();
        String tes = intent.getStringExtra("name");
        String title = intent.getStringExtra("title");
        tesbihatText.setText(tes);
        this.setTitle(title);
    }
}