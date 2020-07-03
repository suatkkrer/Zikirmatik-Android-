package com.example.zikirmatik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DuaSureAsr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dua_sure_asr);

        this.setTitle("Dualar, Sureler ve Aşr-ı Şerifler");
    }
    public void sureler(View view){
        Intent intent = new Intent(DuaSureAsr.this,DualarSureler.class);
        startActivity(intent);
    }
    public void dualar(View view){
        Intent intent = new Intent(DuaSureAsr.this,Dualar.class);
        startActivity(intent);
    }
    public void asrlar(View view){
        Intent intent = new Intent(DuaSureAsr.this,Asrlar.class);
        startActivity(intent);
    }
}