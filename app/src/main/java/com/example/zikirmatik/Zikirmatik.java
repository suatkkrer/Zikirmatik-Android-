package com.example.zikirmatik;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import android.provider.MediaStore;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Zikirmatik extends AppCompatActivity {

    Button zikirButton,resetButton,buttonHedef;
    TextView zikirText,hedefler;
    Vibrator vibrator;
    ImageView imageSound,imageVibration,imageColor,zikirView,trueView,falseView,imageHedef;
    EditText hedefText;
    SharedPreferences sharedPreferenceszikir;
    int numbZikir;
    int textNumber = 0;
    int storedZikir;
    int currentSoundImage;
    int currentVibImage;
    int currentColorImage;
    int currentChangeColor;
    int[] soundImages = {R.drawable.soundon,R.drawable.soundoff};
    int[] vibImages = {R.drawable.vibon,R.drawable.viboff};
    int[] zikirColorImages = {R.drawable.zikirbordo,R.drawable.zikirpembe,R.drawable.zikirsari,R.drawable.zikirturuncu,R.drawable.zikiryesil,R.drawable.zikir};
    int[] changeColor = {R.drawable.coloricon,R.drawable.changecolor};
    int sesSayac = 1;
    int vibSayac = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zikirmatik);

        sharedPreferenceszikir = this.getSharedPreferences("com.example.zikirmatik", Context.MODE_PRIVATE);

        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);

        imageHedef = findViewById(R.id.imageHedef);
        buttonHedef = findViewById(R.id.buttonHedef);
        hedefler = findViewById(R.id.hedefler);
        trueView = findViewById(R.id.trueView);
        falseView = findViewById(R.id.falseView);
        hedefText = findViewById(R.id.hedefText);
        zikirButton = findViewById(R.id.buttonZikir);
        resetButton = findViewById(R.id.buttonReset);
        zikirText = findViewById(R.id.zikirText);
        imageSound = findViewById(R.id.imageSound);
        imageVibration = findViewById(R.id.imageVibration);
        imageColor = findViewById(R.id.imageColor);
        zikirView = findViewById(R.id.imageView);

        storedZikir = sharedPreferenceszikir.getInt("zikir", numbZikir);
        zikirText.setText(String.valueOf(storedZikir));

    }

    public void zikir(View view) {
        final Animation animation = AnimationUtils.loadAnimation(this,R.anim.bounce);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.ses);
        storedZikir += 1;
        if (vibSayac == 1){
            vibrator.vibrate(100);
        }
       if (sesSayac == 1){
            mediaPlayer.start();
        }
       if (textNumber != 0 ){
           zikirText.setText(String.valueOf(storedZikir));
           numbZikir = storedZikir;
           sharedPreferenceszikir.edit().putInt("zikir", numbZikir).apply();
           if (textNumber == storedZikir){
               vibrator.vibrate(1500);
               AlertDialog.Builder alert = new AlertDialog.Builder(this);
               alert.setTitle("Hedefe Ulaştınız");
               alert.setMessage("Hedefe Ulaştınız zikirlerinizi sıfırlamak ister misiniz?");
               alert.setPositiveButton("Evet", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialog, int which) {
                       zikirText.setText(String.valueOf(0));
                       storedZikir = 0;
                       numbZikir = 0;
                       sharedPreferenceszikir.edit().putInt("zikir", numbZikir).apply();
                       hedefler.setText("");
                       textNumber = 0;
                   }
               });
               alert.setNegativeButton("Hayır", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialog, int which) {
                       Toast.makeText(Zikirmatik.this, "Zikirlerinize kaldığınız yerden devam edebilirsiniz. Hedefiniz sıfırlandı.", Toast.LENGTH_SHORT).show();
                       textNumber = 0;
                       hedefler.setText("");
                   }
               });
               alert.create().show();
           }
       } else {
           zikirText.setText(String.valueOf(storedZikir));
           numbZikir = storedZikir;
           sharedPreferenceszikir.edit().putInt("zikir", numbZikir).apply();
       }
        zikirButton.startAnimation(animation);
    }

    public void reset(View view) {
        final Animation animation = AnimationUtils.loadAnimation(this,R.anim.bounce);
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        resetButton.startAnimation(animation);
        alert.setTitle("Sıfırla");
        alert.setMessage("Zikirlerinizini sıfırlamak istediğinize emin misiniz?");
        alert.setPositiveButton("Evet", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                zikirText.setText(String.valueOf(0));
                storedZikir = 0;
                numbZikir = 0;
                sharedPreferenceszikir.edit().putInt("zikir", numbZikir).apply();
                hedefler.setText("");
            }
        });
        alert.setNegativeButton("Hayır", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(Zikirmatik.this,"Zikirleriniz sıfırlanmadı!!",Toast.LENGTH_LONG).show();
            }
        });
        alert.create().show();
    }

    public void buttonVibration(View view) {
        currentVibImage++;
        currentVibImage = currentVibImage % vibImages.length;
        imageVibration.setImageResource(vibImages[currentVibImage]);
        if (vibImages[currentVibImage] == R.drawable.vibon){
            vibSayac = 1;
        } else if (vibImages[currentVibImage] == R.drawable.viboff){
            vibSayac = 0;
        }

    }

    public void buttonSound(View view) {
        currentSoundImage++;
        currentSoundImage = currentSoundImage % soundImages.length;
        imageSound.setImageResource(soundImages[currentSoundImage]);
        if (soundImages[currentSoundImage] == R.drawable.soundon){
            sesSayac = 1;
        } else if (soundImages[currentSoundImage] == R.drawable.soundoff){
            sesSayac = 0;
        }
    }

    public void buttonColor(View view) {
        currentChangeColor++;
        currentColorImage++;
        currentChangeColor = currentChangeColor % changeColor.length;
        currentColorImage = currentColorImage % zikirColorImages.length;
        zikirView.setImageResource(zikirColorImages[currentColorImage]);
        imageColor.setImageResource(changeColor[currentChangeColor]);
    }

    public void buttonHedef(View view) {
        hedefText.setVisibility(View.VISIBLE);
        trueView.setVisibility(View.VISIBLE);
        falseView.setVisibility(View.VISIBLE);
        buttonHedef.setVisibility(View.INVISIBLE);
        imageHedef.setVisibility(View.INVISIBLE);
    }

    public void trueOnClick(View view) {
        if (hedefText.length() == 0 || hedefText.equals("") || hedefText == null){
            Toast.makeText(Zikirmatik.this,"Bu alan boş olamaz. Çıkmak için çarpıya basınız.",Toast.LENGTH_LONG).show();
        } else if (hedefText.length() > 4){
            Toast.makeText(Zikirmatik.this,"Lütfen maksimum 4 haneli sayı giriniz.",Toast.LENGTH_LONG).show();
        } else {

            if (Integer.parseInt(String.valueOf(hedefText.getText())) <= storedZikir) {
                Toast.makeText(Zikirmatik.this,"Girdiğiniz sayı mevcut zikirlerinizden fazla olduğu için, mevcut zikirleriniz sıfırlandı. ",Toast.LENGTH_LONG).show();
                zikirText.setText(String.valueOf(0));
                storedZikir = 0;
                numbZikir = 0;
                sharedPreferenceszikir.edit().putInt("zikir", numbZikir).apply();
                hedefler.setText("Hedef: " + hedefText.getText());
                textNumber = Integer.parseInt(String.valueOf(hedefText.getText()));
            } else if(storedZikir == 0) {
                hedefler.setText("Hedef: " + hedefText.getText());
                textNumber = Integer.parseInt(String.valueOf(hedefText.getText()));
            } else {

                AlertDialog.Builder alert = new AlertDialog.Builder(this);
                alert.setTitle("Sıfırla");
                alert.setMessage("Mevcut zikirlerinizin silinmesini ister misiniz?");
                alert.setPositiveButton("Evet", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        zikirText.setText(String.valueOf(0));
                        storedZikir = 0;
                        numbZikir = 0;
                        sharedPreferenceszikir.edit().putInt("zikir", numbZikir).apply();
                        hedefler.setText("Hedef: " + hedefText.getText());
                        textNumber = Integer.parseInt(String.valueOf(hedefText.getText()));
                    }
                });
                alert.setNegativeButton("Hayır", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        hedefler.setText("Hedef: " + hedefText.getText());
                        textNumber = Integer.parseInt(String.valueOf(hedefText.getText()));
                    }
                });
                alert.create().show();
            }
            hedefText.setVisibility(View.INVISIBLE);
            trueView.setVisibility(View.INVISIBLE);
            falseView.setVisibility(View.INVISIBLE);
            buttonHedef.setVisibility(View.VISIBLE);
            imageHedef.setVisibility(View.VISIBLE);
        }
    }
    public void falseOnClick(View view) {
        hedefText.setVisibility(View.INVISIBLE);
        trueView.setVisibility(View.INVISIBLE);
        falseView.setVisibility(View.INVISIBLE);
        buttonHedef.setVisibility(View.VISIBLE);
        imageHedef.setVisibility(View.VISIBLE);
    }
}
