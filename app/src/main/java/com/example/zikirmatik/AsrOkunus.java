package com.example.zikirmatik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import static com.example.zikirmatik.Asrlar.selectedAsr;

public class AsrOkunus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asr_okunus);

//        TextView asrOkunusTextAr = findViewById(R.id.asrOkunusTextAr);
        TextView asrOkunusText = findViewById(R.id.asrOkunusText);
        ImageView asrOkunusView = findViewById(R.id.asrOkunusView);

        Intent intent = getIntent();
        String okunus = intent.getStringExtra("name");
//        String arabOkunus = intent.getStringExtra("arabic");
        String title = intent.getStringExtra("title");
        this.setTitle(title);
        asrOkunusText.setText(okunus);
        asrOkunusView.setImageBitmap(selectedAsr);
//        asrOkunusTextAr.setText(arabOkunus);

    }
}