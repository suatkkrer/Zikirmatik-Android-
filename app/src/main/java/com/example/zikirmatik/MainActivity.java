package com.example.zikirmatik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button tesbihatlar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setTitle("Ana Sayfa");

        tesbihatlar = findViewById(R.id.tesbihatButton);

    }

    public void tesbihatlar(View view){

        Intent intent = new Intent(MainActivity.this,NamazTesbihatlari.class);
        startActivity(intent);

    }

    public void duaSureAsr(View view){

        Intent intent = new Intent(MainActivity.this,DuaSureAsr.class);
        startActivity(intent);

    }

    public void esmButton(View view){
        Intent intent = new Intent(MainActivity.this,esmaulhusna.class);
        startActivity(intent);
    }


    public void cevsenClick(View view) {
        Intent intent = new Intent(MainActivity.this,Cevsen.class);
        startActivity(intent);
    }

    public void zikirmatik(View view) {
        Intent intent = new Intent(MainActivity.this,Zikirmatik.class);
        startActivity(intent);
    }
}