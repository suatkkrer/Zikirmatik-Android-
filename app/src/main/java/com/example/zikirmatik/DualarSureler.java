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

public class DualarSureler extends AppCompatActivity {

    static Bitmap selectedImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dualar_sureler);

        ListView listViewSure = findViewById(R.id.listViewSure);

        this.setTitle("Sureler");

        final ArrayList<String> sureler = new ArrayList<>();
        sureler.add("1- Fatiha Suresi");
        sureler.add("2- Duha Suresi");
        sureler.add("3- Insirah Suresi");
        sureler.add("4- Tin Suresi");
        sureler.add("5- Alak Suresi");
        sureler.add("6- Kadir Suresi");
        sureler.add("7- Beyyine Suresi");
        sureler.add("8- Zilzal Suresi");
        sureler.add("9- Adiyat Suresi");
        sureler.add("10- Kari'a Suresi");
        sureler.add("11- Tekasür Suresi");
        sureler.add("12- Asr Suresi");
        sureler.add("13- Hümeze Suresi");
        sureler.add("14- Fil Suresi");
        sureler.add("15- Kureys Suresi");
        sureler.add("16- Ma'un Suresi");
        sureler.add("17- Kevser Suresi");
        sureler.add("18- Kafirun Suresi");
        sureler.add("19- Nasr Suresi");
        sureler.add("20- Tebbet Suresi");
        sureler.add("21- Ihlas Suresi");
        sureler.add("22- Felak Suresi");
        sureler.add("23- Nas Suresi");

        Bitmap fatiha = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.fatiha);
        Bitmap duha = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.duha);
        Bitmap insirah = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.insirah);
        Bitmap tin = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.tin);
        Bitmap alak = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.alak);
        Bitmap kadir = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.kadir);
        Bitmap beyyine = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.beyyine);
        Bitmap zilzal = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.zilzal);
        Bitmap adiyat = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.adiyat);
        Bitmap karia = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.karia);
        Bitmap tekasur = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.tekasur);
        Bitmap asr = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.asr);
        Bitmap humeze = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.humeze);
        Bitmap fil = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.fil);
        Bitmap kureys = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.kureys);
        Bitmap maun = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.maun);
        Bitmap kevser = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.kevser);
        Bitmap kafirun = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.kafirun);
        Bitmap nasr = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.nasr);
        Bitmap tebbet = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.tebbet);
        Bitmap ihlas = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.ihlas);
        Bitmap felak = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.felak);
        Bitmap nas = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.nas);

        final ArrayList<Bitmap> sureImages = new ArrayList<>();
        sureImages.add(fatiha);
        sureImages.add(duha);
        sureImages.add(insirah);
        sureImages.add(tin);
        sureImages.add(alak);
        sureImages.add(kadir);
        sureImages.add(beyyine);
        sureImages.add(zilzal);
        sureImages.add(adiyat);
        sureImages.add(karia);
        sureImages.add(tekasur);
        sureImages.add(asr);
        sureImages.add(humeze);
        sureImages.add(fil);
        sureImages.add(kureys);
        sureImages.add(maun);
        sureImages.add(kevser);
        sureImages.add(kafirun);
        sureImages.add(nasr);
        sureImages.add(tebbet);
        sureImages.add(ihlas);
        sureImages.add(felak);
        sureImages.add(nas);

        final ArrayList<String> sureOkunus = new ArrayList<>();
        sureOkunus.add(
                "Fatiha Suresi Arapça Okunuşu:\n" + "\n" +  "1- Bismillâhi’r-Rahmâni’r-Rahîm.\n2- Elhamdulillâhi Rabbi’l-âlemîn.\n3- Er-Rahmâni’r-Rahîm.\n4- Mâliki yevmi’d-dîn.\n5- İyyâke na’budu ve iyyâke neste’în.\n6- İhdine’s-sırâta’l-mustakîm.\n7- Sırâta’l-lezîne en’amte aleyhim. Ğayri’l-meğdûbi aleyhim ve le’d-dâllîn.”\n" +
                "\n" +
                "Fatiha Suresi Meali (Anlamı):\n" + "\n" + "1- “Rahmân ve Rahîm olan Allah’ın adıyla.\n2- Hamd; Âlemlerin Rabbi olan Allah’a aittir.\n3- (O Allah) Rahmân ve Rahîm’dir.\n4- Din (ödül ve ceza) gününün sahibidir.\n5- (Ey Allah’ım) Biz yalnızca Sana ibadet eder ve yalnızca Sen’den yardım dileriz.\n6- Bizi dosdoğru yola ilet.\n7- Kendilerine nimet verdiğin kimselerin yoluna ilet, gazaba uğrayanların ve sapıkların yoluna değil.”");
        sureOkunus.add("Duha Suresi Arapça Okunuşu:\n" + "\n" +
                "Bismillahirrahmânirrahîm.\n" +
                " 1- Vedduha.\n" +
                " 2- Velleyli iza seca.\n" +
                " 3- Ma vedde'ake rabbüke ve ma kala.\n" +
                " 4- Ve lel'ahıretü hayrün leke minel'ula.\n" +
                " 5- Ve lesevfe yu'tıyke rabbüke feterda.\n" +
                " 6- Elem yecidke yetiymen feava.\n" +
                " 7- Ve vecedeke dallen feheda.\n" +
                " 8- Ve vecedeke 'ailen feağna.\n" +
                " 9- Feemmel yetiyme fela tekhar.\n" +
                " 10- Ve emmessaile fela tenher.\n" +
                " 11- Ve emma binı'meti rabbike fehaddis.\n" + "\n" +
                "Duha Suresi Meali (Anlamı):\n" + "\n" + "Rahmân ve Rahîm olan Allah'ın ismiyle.\n 1- Andolsun kuşluk vaktine\n " +
                "2- ve dindiği zaman o geceye ki,\n 3- Rabbin sana veda etmedi ve darılmadı! \n4- Ve kesinlikle senin için sonu önünden (ahiret dünyadan) daha hayırlıdır.\n5- ileride Rabbin sana verecek de hoşnut olacaksın!\n" +
                "6- O, seni bir yetim iken barındırmadı mı? \n7- Seni, yol bilmez iken (doğru) yola koymadı mı? \n8- Seni bir yoksul iken zengin etmedi mi?\n" +
                "9- Öyle ise, sakın yetime kahretme (onu horlama)! \n10- El açıp isteyeni de azarlama! \n11- Fakat Rabbinin nimetini anlat da anlat!");
        sureOkunus.add("İnşirah Suresi Arapça Okunuşu:\n\n" +
                "Bismillahirrahmânirrahîm.\n" +
                "1- Elem neşrah leke sadrek\n" +
                "2- Ve vada’na ‘anke vizreke\n" +
                "3- Elleziy enkada zahreke\n" +
                "4- Ve refa’na leke zikreke\n" +
                "5- Feinne me’al’usri yüsren\n" +
                "6- İnne me’al’usri yüsren\n" +
                "7- Feiza ferağte fensab\n" +
                "8- Ve ila rabbike ferğab\n" +
                "\n" +
                "İnşirah Suresi Meali (Anlamı):\n\n" +
                "Rahmân ve Rahîm olan Allah’ın ismiyle.\n" +
                "1- Senin için bağrını açmadık mı?\n" +
                "2- İndirmedik mi senden o yükünü?\n" +
                "3- O sırtında gıcırdamakta olan (ve bu şekilde sana eziyet veren) yükünü?\n" +
                "4- Senin şanını yüceltmedik mi?\n" +
                "5- Demek ki, zorlukla beraber bir kolaylık var.\n" +
                "6- Evet o zorlukla beraber bir kolaylık var!\n" +
                "7- O halde boş kaldığında yine kalk yorul!\n" +
                "8- Ve ancak Rabbinden ümit et, hep O’na doğrul!");
        sureOkunus.add("Tin Suresi Arapça Okunuşu:\n\n" +
                "Bismillahirrahmânirrahîm.\n" +
                "1- Vettiyni vezzeytuni\n" +
                "2- Ve turi siyniyne\n" +
                "3- Ve hazelbeledil’emiyni\n" +
                "4- Lekad halaknel’insane fiy ahseni takviymin\n" +
                "5- Sümme redednahü esfele safiliyne\n" +
                "6- İllelleziyne amenu ve amilussalihati felehum ecrun gayru memnuun\n" +
                "7- Fema yukezzibuke ba’du biddiin\n" +
                "8- Eleysallahu bi ahkemil hakimiyn\n" +
                "\n" +
                "Tin Suresi Meali (Anlamı):\n\n" +
                "Rahmân ve Rahîm olan Allah’ın ismiyle.\n" +
                "1- Andolsun o incire, o zeytine,\n" +
                "2- Sinin (Sina) dağına\n" +
                "3- ve bu güvenli beldeye ki,\n" +
                "4- Biz insanı en güzel biçimde yarattık.\n" +
                "5- Sonra da çevirdik aşağıların aşağısına kaktık.\n" +
                "6- Ancak iman edip yararlı işler yapan kimseler başka; onlar için kesilmez bir mükafat vardır.\n" +
                "7- O halde artık sana dini ne yalanlatabilir?\n" +
                "8- Allah hakimlerin hakimi değil mi?");
        sureOkunus.add("Alak Suresi Arapça Okunuşu:\n\n" +
                "Bismillahirrahmânirrahîm.\n" +
                "1- Ikra’ bismi rabbikelleziy halak\n" +
                "2- Halekal’insane min ‘alak\n" +
                "3- Ikre’ ve rabbükel’ekrem\n" +
                "4- Elleziy ‘alleme bilkalem\n" +
                "5- Allemel’insane ma lem ya’lem\n" +
                "6- Kella innel’insane leyatğa\n" +
                "7- Erra a hustağna\n" +
                "8- İnne ila rabbikerrü’câ\n" +
                "9- Eraeytelleziy yenha\n" +
                "10- Abden iza salla\n" +
                "11- Eraeyte in kane ‘alelhüda\n" +
                "12- Ev emara bittakva\n" +
                "13- Eraeyte in kezzebe ve tevella\n" +
                "14- Elem ya’lem biennallahe yera\n" +
                "15- Kella lein lem yentehi lenesfe’an binnasıyeh\n" +
                "16- Nasıyetin kezibetin hatıeh\n" +
                "17- Felyed’u nadiyehu.\n" +
                "18- Sened’uzzebaniyete.\n" +
                "19- Kella la tütı’hü vescüd vakterib\n" +
                "\n" +
                "Alak Suresi Meali (Anlamı):\n\n" +
                "Rahmân ve Rahîm olan Allah’ın ismiyle.\n" +
                "1- Yaratan Rabbinin adıyla oku!\n" +
                "2- İnsanı bir kan pıhtısından yarattı!\n" +
                "3- Oku! Rabbin sonsuz kerem sahibidir.\n" +
                "4- O Rab ki kalemle yazmayı öğretti.\n" +
                "5- İnsana bilmediği şeyleri öğretti.\n" +
                "6- Hayır! Doğrusu (kâfir) insan azgınlık eder.\n" +
                "7- Kendisinin muhtaç olmadığını zannettiği için.\n" +
                "8- Muhakkak ki dönüş mutlaka Rabbinedir.\n" +
                "9-10 – Namaz kıldığı zaman, bir kulu engelleyeni gördün mü?\n" +
                "11- Gördün mü (ne dersin?), ya o (kul) doğru yolda olur,\n" +
                "12- Veya kötülüklerden sakınmayı emrederse?\n" +
                "13- Gördün mü, ya bu (adam, hakkı) yalanlar, yüzçevirirse,\n" +
                "14- O adam, Allah’ın kendini gördüğünü hiç bilmiyor mu?\n" +
                "15-16 – Hayır, hayır! Eğer o, bu davranışından vazgeçmezse, and olsun ki biz, onu perçeminden, o günahkâr ve yalancı perçeminden tutup cehenneme sürükleriz.\n" +
                "17- O zaman o taraftarlarını yardıma çağırsın.\n" +
                "18- Biz de Zebanileri çağıracağız.\n" +
                "19- Hayır, sakın onu dinleme de, secde et ve yaklaş!");
        sureOkunus.add("Kadir Suresi Arapça Okunuşu\n\n" +
                "Bismillahirrahmânirrahîm.\n" +
                "1- İnna enzelnahü fiy leyletilkadr\n" +
                "2- Ve ma edrake ma leyletülkadr\n" +
                "3- Leyletülkadri hayrüm min elfi şehr\n" +
                "4- Tenezzelülmelaiketü verruhu fiyha biizni rabbihim min külli emr\n" +
                "5- Selamün hiye hatta matle’ılfecr\n" +
                "\n" +
                "Kadir Suresi Meali (Anlamı)\n\n" +
                "Rahmân ve Rahîm olan Allah’ın ismiyle.\n" +
                "1- Biz o (Kur’ân)nu Kadir gecesinde indirdik.\n" +
                "2- Kadir gecesinin ne olduğunu sen nereden bileceksin?\n" +
                "3- Kadir gecesi bin aydan daha hayırlıdır.\n" +
                "4- Melekler ve Ruh (Cebrail veya Ruh adındaki melek) o gece Rablerinin izniyle, her iş için inerler.\n" +
                "5- O gece, tanyeri ağarıncaya kadar süren bir selâmettir.");
        sureOkunus.add("Beyyine Suresi Arapça Okunuşu\n\n" +
                "Bismillahirrahmânirrahîm.\n" +
                "1- Lem yekünillezine keferu min ehlil kitabi velmüşrikine münfekkıyne hatta te’tiye hümülbeyyineh\n" +
                "2- Rasulüm minallahi yetlu suhufem mütahherah\n" +
                "3- Fiha kütübün kayyimeh\n" +
                "4- Ve ma teferrekallezıne utül kitabe illa min ba’di ma caethümül beyyineh\n" +
                "5- Ve ma ümiru illa liya’büdüllahe muhlisıyne lehüd din hunefae ve yükıymussalate ve yü’tüzzekane ve zalike diynülkayyimeh\n" +
                "6- İnnelleziyne keferu min ehlilkitabi velmüşrikiyne fiy nari cehenneme halidiyne fiyha ülaike hüm şerrülberiyyeh\n" +
                "7- İnnelleziyne amenu ve ‘amilussalihati ülaike hüm hayrülberiyyeh\n" +
                "8- Cezaühüm’ınde rabbihim cennatü ‘adnin tecriy min tahtihel’enharü halidiyne fiyha ebeden radıyallahü ‘anhüm ve radu ‘anhü zalike limen haşiye rabbeh\n" +
                "\n" +
                "Beyyine Suresi Meali (Anlamı)\n\n" +
                "Rahmân ve Rahîm olan Allah’ın ismiyle.\n" +
                "1- Kitap ehlinden ve müşriklerden (Hakk’ı) tanımayanlar, kendilerine açık delil gelinceye kadar inkârlarından ayrılacak değillerdi.\n" +
                "2- (Bu delil), tertemiz sayfaları okuyan, Allah tarafından gönderilmiş bir peygamberdir.\n" +
                "3- O sayfalarda, en doğru hükümler vardır.\n" +
                "4- Kitap ehli, ancak kendilerine apaçık delil geldikten sonra ayrılığa düştüler.\n" +
                "5- Halbuki onlar, dini sadece Allah’a tahsis ederek, Allah’ı birleyerek, ancak Allah’a ibadet etmekle, namazı kılmakla ve zekatı vermekle emrolunmuşlardır. İşte dosdoğru din budur.\n" +
                "6- Kâfirler, gerek kitap ehlinden olsun gerek puta tapanlardan olsun muhakkak, cehennem ateşindedirler. Orada ebedî olarak kalacaklardır. Onlar, insanların en şerlileridir.\n" +
                "7- İnanan ve güzel amel işleyenler de insanların en hayırlılarıdır.\n" +
                "8- Rableri katında onların mükâfatı, altlarından ırmaklar akan Adn cennetleridir. Orada ebedî olarak kalacaklardır. Allah onlardan razı olmuş, onlar da O’ndan razı olmuşlardır. İşte bu mükâfat, Rabbine saygı gösterene mahsustur.");
        sureOkunus.add("Zilzal Suresi Arapça Okunuşu\n\n" +
                "Bismillahirrahmânirrahîm.\n" +
                "1- İza zülziletil erdu zilzaleha\n" +
                "2- Ve ahracetilerdu eskaleha\n" +
                "3- Ve kalel insanü ma leha\n" +
                "4- Yevmeizin tühaddisü ahbaraha\n" +
                "5- Bienne rabbeke evha leha\n" +
                "6- Yevmeiziy yasdürun nasü eştatel li yürav a’malehüm\n" +
                "7- Fe mey ya’mel miskale zerratin hayray yerah\n" +
                "8- Ve mey ya’mel miskale zerratin şerray yerah\n" +
                "\n" +
                "Zilzal Suresi Meali (Anlamı)\n\n" +
                "Rahmân ve Rahîm olan Allah’ın ismiyle.\n" +
                "1- Yer o yaman sarsıntı ile sarsıldığı,\n" +
                "2- Yer, içindeki ağırlıkları çıkarıp dışarı attığı,\n" +
                "3- Ve insan: “Ona ne oluyor?” dediği zaman.\n" +
                "4- O gün yer, bütün haberlerini anlatır.\n" +
                "5- Çünkü Rabbin ona vahyetmiştir.\n" +
                "6- O gün insanlar, amellerinin karşılığı kendilerine gösterilmek üzere bölük bölük çıkacaklardır.\n" +
                "7- Her kim zerre kadar hayır işlemişse onu görecektir.\n" +
                "8- Her kim, zerre kadar şer işlemişse onu görecektir.");
        sureOkunus.add("Adiyat Suresi Arapça Okunuşu\n\n" +
                "Bismillahirrahmânirrahîm.\n" +
                "1- Vel adiyati dabha\n" +
                "2- Fel muriyati kadha\n" +
                "3- Fel muğırati subha\n" +
                "4- Fe eserne bihı nak’a\n" +
                "5- Fe vesatne bihı cem’a\n" +
                "6- İnnelinsane li rabbihı le kenud\n" +
                "7- Ve innehu ala zalike le şehıd\n" +
                "8- Ve innehu li hubbil hayri le şedıd\n" +
                "9- E fe la ya’lemü iza bu’sira ma fil kubur\n" +
                "10- Ve hussıle ma fis sudur\n" +
                "11- İnne rabbehüm bihim yevmeizin le habir\n" +
                "\n" +
                "Adiyat Suresi Meali (Anlamı)\n\n" +
                "Rahmân ve Rahîm olan Allah’ın ismiyle.\n" +
                "1- O harıl harıl (savaşa) koşanlara,\n" +
                "2- (Tırnaklarıyla yerden) ateş çıkaranlara,\n" +
                "3- Sabahleyin akın edenlere,\n" +
                "4- Tozu dumana karıştıranlara,\n" +
                "5- Derken bir topluluğun ortasına dalanlara yemin ederim ki,\n" +
                "6- Şüphesiz insan, Rabbine karşı çok nankördür.\n" +
                "7- Ve kendisi de buna şahittir.\n" +
                "8- Gerçekten o dünya malını çok sevdiği için katıdır.\n" +
                "9- Bilmiyor mu ki, kabirlerin içindekiler fırlatılacak.\n" +
                "10- Ve sinelerin içindekiler derlenecek.\n" +
                "11- O gün Rableri onların bütün yaptıklarından haberdardır.");
        sureOkunus.add("Karia Suresi Arapça Okunuşu\n\n" +
                "Bismillahirrahmânirrahîm.\n" +
                "1- El kariah\n" +
                "2- Mel kariah\n" +
                "3- Ve ma edrake mel kariah\n" +
                "4- Yevme yekunün nasü kelferaşil mebsus\n" +
                "5- Ve tekunül cibalü kelıhnil menfuş\n" +
                "6- Fe emma men sekulet mevazınüh\n" +
                "7- Fe hüve fi ıyşetir radıyeh\n" +
                "8- Ve emma men haffet mevazınüh\n" +
                "9- Fe ümmühu havıyeh\n" +
                "10- Ve ma edrake mahiyeh\n" +
                "11- Narun hamiyeh\n" +
                "\n" +
                "Karia Suresi Meali (Anlamı)\n\n" +
                "Rahmân ve Rahîm olan Allah’ın ismiyle.\n" +
                "1- O apaçık bela (Kıyamet)…\n" +
                "2- Nedir o çarpacak bela?\n" +
                "3- O çarpacak belanın ne olduğunu ne bildirdi ki sana?\n" +
                "4- O gün insanlar çırpınıp yayılan pervaneler gibi olacak.\n" +
                "5- Dağlar da didilmiş renkli yünler gibi atılacaktır.\n" +
                "6- İşte o zaman tartıları ağır basan kimse,\n" +
                "7- Artık hoşnut olacağı bir hayat içindedir o.\n" +
                "8- Fakat tartıları hafif gelen kimse.\n" +
                "9- O vakit onun anası Haviyedir.\n" +
                "10- Ve bildin mi, Haviye nedir?\n" +
                "11- Kızışmış bir ateştir!");
        sureOkunus.add("Tekasür Suresi Arapça Okunuşu\n\n" +
                "Bismillahirrahmânirrahîm.\n" +
                "1- Elhakümüt tekasür\n" +
                "2- Hatta zürtümülmekabir\n" +
                "3- Kella sevfe ta’lemun\n" +
                "4- Sümme kella sevfe ta’lemun\n" +
                "5- Kella lev ta’lemune ılmel yekıyn\n" +
                "6- Le teravünnelcehıym\n" +
                "7- Sümme leteravünneha aynelyakıyn\n" +
                "8- Sümme le tüs’elünne yevmeizin anin neıym\n" +
                "\n" +
                "Tekasür Suresi Meali (Anlamı)\n\n" +
                "Rahmân ve Rahîm olan Allah’ın ismiyle.\n" +
                "1- O çokluk kuruntusu sizleri oyaladı,\n" +
                "2- Ta kabirlere kadar gidip ziyaret edişinize kadar!\n" +
                "3- Öyle değil, ileride bileceksiniz!\n" +
                "4- Sonra yine öyle değil, ileride bileceksiniz!\n" +
                "5- Öyle değil, kesin olarak bilseniz,\n" +
                "6- Andolsun ki, cehennemi mutlaka göreceksiniz!\n" +
                "7- Sonra yine andolsun ki, onu yakın gözüyle göreceksiniz!\n" +
                "8- Sonra andolsun ki, o gün her nimetten sorgulanacaksınız!");
        sureOkunus.add("Asr Suresi Arapça Okunuşu\n\n" +
                "Bismillahirrahmânirrahîm.\n" +
                "1- Vel asr\n" +
                "2- İnnel insane le fi husr\n" +
                "3- İllellezıne amenu ve amilus salihati ve tevasav bil hakkı ve tevasav bis sabr\n" +
                "\n" +
                "Asr Suresi Meali (Anlamı)\n\n" +
                "Rahmân ve Rahîm olan Allah’ın ismiyle.\n" +
                "1- Asra yemin olsun ki,\n" +
                "2- İnsan mutlaka ziyandadır.\n" +
                "3- Ancak iman edenler, salih amel (iyi işler) işleyenler, birbirlerine hakkı tavsiye eden ve sabrı tavsiye edenler bunun dışındadır.");
        sureOkunus.add("Hümeze Suresi Arapça Okunuşu\n\n" +
                "Bismillahirrahmânirrahîm.\n" +
                "1- Veylül li külli hümezetil lümezeh\n" +
                "2- Ellezıcemea malev ve addedeh\n" +
                "3- Yahsebü enne malehu ahledeh\n" +
                "4- Kella le yümbezenne fil hutameh\n" +
                "5- Ve ma edrake mel hutameh\n" +
                "6- Narullahil mukadeh\n" +
                "7- Elleti tettaliu alel ef’ideh\n" +
                "8- İnneha aleyhim mü’sadeh\n" +
                "9- Fi amedim mümeddedeh\n" +
                "\n" +
                "Hümeze Suresi Meali (Anlamı)\n\n" +
                "Rahmân ve Rahîm olan Allah’ın ismiyle.\n" +
                "1- Veyl o insanları çekiştirip kaş göz işaretleriyle alay edenlerin bütününe\n" +
                "2- Ve bir mal toplayıp hep onu sayana!\n" +
                "3- Malının, kendisini ebedi yaşatacağını sanır.\n" +
                "4- Hayır, andolsun ki, o Hutame’ye (cehenneme) atılacaktır!\n" +
                "5- Bildin mi Hutame nedir?\n" +
                "6- Allah’ın, tutuşturulmuş ateşidir\n" +
                "7- Ki, gönüllerin ta üstüne çıkar!\n" +
                "8- O (ateş), onların üstüne kapatılacaktır mutlaka,\n" +
                "9- Uzatılmış sütunlar içinde olarak.");
        sureOkunus.add("Fil Suresi Arapça Okunuşu:\n" + "\n" + "Bismillâhi’r-Rahmâni’r-Rahîm.\n1- “Elemtera keyfe fe’ale Rabbuke bi-ashâbi’l-fîl.\n2- Elem yec’al keydehum fî tadlîl.\n3- Ve ersele ’aleyhim tayran ebâbîl.\n4- Termîhim bi-hicâratin min siccîl.\n5- Fece’alehum ke’asfin me’kûl.\n" +
                "\n" +
                "Fil Suresi Meali (Anlamı):\n" + "\n" + "Rahmân ve Rahîm olan Allah’ın adıyla.\n1- “Rabbin fil sahiplerine neler etti, görmedin mi?\n2- Onların kötü planlarını boşa çıkarmadı mı?\n3- Onların üstüne ebabil kuşları gönderdi.\n4- O kuşlar, onların üzerlerine pişkin tuğladan yapılmış taşlar atıyordu.\n5- Böylece Allah onları yenilip çiğnenmiş ekine çevirdi.");
        sureOkunus.add("Kureyş Suresi Arapça Okunuşu:\n" + "\n" + " Bismillâhi’r-Rahmâni’r-Rahîm.\n1- Li îlâfi kurayş.\n2- Îlâfihim rihlete’ş-şitâi ve’s-sayf.\n3- Felya’budû Rabbe hâze’l-beyt.\n4- Ellezî et’amehum min cû’in ve âmenehum min havf.\n" +
                "\n" +
                "Kureyş Suresi Meali (Anlamı):\n"+ "\n" + "Rahmân ve Rahîm olan Allah’ın adıyla.\n1- “Kureyş’in emniyetini sağladığı,\n2- Yaz ve kış yolculuğunda onları (güvenliğe ulaştırıp başkalarıyla) ısındırıp yakınlaştırdığı için onlar,\n3- Bu evin (mabed’in, Kâbe’nin) Rabbine kulluk etsinler.\n4- Ki O (Allah) kendilerini açlıktan (kurtarıp) doyuran ve her çeşit korkudan güvenliğe kavuşturandır.");
        sureOkunus.add("Ma'un Suresi Arapça Okunuşu:\n" + "\n" + "Bismillâhi’r-Rahmâni’r-Rahîm.\n1- “Eraeytellezî yukezzibu bi’d-dîn.\n2- Fezâlike’l-lezî yedu’ul-yetîm.\n3- Ve lâ yehuddu alâ ta’âmi’l-miskîn.\n4- Feveylun lil-musallîn.\n5- Ellezînehum an salâtihim sâhûn.\n6- Ellezînehum yurâûn.\n7- Ve yemne’ûne’l-mâ’ûn.\n" +
                "\n" +
                "Ma'un Suresi Meali (Anlamı):\n" + "\n" + "Rahmân ve Rahîm olan Allah’ın adıyla.\n1- “Din gününü (İslam’ı, ahirette ceza ve mükâfatı) yalanlayanı gördün mü?\n2- İşte o, yetimi itip kakar.\n3- Yoksulu doyurmayı teşvik etmez (önayak olmaz).\n4- Şu namaz kılanların vay haline!\n5- Onlar namazlarından gafildirler (önem vermezler).\n6- Onlar gösteriş (için ibadet) yaparlar.\n7- Ve onlar en küçük bir yardımı (zekâtı) da engellerler.");
        sureOkunus.add("Kevser Suresi Arapça Okunuşu:\n" + "\n" + "Bismillâhi’r-Rahmâni’r-Rahîm.\n1- “İnnâ a’taynâ ke’l-kevser.\n2- Fesalli li-Rabbike ve’nhar.\n3- İnne şâni’eke huve’l-ebter\n" +
                "\n" +
                "Kevser Suresi Meali (Anlamı):\n" + "\n" + "Rahmân ve Rahîm olan Allah’ın adıyla.\n1- “Şüphesiz biz sana Kevser’i verdik.\n2- Öyleyse Rabbin için namaz kıl ve kurban kes.\n3- Asıl sonu kesik olan, senin düşmanın (sana buğzeden)dir");
        sureOkunus.add("Kafirun Suresi Arapça Okunuşu:\n" + "\n" + "Bismillâhi’r-Rahmâni’r-Rahîm.\n1- “Gul yâ eyyuhe’l-kâfirûn.\n2- Lâ a’budu mâ ta’budûn.\n3- Ve lâ entum âbidûne mâ a’bud.\n4- Velâ ene âbidun mâ abettum.\n5- Velâ entum âbidûne mâ a’bud.\n6- Lekum dînukum veliye dîn.\n" +
                "\n" +
                "Kafirun Suresi Meali (Anlamı):\n" + "\n" + "Rahmân ve Rahîm olan Allah’ın adıyla.\n1- “De ki: Ey kâfirler.\n2- Ben sizin taptıklarınıza tapmam.\n3- Siz de benim ibadet ettiğime ibadet edecek değilsiniz.\n4- Ben de sizin taptıklarınıza tapacak değilim.\n5- Siz de benim ibadet ettiğime, ibadet edecek değilsiniz.\n6- Sizin dininiz size, benim dinim bana.");
        sureOkunus.add("Nasr Suresi Arapça Okunuşu:\n" + "\n" + "Bismillâhi’r-Rahmâni’r-Rahîm.\n1- “İzâ câe nasrullâhi ve’l-fethu.\n2- Ve raeyte’n-nâse yedhulûne fî dînillâhi efvâcâ.\n3- Fe sebbih bi-hamdi Rabbike vestağfirhu innehû kâne tevvâbâ.\n" +
                "\n" +
                "Nasr Suresi Meali (Anlamı):\n" + "\n" + "Rahmân ve Rahîm olan Allah’ın adıyla.\n1- “Allah’ın yardımı ve fetih geldiği zaman,\n2- Ve insanların, Allah’ın dinine dalga dalga girdiklerini gördüğün zaman,\n3- Hemen Rabbini överek tesbih et ve O’ndan mağfiret dile. Çünkü O, tevbeleri çok kabul edendir.");
        sureOkunus.add("Tebbet Suresi Arapça Okunuşu:\n" + "\n" + "Bismillâhi’r-Rahmâni’r-Rahîm.\n1- “Tebbet yedâ ebî lehebin ve tebb.\n2- Mâ ağnâ ‘anhu mâluhû ve mâ keseb.\n3- Seyaslâ nâran zâte leheb.\n4- Vemraetuhû hammâlete’l-hatab.\n5- Fî cîdihâ hablun min mesed.\n" +
                "\n" +
                "Tebbet Suresi Meali (Anlamı):\n" + "\n" + "Rahmân ve Rahîm olan Allah’ın adıyla.\n1- “Ebu Leheb’in elleri kurusun, (yok olsun) zaten yok oldu ya.\n2- Malı da, kazandıkları da kendisine bir yarar sağlamadı. (kurtarmadı)\n3- (O) alevli bir ateşe girecektir.\n4- Karısı da, odun hamalı (ve),\n5- Boynunda bükülmüş bir ip olarak (ateşe girecektir.)");
        sureOkunus.add("İhlas Suresi Arapça Okunuşu:\n" + "\n" + "Bismillâhi’r-Rahmâni’r-Rahîm.\n1- “Gul huvallâhu ehad.\n2- Allâhu’s-samed.\n3- Lem yelid ve lem yûled.\n4- Ve lem yekun lehû kufuven ahad.\n" +
                "\n" +
                "İhlas Suresi Meali (Anlamı):\n" + "\n" + "Rahmân ve Rahîm olan Allah’ın adıyla.\n1- “De ki: O Allah birdir.\n2- Allah samed (her şey O’na muhtaç, O kimseye muhtaç değil)’dir.\n3- O doğurmamıştır ve doğurulmamıştır.\n4- Ve hiçbir şey O’nun dengi değildir.");
        sureOkunus.add("Felak Suresi Arapça Okunuşu:\n" + "\n" + "Bismillâhi’r-Rahmâni’r-Rahîm.\n1- “Gul e’ûzu bi-Rabbi’l-felak.\n2- Min şerri mâ halak.\n3- Ve min şerri ğâsikın izâ vekab.\n4- Ve min şerri’n-neffâsâti fi’l-ukad.\n5- Ve min şerri hâsidin izâ hased.\n" +
                "\n" +
                "Felak Suresi Meali (Anlamı):\n" + "\n" + "Rahmân ve Rahîm olan Allah’ın adıyla.\n1- “De ki: ben, karanlığı yarıp sabahı ortaya çıkaran Rabbe sığınırım,\n2- Yarattığı şeylerin şerrinden,\n3- Karanlığı çöktüğü zaman gecenin şerrinden,\n4- Düğümlere üfleyenlerin şerrinden,\n5- Ve hased ettiği zaman hasedçinin şerrinden. (Allah’a sığınırım).");
        sureOkunus.add("Nas Suresi Arapça Okunuşu:\n"  + "\n" + "Bismillâhi’r-Rahmâni’r-Rahîm.\n1- “Gul e’ûzu bi-Rabbi’n-nâs.\n2- Meliki’n-nâs.\n3- İlâhi’n-nâs.\n4- Min şerri’l-vesvâsi’l-hânnâs.\n5- Ellezî yuvesvisu fî sudûri’n-nâs.\n6- Mine’l-cinneti ve’n-nâs.\n" +
                "\n" +
                "Nas Suresi Meali (Anlamı):\n"  + "\n" + "Rahmân ve Rahîm olan Allah’ın adıyla.\n1- “De ki: İnsanların Rabbine sığınırım.\n2- İnsanların malikine,\n3- İnsanların (gerçek) ilahına;\n4- İnsanlara kötü şeyler fısıldayan o sinsi vesvesecinin şerrinden.\n5- O ki, insanların göğüslerine (kötü düşünce, şüphe) vesvese verir.\n6- Gerek cin, gerekse insanlardan (olan vesvesecilerin şerrinden Allah’a sığınırım.)");

        final ArrayList<String> surelerArab = new ArrayList<>();

        surelerArab.add("بِسْمِ اللّٰهِ الرَّحْمٰنِ الرَّح۪يمِ\n" +
                "١﴾ اَلْحَمْدُ لِلّٰهِ رَبِّ الْعَالَم۪ينَۙ ﴿٢﴾ اَلرَّحْمٰنِ الرَّح۪يمِۙ ﴿٣﴾ مَالِكِ يَوْمِ الدّ۪ينِۜ ﴿٤﴾ اِيَّاكَ نَعْبُدُ وَاِيَّاكَ نَسْتَع۪ينُۜ ﴿٥﴾ اِهْدِنَا الصِّرَاطَ الْمُسْتَق۪يمَۙ ﴿٦﴾ صِرَاطَ الَّذ۪ينَ اَنْعَمْتَ عَلَيْهِمْۙ غَيْرِ الْمَغْضُوبِ عَلَيْهِمْ وَلَا الضَّٓالّ۪ينَ ﴿٧");
        surelerArab.add("بِسْمِ اللهِ الرَّحْمَنِ الرَّحِيمِ\n" +
                "\n" +
                "{وَالضُّحَى}\n" +
                "{وَاللَّيْلِ إِذَا سَجَى}\n" +
                "{مَا وَدَّعَكَ رَبُّكَ وَمَا قَلَى}\n" +
                "{وَلَلْآخِرَةُ خَيْرٌ لَكَ مِنَ الأُولَى}\n" +
                "{وَلَسَوْفَ يُعْطِيكَ رَبُّكَ فَتَرْضَى}\n" +
                "{أَلَمْ يَجِدْكَ يَتِيمًا فَآوَى}\n" +
                "{وَوَجَدَكَ ضَالًّا فَهَدَى}\n" +
                "{وَوَجَدَكَ عَائِلاً فَأَغْنَى}\n" +
                "{فَأَمَّا الْيَتِيمَ فَلاَ تَقْهَرْ}\n" +
                "{وَأَمَّا السَّائِلَ فَلاَ تَنْهَرْ}\n" +
                "{وَأَمَّا بِنِعْمَةِ رَبِّكَ فَحَدِّثْ}\n");
        surelerArab.add("بِسْمِ اللهِ الرَّحْمَنِ الرَّحِيمِ\n" +
                "\n" +
                "{أَلَمْ نَشْرَحْ لَكَ صَدْرَكَ}\n" +
                "{وَوَضَعْنَا عَنْكَ وِزْرَكَ}\n" +
                "{الَّذِي أَنْقَضَ ظَهْرَكَ}\n" +
                "{وَرَفَعْنَا لَكَ ذِكْرَكَ}\n" +
                "{فَإِنَّ مَعَ الْعُسْرِ يُسْرًا}\n" +
                "{إِنَّ مَعَ الْعُسْرِ يُسْرًا}\n" +
                "{فَإِذَا فَرَغْتَ فَانْصَبْ}\n" +
                "{وَإِلَى رَبِّكَ فَارْغَبْ}\n");
        surelerArab.add("بِسْمِ اللهِ الرَّحْمَنِ الرَّحِيمِ\n" +
                "\n" +
                "{وَالتِّينِ وَالزَّيْتُونِ}\n" +
                "{وَطُورِ سِينِينَ}\n" +
                "{وَهَذَا الْبَلَدِ الأَمِينِ}\n" +
                "{لَقَدْ خَلَقْنَا الإِنْسَانَ فِي أَحْسَنِ تَقْوِيمٍ}\n" +
                "{ثُمَّ رَدَدْنَاهُ أَسْفَلَ سَافِلِينَ}\n" +
                "{إِلاَّ الَّذِينَ آمَنُوا وَعَمِلُوا الصَّالِحَاتِ فَلَهُمْ أَجْرٌ غَيْرُ مَمْنُونٍ}\n" +
                "{فَمَا يُكَذِّبُكَ بَعْدُ بِالدِّينِ}\n" +
                "{أَلَيْسَ اللهُ بِأَحْكَمِ الْحَاكِمِينَ}\n");
        surelerArab.add("بِسْمِ اللهِ الرَّحْمَنِ الرَّحِيمِ\n" +
                "\n" +
                "{اقْرَأْ بِاسْمِ رَبِّكَ الَّذِي خَلَقَ}\n" +
                "{خَلَقَ الإِنْسَانَ مِنْ عَلَقٍ}\n" +
                "{اقْرَأْ وَرَبُّكَ الأَكْرَمُ}\n" +
                "{الَّذِي عَلَّمَ بِالْقَلَمِ}\n" +
                "{عَلَّمَ الإِنْسَانَ مَا لَمْ يَعْلَمْ}\n" +
                "{كَلَّا إِنَّ الإِنْسَانَ لَيَطْغَى}\n" +
                "{أَنْ رَآهُ اسْتَغْنَى}\n" +
                "{إِنَّ إِلَى رَبِّكَ الرُّجْعَى}\n" +
                "{أَرَأَيْتَ الَّذِي يَنْهَى}\n" +
                "{عَبْدًا إِذَا صَلَّى}\n" +
                "{أَرَأَيْتَ إِنْ كَانَ عَلَى الْهُدَى}\n" +
                "{أَوْ أَمَرَ بِالتَّقْوَى}\n" +
                "{أَرَأَيْتَ إِنْ كَذَّبَ وَتَوَلَّى}\n" +
                "{أَلَمْ يَعْلَمْ بِأَنَّ اللهَ يَرَى}\n" +
                "{كَلَّا لَئِنْ لَمْ يَنْتَهِ لَنَسْفَعَنْ بِالنَّاصِيَةِ}\n" +
                "{نَاصِيَةٍ كَاذِبَةٍ خَاطِئَةٍ}\n" +
                "{فَلْيَدْعُ نَادِيَهُ}\n" +
                "{سَنَدْعُ الزَّبَانِيَةَ}\n" +
                "{كَلَّا لاَ تُطِعْهُ وَاسْجُدْ وَاقْتَرِبْ}\n");
        surelerArab.add("بِسْمِ اللهِ الرَّحْمَنِ الرَّحِيمِ\n" +
                "\n" +
                "{إِنَّا أَنْزَلْنَاهُ فِي لَيْلَةِ الْقَدْرِ}\n" +
                "{وَمَا أَدْرَاكَ مَا لَيْلَةُ الْقَدْرِ}\n" +
                "{لَيْلَةُ الْقَدْرِ خَيْرٌ مِنْ أَلْفِ شَهْرٍ}\n" +
                "{تَنَزَّلُ الْمَلاَئِكَةُ وَالرُّوحُ فِيهَا بِإِذْنِ رَبِّهِمْ مِنْ كُلِّ أَمْرٍ}\n" +
                "{سَلاَمٌ هِيَ حَتَّى مَطْلَعِ الْفَجْرِ}\n");
        surelerArab.add("بِسْمِ اللهِ الرَّحْمَنِ الرَّحِيمِ\n" +
                "\n" +
                "{لَمْ يَكُنِ الَّذِينَ كَفَرُوا مِنْ أَهْلِ الْكِتَابِ وَالْمُشْرِكِينَ مُنْفَكِّينَ حَتَّى تَأْتِيَهُمُ الْبَيِّنَةُ}\n" +
                "{رَسُولٌ مِنَ اللهِ يَتْلُو صُحُفًا مُطَهَّرَةً}\n" +
                "{فِيهَا كُتُبٌ قَيِّمَةٌ}\n" +
                "{وَمَا تَفَرَّقَ الَّذِينَ أُوتُوا الْكِتَابَ إِلاَّ مِنْ بَعْدِ مَا جَاءَتْهُمُ الْبَيِّنَةُ}\n" +
                "{وَمَا أُمِرُوا إِلاَّ لِيَعْبُدُوا اللهَ مُخْلِصِينَ لَهُ الدِّينَ حُنَفَاءَ وَيُقِيمُوا الصَّلاَةَ وَيُؤْتُوا الزَّكَاةَ وَذَلِكَ دِينُ الْقَيِّمَةِ}\n" +
                "{إِنَّ الَّذِينَ كَفَرُوا مِنْ أَهْلِ الْكِتَابِ وَالْمُشْرِكِينَ فِي نَارِ جَهَنَّمَ خَالِدِينَ فِيهَا أُولَئِكَ هُمْ شَرُّ الْبَرِيَّةِ}\n" +
                "{إِنَّ الَّذِينَ آمَنُوا وَعَمِلُوا الصَّالِحَاتِ أُولَئِكَ هُمْ خَيْرُ الْبَرِيَّةِ}\n" +
                "{جَزَاؤُهُمْ عِنْدَ رَبِّهِمْ جَنَّاتُ عَدْنٍ تَجْرِي مِنْ تَحْتِهَا الأَنْهَارُ خَالِدِينَ فِيهَا أَبَدًا رَضِيَ اللهُ عَنْهُمْ وَرَضُوا عَنْهُ ذَلِكَ لِمَنْ خَشِيَ رَبَّهُ}\n");
        surelerArab.add("ِسْمِ اللهِ الرَّحْمَنِ الرَّحِيمِ\n" +
                "\n" +
                "{إِذَا زُلْزِلَتِ الأَرْضُ زِلْزَالَهَا}\n" +
                "{وَأَخْرَجَتِ الأَرْضُ أَثْقَالَهَا}\n" +
                "{وَقَالَ الإِنْسَانُ مَا لَهَا}\n" +
                "{يَوْمَئِذٍ تُحَدِّثُ أَخْبَارَهَا}\n" +
                "{بِأَنَّ رَبَّكَ أَوْحَى لَهَا}\n" +
                "{يَوْمَئِذٍ يَصْدُرُ النَّاسُ أَشْتَاتًا لِيُرَوْا أَعْمَالَهُمْ}\n" +
                "{فَمَنْ يَعْمَلْ مِثْقَالَ ذَرَّةٍ خَيْرًا يَرَهُ}\n" +
                "{وَمَنْ يَعْمَلْ مِثْقَالَ ذَرَّةٍ شَرًّا يَرَهُ}\n");
        surelerArab.add("بِسْمِ اللهِ الرَّحْمَنِ الرَّحِيمِ\n" +
                "\n" +
                "{وَالْعَادِيَاتِ ضَبْحًا}\n" +
                "{فَالْمُورِيَاتِ قَدْحًا}\n" +
                "{فَالْمُغِيرَاتِ صُبْحًا}\n" +
                "{فَأَثَرْنَ بِهِ نَقْعًا}\n" +
                "{فَوَسَطْنَ بِهِ جَمْعًا}\n" +
                "{إِنَّ الإِنْسَانَ لِرَبِّهِ لَكَنُودٌ}\n" +
                "{وَإِنَّهُ عَلَى ذَلِكَ لَشَهِيدٌ}\n" +
                "{وَإِنَّهُ لِحُبِّ الْخَيْرِ لَشَدِيدٌ}\n" +
                "{أَفَلاَ يَعْلَمُ إِذَا بُعْثِرَ مَا فِي الْقُبُورِ}\n" +
                "{وَحُصِّلَ مَا فِي الصُّدُورِ}\n" +
                "{إِنَّ رَبَّهُمْ بِهِمْ يَوْمَئِذٍ لَخَبِيرٌ}\n");
        surelerArab.add("بِسْمِ اللهِ الرَّحْمَنِ الرَّحِيمِ\n" +
                "\n" +
                "{الْقَارِعَةُ}\n" +
                "{مَا الْقَارِعَةُ}\n" +
                "{وَمَا أَدْرَاكَ مَا الْقَارِعَةُ}\n" +
                "{يَوْمَ يَكُونُ النَّاسُ كَالْفَرَاشِ الْمَبْثُوثِ}\n" +
                "{وَتَكُونُ الْجِبَالُ كَالْعِهْنِ الْمَنْفُوشِ}\n" +
                "{فَأَمَّا مَنْ ثَقُلَتْ مَوَازِينُهُ}\n" +
                "{فَهُوَ فِي عِيشَةٍ رَاضِيَةٍ}\n" +
                "{وَأَمَّا مَنْ خَفَّتْ مَوَازِينُهُ}\n" +
                "{فَأُمُّهُ هَاوِيَةٌ}\n" +
                "{وَمَا أَدْرَاكَ مَا هِيَهْ}\n" +
                "{نَارٌ حَامِيَةٌ}\n");
        surelerArab.add("بِسْمِ اللهِ الرَّحْمَنِ الرَّحِيمِ\n" +
                "\n" +
                "{أَلْهَاكُمُ التَّكَاثُرُ}\n" +
                "{حَتَّى زُرْتُمُ الْمَقَابِرَ}\n" +
                "{كَلَّا سَوْفَ تَعْلَمُونَ}\n" +
                "{ثُمَّ كَلَّا سَوْفَ تَعْلَمُونَ}\n" +
                "{كَلَّا لَوْ تَعْلَمُونَ عِلْمَ الْيَقِينِ}\n" +
                "{لَتَرَوُنَّ الْجَحِيمَ}\n" +
                "{ثُمَّ لَتَرَوُنَّهَا عَيْنَ الْيَقِينِ}\n" +
                "{ثُمَّ لَتُسْأَلُنَّ يَوْمَئِذٍ عَنِ النَّعِيمِ}\n");
        surelerArab.add("بِسْمِ اللهِ الرَّحْمَنِ الرَّحِيمِ\n" +
                "\n" +
                "{وَالْعَصْرِ}\n" +
                "{إِنَّ الإِنْسَانَ لَفِي خُسْرٍ}\n" +
                "{إِلاَّ الَّذِينَ آمَنُوا وَعَمِلُوا الصَّالِحَاتِ وَتَوَاصَوْا بِالْحَقِّ وَتَوَاصَوْا بِالصَّبْرِ}\n");
        surelerArab.add("ِسْمِ اللهِ الرَّحْمَنِ الرَّحِيمِ\n" +
                "\n" +
                "{وَيْلٌ لِكُلِّ هُمَزَةٍ لُمَزَةٍ}\n" +
                "{الَّذِي جَمَعَ مَالاً وَعَدَّدَهُ}\n" +
                "{يَحْسَبُ أَنَّ مَالَهُ أَخْلَدَهُ}\n" +
                "{كَلَّا لَيُنْبَذَنَّ فِي الْحُطَمَةِ}\n" +
                "{وَمَا أَدْرَاكَ مَا الْحُطَمَةُ}\n" +
                "{نَارُ اللهِ الْمُوقَدَةُ}\n" +
                "{الَّتِي تَطَّلِعُ عَلَى الأَفْئِدَةِ}\n" +
                "{إِنَّهَا عَلَيْهِمْ مُؤْصَدَةٌ}\n" +
                "{فِي عَمَدٍ مُمَدَّدَةٍ}\n");
        surelerArab.add("بِسْمِ اللهِ الرَّحْمَنِ الرَّحِيمِ\n" +
                "\n" +
                "{أَلَمْ تَرَ كَيْفَ فَعَلَ رَبُّكَ بِأَصْحَابِ الْفِيلِ}\n" +
                "{أَلَمْ يَجْعَلْ كَيْدَهُمْ فِي تَضْلِيلٍ}\n" +
                "{وَأَرْسَلَ عَلَيْهِمْ طَيْرًا أَبَابِيلَ}\n" +
                "{تَرْمِيهِمْ بِحِجَارَةٍ مِنْ سِجِّيلٍ}\n" +
                "{فَجَعَلَهُمْ كَعَصْفٍ مَأْكُولٍ}\n");
        surelerArab.add("بِسْمِ اللهِ الرَّحْمَنِ الرَّحِيمِ\n" +
                "\n" +
                "{لإِيلاَفِ قُرَيْشٍ}\n" +
                "{إِيلاَفِهِمْ رِحْلَةَ الشِّتَاءِ وَالصَّيْفِ}\n" +
                "{فَلْيَعْبُدُوا رَبَّ هَذَا الْبَيْتِ}\n" +
                "{الَّذِي أَطْعَمَهُمْ مِنْ جُوعٍ وَآمَنَهُمْ مِنْ خَوْفٍ}\n");
        surelerArab.add("بِسْمِ اللهِ الرَّحْمَنِ الرَّحِيمِ\n" +
                "\n" +
                "{أَرَأَيْتَ الَّذِي يُكَذِّبُ بِالدِّينِ}\n" +
                "{فَذَلِكَ الَّذِي يَدُعُّ الْيَتِيمَ}\n" +
                "{وَلاَ يَحُضُّ عَلَى طَعَامِ الْمِسْكِينِ}\n" +
                "{فَوَيْلٌ لِلْمُصَلِّينَ}\n" +
                "{الَّذِينَ هُمْ عَنْ صَلاَتِهِمْ سَاهُونَ}\n" +
                "{الَّذِينَ هُمْ يُرَاءُونَ}\n" +
                "{وَيَمْنَعُونَ الْمَاعُونَ}\n");
        surelerArab.add("بِسْمِ اللهِ الرَّحْمَنِ الرَّحِيمِ\n" +
                "\n" +
                "{إِنَّا أَعْطَيْنَاكَ الْكَوْثَرَ}\n" +
                "{فَصَلِّ لِرَبِّكَ وَانْحَرْ}\n" +
                "{إِنَّ شَانِئَكَ هُوَ الأَبْتَرُ}\n");
        surelerArab.add("بِسْمِ اللهِ الرَّحْمَنِ الرَّحِيمِ\n" +
                "\n" +
                "{قُلْ يَا أَيُّهَا الْكَافِرُونَ}\n" +
                "{لاَ أَعْبُدُ مَا تَعْبُدُونَ}\n" +
                "{وَلاَ أَنْتُمْ عَابِدُونَ مَا أَعْبُدُ}\n" +
                "{وَلاَ أَنَا عَابِدٌ مَا عَبَدْتُمْ}\n" +
                "{وَلاَ أَنْتُمْ عَابِدُونَ مَا أَعْبُدُ}\n" +
                "{لَكُمْ دِينُكُمْ وَلِيَ دِينِ}\n");
        surelerArab.add("بِسْمِ اللهِ الرَّحْمَنِ الرَّحِيمِ\n" +
                "\n" +
                "{إِذَا جَاءَ نَصْرُ اللهِ وَالْفَتْحُ}\n" +
                "{وَرَأَيْتَ النَّاسَ يَدْخُلُونَ فِي دِينِ اللهِ أَفْوَاجًا}\n" +
                "{فَسَبِّحْ بِحَمْدِ رَبِّكَ وَاسْتَغْفِرْهُ إِنَّهُ كَانَ تَوَّابًا}\n");
        surelerArab.add("بِسْمِ اللهِ الرَّحْمَنِ الرَّحِيمِ\n" +
                "\n" +
                "{تَبَّتْ يَدَا أَبِي لَهَبٍ وَتَبَّ}\n" +
                "{مَا أَغْنَى عَنْهُ مَالُهُ وَمَا كَسَبَ}\n" +
                "{سَيَصْلَى نَارًا ذَاتَ لَهَبٍ}\n" +
                "{وَامْرَأَتُهُ حَمَّالَةَ الْحَطَبِ}\n" +
                "{فِي جِيدِهَا حَبْلٌ مِنْ مَسَدٍ}\n");
        surelerArab.add("بِسْمِ اللهِ الرَّحْمَنِ الرَّحِيمِ\n" +
                "\n" +
                "{قُلْ هُوَ اللهُ أَحَدٌ}\n" +
                "{اللهُ الصَّمَدُ}\n" +
                "{لَمْ يَلِدْ وَلَمْ يُولَدْ}\n" +
                "{وَلَمْ يَكُنْ لَهُ كُفُوًا أَحَدٌ}\n");
        surelerArab.add("بِسْمِ اللهِ الرَّحْمَنِ الرَّحِيمِ\n" +
                "\n" +
                "{قُلْ أَعُوذُ بِرَبِّ الْفَلَقِ}\n" +
                "{مِنْ شَرِّ مَا خَلَقَ}\n" +
                "{وَمِنْ شَرِّ غَاسِقٍ إِذَا وَقَبَ}\n" +
                "{وَمِنْ شَرِّ النَّفَّاثَاتِ فِي الْعُقَدِ}\n" +
                "{وَمِنْ شَرِّ حَاسِدٍ إِذَا حَسَدَ}\n");
        surelerArab.add("بِسْمِ اللهِ الرَّحْمَنِ الرَّحِيمِ\n" +
                "\n" +
                "{قُلْ أَعُوذُ بِرَبِّ النَّاسِ}\n" +
                "{مَلِكِ النَّاسِ}\n" +
                "{إِلَهِ النَّاسِ}\n" +
                "{مِنْ شَرِّ الْوَسْوَاسِ الْخَنَّاسِ}\n" +
                "{الَّذِي يُوَسْوِسُ فِي صُدُورِ النَّاسِ}\n" +
                "{مِنَ الْجِنَّةِ وَالنَّاسِ}\n");

        ArrayAdapter arrayAdapter = new ArrayAdapter(DualarSureler.this,R.layout.surelayout,sureler);

        listViewSure.setAdapter(arrayAdapter);

        listViewSure.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(),DualarSurelerOkunus.class);
                intent.putExtra("name",sureOkunus.get(position));
                intent.putExtra("arabic",surelerArab.get(position));
                intent.putExtra("title",sureler.get(position));
                selectedImage = sureImages.get(position);
                startActivity(intent);
            }
        });

    }
}