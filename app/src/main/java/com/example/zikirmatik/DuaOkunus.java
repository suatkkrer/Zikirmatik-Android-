package com.example.zikirmatik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.zikirmatik.Dualar.selectedDua;

public class DuaOkunus extends AppCompatActivity {

    public int sayac = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dua_okunus);


        TextView duaOkunusText = findViewById(R.id.duaOkunusText);
//        TextView duaOkunusText2 = findViewById(R.id.duaOkunusText2);
        ImageView imageViewDua = findViewById(R.id.imageViewDua);

        Intent intent = getIntent();
        String okunus = intent.getStringExtra("name");
//        String arabOkunus = intent.getStringExtra("arabic");
        String title = intent.getStringExtra("title");

        duaOkunusText.setText(okunus);
//        duaOkunusText2.setText(arabOkunus);
        imageViewDua.setImageBitmap(selectedDua);
        this.setTitle(title);
    }

}