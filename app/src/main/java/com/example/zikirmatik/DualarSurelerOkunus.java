package com.example.zikirmatik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.zikirmatik.DualarSureler.selectedImage;

public class DualarSurelerOkunus extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dualar_sureler_okunus);


        TextView sureOkunusText = findViewById(R.id.sureOkunusText);
//        TextView sureOkunusText2 = findViewById(R.id.sureOkunusTextAr);
        ImageView imageViewSure = findViewById(R.id.imageViewSure);

        Intent intent = getIntent();
        String okunus = intent.getStringExtra("name");
        String arabOkunus = intent.getStringExtra("arabic");
        String title = intent.getStringExtra("title");
        sureOkunusText.setText(okunus);
//        sureOkunusText2.setText(arabOkunus);
        imageViewSure.setImageBitmap(selectedImage);
        this.setTitle(title);
    }
}