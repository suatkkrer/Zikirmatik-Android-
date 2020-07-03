package com.example.zikirmatik;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class esmaulHusnaOkunus extends AppCompatActivity {

    Button buttonEsm,buttonRes;
    TextView esmTextView,tesbihText;
    int number;
    String adetler;
    Vibrator vibrator;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esmaul_husna_okunus);

        sharedPreferences = this.getSharedPreferences("com.example.zikirmatik", Context.MODE_PRIVATE);


        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
        buttonEsm = findViewById(R.id.buttonEsm);
        buttonRes = findViewById(R.id.buttonRes);
        esmTextView = findViewById(R.id.esmTextView);
        tesbihText = findViewById(R.id.tesbihText);
        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        adetler = intent.getStringExtra("adetler");
        String tesbih = intent.getStringExtra("tesbih");
        esmTextView.setText(adetler);
        number = Integer.parseInt(esmTextView.getText().toString());
        int storedNumber = sharedPreferences.getInt("key",number);
        esmTextView.setText(String.valueOf(storedNumber));
        tesbihText.setText("Tesbih Niyeti: " + tesbih);
        this.setTitle(title);
        // KEY YERINE HER BIRI ICIN FARKLI KEY KULLAN


    }

    public void value(View view) {
        final Animation animation = AnimationUtils.loadAnimation(this,R.anim.bounce);
        number -= 1;
        vibrator.vibrate(100);
        esmTextView.setText(String.valueOf(number));
        sharedPreferences.edit().putInt("key",number).apply();
        buttonEsm.startAnimation(animation);
    }

    public void reset(View view) {
        final Animation animation = AnimationUtils.loadAnimation(this,R.anim.bounce);
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        buttonRes.startAnimation(animation);
        alert.setTitle("Sıfırla");
        alert.setMessage("Zikirlerinizini sıfırlamak istediğinize emin misiniz?");
        alert.setPositiveButton("Evet", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                number = Integer.parseInt(adetler);
                esmTextView.setText(String.valueOf(number));
            }
        });
        alert.setNegativeButton("Hayır", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(esmaulHusnaOkunus.this,"Zikirleriniz sıfırlanmadı!!",Toast.LENGTH_LONG).show();
            }
        });
        alert.create().show();
    }
}