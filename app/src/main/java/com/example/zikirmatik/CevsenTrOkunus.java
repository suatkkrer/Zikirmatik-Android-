package com.example.zikirmatik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CevsenTrOkunus extends AppCompatActivity {

    TextView trCevsenText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cevsen_tr_okunus);

        trCevsenText = findViewById(R.id.trCevsenText);

        Intent intent = getIntent();
        String okunus = intent.getStringExtra("bablar");
        String title = intent.getStringExtra("title");
        this.setTitle(title);
        trCevsenText.setText(okunus);

    }
}