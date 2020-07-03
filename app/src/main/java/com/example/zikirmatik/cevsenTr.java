package com.example.zikirmatik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class cevsenTr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cevsen_tr);

        ListView trCevsenList = findViewById(R.id.trCevsenList);
        this.setTitle("Cevşen Türkçe");

        final ArrayList<String> bab = new ArrayList<>();

        bab.add(" Bab 1");
        bab.add(" Bab 2");
        bab.add(" Bab 3");
        bab.add(" Bab 4");
        bab.add(" Bab 5");
        bab.add(" Bab 6");
        bab.add(" Bab 7");
        bab.add(" Bab 8");
        bab.add(" Bab 9");
        bab.add(" Bab 10");
        bab.add(" Bab 11");
        bab.add(" Bab 12");
        bab.add(" Bab 13");
        bab.add(" Bab 14");
        bab.add(" Bab 15");
        bab.add(" Bab 16");
        bab.add(" Bab 17");
        bab.add(" Bab 18");
        bab.add(" Bab 19");
        bab.add(" Bab 20");
        bab.add(" Bab 21");
        bab.add(" Bab 22");
        bab.add(" Bab 23");
        bab.add(" Bab 24");
        bab.add(" Bab 25");
        bab.add(" Bab 26");
        bab.add(" Bab 27");
        bab.add(" Bab 28");
        bab.add(" Bab 29");
        bab.add(" Bab 30");
        bab.add(" Bab 31");
        bab.add(" Bab 32");
        bab.add(" Bab 33");
        bab.add(" Bab 34");
        bab.add(" Bab 35");
        bab.add(" Bab 36");
        bab.add(" Bab 37");
        bab.add(" Bab 38");
        bab.add(" Bab 39");
        bab.add(" Bab 40");
        bab.add(" Bab 41");
        bab.add(" Bab 42");
        bab.add(" Bab 43");
        bab.add(" Bab 44");
        bab.add(" Bab 45");
        bab.add(" Bab 46");
        bab.add(" Bab 47");
        bab.add(" Bab 48");
        bab.add(" Bab 49");
        bab.add(" Bab 50");
        bab.add(" Bab 51");
        bab.add(" Bab 52");
        bab.add(" Bab 53");
        bab.add(" Bab 54");
        bab.add(" Bab 55");
        bab.add(" Bab 56");
        bab.add(" Bab 57");
        bab.add(" Bab 58");
        bab.add(" Bab 59");
        bab.add(" Bab 60");
        bab.add(" Bab 61");
        bab.add(" Bab 62");
        bab.add(" Bab 63");
        bab.add(" Bab 64");
        bab.add(" Bab 65");
        bab.add(" Bab 66");
        bab.add(" Bab 67");
        bab.add(" Bab 68");
        bab.add(" Bab 69");
        bab.add(" Bab 70");
        bab.add(" Bab 71");
        bab.add(" Bab 72");
        bab.add(" Bab 73");
        bab.add(" Bab 74");
        bab.add(" Bab 75");
        bab.add(" Bab 76");
        bab.add(" Bab 77");
        bab.add(" Bab 78");
        bab.add(" Bab 79");
        bab.add(" Bab 80");
        bab.add(" Bab 81");
        bab.add(" Bab 82");
        bab.add(" Bab 83");
        bab.add(" Bab 84");
        bab.add(" Bab 85");
        bab.add(" Bab 86");
        bab.add(" Bab 87");
        bab.add(" Bab 88");
        bab.add(" Bab 89");
        bab.add(" Bab 90");
        bab.add(" Bab 91");
        bab.add(" Bab 92");
        bab.add(" Bab 93");
        bab.add(" Bab 94");
        bab.add(" Bab 95");
        bab.add(" Bab 96");
        bab.add(" Bab 97");
        bab.add(" Bab 98");
        bab.add(" Bab 99");
        bab.add(" Bab 100");
        bab.add(" Dua");

        final ArrayList<String> babOkunus = new ArrayList<>();

        babOkunus.add("Allâhümme innî es’elüke biesmâike\n" +
                "\n" +
                "1- Yâ Allah\n" +
                "2- Yâ Rahman\n" +
                "3- YâRahîm\n" +
                "4- Yâ’Alîm\n" +
                "5- Yâ Halîm\n" +
                "6- Yâ Azîm\n" +
                "7- Yâ Hakîm\n" +
                "8- Yâ Kadîm\n" +
                "9- Yâ Mukîm\n" +
                "10- Yâ Kerîm\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne hallisnâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Seyyide’s-sâdât\n" +
                "2- Yâ Mucîbe’d-de’avât\n" +
                "3- Yâ Veliyye’l-hasenât\n" +
                "4- Yâ Refıa’d-deracât\n" +
                "5- Yâ Azîme’l-berakât\n" +
                "6- Yâ Ğafıra’l-hatîât\n" +
                "7- Yâ Dâfî’a’l-beliyyât\n" +
                "8- Yâ Sâmi’a’l-esvât\n" +
                "9- Yâ Mu’tıye’l-mesûlât\n" +
                "10- Yâ ‘Alime’s-sirri ve’l-hafiyyât\n" +
                "\n" +
                "Sübhâneke lâ ilahe illâ ente’l-emâ-ne’l-emâne hallisnâ mine’n-nar.”\n");
        babOkunus.add("1- Ya Hayra’l-ğâfirîn\n" +
                "2- Ya Hayra’n-nâsırîn\n" +
                "3- Ya Hayra’l-hâkimîn\n" +
                "4- Ya Hayra’l-fatihîn\n" +
                "5- Yâ Hayra’z-zâkirîn\n" +
                "6- Yâ Hayra’l-vârişîn\n" +
                "7- Yâ Hayra’l-hâmidîn\n" +
                "8- Yâ Hayra’r-râzikîn\n" +
                "9- Yâ Hayra’l-fâsilîn\n" +
                "10- Yâ Hayra’l-muhsinîn\n" +
                "\n" +
                "Sübhâneke lâ ilahe illâ ente’l-emâ-ne’l-emâne hallisnâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Men lehü’l-‘izzü ve’l-cemâl\n" +
                "2- Yâ Men lehü’l-mülkü ve’l-celâl\n" +
                "3- Yâ Men lehü’l-kudretü ve’l-kemâl\n" +
                "4- Yâ Men hüve’l-kebîru’l-müte’âl\n" +
                "5- Yâ Men hüve şedîdü’l-mihâl\n" +
                "6- Yâ Men hüve şedîdü’l-‘ikâb\n" +
                "7- Yâ Men hüve serî’u’l-hisâb\n" +
                "8- Yâ Men hüve ‘indehû hüsnü’s-şevâb\n" +
                "9- Yâ Men hüve ‘indehû ümmü’l-kitâb\n" +
                "10- Yâ Men hüve yünşiü’s-sehâbe’s-sikâl\n" +
                "\n" +
                "Sübhâneke lâ ilahe illâ ente’l-emâ-ne’l-emâne hallisnâ mine’n-nâr.”\n");
        babOkunus.add("Ve es’elüke biesmâike\n" +
                "1- Yâ Hannân\n" +
                "2- Yâ Mennân\n" +
                "3- Yâ Deyyân\n" +
                "4- Yâ Gufran\n" +
                "5- Yâ Burhan\n" +
                "6- Yâ Sultân\n" +
                "7- Yâ Sübhân\n" +
                "8- Yâ Müste’ân\n" +
                "9- Yâ Ze’l-menni ve’l-beyân\n" +
                "10- Yâ Ze’l-emân\n" +
                "\n" +
                "Sübhâneke lâ ilahe illâ ente’l-emâ-ne’l-emâne hallisnâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Men tevâda’a küllü şey’in li’azametih\n" +
                "2- Yâ Meni’stesleme küllü şey’in likudratih\n" +
                "3- Yâ Men zelle küllü şey’in li’izzetih\n" +
                "4- Yâ Men hada’a küllü şey’in liheybetih\n" +
                "5- Yâ Meni’nkâde küllü şey’in limülketih\n" +
                "6- Yâ Men dâne küllü şey’in min mehâfetih\n" +
                "7- Yâ Meni’nşakkati’l-cibâlü min haşyetin\n" +
                "8- Yâ Men kâmeti’s-semâvâtü bi emrih\n" +
                "9- Yâ Meni’stekarrati’l-ardu bi iznih\n" +
                "10- Yâ Men lâ yâ’tedî ‘alâ ehli memleketih\n" +
                "\n" +
                "Sübhâneke lâ ilahe illâ ente’l-emâ-ne’l-emâne hallisnâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Ğâfıra’l-hatâyâ\n" +
                "2- Yâ Kâşife’l-belâyâ\n" +
                "3- Yâ Müntehe’r-racâyâ\n" +
                "4- Yâ Müczile’l-‘atâyâ\n" +
                "5- Yâ Vâsi’a’l-hedâyâ\n" +
                "6- Yâ Râzika’l-berâyâ\n" +
                "7- Yâ Kâdiya’l-münâyâ\n" +
                "8- Yâ Sâmi’a’ş-şekâyâ\n" +
                "9- Yâ Bâ’ise’s-serâyâ\n" +
                "10- Yâ Mutlika’l-üsârâ\n" +
                "\n" +
                "Sübhâneke lâ ilahe illâ ente’l-emâ-ne’l-emâne hallisnâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Ze’l-hamdi ve’s-senâ\n" +
                "2- Yâ Ze’l-mecdi ve’s-senâ\n" +
                "3- Yâ Ze’l-fahri ve’l-behâ\n" +
                "4- Yâ Ze’l-‘ahdi ve’l-vefâ\n" +
                "5- Yâ Ze’l-‘afvi ve’r-ridâ\n" +
                "6- Yâ Ze’l-menni ve’l-‘atâ\n" +
                "7- Yâ Ze’l-fasli ve’l-kadâ\n" +
                "8- Yâ Ze’l-‘izzeti ve’l-bekâ\n" +
                "9- Yâ Ze’l-cûdi ve’n-na’mâ\n" +
                "10- Yâ Ze’l-fadli ve’l-‘âlâ\n" +
                "\n" +
                "Sübhâneke lâ ilahe illâ ente’l-emâ-ne’l-emâne hallisnâ mine’n-nâr.”\n");
        babOkunus.add("Ve es’elüke biesmâike\n" +
                "1- Yâ Mâni’\n" +
                "2- Yâ Dâfi’\n" +
                "3- Yâ Nâfi’\n" +
                "4- Yâ Sami’\n" +
                "5- Yâ Râfi’\n" +
                "6- Yâ Sâni’\n" +
                "7- Yâ Şâfi’\n" +
                "8- Yâ Cami’\n" +
                "9- Yâ Vâsi’\n" +
                "10- Yâ Mûsi’\n" +
                "\n" +
                "Sübhâneke lâ ilahe illâ ente’l-emâ-ne’l-emâne hallisnâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Sâni’a külli masnû’\n" +
                "2- Yâ Halika külli mahlûk\n" +
                "3- Yâ Râzika külli merzûk\n" +
                "4- Yâ Mâlike külli memlûk\n" +
                "5- Yâ Kâşife külli mekrûb\n" +
                "6- Yâ Fârice külli mağmum\n" +
                "7- Yâ Râhime külli merhum\n" +
                "8- Yâ Nasıra külli mahzûl\n" +
                "9- Yâ Sâtira külli mâ’yûb\n" +
                "10- Yâ Melcee külli mazlum\n" +
                "\n" +
                "Sübhâneke lâ ilahe illâ ente’l-emâ-ne’l-emâne hallisnâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ ‘Uddetî ‘inde şiddeti\n" +
                "2- Yâ Recâî ‘inde müsîbeti\n" +
                "3- Yâ Mûnisî ‘inde vahşeti\n" +
                "4- Yâ Sâhibî ‘inde gurbeti\n" +
                "5- Yâ Veliyyî ‘inde ni’metî\n" +
                "6- Yâ Kâşifi ‘inde kürbetî\n" +
                "7- Yâ Ğıyâşî ‘inde’f-tikârî\n" +
                "8- Yâ Melceî ‘inde’d-dırârî\n" +
                "9- Yâ Mu’înî ‘inde feze’î\n" +
                "10- Yâ Delîlî ‘inde hayrati\n" +
                "\n" +
                "Sübhâneke lâ ilahe illâ ente’l-emâ-ne’l-emâne hallisnâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ ‘Allâme’l-ğuyûb\n" +
                "2- Yâ Ğaffara’z-zünûb\n" +
                "3- Yâ Settâra’l-‘uyûb\n" +
                "4- Yâ Keşşâfe’l-kürûb\n" +
                "5- Yâ Mukallibe’l-kulûb\n" +
                "6- Yâ Müzeyyine’l-kulûb\n" +
                "7- Yâ Münevvira’l-kulûb\n" +
                "8- Yâ Tabîbe’l-kulûb\n" +
                "9- Yâ Habîbe’l-kulûb\n" +
                "10- Yâ Enîse’l-kulûb\n" +
                "\n" +
                "Sübhâneke lâ ilahe illâ ente’l-emâ-ne’l-emâne hallisnâ mine’n-nâr.”\n");
        babOkunus.add("Ve es’elüke biesmâike\n" +
                "1- Yâ Celîl\n" +
                "2- Yâ Cemîl\n" +
                "3- Yâ Vekîl\n" +
                "4- Yâ Kefil\n" +
                "5- Yâ Delîl\n" +
                "6- Yâ Mükîl\n" +
                "7- Yâ Habîr\n" +
                "8- Yâ Latîf\n" +
                "9- Yâ ‘Azîz\n" +
                "10- Yâ Melîk\n" +
                "\n" +
                "Sübhâneke lâ ilahe illâ ente’l-emâ-ne’l-emâne hallisnâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Delîle’l-mütehayyirîn\n" +
                "2- Yâ Gıyâşe’l-müsteğîşîn\n" +
                "3- Yâ Sarîha’l-müstesrihîn\n" +
                "4- Yâ Câra’l-müstecîrîn\n" +
                "5- Yâ Melcee’l-‘âsîn\n" +
                "6- Yâ Ğâfıra’l-müznibîn\n" +
                "7- Yâ Emâne’l-hâifîn\n" +
                "8- Yâ Râhime’l-mesâkîn\n" +
                "9- Yâ Enîse’l-müstevhişîn\n" +
                "10- Yâ Mücîbe da’veti’l-müdtarrîn\n" +
                "\n" +
                "Sübhâneke lâ ilahe illâ ente’l-emâ-ne’l-emâne hallisnâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Ze’l-cûdi ve’l-ihsân\n" +
                "2- Yâ Ze’l-fadli ve’l-imtinân\n" +
                "3- Yâ Ze’l-emni ve’l-emân\n" +
                "4- Yâ Ze’l-kudsi ve’s-sübhân\n" +
                "5- Yâ Ze’l-hikmeti ve’l-beyân\n" +
                "6- Yâ Ze’r-rahmeti ve’r-rıdvân\n" +
                "7- Yâ Ze’l-hucceti ve’l-bürhân\n" +
                "8- Yâ Ze’l-‘azameti ve’s-sultân\n" +
                "9- Yâ Ze’l-‘afvi ve’l-ğvıfrân\n" +
                "10- Yâ Ze’r-ra’feti ve’l-müste’ân\n" +
                "\n" +
                "Sübhâneke lâ ilahe illâ ente’l-emâ-ne’l-emâne hallisnâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Men hüve Rabbü külli şey’\n" +
                "2- Yâ Men hüve ilâhü külli şey’\n" +
                "3- Yâ Men hüve Hâliku külli şey’\n" +
                "4- Yâ Men hüve fevka külli şey’\n" +
                "5- Yâ Men hüve kable külli şey’\n" +
                "6- Yâ Men hüve ba’de külli şey’\n" +
                "7- Yâ Men hüve ‘Alimü külli şey’\n" +
                "8- Yâ Men hüve Kâdiru külli şey’\n" +
                "9- Yâ Men hüve Sâni’u külli şey’\n" +
                "10- Yâ Men hüve yebkâ veyefnâ küllü şey’\n" +
                "\n" +
                "Sübhâneke lâ ilahe illâ ente’l-emâ-ne’l-emâne hallisnâ mine’n-nâr.”\n");
        babOkunus.add("Ve es’elüke biesmâike\n" +
                "1- Yâ Mü’min\n" +
                "2- Yâ Müheymin\n" +
                "3- Yâ Mükevvin\n" +
                "4- Yâ Mülakkin\n" +
                "5- Yâ Mübeyyin\n" +
                "6- Yâ Mühevvin\n" +
                "7- Yâ Müzeyyin\n" +
                "8- Yâ Mu’azzim\n" +
                "9- Yâ Mu’avvin\n" +
                "10- Yâ Mülevvin\n" +
                "\n" +
                "Sübhâneke lâ ilahe illâ ente’l-emâ ne’l-emâne hallisnâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ men hüve fî mülkihî mükîm\n" +
                "2- Yâ men hüve fî celâlihî ‘azîm\n" +
                "3- Yâ men hüve fî sültânihî kadîm\n" +
                "4- Yâ men hüve ‘alâ ‘abdihî rahîm\n" +
                "5- Yâ men hüve bikülli şey’in ‘alîm\n" +
                "6- Yâ men hüve limen cefâhu halîm\n" +
                "7- Yâ men hüve limen teraccâhü kerîm\n" +
                "8- Yâ men hüve fî mekâdîrihî hakim\n" +
                "9- Yâ men hüve fi hükmihî latîf\n" +
                "10- Yâ men hüve fı lütfihî kadîr\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne hallisnâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ men la yürcâ illâ fadlüh\n" +
                "2- Yâ men lâ yühâfü illâ ‘adlüh\n" +
                "3- Yâ men lâ yüntezaru illa birruh\n" +
                "4- Yâ men lâ yüs’elü illâ ‘afvüh\n" +
                "5- Yâ men lâ yedûmü illâ mülküh\n" +
                "6- Yâ men lâ sültâne illâ sültânüh\n" +
                "7- Yâ men lâ bürhâne illâ bürhânüh\n" +
                "8- Yâ men vesiat külle şey’in rahmetüh\n" +
                "9- Yâ men sebekat rahmetühû ‘alâ ğadabih\n" +
                "10- Yâ men ehâta bi külli şey’in ‘ilmüh\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne hallisnâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Fârice’l-hemm\n" +
                "2- Yâ Kâşife’l-ğamm\n" +
                "3- Yâ Gâfire’z-zenb\n" +
                "4- Yâ Kâbile’t-tevb\n" +
                "5- Yâ Hâlika’l-halk\n" +
                "6- Yâ Sâdika’l-va’d\n" +
                "7- Yâ Râzika’t-tıfl\n" +
                "8- Yâ Mûfiye’l-‘ahd\n" +
                "9- Yâ ‘Alime’s-sirr\n" +
                "10- Yâ Fâlika’l-habb\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne hallisnâ mine’n-nâr.”\n");
        babOkunus.add("Ve es’elüke biesmâike\n" +
                "\n" +
                "1- Yâ ‘Aliyy\n" +
                "2- Yâ Vefiyy\n" +
                "3- Yâ Veliyy\n" +
                "4- Yâ Ganiyy\n" +
                "5- Yâ Meliyy\n" +
                "6- Yâ Zekiyy\n" +
                "7- Yâ Radiyy\n" +
                "8- Yâ Bediyy\n" +
                "9- Yâ HafIyy\n" +
                "10- Yâ Kaviyy\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne hallisnâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Men azhera’l-cemîl\n" +
                "2- Yâ Men setera ‘ale’l-kabîh\n" +
                "3- Yâ Men lâ yüâhizü bi’l-cerîmeh\n" +
                "4- Yâ Men lâ yehtikü’s-sitr\n" +
                "5- Yâ ‘Azîme’l-‘afv\n" +
                "6- Yâ Hasene’t-tecâvüz\n" +
                "7- Yâ Vâsi’a’l-mağfireh\n" +
                "8- Yâ Bâsita’l-yedeyni bi’r-rahmeh\n" +
                "9- Yâ Sahibe külli necvâ\n" +
                "10- Yâ Müntehâ külli şekva\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne hallisnâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Ze’n-ni’meti’s-sâbiğah\n" +
                "2- Yâ Ze’r-rahmeti’l-vâsi’ah\n" +
                "3- Yâ Ze’l-hikmeti’l-bâliğah\n" +
                "4- Yâ Ze’l-kudreti’l-kâmileh\n" +
                "5- Yâ Ze’l-hucceti’l-kâtı’ah\n" +
                "6- Yâ Ze’l-kerâmeti’z-zâhirah\n" +
                "7- YâZe’s-sıfati’l-‘âliyeh\n" +
                "8- YâZe’l-‘izzeti’d-dâimeh\n" +
                "9- Yâ Ze’l-kuvveti’l-metîneh\n" +
                "10- Yâ Ze’l-minneti’s-sâbikah\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ entei-emâ-ne’l-emâne hallisnâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Ahkeme’l-hâkimîn\n" +
                "2- Yâ ‘Adele’l-‘âdilîn\n" +
                "3- Yâ Asdeka’s-sâdikîn\n" +
                "4- Yâ Azhera’z-zâhirîn\n" +
                "5- Yâ Athera’t-tâhirîn\n" +
                "6- Yâ Ahsene’l-hâlikîn\n" +
                "7- Yâ Esra’a’l-hâsibîn\n" +
                "8- Yâ Esme’a’s-sâmi’în\n" +
                "9- Yâ Ekrame’l-ekramîn\n" +
                "10- Yâ Erhame’r-râhimîn\n" +
                "11- Yâ Eşfe’a’ş-şâfi’în\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne hallisnâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Bedi’a’s-semâvât\n" +
                "2- Yâ Câ’ile’z-zulümât\n" +
                "3- Yâ ‘A’lime’l-hafıyyât\n" +
                "4- Yâ Râhîme’l-‘aberât\n" +
                "5- Yâ Sâtira’l-‘averât\n" +
                "6- Yâ Kâşife’l-beliyyât\n" +
                "7- Yâ Muhyiye’l-emvât\n" +
                "8- Yâ Dâ’ife’l-hasenât\n" +
                "9- Yâ Münzile’l-berakât\n" +
                "10- Yâ Şedîde’n-nekamât\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne hallisnâ mine’n-nâr.”\n");
        babOkunus.add("Ve es’elüke biesmâike\n" +
                "\n" +
                "1- Yâ Müsavvir\n" +
                "2- YâMükaddir\n" +
                "3- Yâ Mütahhir\n" +
                "4- Yâ Münevvir\n" +
                "5- Yâ Mükaddim\n" +
                "6- Yâ Müahhir\n" +
                "7- Yâ Müyessir\n" +
                "8- Yâ Münzir\n" +
                "9- Yâ Mübeşşir\n" +
                "10- Yâ Müdebbir\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne hallisnâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Rabbe’l-beyti’l-harâm\n" +
                "2- Yâ Rabbe’ş-şehri’l-harâm\n" +
                "3- Yâ Rabbe’l-mescidi’l-harâm\n" +
                "4- Yâ Rabbe’l-beledi’l-harâm\n" +
                "5- Yâ Rabbe’r-rukni ve’l-mekâm\n" +
                "6- Yâ Rabbe’l-meş’ari’l-harâm\n" +
                "7- Yâ Rabbe’l-hılli ve’l-haram\n" +
                "8- Yâ Rabbe’n-nûri.ve’z-zalâm\n" +
                "9- Yâ Rabbe’t-tahiyyeti ve’s-selâm\n" +
                "10- Yâ Rabbe’l-celâli ve’l-ikrâm\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne hallisnâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ ‘İmâde men lâ ‘imâde leh\n" +
                "2- Yâ Senede men lâ senede leh\n" +
                "3- Yâ Zühra men lâ zühra leh\n" +
                "4- Yâ Giyâşe men lâ ğiyâşe leh\n" +
                "5- Yâ Hırze men lâ hırze leh\n" +
                "6- Yâ Fahra men lâ fahra leh\n" +
                "7- Yâ ‘İzze men lâ ‘izze leh\n" +
                "8- Yâ Mu’îne men lâ mu’îne leh\n" +
                "9- Yâ Enîse men lâ enîse leh\n" +
                "10- Yâ Gunyete men lâ gunyete leh\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne hallisnâ mine’n-nâr.”\n");
        babOkunus.add("Ve es’elüke biesmâike\n" +
                "1- Yâ Kâim\n" +
                "2- Yâ Dâim\n" +
                "3- Yâ Rahim\n" +
                "4- Yâ Hâkim\n" +
                "5- Yâ ‘Âlim\n" +
                "6- Yâ ‘Âsim\n" +
                "7- Yâ Kâsim\n" +
                "8- Yâ Salim\n" +
                "9- Yâ Kâbid\n" +
                "10- Yâ Basit\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne hallisnâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ ‘Âsıme-meni’sta’sameh\n" +
                "2- Yâ Râhime meni’sterhameh\n" +
                "3- Yâ Nasıra meni’stensarah\n" +
                "4- Yâ Hafıza meni’stahfezah\n" +
                "5- Yâ Mükrime meni’stekrameh\n" +
                "6- Yâ Mürşide meni’sterşedeh\n" +
                "7- Yâ Mu’îne meni’ste’âneh\n" +
                "8- Yâ Muğîşe meni’steğâşeh\n" +
                "9- Yâ Sarîha meni’stesrahah\n" +
                "10- Yâ Ğâfıra meni’stağferah\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne hallisnâ mine’rı-nâr.”\n");
        babOkunus.add("1- Yâ Kerîme’s-saftı\n" +
                "2- Yâ ‘Azîme’l-menn\n" +
                "3- Yâ Keşîra’l-hayr\n" +
                "4- Yâ Kadîme’l-fadl\n" +
                "5- Yâ Latîfe’s-sun’\n" +
                "6- Yâ Dâime’l-lütf\n" +
                "7- Yâ Nâfise’l-kerb\n" +
                "8- Yâ Kâşife’d-durr\n" +
                "9- Yâ Mâlike’l-mülk\n" +
                "10- Yâ Kâdiyen bi’l-hakk\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne ecirnâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ ‘Azîzen lâ yüdâm\n" +
                "2- Yâ Latîfen lâ yürâm\n" +
                "3- Yâ Rakîben lâ yenâm\n" +
                "4- Yâ Kaimen lâ yefût\n" +
                "5- Yâ Hayyen lâ yemût\n" +
                "6- Yâ Meliken lâyezûl\n" +
                "7- Yâ Bakiyen lâ yefnâ\n" +
                "8- Yâ ‘Alimen lâ yechel\n" +
                "9- Yâ Sameden lâ yüt’âm\n" +
                "10- Yâ Kaviyyen lâ yüd’af\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne ecirnâ mine’n-nâr.”\n");
        babOkunus.add("Ve es’elüke biesmâike\n" +
                "1- Yâ Vâhid\n" +
                "2- Yâ Vâcid\n" +
                "3- Yâ Şâhid\n" +
                "4- Yâ Mâcid\n" +
                "5- Yâ Râşid\n" +
                "6- Yâ Bâis\n" +
                "7- Yâ Vâris\n" +
                "8- Yâ Dârr\n" +
                "9- Yâ Nâfi’\n" +
                "10- Yâ Hâdî\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne ecirnâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ A’zamü min külli ‘azîm\n" +
                "2- Yâ Ekramü min külli kerîm\n" +
                "3- Yâ Erhamü min külli rahîm\n" +
                "4- Yâ Ahkemü min külli hakîm\n" +
                "5- Yâ Aİemü min külli ‘alîm\n" +
                "6- Yâ Akdemü min külli kadîm\n" +
                "7- Yâ Ekberu min külli kebîr\n" +
                "8- Yâ Ecellü min külli celîl\n" +
                "9- Yâ E’azzü min külli ‘azîz\n" +
                "10- Yâ Eltafü min külli latîf\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne ecirnâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Men hüve fî ‘ahdihî vefiyy\n" +
                "2- Yâ Men hüve fî vefaihî kaviyy\n" +
                "3- Yâ Men hüve fî kuvvetihi ‘aliyy\n" +
                "4- Yâ Men hüve fî ‘ulüvvihî karîb\n" +
                "5- Yâ Men hüve fî kurbihî latîf\n" +
                "6- Yâ Men hüve fî lütfıhî şerîf\n" +
                "7- Yâ Men hüve fî şerefîhî ‘azîz\n" +
                "8- Yâ Men hüve fî ‘izzetihî ‘azîm\n" +
                "9- Yâ Men hüve fî ‘azametihî mecîd\n" +
                "10- Yâ Men hüve fî mecdihî hamîd\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne ecirnâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Men hüve küllü şey’in hâdiun leh\n" +
                "2- Yâ Men hüve küllü şey’in kâinün leh\n" +
                "3- Yâ Men hüve küllü şey’in mevcudun leh\n" +
                "4- Yâ Men hüve küllü şey’in münîbün leh\n" +
                "5- Yâ Men hüve küllü şey’in hâifün minh\n" +
                "6- Yâ Men hüve küllü şey’in müsebbihun leh\n" +
                "7- Yâ Men hüve küllü şey’in kâimün bih\n" +
                "8- Yâ Men hüve küllü şey’in hâşiün leh\n" +
                "9- Yâ Men hüve küllü şey’in sâirun ileyh\n" +
                "10- Yâ men hüve küllü şey’in hâlikün illâ vecheh\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne ecirnâ mine’n-nâr.”\n");
        babOkunus.add("Ve es’elüke biesmâike\n" +
                "1- Yâ Kâfi\n" +
                "2- Yâ Şâfî\n" +
                "3- Yâ Vâfî\n" +
                "4- Yâ Mu’âfî\n" +
                "5- Yâ ‘Âlî\n" +
                "6- Yâ Dâ’î\n" +
                "7- Yâ Râdî\n" +
                "8- Yâ Kâdî\n" +
                "9- Yâ Bakî\n" +
                "10- Yâ Hâdî\n" +
                "\n" +
                "Sübhâneke yâ îâ ilahe illâ ente’l-emâ-ne’I-emâne ecirnâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Men lâ meferra illâ ileyh\n" +
                "2- Yâ Men lâ mefze’a illâ ileyh\n" +
                "3- Yâ Men lâ melcee illâ ileyh\n" +
                "4- Yâ Men lâ yütevekkelü illâ ‘aleyh\n" +
                "5- Yâ Men lâ maksade illâ ileyh\n" +
                "6- Yâ Men lâ mencee illâ ileyh\n" +
                "7- Yâ Men lâ yürğabü illâ ileyh\n" +
                "8- Yâ Men lâ yü’bedü illâ iyyâh\n" +
                "9- Yâ Men lâ yüste’ânü illâ minh\n" +
                "10- Yâ Men lâ havle velâ kuvvete illâ bih\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne ecirnâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Hayra’l-merhûbîn\n" +
                "2- Yâ Hayra’l-matlûbîn\n" +
                "3- Yâ Hayra’l-merğûbîn\n" +
                "4- Yâ Hayra’l-mes’ûlîn\n" +
                "5- Yâ Hayra’l-maksûdîn\n" +
                "6- Yâ Hayra’l-mezkûrîn\n" +
                "7- Yâ Hayra’l-meşkûrîn\n" +
                "8- Yâ Hayra’l-mahbûbîn\n" +
                "9- Yâ Hayra’l-münzilîn\n" +
                "10- Yâ Hayra’l-müste’nisîn\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne ecirnâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Men hüve halaka fesevvâ\n" +
                "2- Yâ Men hüve kaddera fehedâ\n" +
                "3- Yâ Men hüve yekşifü’l-belvâ\n" +
                "4- Yâ Men hüve yesme’u’n-necvâ\n" +
                "5- Yâ Men hüve yünkizü’l-garkâ\n" +
                "6- Yâ Men hüve yünci’l-helkâ\n" +
                "7- Yâ Men hüve yeşfi’l-merdâ\n" +
                "8- Yâ Men hüve emâte ve ahyâ\n" +
                "9- Yâ Men hüve edhake ve ebkâ\n" +
                "10- Yâ Men hüve edalle ve ehdâ\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne ecirnâ mine’n-nâr.”\n");
        babOkunus.add("Ve es’elüke biesmâike\n" +
                "1- Yâ Ğâfır\n" +
                "2- Yâ Sâtir\n" +
                "3- Yâ Kahir\n" +
                "4- Yâ Kadir\n" +
                "5- Yâ Nazır\n" +
                "6- Yâ Fâtır\n" +
                "7- Yâ Şâkir\n" +
                "8- Yâ Zâkir\n" +
                "9- Yâ Nâsır\n" +
                "10- Yâ Câbir\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne`l-emâne ecirnâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Men hüve fi’l-berri ve’l-bahri sebîlüh\n" +
                "2- Yâ Men hüve fi’l-âfaki âyâtüh\n" +
                "3- Yâ Men hüve fi’l-âyâti bürhânüh\n" +
                "4- Yâ Men hüve fı’l-memâti kudratüh\n" +
                "5- Yâ Men hüve fı’l-kubûri ‘izzetüh\n" +
                "6- Yâ Men hüve fı’l-kıyâmeti milketüh\n" +
                "7- Yâ Men hüve fı’l-hisâbi heybetüh\n" +
                "8- Yâ Men hüve fı’l-mîzâni kadâüh\n" +
                "9- Yâ Men hüve fi’l-cenneti rahmetüh\n" +
                "10- Yâ Men hüve fı’n-nâri ‘azâbüh\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne ecirnâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Men hüve ileyhi yehrabü’l-hâifûn\n" +
                "2- Yâ Men hüve ileyhi yefze’u’l-müznibûn\n" +
                "3- Yâ Men hüve ileyhi yaksıdü’l-münîbûn\n" +
                "4- Yâ Men hüve ileyhi yelceü’l-‘âsûn\n" +
                "5- Yâ Men hüve ileyhi yerğabü’z-zâhidûn\n" +
                "6- Yâ Men hüve fîhi yatme’u’l-hâtıûn\n" +
                "7- Yâ Men hüve yeste’nisü bihi’l-mürîdûn\n" +
                "8- Yâ Men hüve yeftehiru bihi’l-muhsinûn\n" +
                "9- Yâ men hüve ‘aleyhi yetevekkelü’l-mütevekkilun\n" +
                "10- Yâ men hüve yeskünü bihi’l-mûkınûn\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne ecirnâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Ekrabe min külli karîb\n" +
                "2- Yâ Ehabbe miri külli habîb\n" +
                "3- Yâ A’zame min külli ‘azîm\n" +
                "4- Yâ E’azze min külli ‘azîz\n" +
                "5- Yâ Ekvâ min külli kaviyy\n" +
                "6- Yâ Ağnâ min külli ğaniyy\n" +
                "7- Yâ Ecvede min külli cevâd\n" +
                "8- Yâ Er’efe min külli raûf\n" +
                "9- Yâ Erhame min külli rahîm\n" +
                "10- Yâ Ecelle min külli celîl\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne ecirnâ mine’n-nâr.”\n");
        babOkunus.add("Ve es’elüke biesmâike\n" +
                "1- Karîb\n" +
                "2- Yâ Rakîb\n" +
                "3- Yâ Habîb\n" +
                "4- Yâ Mücîb\n" +
                "5- Yâ Hasîb\n" +
                "6- Yâ Tabîb\n" +
                "7- Yâ Basîr\n" +
                "8- Yâ Habîr\n" +
                "9- Yâ Münîr\n" +
                "10- Yâ Mübîn\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne ecirnâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Ğâliben gayra mağlûb\n" +
                "2- Yâ Sâni’an gayra masnu’\n" +
                "3- Yâ Hâlikan gayra mahlûk\n" +
                "4- Yâ Mâliken gayra memlûk\n" +
                "5- Yâ Kâhiran gayra makhûr\n" +
                "6- Yâ Râfı’an gayra merfu’\n" +
                "7- Yâ Hafızan gayra mahfuz\n" +
                "8- Yâ Nâsiran gayra mensur\n" +
                "9- Yâ Sahiden gayra gâib\n" +
                "10- Yâ Karîben gayra ba’îd\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne ecirnâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Nûra’n-nûr\n" +
                "2- Yâ Münevvira’n-nûr\n" +
                "3- Yâ Müsavvira’n-nûr\n" +
                "4- Yâ Hâlika’n-nûr\n" +
                "5- Yâ Mükaddira’n-nûr\n" +
                "6- Yâ Müdebbira’n-nûr\n" +
                "7- Yâ Nûran kable külli nûr\n" +
                "8- Yâ Nûran ba’de külli nûr\n" +
                "9- Yâ Nûran fevka külli nûr\n" +
                "10- Yâ Nûran leyse mişlehû nûr\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne ecirnâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Men ‘atâuhû şerîf\n" +
                "2- Yâ Men fı’lühû latîf\n" +
                "3- Yâ Men lütfühû mükim\n" +
                "4- Yâ Men ihsânühû kadîm\n" +
                "5- Yâ Men kavlühü hakk\n" +
                "6- Yâ Men va’dühû sıdk\n" +
                "7- Yâ Men ‘afVühû fadl\n" +
                "8- Yâ Men ‘azabühû ‘adl\n" +
                "9- Yâ Men zikrühû hulv\n" +
                "10- Yâ men ünsühû leziz\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-ne’l-emâne ecirnâ mine’n-nâr.”\n");
        babOkunus.add("Ve es’elüke biesmâike\n" +
                "1- Yâ Münevvil\n" +
                "2- Yâ Müfassü\n" +
                "3- YâMübeddil\n" +
                "4- Yâ Müsehhil\n" +
                "5- Yâ Müzellil\n" +
                "6- Yâ Münezzil\n" +
                "7- Yâ Muhavvil\n" +
                "8- Yâ Mücemmil\n" +
                "9- Yâ Mükemmil\n" +
                "10- Yâ Müfaddil\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente ne’l-emâne ecirnâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Men yerâ velâ yürâ\n" +
                "2- Yâ Men yahlüku velâ yühlâk\n" +
                "3- Yâ Men yehdî velâ yühda\n" +
                "4- Yâ Men yühyî velâ yühyâ\n" +
                "5- Yâ Men yüt’imü velâ yüt’am\n" +
                "6- Yâ Men yücîru velâ yücâr\n" +
                "7- Yâ Men yakdî velâ yükdâ ‘aleyh\n" +
                "8- Yâ Men yahkümü velâ yuhkemü ‘aleyh\n" +
                "9- Yâ Men lem yelid velem yûled\n" +
                "10- Ve lem yekûn lehû küfüven ehad\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne ecirnâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Ni’me’l-habîb\n" +
                "2- Yâ Ni’me’t-tabîb\n" +
                "3- Yâ Ni’me’l-hasîb\n" +
                "4- Yâ Ni’me’l-karîb\n" +
                "5- Yâ Ni’me’r-rakîb\n" +
                "6- Yâ Ni’me’l-mucîb\n" +
                "7- Yâ Ni’me’l-enîs\n" +
                "8- Yâ Ni’me’l-vekîl\n" +
                "9- Yâ Ni’me’l-mevlâ\n" +
                "10- Yâ Ni’me’n-nasîr\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne ecirnâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Sürûra’l-‘ârifîn\n" +
                "2- Yâ Enîse’l-mürîdîn\n" +
                "3- Yâ Muğîşe’l-müştâkîn\n" +
                "4- Yâ Habîbe’t-tevvâbîn\n" +
                "5- Yâ Râzika’l-mükillîn\n" +
                "6- Yâ Recâe’l-müznibîn\n" +
                "7- Yâ Kâşife’l-mekrûbîn\n" +
                "8- Yâ Müneffisen ‘ani’l-mağmûmîn\n" +
                "9- Yâ Müferricen ‘ani’l-mahzûnîn\n" +
                "10- Yâ İlâhe’l-evvelîne ve’l-âhirîn\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne ecirnâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Rabbe’l-cenneti ve’n-nâr\n" +
                "2- Yâ Rabbe’n-nebiyyîne ve’l-ahyâr\n" +
                "3- Yâ Rabbe’s-sıddîkîne ve’l-ebrâr\n" +
                "4- Yâ Rabbe’s-siğâri ve’l-kibâr\n" +
                "5- Yâ Rabbe’l-hubûbi ve’l-eşmâr\n" +
                "6- Yâ Rabbe’l-enhâri ve’l-eşcâr\n" +
                "7- Yâ Rabbe’s-sahârâ ve’l-kıfâr\n" +
                "8- Yâ Rabbe’l-‘abîdi ve’l-ahrâr\n" +
                "9- Yâ Rabbe’l-i’lâni ve’l-isrâr\n" +
                "10- Yâ Rabbe’l-leyli ve’n-nehâr\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne ecirnâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Men lahika fî külli şey’in ‘ilmüh\n" +
                "2- Yâ Men nefeze bi külli şey’in besaruh\n" +
                "3- Yâ Men beleğat ilâ külli şey’in kudratüh\n" +
                "4- Yâ Men lâ yuhsı’l-‘ibâdü na’mâeh\n" +
                "5- Yâ Men lâ teblüğu’l-halâiku şükrah\n" +
                "6- Yâ Men lâ tüdrikü’l-efhâmü celâleh\n" +
                "7- Yâ Men lâ tenâlü’l-evhâmü künheh\n" +
                "8- Yâ Meni’l-‘azâmetü ve’l-kibriyâü ridâüh\n" +
                "9- Yâ Meni’l-heybetü ve’s-sültânü behâüh\n" +
                "10- Yâ Men te’azzeze bi’l-‘izzi bekâüh\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne ecirnâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Men lehü’l-meşelü’l-a’lâ\n" +
                "2- Yâ Men lehü’l-sıfâtü’l-‘ulâ\n" +
                "3- Yâ Men lehü’l-âhiratü ve’l-ûlâ\n" +
                "4- Yâ Men lehü’l-cennetü’l-me’vâ\n" +
                "5- Yâ Men lehü’n-nâru ve’l-lezâ\n" +
                "6- Yâ Men lehü’l-âyâtü’l-kübrâ\n" +
                "7- Yâ Men lehü’l-esmâü’l-hüsnâ\n" +
                "8- Yâ Men lehü’l-hükmü ve’l-kadâ\n" +
                "9- Yâ Men lehü’s-semâvâtü’l-‘ulâ\n" +
                "10- Yâ Men lehü’l-‘arşü ve’s-serâ\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne ecirnâ mine’n-nâr.”\n");
        babOkunus.add("Ve es’elüke biesmâike\n" +
                "1- Yâ’Afüvv\n" +
                "2- Yâ Ğafûr\n" +
                "3- Yâ Vedûd\n" +
                "4- Yâ Şekûr\n" +
                "5- Yâ Sabûr\n" +
                "6- Yâ Rauf\n" +
                "7- Yâ’Atûf\n" +
                "8- Yâ Kuddûs\n" +
                "9- Yâ Hayy\n" +
                "10- Yâ Kayyûm\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne ecirnâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Men hüve fı’s-semâi ‘azametüh\n" +
                "2- Yâ Men hüve fi’l-ardi âyâtüh\n" +
                "3- Yâ Men hüve fî külli şey’in delâilüh\n" +
                "4- Yâ Men hüve fi’l-bihâri ‘acâibüh\n" +
                "5- Yâ Men yebdeü’l-halka şürame yü’îdüh\n" +
                "6- Yâ Men hüve fi’l-cibâli hazâinüh\n" +
                "7- Yâ Men ahsene külle şey’in halekah\n" +
                "8- Yâ Men ileyhi yürce’u’l-emrü küllüh\n" +
                "9- Yâ Men zahera fî külli şey’in lütfülı\n" +
                "10- Yâ Men yü’arrifü’l-halâika kudrateh\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne ecirnâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Habîbe men lâ habîbe leh\n" +
                "2- Yâ Tabîbe men lâ tabîbe leh\n" +
                "3- Yâ Mücîbe men lâ mücîbe leh\n" +
                "4- Yâ Şefîka men lâ şefîka leh\n" +
                "5- Yâ Rafîka men lâ rafîka leh\n" +
                "6- Yâ Şefî’a men lâ §efî’a leh\n" +
                "7- Yâ Müğîşe men lâ müğîşe leh\n" +
                "8- Yâ Delîle men lâ delîle leh\n" +
                "9- Yâ Kaide men lâ kaide leh\n" +
                "10- Yâ Râhıme men lâ râhıme leh\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne ecirnâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Kâfiye meni’stekfâh\n" +
                "2- Yâ Hâdiye meni’stehdâh\n" +
                "3- Yâ Kâliye meni’steklâh\n" +
                "4- Yâ Dâ’iye meni’sted’âh\n" +
                "5- Yâ Şâfıye meni’steşfâh\n" +
                "6- Yâ Kâdiye meni’stakdâh\n" +
                "7- Yâ Muğniye meni’steğnâh\n" +
                "8- Yâ Mûfîye meni’stevfâh\n" +
                "9- Yâ Mükavviye meni’stakvâh\n" +
                "10- Yâ Veliyye meni’stevlâh\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne ecirnâ mine’n-nâr.”\n");
        babOkunus.add("Ve es’elüke biesmâike\n" +
                "1- Yâ Evvel\n" +
                "2- Yâ Âhir\n" +
                "3- Yâ Zahir\n" +
                "4- Yâ Bâtın\n" +
                "5- Yâ Halik\n" +
                "6- Yâ Râzik\n" +
                "7- Yâ Sâdık\n" +
                "8- Yâ Sabık\n" +
                "9- Yâ Saik\n" +
                "10- Yâ Fâlik\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne ecirnâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Men yükallibü’l-leyle ve’n-nehâr\n" +
                "2- Yâ Men Halaka’z-zulümâti ve’n-nûr\n" +
                "3- Yâ Men ce’ale’z-zılle ve’l-harur\n" +
                "4- Yâ Men sehhara’s-semse ve’l-kamer\n" +
                "5- Yâ Men haleka’l-mevte ve’l-hayah\n" +
                "6- Yâ Men lehü’l-halku ve’l-emr\n" +
                "7- Yâ Men lem yettehiz sâhibeten velâ veledâ\n" +
                "8- Yâ Men lem yekûn lehû şerikim fi’l-mülk\n" +
                "9- Yâ Men lem yekûn lehû veliyyün mine’z-züll\n" +
                "10- Yâ men lehü’l-havlü ve’l-kuvveh\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ enteİ-emâ-ne’l-emâne neccinâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Men ya’lemü mürâde’l-mürîdîn\n" +
                "2- Yâ Men yemlikü havaice’s-sâilîn\n" +
                "3- Yâ Men yesme’u enîne’l-valihîn\n" +
                "4- Yâ Men yerâ bükâe’l-hâifîn\n" +
                "5- Yâ Men ya’lemu damîra’s-sâmitîn\n" +
                "6- Yâ Men yerâ nedeme’n-nâdimîn\n" +
                "7- Yâ Men yakbelü ‘uzre’t-tâibîn\n" +
                "8- Yâ Men lâ yüslihu ‘amele’l-müfsidîn\n" +
                "9- Yâ Men lâ yüdî’u ecra’l-muhsinîn\n" +
                "10- Yâ Men lâ yeb’udü an kulûbi’l-‘arifîn\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne neccinâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Dâime’l-bekâ\n" +
                "2- Yâ Ğafira’l-hatâ\n" +
                "3- Yâ Sâmi’e’d-düâ\n" +
                "4- Yâ Vâsi’a’l-‘atâ\n" +
                "5- Yâ Râfı’a’s-semâ\n" +
                "6- Yâ Kâşife’l-belâ\n" +
                "7- Yâ ‘Azîme’s-senâ\n" +
                "8- Yâ Kadîme’s-senâ\n" +
                "9- Yâ Keşira’l-vefa\n" +
                "10- Yâ Şerîfe’l-cezâ\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne neccinâ mine’n-nâr.”\n");
        babOkunus.add("Ve es’elüke biesmâike\n" +
                "1- Yâ Ğaffâr\n" +
                "2- Yâ Settâr\n" +
                "3- Yâ Kahhâr\n" +
                "4- Yâ Cebbar\n" +
                "5- Yâ Sabbâr\n" +
                "6- Yâ Razzâk\n" +
                "7- Yâ Fettâh\n" +
                "8- Yâ ‘Allâm\n" +
                "9- Yâ Vehhâb\n" +
                "10- Yâ Tevvâb\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l ne’l-emâne neccinâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Men halekanî ve sevvânî\n" +
                "2- Yâ Men razekanî ve rabbânî\n" +
                "3- Yâ Men et’amenî ve sekânî\n" +
                "4- Yâ Men karrabenî ve ednânî\n" +
                "5- Yâ Men ‘asamenî ve kefânî\n" +
                "6- Yâ Men hafızanî ve kelânî\n" +
                "7- Yâ Men veffekanî ve hedânî\n" +
                "8- Yâ Men e’azzenî ve ağnânî\n" +
                "9- Yâ Men emâtenî ve ahyânî\n" +
                "10- Yâ Men ânesenî ve âvânî\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne neccinâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Men yühikku’l-hakka bikelimâtih\n" +
                "2- Yâ Men lâ mü’akkibe lihukmih\n" +
                "3- Yâ Men lâ radde likadâih\n" +
                "4- Yâ Men yehûlü beyne’l-mer’i ve kalbih\n" +
                "5- Yâ Men yakbelü’t-tevbete an ‘ibâdih\n" +
                "6- Yâ Men lâ tenfe’u’ş-şefa’atü illâ biiznih\n" +
                "7- Yâ Meni’s-semâvâtü matviyyâtün biyemînih\n" +
                "8- Yâ Men hüve a’lemü bi men dalle ‘an sebîlih\n" +
                "9- Yâ Men yüsebbihu’r-ra’dü bihâmdi-hi ve’l-melâiketü min hîfetih\n" +
                "10- Yâ Men yürsilü’r-riyâha büşran beyne yedey rahmetih\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne neccinâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Men ce’ale’l-arda mihâdâ\n" +
                "2- Yâ Men ce’ale’l-cibâle evtâdâ\n" +
                "3- Yâ Men ce’ale’l-şemse sirâcâ\n" +
                "4- Yâ Men ce’ale’l-kamera nûrâ\n" +
                "5- Yâ Men ce’ale’l-leyle libâsa\n" +
                "6- Yâ Men ce’ale’n-nehâra me’âşâ\n" +
                "7- Yâ Men ce’ale’n-nevme sübâtâ\n" +
                "8- Yâ Men ce’ale’s-semâe binâa\n" +
                "9- Yâ Men ce’ale’l-eşyâe ezvâcâ\n" +
                "10- Yâ Men ce’ale’n-nâra mirsâdâ\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne neccinâ mine’n-nâr.”\n");
        babOkunus.add("Ve es’elüke biesmâike\n" +
                "1- Yâ Şefî’\n" +
                "2- Yâ Semî’\n" +
                "3- Yâ Rafı’\n" +
                "4- Yâ Meni`\n" +
                "5- Yâ Bedi`\n" +
                "6- Yâ Serî’\n" +
                "7- Yâ Beşîr\n" +
                "8- Yâ Nezîr\n" +
                "9- Yâ Kadîr\n" +
                "10- Yâ Muktedir\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-em ne’l-emâne neccinâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Hayyü kable külli hayy\n" +
                "2- Yâ Hayyü ba’de külli hayy\n" +
                "3- Yâ Hayyü’llezî lâ yüşbihühû şey’\n" +
                "4- Yâ Hayyü’llezî leyse kemişlihî hayy ‘ Yâ Hayyü’llezî lâ yüşârikühû hayy\n" +
                "6- Yâ Hayyü’llezî lâ yahtâcü ilâ hayy\n" +
                "7- Yâ Hayyü’llezî yümîtü külle hayy\n" +
                "8- Yâ Hayyü’llezî yerzüku külle hayy\n" +
                "9- Yâ Hayyü’llezî yühyi’l-mevtâ\n" +
                "10- Yâ Hayyü’llezî lâ yemût\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne neccinâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Men lehû zikrun lâ yünsâ\n" +
                "2- Yâ Men lehû nurun lâ yutfâ\n" +
                "3- Yâ Men lehû şenâün lâ yuhsâ\n" +
                "4- Yâ Men lehû nü’ûtün lâ tüğayyer\n" +
                "5- Yâ Men lehû ni’amün lâ tü’add\n" +
                "6- Yâ Men lehû mülkün lâ yezûl\n" +
                "7- Yâ Men lehû celâlün lâ yükeyyef\n" +
                "8- Yâ Men lehû kadâün lâ yüradd\n" +
                "9- Yâ Men lehû sıfâtün lâ tübeddel\n" +
                "10- Yâ Men lehû kemâlün lâ yüdrak\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne neccinâ mine’n-nâr.”\n");
        babOkunus.add("1- YâRabbe’I-‘âlemîn\n" +
                "2- Yâ Mâlike yevmi’d-dîn\n" +
                "3- Yâ Men yühibbü’s-sâbirîn\n" +
                "4- Yâ Men yuhibbü’t-tevvâbîn\n" +
                "5- Yâ Men yuhibbü’l-mütetahhirîn\n" +
                "6- Yâ Men yuhibbü’l-muhsinîn\n" +
                "7- Yâ Men hüve hayru’n-nâsirîn\n" +
                "8- Yâ Men hüve hayru’l-fasilîn\n" +
                "9- Yâ Men hüve hayru’ş-şâkirîn\n" +
                "10- Yâ men hüve a’lemü bi’l-müfsidîn\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne neccinâ mine’n-nâr.”\n");
        babOkunus.add("Ve es’elüke biesmâike\n" +
                "1- Yâ Mübdi\n" +
                "2- Yâ Mu’îd\n" +
                "3- Yâ Hafız\n" +
                "4- Yâ Mühît\n" +
                "5- Yâ Hamîd\n" +
                "6- Yâ Mecîd\n" +
                "7- Yâ Mükît\n" +
                "8- Yâ Müğîs\n" +
                "9- Yâ Mü’îzz\n" +
                "10- Yâ Müzill\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-e: ne’l-emâne neccinâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Men hüve Ehadün bilâ didd\n" +
                "2- Yâ Men hüve Ferdün bilâ nidd\n" +
                "3- Yâ Men hüve Samedün bilâ ‘ayb\n" +
                "4- Yâ Men hüve Vitrun bilâ şef\n" +
                "5- Yâ Men hüve Rabbün bilâ vezîr\n" +
                "6- Yâ Men hüve Ğaniyyün bilâ fakr\n" +
                "7- Yâ Men hüve Sültânün bilâ ‘azl\n" +
                "8- Yâ Men hüve Melîkün bilâ ‘acz\n" +
                "9- Yâ Men hüve Mevcudun bilâ mişl\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne neccinâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Men hüve zikruhû şerafün li’z-zâkirîn\n" +
                "2- Yâ Men hüve şükruhû fevzün li’ş-şâkirîn\n" +
                "3- Yâ Men hüve hamdühû fahrun li’l-hâmidîn\n" +
                "4- Yâ Men hüve tâ’atühû necâtün li’l-mütî’în\n" +
                "5- Yâ Men hüve bâbühü meftûhun li’t-tâlibîn\n" +
                "6- Yâ Men hüve sebilühû vâdihun li’l-mü’minîn\n" +
                "7- Yâ men hüve âyâtühû bürhânün Ii’n-nâzirîn\n" +
                "8- Yâ men hüve kitâbühû tezkiratün li’l-mûkınîn\n" +
                "9- Yâ men hüve ‘afvühü melceün li’l-müznibîn\n" +
                "10- Yâ men hüve rahmetühû karîbûn li’l-muhsinîn\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne neccinâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Men tebâreke’smüh\n" +
                "2- Yâ Men te’âlâ ceddüh\n" +
                "3- Yâ Men celle şenâüh\n" +
                "4- Yâ Men lâ ilahe ğayruh\n" +
                "5- Yâ Men tekaddeset esmâüh\n" +
                "6- Yâ Men yedûmü bekâüh\n" +
                "7- Yâ Meni’l-‘azametü behâüh\n" +
                "8- Yâ Meni’l-kibriyâü ndâüh\n" +
                "9- Yâ Men lâ yühsâ âlâüh\n" +
                "10- Yâ Men lâ yü’addü na’mâüh\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne neccinâ mine’n-nâr.”\n");
        babOkunus.add("Ve es’elüke biesmâike\n" +
                "1- Yâ Mü’în\n" +
                "2- Yâ Mübîn\n" +
                "3- Yâ Emîn\n" +
                "4- Yâ Mekîn\n" +
                "5- Yâ Metîn\n" +
                "6- Yâ Şedîd\n" +
                "7- Yâ Şehîd\n" +
                "8- Yâ Raşîd\n" +
                "9- Yâ Hamîd\n" +
                "10- Yâ Mecîd\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-neİ-emâne neccinâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Ze’l-arşi’l-mecîd\n" +
                "2- Yâ Ze’l-kavli’s-sedîd\n" +
                "3- Yâ Ze’l-fadli’r-raşîd\n" +
                "4- Yâ Ze’l-batşi’ş-şedîd\n" +
                "5- Yâ Ze’l-va’di ve’l-va’îd\n" +
                "6- Yâ Karîben gayra ba’îd\n" +
                "7- Yâ Men hüve’l-veliyyü’l-hamîd\n" +
                "8- Yâ Men hüve ‘alâ külli şey’in şehîd\n" +
                "9- Yâ Men hüve leyse bizallâmîn li’l-‘abîd\n" +
                "10- Yâ men hüve akrabü ileyhi min habli’l-verîd\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne neccinâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Men lâ şerîke lehû velâ vezîr\n" +
                "2- Yâ Men lâ şebîhe lehû velâ nezîr\n" +
                "3- Yâ Hâlika’ş-şemsi ve’l-kameri’l-münîr\n" +
                "4- Yâ Müğniye’l-bâisi’l-fakîr 3 Yâ Râzika’t-tıfli’s-sağîr\n" +
                "6- Yâ Râhime’ş-şeyhi’l-kebir\n" +
                "7- Yâ ‘Ismete’l-hâifi’l-müstecîr\n" +
                "8- Yâ Men hüve bi’ibâdihî basîr\n" +
                "9- Yâ Men hüve bihavâyici’l-‘ibâdi habîr\n" +
                "10- Yâ Men hüve ‘alâ külli şey’in kadîr\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne neccinâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Ze’l-cûdi ve’n-ni’âm\n" +
                "2- Yâ Ze’l-fadli ve’l-keram\n" +
                "3- Yâ Ze’l-be’si ve’n-nikam\n" +
                "4- Yâ Hâlika’l-levhi ve’l-kalem ‘\n" +
                "5- Yâ Bârie’z-zerri ve’n-nesem\n" +
                "6- Yâ Mülhime’l-‘arabi ve’l-‘acem\n" +
                "7- Yâ Kâşife’drdurri ve’l-elem\n" +
                "8- Yâ ‘Alime’s-sirri ve’l-himem\n" +
                "9- Yâ Men lehü’l-beytü ve’l-haram\n" +
                "10- Yâ Men yahlüku’l-eşyâe mine’l-‘adem\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne neccinâ mine’n-nâr.”\n");
        babOkunus.add("Ve es’elüke biesmâike\n" +
                "1- Yâ ‘Adil\n" +
                "2- Yâ Kabil\n" +
                "3- Yâ Fâdil\n" +
                "4- YâFâ’il\n" +
                "5- Yâ Kâfıl\n" +
                "6- Yâ Câ’il\n" +
                "7- Yâ Kâmil\n" +
                "8- Yâ Fâtır\n" +
                "9- Yâ Tâlib\n" +
                "10- Yâ Matlûb\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne neccinâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Men en’ame bihavlih\n" +
                "2- Yâ Men ekrame bitavlih\n" +
                "3- Yâ Men ‘âde bilütfıh\n" +
                "4- Yâ Men te’azzeze bikudratih\n" +
                "5- Yâ Men kaddera bihikmetih\n" +
                "6- Yâ Men hakeme bitedbîrih\n" +
                "7- Yâ Men debbera bi’ilmih\n" +
                "8- Yâ Men tecâveze bihılmih\n" +
                "9- Yâ Men denâ fî ‘ulüvvih\n" +
                "10- Yâ Men ‘alâ fî dünüvvih\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne neccinâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Men yahlüku ma yeşâ\n" +
                "2- Yâ Men yef’alü ma yeşâ\n" +
                "3- Yâ Men yehdi men yeşâ\n" +
                "4- Yâ Men yudillü men yeşâ\n" +
                "5- Yâ Men yağfiru limen yeşâ\n" +
                "6- Yâ Men yü’azzibü men yeşâ\n" +
                "7- Ya Men yetûbü alâ men yeşâ\n" +
                "8- Yâ Men yüsavviru fı’l-erhâmi keyfe yeşâ\n" +
                "9- Yâ Men yezîdü fi’l-halki mâ yeşâ\n" +
                "10- Yâ Men yahtassu bi rahmetihî men yeşâ\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne neccinâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Men lem yettehiz sahibeten velâ veledâ\n" +
                "2- Yâ Men la yüşrikü fî hukmihî ehadâ\n" +
                "3- Yâ Men ce’ale li külli şey’in kadrâ\n" +
                "4- Yâ Men lem yezel rahîmâ\n" +
                "5- Yâ Câ’ile’l-melâiketi rusülâ\n" +
                "6- Yâ Men ce’ale fı’s-semâi bürûcâ\n" +
                "7- Yâ Men ce’ale’l-arda karâra\n" +
                "8- Yâ Men ce’ale mine’l-mâi beşerâ\n" +
                "9- Yâ Men ahsa külle şey’in ‘adedâ\n" +
                "10- Yâ Men ehâta bi külli şey’in ‘ilmâ\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne neccinâ mine’n-nâr.”\n");
        babOkunus.add("Ve es’elüke biesmâike\n" +
                "1- Yâ Ferd\n" +
                "2- Yâ Vitr\n" +
                "3- Yâ Ehad\n" +
                "4- Yâ Samed\n" +
                "5- Yâ Emced\n" +
                "6- Yâ E’azz\n" +
                "7- Yâ Eceli\n" +
                "8- Yâ Ehakk\n" +
                "9- Yâ Eberr\n" +
                "10- Yâ Ebed\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-nel-emâne neccinâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Ma’rûfe men ‘arafeh\n" +
                "2- Yâ Ma’bûde men ‘abedeh\n" +
                "3- Yâ Meşkûre men şekerah\n" +
                "4- Yâ Mezkûre men zekerah\n" +
                "5- Yâ Mahmude men hamideh\n" +
                "6- Yâ Mevcûde men talebeh\n" +
                "7- Yâ Mevsûfe men vahhadeh\n" +
                "8- Yâ Mahbûbe men ehabbeh\n" +
                "9- Yâ Merğûbe men erâdeh\n" +
                "10- Yâ Maksûde men enâbe ileyh\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne neccinâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Men lâ mülke illâ mülküh\n" +
                "2- Yâ Men lâ yuhsi’l-‘ibadü şenaeh\n" +
                "3- Yâ Men lâ tesıfü’l-halâiku celâleh\n" +
                "4- Yâ Men lâ yüdrikü’l-ebsâru kemâleh\n" +
                "5- Yâ Men lâ yeblüğu’l-efhâmü sıfâtih\n" +
                "6- Yâ Men lâ yenâlü’l-efkâru kibriyâeh\n" +
                "7- Yâ Men lâ yuhsinü’l-insânü nü’ûteh\n" +
                "8- Yâ Men lâ yeruddü’l-‘ibâdü kadâeh\n" +
                "9- Yâ Men zahera fî külli şey’in âyâtüh\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne neccinâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Habîbe’l-bekkâîn\n" +
                "2- Yâ Senede’l-mütevekkilîn\n" +
                "3- Yâ Hâdiye’l-mudillîn\n" +
                "4- Yâ Veliyye’l-mü’minîn\n" +
                "5- Yâ Enîse’s-zâkirîn\n" +
                "6- Yâ Akdera’l-kâdirîn\n" +
                "7- Yâ Ebsara’n-nâzırîn\n" +
                "8- Yâ Aleme’l-‘âlimîn\n" +
                "9- Yâ Mefze’a’l-melhûfîn\n" +
                "10- Yâ Ensara’n-nâsirîn\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne neccinâ mine’n-nâr”\n");
        babOkunus.add("Ve es’elüke biesmâike\n" +
                "1- Yâ Mükrim\n" +
                "2- Yâ Mü’azzim\n" +
                "3- Yâ Müna’im\n" +
                "4- Ya Mü’tî\n" +
                "5- Yâ Müğnî\n" +
                "6- Yâ Mühyî\n" +
                "7- Yâ Mübdî\n" +
                "8- Yâ Mürdî\n" +
                "9- YâMüncî\n" +
                "10- Yâ Muhsin\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne neccinâ mine’n-nâr”\n");
        babOkunus.add("1- Yâ Kâfiye külli şey\n" +
                "2- Yâ Kaimen ‘alâ külli şey\n" +
                "3- Yâ Men lâ yüşbihühû şey\n" +
                "4- Yâ Men lâ yezîdü fî mülkihî şey\n" +
                "5- Yâ Men lâ yenkusu min hazainihî şey\n" +
                "6- Yâ Men lâ yahfâ ‘aleyhi şey\n" +
                "7- Yâ Men leyse kemişlihî şey\n" +
                "8- Yâ Men biyedihî mekâlîdü külli şey\n" +
                "9- Yâ Men vesi’at rahmetühû külle şey\n" +
                "10- Yâ Men yebkâ ve yefnâ küllü şey\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne neccinâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Men lâ ya’lemü’l-ğaybe illâ hû\n" +
                "2- Yâ Men lâ yasrifü’s-sûe illâ hû\n" +
                "3- Yâ Men lâ yüdebbiru’l-emra illâ hû\n" +
                "4- Yâ Men lâ yağfiru’z-zünûbe illâ hû\n" +
                "5- Yâ Men lâ yükallibü’l-kalbe illâ hû\n" +
                "6- Yâ Men lâ yahlüku’l-halka illâ hû\n" +
                "7- Yâ Men lâ yütimmü’n-ni’mete illâ hû\n" +
                "8- Yâ Men lâ yünezzilü’l-ğayşe illâ hû\n" +
                "9- Yâ Men lâ yuhyi’l-mevtâ illâ hû\n" +
                "10- Yâ Men lâ yuğni ‘ale’t-tahkîki illâ hû\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne neccinâ mine’n-nâr.”\n");
        babOkunus.add("Ve es’elüke biesmâike\n" +
                "1- Yâ Kâşif\n" +
                "2- Yâ Fâric\n" +
                "3- Yâ Fâtih\n" +
                "4- Yâ Nâsir\n" +
                "5- Yâ Dâmin\n" +
                "6- Yâ Âmir\n" +
                "7- Yâ Nâhi\n" +
                "8- Yâ Raca\n" +
                "9- Yâ Mürtecâ\n" +
                "10- Yâ ‘Azîme’r-racâ\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne hallisnâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Mü’îne’d-du’afâ\n" +
                "2- Yâ Kenze’l-fükarâ\n" +
                "3- Yâ Sâhibe’l-ğurabâ\n" +
                "4- Yâ Nâsira’l-evliyâ\n" +
                "5- Yâ Kâhira’l-a’dâ\n" +
                "6- Yâ Râfia’s-semâ\n" +
                "7- Yâ Kâşife’l-belâ\n" +
                "8- Yâ Enîse’l-evliyâ\n" +
                "9- Yâ Habîbe’l-etkıyâ\n" +
                "10- Yâ İlâhe’l-ağniyâ\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne hallisnâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Evvele külli şey’in ve âhirah\n" +
                "2- Yâ İlahe külli şey’in ve sâni’ah\n" +
                "3- Yâ Râzika külli şey’in ve hâlikah\n" +
                "4- Yâ Fâtira külli şey’in ve melîkeh\n" +
                "5- Yâ Kâbida külli şey’in ve bâsiteh\n" +
                "6- Yâ Mübdie külli şey’in ve nıü’îdeh\n" +
                "7- Yâ Müsebbibe külli şey’in ve mükaddirah s Yâ Mürabbiye külli şey’in ve müdebbirah\n" +
                "9- Yâ Mükevvira külli şey’in ve muhavvileh\n" +
                "10- Yâ Muhyiye külli şey’in ve mümîteh\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne hallisnâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Hayra zâkirîn ve mezkûr\n" +
                "2- Yâ Hayra şâkirîn ve meşkûr\n" +
                "3- Yâ Hayra hâmidin ve mahmûd\n" +
                "4- Yâ Hayra şahidin ve meşhûd\n" +
                "5- Yâ Hayra dâ’in ve med’uvv\n" +
                "6- Yâ Hayra mücîbin ve mücâb\n" +
                "7- Yâ Hayra munisin ve enîs\n" +
                "8- Yâ Hayra sahibin ve celîs\n" +
                "9- Yâ Hayra maksûdin ve matlûb\n" +
                "10- Yâ Hayra habîbin ve mahbûb\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne hallisnâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Men hüve limen de’âhü mücîb\n" +
                "2- Yâ Men hüve limen etâ’ahû habîb\n" +
                "3- Yâ Men hüve limen ehabbehû karîb\n" +
                "4- Yâ Men hüve bimen erâdehû ‘alîm\n" +
                "5- Yâ Men hüve limen recâhü kerîm\n" +
                "6- Yâ Men hüve bimen ‘asâhü halîm\n" +
                "7- Yâ Men hüve fî hilmihî hakîm\n" +
                "8- Yâ Men hüve fî hükmihî ‘azîm\n" +
                "9- Yâ Men hüve fî ‘azametihî rahîm\n" +
                "10- Yâ Men hüve fî ihsânihî kadîm\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne hallisnâ mine’n-nâr.”\n");
        babOkunus.add("Ve es’elüke biesmâike\n" +
                "1- Yâ Müsebbib\n" +
                "2- Yâ Mukarrib\n" +
                "3- Yâ Mü’akkib\n" +
                "4- Yâ Mukallib\n" +
                "5- Yâ Mukaddir\n" +
                "6- Yâ Mürattib\n" +
                "7- Yâ Mürağğib\n" +
                "8- Yâ Müzekkir\n" +
                "9- Yâ Mükevvîn\n" +
                "10- Yâ Mütekebbir\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne hallisnâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Men lâ yüşğilühû sem’un an sem’\n" +
                "2- Yâ Men lâ yemne’uhû fı’lün an fi’l\n" +
                "3- Yâ Men lâ yülhîhi kavlün an kavi\n" +
                "4- Yâ Men lâ yüğallituhû süâlün ‘an suâl\n" +
                "5- Yâ Men lâ yübrimühû ilhâhu’Umulihhîn\n" +
                "6- Yâ Men şeraha bi’l-islâmi sudûra’l-mü’minîn\n" +
                "7- Yâ Men etâbe bi zikrihî kulûbe’l-muhbitîn\n" +
                "8- Yâ Men la yeğibü ‘an kulûbi’l-müştâkın\n" +
                "9- Yâ Men hüve gâyetü mürâdi’l-mürîdîn\n" +
                "10- Yâ Men la yahfâ ‘aleyhi şey’ün fı’l-‘âlemîn\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne hallisnâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Men hüve ‘ilmühû sabık\n" +
                "2- Yâ Men hüve va’dühû sâdık\n" +
                "3- Yâ Men hüve lütfühû zahir\n" +
                "4- Yâ Men hüve emruhû ğâlib\n" +
                "5- Yâ Men hüve kitâbühû muhkem\n" +
                "6- Yâ Men hüve kadâühû kâin\n" +
                "7- Yâ Men hüve kur’anühû mecîd\n" +
                "8- Yâ Men hüve mülkühû kadîm\n" +
                "9- Yâ Men hüve fadlühû mukîm\n" +
                "10- Yâ Men hüve ‘arşühû ‘azîm\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne hallisnâ mine’n-nâr.”\n");
        babOkunus.add("1- Yâ Rabbe’l-erbâb\n" +
                "2- Yâ Müfettiha’l-ebvâb\n" +
                "3- Yâ Müsebbibe’l-esbâb\n" +
                "4- Yâ Mu’tiye’s sevâb\n" +
                "5- Yâ Mülhime’s-savâb\n" +
                "6- Yâ Münşie’s-sehâb\n" +
                "7- Yâ Şedîde’l-‘ikâb\n" +
                "8- Yâ Seri’a’l-hisâb\n" +
                "9- Yâ Men lehü’l-iyâb\n" +
                "10- Yâ Gafuru yâ Tevvâb\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne hallisnâ mine’n-nâr.”\n");
        babOkunus.add("Ve es’elüke biesmâike\n" +
                "1- Yâ Rabbena\n" +
                "2- Yâ İlâhenâ\n" +
                "3- Yâ Seyyidenâ\n" +
                "4- Yâ Mevlânâ\n" +
                "5- Yâ Nâsıranâ\n" +
                "6- Yâ Hafızana\n" +
                "7- Yâ Kâdiranâ\n" +
                "8- Yâ Râzikanâ\n" +
                "9- Yâ Delîlenâ\n" +
                "10- Yâ Muğisenâ\n" +
                "\n" +
                "Sübhâneke yâ lâ ilahe illâ ente’l-emâ-ne’l-emâne hallisnâ mine’n-nâr.”\n");
        babOkunus.add("Allâhümme Rabbena * hallisnâ * ve ecirnâ * ve neccinâ mine’n-nar * ve ‘â-finâ va’fü ‘annâ ve edhilne’l-cennete dara kudsike me’a’l-ebrâr * bi ‘afvike Yâ Mücîr * bi fadlike Yâ Gaffar * ve es-elüke bihakki hâzihi’l-esmâi’l-kerîme-ti’§-§erîfeti ve’s-sıfâti’l-celîleti’l-latîfeti en tüsalliye ‘alâ seyyidinâ Muhamme-din ve ‘alâ âlihî ve sahbihî bi’adedi ha-senâti Muhammedin bismillah * has-biyallah * lâ ilahe illallah * şehidallâh * kulhüvallâh * mâşâallâh * rabbiyallah * tebârekallâh * te’âlallâh * tevekkeltü ‘alallâh * feseyekfîke hümüllâh * ve hüve’s-semî’u’l-‘alîm * Sübhâneke yâ lâ ilahe illâ ente’l-emâne’l-emâne lâ uhsî şenâen ‘aleyke ente kemâ eşneyte ‘alâ nefsik * Yâ Allah * Yâ Rahman * Yâ Rahîm * Yâ Gafur * Yâ Şekûr * Es-elüke bimâ ahseytehû ‘aleyke min es-mâike’l-hüsnâ ve sıfâtike’l-‘ulyâ ve ke-limâtike’t-tâmmeti en tağfiralî velivâli-deyye veliüstâzî Sâidi’n-Nursîyyi veli-talebeti rasâili’n-nûri velicemî’i’l-mü’-minîne ve’l-mü’minâti ve’l-müslimîne ve’l-müslimâti’l-ahyâi minhüm ve’l-emvâti ve terhamenâ rahmeten tüğnî-nâ bihâ ‘an rahmeti men sivâke min halkıke ve en takdiye havâicenâ ve tû’-tiyenâ süâlenâ fi’d-dünyâ ve’l-âhirati ve tahtime lenâ bi’s-se’âdeti ve’ş-şe-hâdeti ve’l-kerâmeti ve’l-büşrâ ‘inde fîraki’d-dünyâ ve tecziye Muhamme-den sallallâhü ‘aleyhi vesellem ‘annâ mâ hüve ehlühû ve müstehakkuh * Ve en lâ tekilenâ ilâ enfüsinâ tarfete ‘aynin velâ ilâ ehadin min halkik * Ve tus-liha lenâ şe’nenâ ve en tahrusenâ bi-‘aynikelletî lâ tenânıü ve tahfezanâ bi-ruknike’llezî lâ yürâmü Ya Ze’l-celâli ve’l-ikrâm ve en tasrife ‘annâ ve ‘ammen ‘ullika ‘aleyhi hâzihi’l-esmâü âfe-te’l-cinni ve’l-insi ve’§-§eyâtîn * Ve zelzelete’l-ardi ve dekdekete’l-cibâli min haşyetih * Ve âfete’t-tâ’uni ve’l-vebâi ve ‘ayne’s-sûi ve vece’a’l-cevârihi ve sâira’l-afât * Ve tahfezanâ min külli şerrin ve su’ * Ve terzükana’s-selâmete ve’l-‘âfıyete ve’l-hayra fi’d-dünyâ ve’l-âbirati bi rahmetike yâ erhâme’r-râhi-mîn ve sallallâhü ‘alâ seyyidinâ Mu-hammedin ve âlihî ve sahbihî ecma’în. Ve’l-hamdülillâhi Rabbi’l-‘âlemîn");


        ArrayAdapter arrayAdapter = new ArrayAdapter(cevsenTr.this, R.layout.surelayout, bab);
        trCevsenList.setAdapter(arrayAdapter);

        trCevsenList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), CevsenTrOkunus.class);
                intent.putExtra("bablar", babOkunus.get(position));
                intent.putExtra("title", bab.get(position));
                startActivity(intent);
            }
        });
    }
}

