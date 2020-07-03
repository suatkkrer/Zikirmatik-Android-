package com.example.zikirmatik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import static com.example.zikirmatik.cevsenAr.selectedCevs;

public class CevsenArOkunus extends AppCompatActivity {

    ImageView cevsenArOkunusImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cevsen_ar_okunus);

        cevsenArOkunusImage = findViewById(R.id.cevsenArOkunusImage);

        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        cevsenArOkunusImage.setImageBitmap(selectedCevs);
        this.setTitle(title);

    }
}