package com.example.zikirmatik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class cevsenAr extends AppCompatActivity {

    static Bitmap selectedCevs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cevsen_ar);

        ListView arCevsenList = findViewById(R.id.arCevsenList);
        this.setTitle("Cevşen Arapça");

        final ArrayList<String> bablar = new ArrayList<>();

        bablar.add(" Bab 1-2");
        bablar.add(" Bab 3-4");
        bablar.add(" Bab 5-6");
        bablar.add(" Bab 7-8-9");
        bablar.add(" Bab 10-11");
        bablar.add(" Bab 12-13-14");
        bablar.add(" Bab 15-16");
        bablar.add(" Bab 17-18-19");
        bablar.add(" Bab 19-20-21");
        bablar.add(" Bab 22-23");
        bablar.add(" Bab 24-25");
        bablar.add(" Bab 26-27-28");
        bablar.add(" Bab 29-30-31");
        bablar.add(" Bab 31-32-33");
        bablar.add(" Bab 34-35-36");
        bablar.add(" Bab 36-37-38");
        bablar.add(" Bab 39-40");
        bablar.add(" Bab 41-42-43");
        bablar.add(" Bab 43-44-45");
        bablar.add(" Bab 46-47-48");
        bablar.add(" Bab 48-49-50");
        bablar.add(" Bab 51-52");
        bablar.add(" Bab 53-54-55");
        bablar.add(" Bab 55-56-57");
        bablar.add(" Bab 57-58-59");
        bablar.add(" Bab 60-61");
        bablar.add(" Bab 62-63-64");
        bablar.add(" Bab 65-66");
        bablar.add(" Bab 66-67-68");
        bablar.add(" Bab 69-70");
        bablar.add(" Bab 71-72-73");
        bablar.add(" Bab 74-75");
        bablar.add(" Bab 75-76-77");
        bablar.add(" Bab 77-78-79");
        bablar.add(" Bab 80-81-82");
        bablar.add(" Bab 82-83-84");
        bablar.add(" Bab 85-86");
        bablar.add(" Bab 87-88-89");
        bablar.add(" Bab 89-90-91");
        bablar.add(" Bab 91-92-93");
        bablar.add(" Bab 93-94-95");
        bablar.add(" Bab 96-97");
        bablar.add(" Bab 98-99");
        bablar.add(" Bab 100- Dua(1.Sayfa)");
        bablar.add(" Dua(2.Sayfa)");
        bablar.add(" Dua(3.Sayfa)");

        Bitmap a = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.a);
        Bitmap b = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.b);
        Bitmap c = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.c);
        Bitmap d = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.d);
        Bitmap e = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.e);
        Bitmap f = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.f);
        Bitmap g = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.g);
        Bitmap h = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.h);
        Bitmap i = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.i);
        Bitmap j = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.j);
        Bitmap k = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.k);
        Bitmap l = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.l);
        Bitmap m = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.m);
        Bitmap n = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.n);
        Bitmap o = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.o);
        final Bitmap p = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.p);
        Bitmap r = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.r);
        Bitmap s = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.s);
        Bitmap t = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.t);
        Bitmap u = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.u);
        Bitmap v = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.v);
        Bitmap y = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.y);
        Bitmap z = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.z);
        Bitmap za = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.za);
        Bitmap zb = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.zb);
        Bitmap zc = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.zc);
        Bitmap zd = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.zd);
        Bitmap ze = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.ze);
        Bitmap zf = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.zf);
        Bitmap zg = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.zg);
        Bitmap zh = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.zh);
        Bitmap zi = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.zi);
        Bitmap zj = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.zj);
        Bitmap zk = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.zk);
        Bitmap zl = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.zl);
        Bitmap zm = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.zm);
        Bitmap zn = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.zn);
        Bitmap zo = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.zo);
        Bitmap zp = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.zp);
        Bitmap zr = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.zr);
        Bitmap zs = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.zs);
        Bitmap zt = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.zt);
        Bitmap zu = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.zu);
        Bitmap zv = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.zv);
        Bitmap zy = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.zy);
        Bitmap zz = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.zz);


        final ArrayList<Bitmap> cevsImages = new ArrayList<>();

        cevsImages.add(a);
        cevsImages.add(b);
        cevsImages.add(c);
        cevsImages.add(d);
        cevsImages.add(e);
        cevsImages.add(f);
        cevsImages.add(g);
        cevsImages.add(h);
        cevsImages.add(i);
        cevsImages.add(j);
        cevsImages.add(k);
        cevsImages.add(l);
        cevsImages.add(m);
        cevsImages.add(n);
        cevsImages.add(o);
        cevsImages.add(p);
        cevsImages.add(r);
        cevsImages.add(s);
        cevsImages.add(t);
        cevsImages.add(u);
        cevsImages.add(v);
        cevsImages.add(y);
        cevsImages.add(z);
        cevsImages.add(za);
        cevsImages.add(zb);
        cevsImages.add(zc);
        cevsImages.add(zd);
        cevsImages.add(ze);
        cevsImages.add(zf);
        cevsImages.add(zg);
        cevsImages.add(zh);
        cevsImages.add(zi);
        cevsImages.add(zj);
        cevsImages.add(zk);
        cevsImages.add(zl);
        cevsImages.add(zm);
        cevsImages.add(zn);
        cevsImages.add(zo);
        cevsImages.add(zp);
        cevsImages.add(zr);
        cevsImages.add(zs);
        cevsImages.add(zt);
        cevsImages.add(zu);
        cevsImages.add(zv);
        cevsImages.add(zy);
        cevsImages.add(zz);
        cevsImages.add(zv);

        ArrayAdapter arrayAdapter = new ArrayAdapter(cevsenAr.this,R.layout.surelayout,bablar);
        arCevsenList.setAdapter(arrayAdapter);

        arCevsenList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(),CevsenArOkunus.class);
                selectedCevs = cevsImages.get(position);
                intent.putExtra("title",bablar.get(position));
                startActivity(intent);
            }
        });


    }

}