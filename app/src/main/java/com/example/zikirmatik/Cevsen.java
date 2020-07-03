package com.example.zikirmatik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Cevsen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cevsen);

        this.setTitle("Cevşen");
    }

    public void cevsenTr(View view) {
        Intent intent = new Intent(Cevsen.this,cevsenTr.class);
        startActivity(intent);
    }

    public void cevsenAr(View view) {
        Intent intent = new Intent(Cevsen.this,cevsenAr.class);
        startActivity(intent);
    }
}