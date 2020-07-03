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

import java.util.ArrayList;

public class Asrlar extends AppCompatActivity {

    static Bitmap selectedAsr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asrlar);

        ListView listViewAsr = findViewById(R.id.listViewAsr);

        this.setTitle("Aşr-ı Şerifler");

        final ArrayList<String> asrlar = new ArrayList<>();
        asrlar.add("1- AMENERRASULU");
        asrlar.add("2- NEBE ASR-I SERİF");
        asrlar.add("3- AHZAB ASR 38-48");
        asrlar.add("4- HASR HUVALLAHULLEZİ");
        asrlar.add("5- BAKARA 152-157 AŞR");

        Bitmap amenerrasulu = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.amenerrasulu);
        Bitmap amme = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.amme);
        Bitmap ahzab = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.ahzab);
        Bitmap huvallahullezi = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.huvallahullezi);
        Bitmap bakara = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.bakara);

        final ArrayList<Bitmap> asrImages = new ArrayList<>();

        asrImages.add(amenerrasulu);
        asrImages.add(amme);
        asrImages.add(ahzab);
        asrImages.add(huvallahullezi);
        asrImages.add(bakara);


        final ArrayList<String> asrOkunus = new ArrayList<>();
        asrOkunus.add("\n\nAmenerrasûlü Arapça Okunuşu:\n\nAmenerrasûlü bimâ unzile ileyhi min rabbihî vel mu’minûn(mu’minûne), kullun âmene billâhi ve melâiketihî ve kutubihî ve rusulih(rusulihî), lâ nüferrigu beyne ehadin min rusulih(rusulihî), ve gâlû semi’nâ ve eta’nâ ğufrâneke Rabbenâ ve ileykel masîr(masîru).\nLâ yükellifullâhu nefsen illâ vüs’ahâ lehâ mâ kesebet ve aleyhâ mektesebet rabbenâ lâ tuâhıznâ in nesînâ ev ahta’nâ, rabbenâ ve lâ tahmil aleynâ ısran kemâ hameltehu alellezîne min gablinâ, rabbenâ ve lâ tuhammilnâ mâ lâ tâkate lenâ bih(bihî), va’fu annâ, vağfir lenâ, verhamnâ, ente mevlânâ fensurnâ alel gavmil kâfirîn(kâfirîne).\n" +
                "\n" +
                "Amenerrasûlü Meali (Anlamı):\n\nPeygamber, Rabbinden kendisine indirilene iman etti, mü’minler de (iman ettiler). Her biri; Allah’a, meleklerine, kitaplarına ve peygamberlerine iman ettiler ve şöyle dediler: “Onun peygamberlerinden hiçbirini (diğerinden) ayırt etmeyiz.” Şöyle de dediler: “İşittik ve itaat ettik. Ey Rabbimiz! Senden bağışlama dileriz. Sonunda dönüş yalnız sanadır.” Bakara 285 Allah bir kimseyi ancak gücünün yettiği şeyle yükümlü kılar. Onun kazandığı iyilik kendi yararına, kötülük de kendi zararınadır. (Şöyle diyerek dua ediniz): “Ey Rabbimiz! Unutur, ya da yanılırsak bizi sorumlu tutma! Ey Rabbimiz! Bize, bizden öncekilere yüklediğin gibi ağır yük yükleme. Ey Rabbimiz! Bize gücümüzün yetmediği şeyleri yükleme! Bizi affet, bizi bağışla, bize acı! Sen bizim Mevlâmızsın. Kâfirler topluluğuna karşı bize yardım et.”");
        asrOkunus.add("\n\nNebe Aşr-ı Şerif Arapça Okunuşu:\n\n31- İnne lil muttakîne mefâzâ(mefâzen).\n" +
                "32- Hadâika ve a’nâbâ(a’nâben).\n" +
                "33- Ve kevâıbe etrâbâ(etrâben).\n" +
                "34- Ve ke’sen dihâkâ(dihâkan).\n" +
                "35- Lâ yesmeûne fîhâ lagven ve lâ kizzâbâ(kizzâben).\n" +
                "36- Cezâen min rabbike atâen hısâbâ(hısâben).\n" +
                "37- Rabbis semâvâti vel ardı ve mâ beynehumâr rahmâni lâ yemlikûne minhu hitâbâ(hitâben).\n" +
                "38- Yevme yekûmur rûhu vel melâiketu saffâ(saffen), lâ yetekellemûne illâ men ezine lehur rahmânu ve kâle sevâbâ(sevâben).\n" +
                "39- Zâlikel yevmul hakku, fe men şâettehaze ilâ rabbihî meâbâ(meâben).\n" +
                "40- İnnâ enzernâkum azâben karîbâ(karîben), yevme yanzurul mer’u mâ kaddemet yedâhu ve yekûlul kâfiru yâ leytenî kuntu turâbâ(turâben)" + "\n" +
                "Nebe Aşr-ı Şerif Meali (Anlamı):\n\n31- Gerçek şu ki, muttakiler için 'bir kurtuluş ve mutluluk' vardır.\n" +
                "\n" +
                "32- Nice bahçeler ve üzüm bağları.\n" +
                "\n" +
                "33- Göğüsleri henüz tomurcuklanmış yaşıt kızlar.\n" +
                "\n" +
                "34- Dopdolu kadehler.\n" +
                "\n" +
                "35- İçinde, ne 'boş ve saçma bir söz' işitirler, ne bir yalan.\n" +
                "\n" +
                "36- Rabbinden bir karşılık olmak üzere yeterli bir bağış(tır bu).\n" +
                "\n" +
                "37- Göklerin, yerin ve ikisi arasında bulunanların Rabbi Rahman olan (Allah); O'na hitap etmeye güç yetiremezler.\n" +
                "\n" +
                "38- Ruh ve meleklerin saflar halinde duracakları gün; Rahman'ın kendilerine izin verdikleri dışında olanlar konuşmazlar. (Konuşacak olan da,) Doğruyu söyleyecektir.\n" +
                "\n" +
                "39- İşte bu, hak gündür. Şu halde dileyen Rabbine bir dönüşyolu edinsin.\n" +
                "\n" +
                "40- Gerçekten Biz sizi yakın bir azab ile uyardık. Kişinin kendi ellerinin önceden takdim ettiklerine bakacağı gün, kafir olan da: \"Ah, keşke ben bir toprak oluverseydim\" diyecek.");
        asrOkunus.add("\n\nAhzab Aşr Arapça Okunuşu:\n\n38- Ma kane alen nebiyyi min haracin fîma feradallahü leh sünnetellahi fillezîne halev min kabl ve kane emrullahi kaderam makdura\n" +
                "\n" +
                "39- İllezîne yübelliğune risalatillahi ve yahşevnehu ve la yahşevne ehaden ilellah ve kefa billahi hasîba\n" +
                "\n" +
                "40- Ma kane muhammedün eba ehadim mir ricaliküm ve lakir rasulellahi ve hatemen nebiyyîn ve kanellahü bi külli şey'in alîma\n" +
                "\n" +
                "41- Ya eyyühellezîne amenüzkürullahe zikran kesîra\n" +
                "\n" +
                "42- Ve sebbihuhu bükratev ve esîyla\n" +
                "\n" +
                "43- Hüvellezî yüsallî aleyküm ve melaiketühu li yuhriceküm minez zulümati ilen nur ve kane bil mü'minîne rahîyma\n" +
                "\n" +
                "44- Tehîyyetühüm yevme yelkavnehu selam ve eadde lehüm ecran kerîma\n" +
                "\n" +
                "45- Ya eyyühen nebiyyü inna erselnake şahidev ve mübeşşirav ve nezîra\n" +
                "\n" +
                "46- Ve daîyen ilellahi bi iznihî ve siracem münîra\n" +
                "\n" +
                "47- Ve beşşiril mü'minîne bi enne lehüm minellahi fadlen kebîra\n" +
                "\n" +
                "48- Ve la tütîîl kafirîne vel münafikîyne ve da' ezahüm ve tevekkel alellah ve kefa billahi vekîla" + "\n" +
                "\n\nAhzab Aşr Meali (Anlamı):\n\n38- Allah'ın, kendisine farz kıldığı şeyleri yerine getirmesi konusunda peygambere bir darlık yoktur. Daha önce gelip geçen peygamberler hakkında da Allah'ın kanunu böyledir. Allah'ın emri kesinleşmiş bir hükümdür.\n" +
                "\n" +
                "39- Daha önce gelip geçen o peygamberler, Allah'ın vahiylerini tebliğ eden, Allah'tan korkan, başka hiç kimseden korkmayan kimselerdir. Allah hesap görücü olarak yeter.\n" +
                "\n" +
                "40- Muhammed, sizin erkeklerinizden hiçbirinin babası değildir. Fakat o, Allah'ın Resülü ve nebilerin sonuncusudur. Allah her şeyi hakkıyla bilendir.\n" +
                "\n" +
                "41- Ey iman edenler! Allah'ı çokça zikredin.\n" +
                "\n" +
                "42- Onu sabah akşam tespih edin.\n" +
                "\n" +
                "43- O, sizi karanlıklardan aydınlığa çıkarmak için size merhamet eden; melekleri de sizin için bağışlanma dileyendir. Allah mü'minlere çok merhamet edendir.\n" +
                "\n" +
                "44- Allah'a kavuşacakları gün mü'minlere yönelik esenlik dileği `Selam` dır. Allah onlara bol bir mükafat hazırlamıştır.\n" +
                "\n" +
                "45,46- Ey Peygamber! Biz seni bir şahit, bir müjdeleyici, bir uyarıcı; Allah'ın izniyle kendi yoluna çağıran bir davetçi ve aydınlatıcı bir kandil olarak gönderdik.\n" +
                "\n" +
                "47- Mü'minlere kendileri için Allah'tan büyük bir lütuf olduğunu müjdele.\n" +
                "\n" +
                "48- Kâfirlere ve münafıklara itaat etme! Onların eziyetlerine aldırma ve Allah'a tevekkül et. Vekil olarak Allah yeter.");
        asrOkunus.add("\n\nHüvallâhüllezi Arapça Okunuşu:\n\nBismillahirrahmânirrahîm.\n\n" +
                "1- Hüvallâhüllezi lâ ilâhe illâ hû. 'Âlimü'l-ğaybi veş-şehâdeh. Hüver-rahmânür-rahîm.\n\n" +
                "2- Hüvallâhüllezî lâ ilâhe illâ hû. El-melikül-kuddûsüs-selâmül-mü'minül-müheyminül-'azîzül-cebbârul-mütekebbir. Sübhânellâhi 'ammâ yüşrikûn.\n\n" +
                "3- Hüvallâhül-hâlikul-bâriül-müsavviru lehül-esmâülhüsnâ. Yüsebbihu lehü mâ fis-semâvâti vel-ard. Ve hüvel-'azîzül-hakîm.\n" +
                "\nHüvallâhüllezi Meali (Anlamı):\n\nRahmân ve Rahîm olan Allah'ın ismiyle.\n\n" +
                "1- O öyle Allah ki ondan başka Tanrı yok gaybı da bilir şehadeti de, O Rahmân’dır, Rahîm’dir.\n\n" +
                "2- O öyle Allah ki ondan başka tapılacak yok, öyle melik (Padişah) ki kuddus, selam, iman ve emniyyet veren mü'min, gözeten koruyan müheymin, Azîz, Cebbar, mütekebbir, tenzih o Allah’a muşriklerin şirkinden.\n" +
                "3- O öyle Allah ki Halık, Barî, Müsavvir O, en güzel isimler (Esma-i hüsnâ) onun, bütün göklerdeki ve yerdeki ona tesbih eder, O öyle Aziz öyle hakîmdir.\n\n");
        asrOkunus.add("\n\nBakara 153-157 Aşr Arapça Okunuşu:\n\n153- Ya eyyühellezıne amenüsteıynu bis sabri ves salah* innellahe meas sabirın\n\n" +
                "154- Ve la tekulu li mey yuktelü fı sebılillahi emvat* bel ahyaüv ve lakil la teş'urun\n\n" +
                "155- Ve le neblüvenneküm bi şey'im minel havfi vel cuı ve naksım minel emvali vel enfüsi ves semerat* ve beşşiris sabirın\n\n" +
                "156- Ellezıne iza esabethüm müsıybetün kalu inna lillahi ve inna ileyhi raciun\n\n" +
                "157- Ülaike alayhim salevatüm mir rabbihim ve rahmetüv ve ülaike hümül mühtedun\n\n" +
                "\n" +
                "Bakara 153-157 Aşr Meali (Anlamı):\n\n153- Ey iman edenler, sabırla ve namazla yardım dileyin. Gerçekten Allah, sabredenlerle beraberdir.\n" +
                "\n" +
                "154- Ve sakın Allah yolunda öldürülenlere \"ölüler\" demeyin; hayır onlar diridirler. Fakat siz bunun şuurunda değilsiniz.\n" +
                "\n" +
                "155- Andolsun, Biz sizi biraz korku, açlık ve bir parça mallardan, canlardan ve ürünlerden eksiltmekle imtihan edeceğiz. Sabır gösterenleri müjdele.\n" +
                "\n" +
                "156- Onlara bir musibet isabet ettiğinde, derler ki: \"Biz Allah'a ait (kullar)ız ve şüphesiz O'na dönücüleriz.\"\n" +
                "\n" +
                "157- Rablerinden bağışlanma (salat) ve rahmet bunların üzerinedir ve hidayete erenler de bunlardır.");

        final ArrayList<String> asrlarArab = new ArrayList<>();
        asrlarArab.add("{آمَنَ الرَّسُولُ بِمَا أُنْزِلَ إِلَيْهِ مِنْ رَبِّهِ وَالْمُؤْمِنُونَ كُلٌّ آمَنَ بِاللهِ وَمَلاَئِكَتِهِ وَكُتُبِهِ وَرُسُلِهِ لاَ نُفَرِّقُ بَيْنَ أَحَدٍ مِنْ رُسُلِهِ وَقَالُوا سَمِعْنَا وَأَطَعْنَا غُفْرَانَكَ رَبَّنَا وَإِلَيْكَ الْمَصِيرُ}\n" +
                "\n" +
                "{لاَ يُكَلِّفُ اللهُ نَفْسًا إِلاَّ وُسْعَهَا لَهَا مَا كَسَبَتْ وَعَلَيْهَا مَا اكْتَسَبَتْ رَبَّنَا لاَ تُؤَاخِذْنَا إِنْ نَسِينَا أَوْ أَخْطَأْنَا رَبَّنَا وَلاَ تَحْمِلْ عَلَيْنَا إِصْرًا كَمَا حَمَلْتَهُ عَلَى الَّذِينَ مِنْ قَبْلِنَا رَبَّنَا وَلاَ تُحَمِّلْنَا مَا لاَ طَاقَةَ لَنَا بِهِ وَاعْفُ عَنَّا وَاغْفِرْ لَنَا وَارْحَمْنَا أَنْتَ مَوْلاَنَا فَانْصُرْنَا عَلَى الْقَوْمِ الْكَافِرِينَ}\n");
        asrlarArab.add("\n" +
                "{إِنَّ لِلْمُتَّقِينَ مَفَازًا}\n" +
                "{حَدَائِقَ وَأَعْنَابًا}\n" +
                "{وَكَوَاعِبَ أَتْرَابًا}\n" +
                "{وَكَأْسًا دِهَاقًا}\n" +
                "{لاَ يَسْمَعُونَ فِيهَا لَغْوًا وَلاَ كِذَّابًا}\n" +
                "{جَزَاءً مِنْ رَبِّكَ عَطَاءً حِسَابًا}\n" +
                "{رَبِّ السَّمَاوَاتِ وَالأَرْضِ وَمَا بَيْنَهُمَا الرَّحْمَنِ لاَ يَمْلِكُونَ مِنْهُ خِطَابًا}\n" +
                "{يَوْمَ يَقُومُ الرُّوحُ وَالْمَلاَئِكَةُ صَفًّا لاَ يَتَكَلَّمُونَ إِلاَّ مَنْ أَذِنَ لَهُ الرَّحْمَنُ وَقَالَ صَوَابًا}\n" +
                "{ذَلِكَ الْيَوْمُ الْحَقُّ فَمَنْ شَاءَ اتَّخَذَ إِلَى رَبِّهِ مَآبًا}\n" +
                "{إِنَّا أَنْذَرْنَاكُمْ عَذَابًا قَرِيبًا يَوْمَ يَنْظُرُ الْمَرْءُ مَا قَدَّمَتْ يَدَاهُ وَيَقُولُ الْكَافِرُ يَا لَيْتَنِي كُنْتُ تُرَابًا}\n");
        asrlarArab.add(
                "{مَا كَانَ عَلَى النَّبِيِّ مِنْ حَرَجٍ فِيمَا فَرَضَ اللهُ لَهُ سُنَّةَ اللهِ فِي الَّذِينَ خَلَوْا مِنْ قَبْلُ وَكَانَ أَمْرُ اللهِ قَدَرًا مَقْدُورًا}\n" +
                "{الَّذِينَ يُبَلِّغُونَ رِسَالاَتِ اللهِ وَيَخْشَوْنَهُ وَلاَ يَخْشَوْنَ أَحَدًا إِلاَّ اللهَ وَكَفَى بِاللهِ حَسِيبًا}\n" +
                "{مَا كَانَ مُحَمَّدٌ أَبَا أَحَدٍ مِنْ رِجَالِكُمْ وَلَكِنْ رَسُولَ اللهِ وَخَاتَمَ النَّبِيِّينَ وَكَانَ اللهُ بِكُلِّ شَيْءٍ عَلِيمًا}\n" +
                "{يَا أَيُّهَا الَّذِينَ آمَنُوا اذْكُرُوا اللهَ ذِكْرًا كَثِيرًا}\n" +
                "{وَسَبِّحُوهُ بُكْرَةً وَأَصِيلاً}\n" +
                "{هُوَ الَّذِي يُصَلِّي عَلَيْكُمْ وَمَلاَئِكَتُهُ لِيُخْرِجَكُمْ مِنَ الظُّلُمَاتِ إِلَى النُّورِ وَكَانَ بِالْمُؤْمِنِينَ رَحِيمًا}\n" +
                "{تَحِيَّتُهُمْ يَوْمَ يَلْقَوْنَهُ سَلاَمٌ وَأَعَدَّ لَهُمْ أَجْرًا كَرِيمًا}\n" +
                "{يَا أَيُّهَا النَّبِيُّ إِنَّا أَرْسَلْنَاكَ شَاهِدًا وَمُبَشِّرًا وَنَذِيرًا}\n" +
                "{وَدَاعِيًا إِلَى اللهِ بِإِذْنِهِ وَسِرَاجًا مُنِيرًا}\n" +
                "{وَبَشِّرِ الْمُؤْمِنِينَ بِأَنَّ لَهُمْ مِنَ اللهِ فَضْلاً كَبِيرًا}\n" +
                "{وَلاَ تُطِعِ الْكَافِرِينَ وَالْمُنَافِقِينَ وَدَعْ أَذَاهُمْ وَتَوَكَّلْ عَلَى اللهِ وَكَفَى بِاللهِ وَكِيلاً}\n");
        asrlarArab.add(
                "{لاَ يَسْتَوِي أَصْحَابُ النَّارِ وَأَصْحَابُ الْجَنَّةِ أَصْحَابُ الْجَنَّةِ هُمُ الْفَائِزُونَ}\n" +
                "{لَوْ أَنْزَلْنَا هَذَا الْقُرْآنَ عَلَى جَبَلٍ لَرَأَيْتَهُ خَاشِعًا مُتَصَدِّعًا مِنْ خَشْيَةِ اللهِ وَتِلْكَ الأَمْثَالُ نَضْرِبُهَا لِلنَّاسِ لَعَلَّهُمْ يَتَفَكَّرُونَ}\n" +
                "{هُوَ اللهُ الَّذِي لاَ إِلَهَ إِلاَّ هُوَ عَالِمُ الْغَيْبِ وَالشَّهَادَةِ هُوَ الرَّحْمَنُ الرَّحِيمُ}\n" +
                "{هُوَ اللهُ الَّذِي لاَ إِلَهَ إِلاَّ هُوَ الْمَلِكُ الْقُدُّوسُ السَّلاَمُ الْمُؤْمِنُ الْمُهَيْمِنُ الْعَزِيزُ الْجَبَّارُ الْمُتَكَبِّرُ سُبْحَانَ اللهِ عَمَّا يُشْرِكُونَ}\n" +
                "{هُوَ اللهُ الْخَالِقُ الْبَارِئُ الْمُصَوِّرُ لَهُ الأَسْمَاءُ الْحُسْنَى يُسَبِّحُ لَهُ مَا فِي السَّمَاوَاتِ وَالأَرْضِ وَهُوَ الْعَزِيزُ الْحَكِيمُ}\n");
        asrlarArab.add(
                "{فَاذْكُرُونِي أَذْكُرْكُمْ وَاشْكُرُوا لِي وَلاَ تَكْفُرُونِ}\n" +
                "{يَا أَيُّهَا الَّذِينَ آمَنُوا اسْتَعِينُوا بِالصَّبْرِ وَالصَّلاَةِ إِنَّ اللهَ مَعَ الصَّابِرِينَ}\n" +
                "{وَلاَ تَقُولُوا لِمَنْ يُقْتَلُ فِي سَبِيلِ اللهِ أَمْوَاتٌ بَلْ أَحْيَاءٌ وَلَكِنْ لاَ تَشْعُرُونَ}\n" +
                "{وَلَنَبْلُوَنَّكُمْ بِشَيْءٍ مِنَ الْخَوْفِ وَالْجُوعِ وَنَقْصٍ مِنَ الأَمْوَالِ وَالأَنْفُسِ وَالثَّمَرَاتِ وَبَشِّرِ الصَّابِرِينَ}\n" +
                "{الَّذِينَ إِذَا أَصَابَتْهُمْ مُصِيبَةٌ قَالُوا إِنَّا لِلَّهِ وَإِنَّا إِلَيْهِ رَاجِعُونَ}\n" +
                "{أُولَئِكَ عَلَيْهِمْ صَلَوَاتٌ مِنْ رَبِّهِمْ وَرَحْمَةٌ وَأُولَئِكَ هُمُ الْمُهْتَدُونَ}\n");

        ArrayAdapter arrayAdapter = new ArrayAdapter(Asrlar.this,R.layout.surelayout,asrlar);

        listViewAsr.setAdapter(arrayAdapter);

        listViewAsr.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(),AsrOkunus.class);
                intent.putExtra("name",asrOkunus.get(position));
                intent.putExtra("arabic",asrlarArab.get(position));
                intent.putExtra("title",asrlar.get(position));
                selectedAsr = asrImages.get(position);
                startActivity(intent);
            }
        });
    }
}