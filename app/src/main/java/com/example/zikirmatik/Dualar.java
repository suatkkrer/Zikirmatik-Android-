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

public class Dualar extends AppCompatActivity {

    static Bitmap selectedDua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dualar);

        ListView listViewDua = findViewById(R.id.duaListView);

        this.setTitle("Dualar");

        final ArrayList<String> dualar = new ArrayList<>();

        dualar.add("1- Subhaneke Duası");
        dualar.add("2- Ettehiyyâtu Duası");
        dualar.add("3- Allâhumme Salli Duası");
        dualar.add("4- Allâhumme Barik Duası");
        dualar.add("5- Rabbenâ âtina Duası");
        dualar.add("6- Rabbenâgfirlî Duası");
        dualar.add("7- Kunut Duası 1");
        dualar.add("8- Kunut Duası 2");
        dualar.add("9- Yemek Duası");
        dualar.add("10- Ezan Duası");
        dualar.add("10- Peygamber Duaları");
        dualar.add("12- Salât-ı Tefrîciye Duası (4444 adet tavsiye)");
        dualar.add("13- Hacet Duası Meali");
        dualar.add("14- Hatim Duası Meali");
        dualar.add("15- Sekine Duası");
        dualar.add("16- İsmi Azam Duası");
        dualar.add("17- Sabah Duaları Meali");
        dualar.add("18- Akşam Duaları Meali");
        dualar.add("19- Ashâbı Bedir");
        dualar.add("20- Şühedai Uhud");

        Bitmap subhaneke = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.subhaneke);
        Bitmap tahiyyat = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.tahiyyat);
        Bitmap salli = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.salli);
        Bitmap barik = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.barik);
        Bitmap atina = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.atinaa);
        Bitmap firli = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.firlii);
        Bitmap kunuta = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.kunuta);
        Bitmap kunutaa = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.kunutaa);
        Bitmap noimage = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.noim);
        Bitmap ezan = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.ezan);
        Bitmap subhaneke2 = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.noimage);
        Bitmap tefriciye = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.tefriciye);
        Bitmap hacet = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.hacet);
        Bitmap hatim = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.hatim);
        Bitmap sekine = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.sekine);
        Bitmap ismiazam = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.ismiazam);
        Bitmap subhaneke3 = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.noimage);
        Bitmap subhaneke4 = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.noimage);
        Bitmap subhaneke5 = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.noimage);

        final ArrayList<Bitmap> duaImages = new ArrayList<>();

        duaImages.add(subhaneke);
        duaImages.add(tahiyyat);
        duaImages.add(salli);
        duaImages.add(barik);
        duaImages.add(atina);
        duaImages.add(firli);
        duaImages.add(kunuta);
        duaImages.add(kunutaa);
        duaImages.add(noimage);
        duaImages.add(ezan);
        duaImages.add(noimage);
        duaImages.add(tefriciye);
        duaImages.add(noimage);
        duaImages.add(noimage);
        duaImages.add(sekine);
        duaImages.add(ismiazam);
        duaImages.add(noimage);
        duaImages.add(noimage);
        duaImages.add(noimage);
        duaImages.add(noimage);




        final ArrayList<String> duaOkunus = new ArrayList<>();

        duaOkunus.add("Subhaneke Duası Arapça Okunuşu:\n\nSubhânekellâhumme ve bi hamdik ve tebârakesmuk ve teâlâ cedduk (ve celle senâuk*) ve lâ ilâhe ğayruk.\n" +
                "* (vecelle senâuk kısmı sadece cenaze namazında okunur.)\n\n" +
                "Subhaneke Duası Meali (Anlamı):\n\nAllah'ım! Sen eksik sıfatlardan pak ve uzaksın. Seni daima böyle tenzih eder ve överim. Senin adın mübarektir. Varlığın her şeyden üstündür. Senden başka ilah yoktur\n");
        duaOkunus.add("Ettehiyyâtu Duası Okunuşu:\n\nEttehiyyâtu lillâhi vessalevâtu vettayibât. Esselâmu aleyke eyyuhen-Nebiyyu ve rahmetullahi ve berakâtuhu. Esselâmu aleynâ ve alâ ibâdillâhis-Sâlihîn. Eşhedu en lâ ilâhe illallâh ve eşhedu enne Muhammeden abduhû ve Rasuluh.\n" +
                "\n" +
                "Ettehiyyâtu Duası Meali (Anlamı):\n\nDil ile, beden ve mal ile yapılan bütün ibadetler Allah'a dır. Ey Peygamber! Allah'ın selamı, rahmet ve bereketleri senin üzerine olsun. Selam bizim üzerimize ve Allah'ın bütün iyi kulları üzerine olsun. Şahitlik ederim ki, Allah'tan başka ilah yoktur. Yine şahitlik ederim ki, Muhammed, O'nun kulu ve elçisidir");
        duaOkunus.add("Allâhumme Salli  Duası Okunuşu:\n\nAllâhumme salli alâ Muhammedin ve alâ âli Muhammed. Kemâ salleyte alâ İbrahime ve alâ âli İbrahim. İnneke hamidun mecîd.\n" +
                "\n" +
                "Allâhumme Salli Duası Meali (Anlamı):\n\nAllah'ım! Muhammed'e ve Muhammed'in ümmetine rahmet eyle; şerefini yücelt. İbrahim'e ve İbrahim'in ümmetine rahmet ettiğin gibi. Şüphesiz övülmeye layık yalnız sensin, şan ve şeref sahibi de sensin\n");
        duaOkunus.add("Allâhumme Barik Duası Okunuşu:\n\nAllâhumme barik alâ Muhammedin ve alâ âli Muhammed. Kemâ barekte alâ İbrahîme ve alâ âli İbrahim. İnneke hamidun mecîd\n" +
                "\n" +
                "Allâhumme Barik Duası (Anlamı):\n\nAllah'ım! Muhammed'e ve Muhammed'in ümmetine hayır ve bereket ver. İbrahim'e ve İbrahim'in ümmetine verdiğin gibi. Şüphesiz övülmeye layık yalnız sensin, şan ve şeref sahibi de sensin.\n");
        duaOkunus.add("Rabbenâ âtina Duası Okunuşu:\n\nRabbenâ âtina fid'dunyâ haseneten ve fil'âhirati haseneten ve kınâ azâbennâr.\n" +
                "\n" +
                "Rabbenâ âtina Duası (Anlamı):\n\nAllah'ım! Bize dünyada iyilik ve güzellik, ahirette de iyilik, güzellik ver. Bizi ateş azabından koru.\n");
        duaOkunus.add("Rabbenâğfirlî Duası Okunuşu:\n\nRabbenâğfirlî ve li-vâlideyye ve lil-Mu'minine yevme yekûmu'l hisâb.\n" +
                "\n" +
                "Rabbenâğfirlî Duası Meali (Anlamı):\n\nEy bizim Rabbimiz! Beni, anamı ve babamı ve bütün mü'minleri hesap gününde (herkesin sorguya çekileceği günde) bağışla\n");
        duaOkunus.add("Kunut Duası-1 Okunuşu:\n\nAllâhumme innâ nesteînuke ve nestağfiruke ve nestehdik. Ve nu'minu bike ve netûbu ileyk. Ve netevekkelu aleyke ve nusni aleykel-hayra kullehu neşkuruke ve lâ nekfuruke ve nahleu ve netruku men yefcuruk\n" +
                "\n" +
                "Kunut Duası-1 Meali (Anlamı):\n\nAllahım! Senden yardım isteriz, günahlarımızı bağışlamanı isteriz, razı olduğun şeylere hidayet etmeni isteriz. Sana inanırız, sana tevbe ederiz. Sana güveniriz. Bize verdiğin bütün nimetleri bilerek seni hayır ile överiz. Sana şükrederiz. Hiçbir nimetini inkar etmez ve onları başkasından bilmeyiz. Nimetlerini inkar eden ve sana karşı geleni bırakırız.\n");
        duaOkunus.add("Kunut Duası-2 Okunuşu:\n\nAllâhumme iyyâke na'budu ve leke nusalli ve nescudu ve ileyke nes'a ve nahfidu nercû rahmeteke ve nahşâ azâbeke inne azâbeke bilkuffâri mulhık\n" +
                "\n" +
                "Kunut Duası-2 Meali (Anlamı):\n\nAllahım! Biz yalnız sana kulluk ederiz. Namazı yalnız senin için kılarız, ancak sana secde ederiz. Yalnız sana koşar ve sana yaklaştıracak şeyleri kazanmaya çalışırız. İbadetlerini sevinçle yaparız. Rahmetinin devamını ve çoğalmasını dileriz. Azabından korkarız, şüphesiz senin azabın kafirlere ve inançsızlara ulaşır.\n");
        duaOkunus.add("Yemek Duası\n" +
                "\n" +
                "'Bismillâhirrahmânirrahîm'' ''Elhamdülillâhi’llezî et’amenâ ve sekânâ ve cealenâ minel müslimîn. Külû ve’şrabû ve lâ tüsrifû, İnnehû lâ yuhibbü’l müsrifîn''\n" +
                "\n" +
                "\"Ey bizi nimetleriyle perverde eden SULTANIMIZ! Bize gösterdiğin numunelerin ve gölgelerin asıllarını, menbalarını göster. Ve bizi makarr-ı saltanatına celbet. Bizi bu çöllerde mahfettirme. Bizi huzuruna al. Bize merhamet et. Burada bize tattırdığın leziz nimetlerini orada yedir. Bizi zeval ve teb'id ile tazib etme. Sana müştak ve müteşekkir şu muti raiyyetini başıboş bırakıp idam etme. YA RAB! kusurumuzu affet bizi kendine kul kabul et. Emenetini kabzetmek zamanına kadar bizi emanette emin kıl. Ruhumuzu cesedimize, kalbimizi nefsimize, aklımızı midemize hakim eyle. Lezzeti şükür için isteyen kullarından eyle.\"\n" +
                "\n" +
                "\"YA RAB! Resûl-u Ekrem Aleyhissalatü Vesselamın bereketi hürmetine bize ihsan ettiğin maddi ve manevi rızkımıza bereket ihsan et!.. Amin!...\"\n" +
                "\n" +
                "'' Allahümme zid vela tenkus bi hürmetilfatiha''\n");
        duaOkunus.add("Ezan Duası Okunuşu:\n\nAllâhümme Rabbe hâzihi'd-da'veti't-tâmmeh, ve's-salâti'l-kâimeh, âti Muhammedeni'l-vesîlete ve'l-fadîlete, ved-dereceter-refîate. veb'ashü makâmem-mahmûdeni'l-lezî va'adteh. İnneke lâ tuhlifu'l-mîâd.\n" +
                "\n" +
                "Ezan Duası Meali (Anlamı):\n\nEy şu eksiksiz davetin ve kılınacak namazın rabbi Allahım! Muhammed'e vesîleyi ve fazîleti ver. Onu, kendisine vaadettiğin makâm-ı mahmûda ulaştır, Muhakkak ki sen vaadinden dönmezsin\"\n");
        duaOkunus.add("Hz. Yûnus’ın (a.s.) Duası \n\n" + "لَۤا اِلٰهَ اِلَّۤا اَنْتَ سُبْحَانَكَ اِنّ۪ى كُنْتُ مِنَ الظَّالِم۪ينَ \n" + "\nOkunuşu: “…Lâ ilâhe illâ ente subhâneke innî kuntu minez zâlimîn(zâlimîne).”\n" +
                "\n" +
                "Anlamı: “Senden başka ilâh yoktur. Sen her türlü noksanlıktan, eşi-ortağı olmaktan uzaksın. Şüphesiz ben kendine yazık edenlerden oldum”\n"
                + "\n\nHz. Adem ve Hz. Havva'nın (a.s.) Duası\n\n" + "رَبَّنَا ظَلَمْنَا أَنفُسَنَا وَإِن لَّمْ تَغْفِرْ لَنَا وَتَرْحَمْنَا لَنَكُونَنَّ مِنَ الْخَاسِرِينَ\n" + "\nOkunuşu: \"...Rabbenâ zalemnâ enfusenâ ve in lem tagfirlenâ ve terhamnâ le nekûnenne minel hâsirîn(hâsirîne).\n" +
                "\n" +
                "Anlamı: “Rabbimiz! Biz kendimize zulüm ettik. Eğer bizi bağışlamaz ve bize acımazsan mutlaka ziyan edenlerden oluruz.”\n"
                + "\n\nHz. Eyyûb (a.s)'ın Duası\n" +
                "\n" +
                "أَنِّي مَسَّنِيَ الضُّرُّ وَأَنتَ أَرْحَمُ الرَّاحِمِينَ\n" +
                "\nOkunuşu :Enni messeniye'd-durru ve ve ente erhamur râhimîn(râhimîne)..''\n" +
                "\n" +
                "Anlamı : ''Ya Rabbi bana zarar dokundu ve  Sen, merhametlilerin en merhametlisisin.''\n"
                + "\n\nHz Adem'in (a.s) Duası\n" +
                "\n" +
                "رَبَّنَا ظَلَمْنَا أَنفُسَنَا وَإِن لَّمْ تَغْفِرْ لَنَاوَتَرْحَمْنَا لَنَكُونَنَّ مِنَ الْخَاسِرِينَ\n" +
                "\nOkunuşu:\"lRabbenâ  zalemnâ enfüsenâ ve il lem teğfir lenâ ve terhamnâ   le-nekÛnene mine'l -hâsirîn.\"\n" +
                "\n" +
                "Anlamı:\"Ey Rabbimiz! Biz kendimize zulmettik,eğer bizi bağışlamaz ve bize rahmetinle muamele etmezsen muhakkak ziyana uğrayacaklardan oluruz\n");
        duaOkunus.add("Salât-ı Tefrîciye Duası Okunuşu:\n\n“Allâhumme salli salâten kâmileten ve sellim selâmen tâmmen alâ Seyyidinâ Muhammedinillezî tenhallü bihil ukadü ve tenfericu bihil-kürebü ve tukdâ bihil-havâicu ve tünâlü bihir-reğâibü ve hüsnül-havâtimi ve yustaskal ğamâmu bivechihil Kerîm ve alâ âlihî ve sahbihi fî külli lemhatin ve nefesin bi adedi külli ma’lûmin lek.”\n" +
                "\n\nSalât-ı Tefrîciye Duası Meali (Anlamı):\n\n“Allahım! Efendimiz Muhammed’e kusursuz bir salât ve rahmet, mükemmel bir selâm ve selâmet vermeni diliyoruz. O Peygamber (ve O’na öyle bir salât ü selam) ki, O’nun hürmetine düğümler çözülür, sıkıntılar ve belalar O’nun hürmetine açılıp dağılır, hacet ve ihtiyaçlar O’nun hürmetine yerine getirilir. Maksatlara O’nun hürmetine ulaşılır, güzel sonuçlar O’nun hürmetine elde edilir. O’nun şerefli yüzü hürmetine yağmur yüklü bulutlarla rahmet istenilir, Allah’ım, O’na, ehl-i beytine ve ashabına her göz kırpacak ve nefes alıp verecek kadarlık zaman diliminde (her an) Sana malum olan varlıklar sayısınca salât ü selam olsun\n");
        duaOkunus.add("Hacet Duası Meali (Anlamı):\n\n“Halîm ü Kerîm Allah'tan başka ilah yoktur. Arş-ı Azîm'in Rabbi Allah'ı tesbih ederim. Hamd alemlerin Rabbi Allah'a mahsustur. Rabbim, Senden, rahmetinin gereklerini, merhametini celbedecek şeyleri, gerçekleşmesi muhakkak olan mağfiretini, günahtan korunmayı, her türlü iyiliği kazanmayı, her türlü günahtan da selâmette olmayı istiyorum. Bende bağışlamadığın hiçbir günah, gidermediğin hiçbir keder, Senin rızana muvafık olup da karşılamadığın hiçbir ihtiyaç bırakma Ya Erhamerrahimin.\n" +
                "Allah’ım, Sen kullarının ihtilaf ettikleri şeylerde hüküm verirsin. Yüce ve Azim Allah'tan başka ilah yoktur. Halîm ve Kerîm Allah yegâne ilahtır. Yedi semanın ve Arş-ı Azîm'in Rabbi Allah'ı tesbih ederim. Hamd alemlerin Rabbi Allah'a mahsustur.\n" +
                "Ey kederleri gideren, tasaları kaldıran, Sana dua ettiklerinde çaresizlerin duasına icabet eden Allahım, ey dünya ve ahiretin Rahman ve Rahîm’i! Şu ihtiyacımın giderilmesi ve tamamlanması hususunda beni başkalarının merhametinden müstağni kılacak bir şekilde bana merhamet et.” “Allah’ım Sen'den diliyor ve dileniyorum, Rahmet Peygamberi Hazreti Muhammed'i vesile edinerek Sana teveccüh ediyorum. Ya Muhammed (aleyhissalâtu vesselâm) şu hacetimin yerine getirilmesi için seni vesile yaparak Rabbime yöneliyorum. Allah’ım peygamberimizi hakkımda şefaatçi eyle.”\n");
        duaOkunus.add("Hatim Duası Meali (Anlamı):\n\nÂlemlerin Rabbi olan Allah’a hamd olsun. İyi akıbet müttakilerindir. Düşmanlık ancak zalimler içindir. Peygamberimiz Hz. Muhammed (a.s)’e, onun bütün ehl-i beytine ve ashâbına salât ve selâm olsun. Ey Rabbimiz! Bizden ibadetlerimizi kabul buyur! Şüphesiz ki sen her şeyi işiten ve her şeyi bilensin. Ey Mevlamız! Bizim tövbelerimizi kabul eyle!. Şüphesiz ki sen tövbeleri çok çok kabul eden ve merhametli olansın. Bize hidâyet ver! Hak yola ve sırat-ı müstakime ulaşmayı bizi muvaffak eyle!. Yüce Kur’ân’ın hürmetine, âlemlere rahmet olarak gönderdiğin Peygamber hürmetine.Ey Kerim olan Allah! Bizi bağışla. Ey Rahim olan Allah! Bizi bağışla." +
                " Ey ikram edenlerin en keremlisi olan Allah! Lütfunla ve ihsanınla bizim günahlarımızı bağışla.\n" +
                "Allah’ım! Bizi Kur’ân süsü ile süsle. Kur’ân ile bize lütfet! Kur’ân ile bizi şereflendir. Kur’ân elbisesini bize giydir. Kur’ân hürmetine bizi cennetine koy. Kur’ân hürmetine dünyadaki belalardan ve âhiret azabından bizi koru. Ey Rahim, Ey Rahman! Ümmet-i Muhammed’in tamamına merhamet et.\n" +
                "Allah’ım! Kur’ân’ı bize dünyada yoldaş eyle. O’nu bize kabirde dost eyle. Kıyamet günü onu bize şefaatçi kıl, sırat köprüsü üzerinde onu bize nur eyle. Cennette onu bize yoldaş eyle. Cehennem ateşine karşı onu bize perde ve engel kıl. İhsanın, cömertliğin ve keremin ile tüm hayırlı yollar için onu bize önder kıl.\n" +
                "Kur’ân hidâyeti ile bizi hidâyete eriştir. Kur’ân’ın hürmetine bizi ateşten koru. Kur’ân hürmetine bizim derecemizi yükselt. Okunan Kur’ân hürmetine günahlarımızı bağışla. Ey Lütuf ve ihsan sahibi!. Allah’ım! Kalplerimizi temizle. Kusurlarımızı ört. Hastalarımıza şifa ver. Borçlarımızı ödemeye yardım et. Yüzümüzü aydınlat. Derecemizi yükselt. Babalarımıza merhamet et. Annelerimizi bağışla. Din ve dünya işlerimizi islâh et. Düşmanlarımızın bize saldırısını bertaraf eyle. Ailemizi, mallarımızı, memleketimizi her türlü afetlerden, hastalıklardan ve belalardan koru. Ayaklarımızı sabit eyle, kâfir toplumlara karşı bize yardım et. Yüce Kur’ân hürmetine.\n" +
                "Allah’ım! Okuduğumuz ve tilavet ettiğimiz Kur’ân’ın sevabını ve nurunu Efendimiz Hz. Muhammed (a.s)’in ruhuna ulaştır. Ve onun kardeşleri olan tüm peygamberlerin (a.s) ruhlarına ulaştır. Ve Peygamberimiz (a.s)’in ehlinin, çocuklarının, hanımlarının, ashabının, tabiinin ve bütün zürriyetinin ruhlarına ulaştır.\n" +
                "Hayatta olan veya vefat etmiş olan babalarımızın, annelerimizin, kardeşlerimizin, evladımızın, akrabalarımızın, sevdiklerimizin, dostlarımızın, hocalarımızın, üzerimizde hakkı olan herkesin ve Müslüman olan bütün kadın ve erkeğin ruhlarına ulaştır. Ey ihtiyaçları gideren Allah! Ey dualara icabet eden Allah! Ey merhametlilerin en merhametlisi! Dualarımızı kabul et. Tüm peygamberlere salât ve selam olsun. Senin Rabbin; kudret ve şeref sahibi olan Rab, onların nitelendirdiği şeylerden uzaktır, yücedir. Peygamberlere selam olsun. alemlerin Rabbi olan Allah’a hamdolsun.\n" +
                "\nEl-Fatiha denir ve Kur’an’ın birinci suresi (Fatiha) okunur.\n");
        duaOkunus.add("Sekine Duası Okunuşu:\n\nAllahu-Ekber (10 defa denilir)\n" +
                "\nBismillahirrahmanirrahim\n" + "\n" +
                "Ferdün, hayyun, kayyumun, hakemun, adlun, kuddusun..\n" +
                "\n1. Seyec ‘alullahu ba’de ‘usru-y yusra”\n" +
                "2. Anetil vucuhü lil hayyil kayyum\n" +
                "3. Ve innallahe biküm lera ufün rahimu\n" +
                "4. İnnallahe kane tevvaben rahime\n" +
                "5. innallahe kane gafuran rahime\n" +
                "6. fe innallahe kane afüvven kadira\n" +
                "7. innallahe kane semian besira\n" +
                "8. innallahe kane alimen hakime\n" +
                "9. innallahe kane aleyküm rakibe\n" +
                "10. İnnâ fetâhnaleke fethan mübiyna\n" +
                "11. ve yen surakellahu nesran azize\n" +
                "12. İnne hızballahi humül gâlibûn\n" +
                "13. innallahe huvel kaviyyül aziz\n" +
                "14. innallahe huvel ganiyyül hamid\n" +
                "15. Hasbiyallâhu lâ ilâhe illâ HU\n" +
                "16. Hasbünallâhu veni'mel vekîl\n" +
                "17. la yeh zünühümül fezeul ekber\n" +
                "18. iyyake na'budü ve iyyake nestain\n" +
                "19. velhamdü lillahi rabbil alemin\n" +
                "(19 defa okunur.)\n" +
                "\n Sekine Duası Meali (Anlamı):\n" +
                "\n1. Allah her sıkıntıdan sonra kolaylık lütfedecektir.\n" +
                "2. Yüzlerin sıkıntısı Hayy-ı Kayyûm içindir.\n" +
                "3. Allah size karşı çok şefkatli, çok merhametlidir.\n" +
                "4. Allah tövbeleri çok kabul edici ve kullarına çok merhamet edicidir.\n" +
                "5. Muhakkak ki, Allah çok bağışlayıcı ve çok merhamet edicidir.\n" +
                "6. Muhakkak ki, Allah her şeye gücü yettiği halde çok bağışlayıcıdır.\n" +
                "7. Şüphesiz Allah her şeyi hakkıyla işitir ve her şeyi hakkıyla görür.\n" +
                "8. Şüphesiz Allah her şeyi hakkıyla bilir ve her işi hikmetle yerine getirir.\n" +
                "9. Muhakkak ki, Allah sizin üzerinizde gözeticidir ve her halinizi görür.\n" +
                "10. Biz sana apaçık bir fetih yolu açtık.\n" +
                "11. Ve Allah sana pek şerefli bir zaferle yardım etsin.\n" +
                "12. Şüphesiz Allah’a tâbi olan topluluk gerçek gâliplerin tâ kendisidir.\n" +
                "13. Muhakkak ki Allah, azabında pek kuvvetlidir ve kudreti her şeye galip olandır.\n" +
                "14. Muhakkak ki hiçbir şeye ihtiyacı olmayan ve her türlü övgüye lâyık olan ancak Allah’tır.\n" +
                "15. Allah bana yeter. O’ndan başka ibâdete lâyık hiçbir ilah yoktur. \n" +
                "16- Allah bize yeter. O ne güzel vekildir.\n" +
                "17. En büyük korku olan kıyâmetin dehşeti onlara üzüntü vermez.\n" +
                "18. Ancak Sana kulluk eder ve ancak Senden yardım isteriz.\n" +
                "19. Ve âlemlerin Rabbi olan Allah’a hamd olsun.\n");
        duaOkunus.add("İsmi Azam Duası Okunuşu:\n\n" +
                "Eûzübi’llâhimineşşeytanirracim.Bismillahirrahmanirrahim.”Allâhümme inni es’elüke bi-enni leke’l-hamdü lâ ilahe illâ ente’l-Mennânü,yâ Hannanü,yâ Mennanü,ya Bedi’as-semâvâti ve’l-ard,Yâ zel celali vel ikram.”Ya Hayyu,Ya Kayyûm.Lâ ilâhe illâ ente sübhaneke inni küntü minez zalimin.." +
                "Allâhümme inni es’elüke bi-enni eşhedü enneke ente’l-lâhü lâ ilahe illâ ente’l-Ehadü’s-Samedüllezi lem-yelid,ve lem yüled,ve lem yekûn lehü küfuven Ehad.Elif Lâm Mim,Allâhü lâ ilâhe illâ Hüve’l-Hayyu’l-Kayyûm.Ve ilâhüküm ilâhün Vahidün lâ ilâhe illâ Hüve’r-Rahmanü’r-Rahim.Yâ zel celâli vel ikram.Yâ Erhame’r-Rahimin.Allâhümme inni es-elüke bi-enneke ente’l-lahu lâ ilahe,illâ entel Vâhidül-Ehadül Ferdüs Samedüllezi lem yelid ve lem yüled,ve lem yekün lehü küfüven Ehad." +
                "Lâ İlâhe illâllahu vahdehü lâ şerike leh,lehü’l mükü ve lehül hamdü ve Hüve ala külli şey’in Kadir.Lâ ilâhe illallahu ve lâ havleve la kuvvete illâ billahil Aliyyil Azim." +
                "Es-elüke bismike’l-e’azze’l-ecelli’l-ekrem.Rabbi,Rabbi,Rabbi, Ya Rabbi,Ya Rabbi,ya Rabbi.Lâ ilâhe illallahu Vahdehu lâ şerike leh,lehül mülkü ve lehül hamdü ve Hüve alâ külli şey’in Kadir.Elhamdüli’llâhi ve Sübhan-Allahi ve’l-hamdülllahi ve lâ ilâhe illâllahu v’Allahhu Ekber,ve lâ havle ve lâ kuvvete illâ billâhi’l-Aliyyi’l-Azim.\n"
                + "\n\n\nİsmi Azam Duası Meali (Anlamı):\n\n “Allah'tan başka ilah yoktur. Ancak, Celil ve Cebbar olan O'dur. O'ndan başka ilah yoktur. Ancak bütün kullarının hallerine vakıf olan ve kusurlarını örtbas edendir." +
                " Allah'tan başka ilah yoktur. Gece ile gündüzü halk eden O'dur. Allah'tan başka ilah yoktur. Tektir, şeriki yoktur, tektir ve birdir. Biz O'na hamdü sena ederiz. Allah'tan başka ilah yoktur. " +
                "Ancak O vardır, tektir, ortağı yoktur. Tek bir Allah'tır. Biz O'na ibadet ederiz. Allah'tan başka ilah yoktur. Ancak O vardır, tektir ve ortağı yoktur. Tek bir ilahtır. Bizler O'na şükrederiz. Allah'tan başka ilah yoktur. Allah tektir, ortağı yoktur, Muhammed O'nun Resuü'dür. Hay ve Kayyum O'dur. Allah'ın rahmeti mahlukatının en hayırlısı olan Muhammedin al ve ashabının ve hepsinin üzerine olsun. Şehadet ederim ki Sen hem Rabbimiz ve hem de Halikimizsin. " +
                "Allah'ım, beni mağfiret eyle, ey Allah, ey Allah, ey Allah Rahmetinle beni yarlığa Zira, Sen merhamet edenlerin en merhametlisisin.”\n ");
        duaOkunus.add("Sabah Duaları Meali (Anlamı):\n\n " +
                "Rahman ve Rahîm Allah’ın adıyla.\n\n" +
                "Allahım! Selam Sensin, bütün kusurlardan sâlimsin ve herkes için selamet kaynağısın. Ey celâl ve ikram sahibi! Bereket Senin şiarın, ululuk da şanındır. Allah, bütün noksan sıfatlardan münezzehtir. Bütün hamd ü senalar O’nadır. O’ndan başka ilah yoktur. Gerçek güç ve kuvvet ululuk ve azamet tahtının yegâne sultanı Allah’ındır. [Allah o ilahtır ki, Kendisinden başka ilah yoktur. Hayy’dır, Kayyûm’dur. Kendisini ne bir uyuklama, ne de uyku tutar. " +
                "Göklerde ve yerde ne varsa O’nundur. İzni olmadan huzurunda şefaat etmek kimin haddine? Yarattığı mahlûkların önünde, ardında ne var, hepsini bilir. Mahlûklar ise O’nun dilediğinden başka, ilminden hiçbir şey kavrayamazlar. O’nun kürsüsü gökleri ve yeri kaplamıştır. Gökleri ve yeri koruyup gözetmek O’na ağır gelmez; O öyle ulu, öyle büyüktür.]\n\n" +
                "[Sübhanallah. (33 defa)] [Elhamdülillah. (33 defa)] [Allahüekber. (33 defa)] [Lâilaheillallah. (100 defa)]\n\n" +
                "Kovulmuş şeytanın şerrinden Allah’a sığınırım. Rahman ve Rahîm Allah’ın adıyla. \n\n" +
                "[Allahım! Sen, benim Rabbimsin; Senden başka ilah yoktur. Beni Sen yarattın. Ben, Senin kulunum ve gücüm yettiğince Sana olan ahdime ve vaadime bağlıyım. İşlediklerimin şerrinden Sana sığınırım. Üzerimdeki nimetlerini itiraf, günahlarımı da ikrar ederim. Beni bağışla; zira günahları sadece Sen bağışlarsın. (3 defa)]\n\n" +
                "[Yüce ismi anılınca ne yerde ne de gökte hiçbir şeyin zarar veremeyeceği Allah’ın ismiyle ki, O Semî’ ve Alîm’dir. (3 defa)] Mahlûkâtının şerrinden Cenab-ı Allah’ın her türlü eksiklikten uzak, şifa ve deva vesilesi olan tastamam kelimelerine sığınırım. İnsî-cinnî bütün şeytanlardan, zarar verebilecek her canlıdan ve kem nazardan da Allah’ın tastamam kelimelerine sığınırım. \n\n" +
                "Allah’ın rahmetinden kovulmuş şeytanın şerrinden, her şeyi işiten ve bilen Allah’a sığınıyorum. Rahman ve Rahîm Allah’ın adıyla. [Allah’tır gerçek İlah! O’ndan başka yoktur ilah. Görünmeyen ve görünen her şeyi bilir. O Rahman’dır, Rahîm’dir. Allah’tır gerçek İlah! O’ndan başka yoktur ilah! O Melik’tir, Kuddûs’tür, Selâm’dır. Mü’min’dir, Müheymin’dir, Aziz’dir, Cebbar’dır, Mütekebbir’dir. Allah, müşriklerin iddialarından münezzeh ve yücedir. Allah o gerçek İlahtır ki Hâlık’tır, Bâri’dir, Musavvir’dir. Hâsılı, en güzel isimler ve vasıflar O’nundur. " +
                "Göklerde ve yerde ne varsa hepsi O’nu tesbîh ve tenzîh eder. O, Azîz’dir, Hakîm’dir.] [De ki, O, Allah’tır, gerçek ilahtır ve birdir. Allah Samed’dir. Ne doğurmuş, ne de doğurulmuştur. Ne de herhangi bir şey O’na denktir. (3 defa)] [De ki: Sabahın Rabbine sığınırım, yarattığı şeylerin şerrinden. Karanlığı çöktüğü zaman gecenin şerrinden. Düğümlere üfleyip büyü yapan büyücü kadınların şerrinden ve haset ettiği zaman hasetçinin şerrinden. (3 defa)] [De ki: İnsanların Rabbine, insanların yegâne Hükümdarına, insanların İlahına sığınırım. O sinsi şeytanın şerrinden. O ki, insanların kalblerine vesvese verir. " +
                "O şeytan, cinlerden de olur, insanlardan da. (3 defa)] [Haydi, siz akşama girerken, sabaha çıkarken Allah’ı takdîs ve tenzîh edin, namaz kılın! Göklerde ve yerde hamd, güzel övgü O’na mahsustur. İkindi vaktinde de, öğleye girerken de, O’nu takdîs ve tenzîh edin, namaz kılın! O, ölüden diriyi çıkarır, diriden ölüyü çıkarır ve ölmüş toprağa hayat verir. İşte siz de öldükten sonra böylece diriltileceksiniz.]\n\n" +
                "Allahım! Senin inayetinle sabahladık; Senin inayetinle akşamladık; Senin inayetinle yaşar, Senin izninle ölürüz. Dönüş de Sanadır. Hamd, canımızı aldıktan sonra bizi tekrar dirilten Allah’a mahsustur. Dönüş de O’nadır. Allahım, Senden başka ilah yoktur. Senin şerîkin de bulunmaz. Allahım, Seni, yüce şanına yaraşmayacak her eksiklikten tenzîh ediyor, günahlarımı bağışlamanı ve rahmetini diliyorum. Allahım, ilmimi artır ve bahşettiğin hidayetten sonra kalbimi kaydırma. Yüce nezdinden bana rahmetini lutfet. Şüphesiz ki, Sen çok lütufkârsın.\n\n" +
                "[Allahım! Seyyidina Hazreti İbrahim ve ailesine salât ettiğin gibi, Efendimiz Hazreti Muhammed ve ailesine de salât et. Muhakkak ki Sen, her bakımdan hamde layık ve şanı yüce olansın. (10 defa)] [Allahım! Seyyidina Hazreti İbrahim ve ailesine bereket ihsan ettiğin gibi, Efendimiz Hazreti Muhammed ve ailesine de bereket ihsan et. Muhakkak ki Sen, her bakımdan hamde layık ve şanı yüce olansın. (10 defa)]\n\n" +
                "[Allahım! Senden başka ilah olmadığına ve Hazreti Muhammed (aleyhissalâtü vesselam)’ın Senin kulun ve rasûlün olduğuna; Seni, hamele-i arşını, meleklerini ve bütün mahlûkâtını şâhit tutarak sabahladım. (3 defa)]\n\n" +
                "Lebbeyk ya Rab, fermanına uydum, divanına geldim. Her zaman gelmeye de âmâdeyim. Her türlü hayır ve güzellik Senin elindedir; Senden gelir ve yine Sana döner. \n\n" +
                "Allahım! Bir söz söylemiş, bir yemin etmiş, bir nezirde bulunmuş yahut bir amel işlemiş olmayayım ki, Sen hepsini önceden dilemiş olmayasın. Neyi ki diledin, o olmuştur. Olmamasını dilediğin şey de olmamıştır. Gerçek güç ve kuvvet ancak Sana aittir. Şüphesiz Senin gücün her şeye yeter. Allahım, yaptığım her dua, Senin rahmetinle muamelede bulunduğun, ettiğim her lanet de Senin lanet ettiğin kimsenin üzerine olsun. Sen dünyada ve ahirette benim yüce dostum ve velimsin; beni müslüman olarak öldür ve salih kulların zümresine ilhak buyur.\n\n" +
                "Allahım! Senden, muzır bir şeye ve saptırıcı bir fitneye uğramaksızın, kazaya rıza, ölümden sonra rahat bir hayat, cemâline bakma lezzeti ve Sana kavuşma iştiyakı istiyor; zulmetmekten ya da zulme uğramaktan, düşmanlıkta bulunmaktan veya düşmanlığa maruz kalmaktan, hata işlemekten yahut bağışlanmayacak bir günaha girmekten Sana sığınıyorum. \n\n" +
                "Gökleri ve yeri yaratan, hem gayb hem de şehadet âlemlerini bilen, celâl ve ikram sahibi Allahım! Şu dünya hayatında Sana söz veriyor ve Seni sözüme şahit tutuyorum. Zaten Sen şahid olarak yetersin. Şehadet ederim ki, Senden başka ilah yoktur; birsin; ortağın bulunmaz; mülk Senindir, hamd Sana mahsustur ve Senin gücün her şeye yeter. Yine şehadet ederim ki, Hazreti Muhammed (sallallahü aleyhi vesellem) Senin kulun ve Rasûlündür. Vaadinin hak, Senin huzuruna çıkmanın da hak olduğuna, Kıyamet saatinin katiyen geleceğine ve Senin kabirdekileri dirilteceğine de şehadet ederim. Şayet beni nefsime bırakırsan, o zaman zaaf, kusur, günah ve hatalarla baş başa bırakmış olursun." +
                " Ben sadece Senin rahmetine itimat ediyorum. Ne olur, bütün günahlarımı bağışla; zira günahları ancak Sen bağışlarsın. Tevbemi kabul buyur, çünkü Sen, tevbe yollarını açan ve o tevbeleri kabul eden Tevvâb ü Rahîmsin.\n\n" +
                "Uykuyu ve uyanıklığı yaratan Cenab-ı Allah’a hamd olsun. Beni sağ-salim ve her uzvum yerli yerinde dirilten Allah’a hamd olsun. Şehadet ederim ki, Allah ölüleri de diriltir ve O, her şeye gücü yetendir. \n\n" +
                "Biz de, bütün mülk de, Azîz ve Celîl olan Allah’a ait olarak sabahladık. Hamd Allah’a mahsustur; ululuk ve azamet yalnız Allah’ındır. Yaratma da, emir de, gece ve gündüz de, gece ile gündüzü mesken tutmuş her şey de yalnızca Allah’a aittir.\n\n" +
                "Allahım! İçinde bulunduğumuz şu günün evvelini sulh ü salah, ortasını felah, sonunu da her bakımdan muvaffakiyetli kıl. Senden dünyanın da, ahiretin de hayrını diliyorum, ey Merhametliler Merhametlisi! \n\n" +
                "[Allahım! Her türlü gam ve hüzünden Sana sığınıyorum; acizlik ve tembellikten de Sana sığınıyorum; korkaklık ve cimrilikten de yine Sana sığınıyorum; borca mağlup olmaktan ve düşmanların kahrına uğramaktan da yine Sana sığınıyorum. (3 defa)]\n\n" +
                "Biz de, bütün mülk de, Allah’a ait olarak sabahladık; O’nun ortağı yoktur. O’ndan başka ilah bulunmaz ve dönüş de yine O’nadır. \n\n" +
                "[Gökleri ve yeri yaratan, hem gayb hem de şehadet âlemini bilen, her şeyin Rabbi ve Sahibi olan Allahım! Şehadet ederim ki, Senden başka ilah yoktur. Nefsimin ve şeytanın şerrinden, onun her türlü tuzağından, günah işleyerek kendi nefsime zulmetmekten veya başka bir müslümana kötülük dokundurmaktan Sana sığınırım. (4 defa)]\n\n" +
                "Ya Hayy u ya Kayyûm! Rahmetin hürmetine Senden yardım dileniyorum; her halimi ıslah buyur ve göz açıp kapayıncaya kadar olsun beni kendime ve nefsime terk etme.\n\n" +
                "Allahım! Adı anılmaya en layık olan Sen, kullukta bulunulmaya en layık olan da yine Sensin. Sensin yardım istenilenlerin en çok yardım edeni, güç sahiplerinin en şefkatlisi, kapısında bir şeyler dilenilenlerin en cömerdi ve verenlerin eli en açık olanı. Sensin her şeyin, ortağı olmayan yegâne sahibi ve hâkimi." +
                " Sensin eşi ve benzeri olmayan biricik varlık. Senden başka ne varsa hepsi yok olmaya mahkûmdur. Sana, ancak Senin iznin ile itaat edilir ve Sen isyan edenleri mutlaka bilirsin. Sana itaat edilir, karşılığını verirsin. İsyan edilir, affedersin. Her şeye en yakın şahit Sen, en yakın koruyucu da yine Sensin. Nefislerin önüne geçer ve perçemlerden yakalarsın. İnsanların yaptıklarını yazar ve ecellerini takdir edersin. Kalbler sırlarını Sana açar, dolayısıyla her gizli Sana ayandır. Helal, Senin helal kıldığın, haram da Senin haram buyurduğundur. Din, Senin teşri kıldığın; emir de Senin hükmettiğindir. Mahlûkat Senin varlığın; kul da Senin kulundur." +
                " Sen, Raûf ve Rahîm Allah’sın. Göklerin ve yerin kendisiyle parıldadığı yüzünün nuru hürmetine, Sana ait her bir hak hürmetine ve Senden isteyen kulların hürmetine beni şu günün sabahında ve akşamında affetmeni ve kudretinle Cehennem ateşinden korumanı diliyorum. \n\n" +
                "[Allah bana yeter. O’ndan başka ilah yoktur. Ona tevekkül ettim. O, Arş-ı Azîm’in Rabbidir. (7 defa)]\n\n" +
                "[Rabb olarak Allah’tan, Din olarak İslam’dan, Rasûl olarak da Hazreti Muhammed (sallallahü aleyhi vesellem)’den razı olduk. Rabb olarak Allah’tan, Din olarak İslam’dan, Nebî olarak da Hazreti Muhammed (sallallahü aleyhi vesellem)’den razı oldum. (3 defa)]\n\n" +
                "Allahım, bu günün sabahında benim üzerimde ya da mahlûkatından herhangi biri üzerinde olan her bir nimet ancak Sendendir. Senin ortağın yoktur. Hamd Sana mahsus, şükür de yine Sana mahsustur.\n\n" +
                "Allahım, Senden sürpriz hayırlar diler ve beklenmedik şerlerden Sana sığınırım. \n\n" +
                "Allahım, şu sabaha Senden gelen bir nimet ve afiyet ile ve günahlarım örtülmüş olarak çıktım. Dünyada ve ahirette üzerimdeki nimetini, afiyetini ve sıyanetini tamamlamanı diliyorum. \n\n" +
                "Rabbim Allah’tır, tevekkülüm de Allah’adır. O’ndan başka ilah yoktur. O’na tevekkül ettim. O, Arş-ı Azîm’in Rabbi’dir. \n\n" +
                "Ululuk ve azamet sahibi Allah’tan başka bir ilah yoktur. O, ne dilemişse olmuş, olmamasını dilediği hiçbir şey de olmamıştır. Biliyorum ki, Allah’ın gücü her şeye yeter ve Allah, ilmiyle her şeyi kuşatmıştır.\n\n" +
                "Allahım! Sen benim Rabbimsin; Senden başka bir ilah yok; ben yalnız Sana tevekkül ettim. Sen, Arş-ı Azîm’in Rabbisin. Allah, neyi dilediyse o olmuş, olmamasını dilediği de olmamıştır; güç ve kuvvet, ululuk ve azamet sahibi Allah’ındır. \n\n" +
                "Allahım! Nefsimin ve perçeminden tuttuğun her canlının şerrinden Sana sığınırım. [Şüphesiz ki Rabbim, dosdoğru bir yol üzerindedir.]\n\n" +
                "Biz de, bütün mülk de Allah’a ait olarak sabahladık. Hamd, Allah’a mahsustur. Başka ilah yoktur, ancak Allah vardır. O’nun ortağı yoktur; mülk de hamd de O’na aittir. O’nun her şeye gücü yeter. \n\n" +
                "Rabbim! Bu ve bundan sonraki günlerin hayrını Senden diler, bugünün ve daha sonraki günlerin şerrinden de Sana sığınırım. \n\n" +
                "Rabbim! Tembellikten ve ihtiyarlığın dertlerinden Sana sığınırım. \n\n" +
                "Rabbim! Cehennem’deki ve kabirdeki azaptan Sana sığınırım. \n\n" +
                "[Allahım, Sana sığınırım küfürden ve fakirlikten. Allahım, Sana sığınırım kabir azabından. Senden başka ilah yoktur. (3 defa)] [Allahım, bedenime afiyet ver. Allahım, kulağıma afiyet ver. Allahım, gözüme afiyet ver. Senden başka ilah yoktur. (3 defa)]\n\n" +
                "Yüce Zat’ına mahsus hamd ile Allah’ı tesbîh ederim. Kuvvet sadece Allah’ındır. Allah ne dilediyse olmuş, olmamasını dilediği de olmamıştır. Biliyorum ki, Allah’ın gücü her şeye yeter ve Allah, sonsuz ilmiyle her şeyi kuşatmıştır.\n\n" +
                "İslam fıtratı, ihlas/tevhid kelimesi ile Peygamberimiz Hazreti Muhammed (sallallahü aleyhi vesellem)’in dini üzerinde ve hiçbir zaman şirke düşmeden hep Hakk’a yönelen ve Müslüman olan atamız İbrahim (aleyhisselam)’ın milletinden olarak sabaha erdik. \n\n" +
                "Allahım! Tembellikten, kocamaktan, ihtiyarlığın dertlerinden, dünyanın fitnesinden ve ahiret azabından Sana sığınıyorum. Biz de, bütün mülk de, Âlemlerin Rabbi Allah’a ait olarak sabahladık. \n\n" +
                "Allahım! Senden bugünün hayrını, fethini, yardımını, nurunu, bereket ve hidayetini istiyor, bugünde ve bundan sonraki günlerde olan ve olacakların şerrinden Sana sığınıyorum. \n\n" +
                "Allah’tan başka ilah yoktur. Büyük Allah’tır; başka ilah yoktur, sadece Allah vardır. Allah’tan başka ilah yoktur; O’nun ortağı bulunmaz. Allah’tan başka ilah yoktur. Hamd ve mülk O’na mahsustur. Allah’tan başka ilah yoktur; gerçek havl ve kuvvet ancak Allah’a aittir.\n\n" +
                "Allahım! Dünyada ve ahirette Senden afiyet diliyorum. \n\n" +
                "Allahım! Dinimde ve dünyamda, ailemde ve malımda Senden afv u afiyet dileniyorum. \n\n" +
                "Allahım! Ayıplarımı setret ve beni korkularımdan emin kıl. \n\n" +
                "Allahım! Önümden, arkamdan, sağımdan, solumdan ve üstümden gelecek tehlikelerden beni koru. Ayağımın altından ansızın derdest edilmekten de Senin azametine sığınıyorum. \n\n" +
                "[Allah’ı her türlü noksandan tenzîh eder ve O’na hamd ederim. Şanı yüce Allah, her türlü eksiklikten münezzehtir. (100 defa)]\n\n" +
                "[Allah bütün noksanlardan münezzehtir. Hamd Allah’a mahsustur. Allah’tan başka ilah yoktur. Büyük Allah’tır. (100 defa)]\n\n" +
                "Allahım! Senden, imanda sıhhat, güzel ahlakla bezenmiş iman, arkasından felah gelecek bir muvaffakiyet, katından rahmet ve afiyet ve nezdinden mağfiret ve rıza diliyorum. \n\n" +
                "Allahım! İmanı bize sevdir ve onu kalblerimizde tezyin et. Küfür, fısk ve isyanı da bize çirkin göster ve bizi hep dosdoğru yolda yürüyenlerden eyle. \n\n" +
                "Allahım, Senden, Seninle itmi’nan bulmuş, Sana kavuşacağına inanan, kazana razı ve verdiğine kanaat eden bir nefis diliyorum. \n\n" +
                "[Allahım! Bilerek şirk koşmaktan Sana sığınıyor, bilemediklerimden dolayı da mağfiretini diliyorum. (3 defa)]\n\n" +
                "Allahım! Her işte âkıbetimizi güzel eyle ve bizi dünyada rezil rüsvay olmaktan, ahirette de azaba uğramaktan muhafaza buyur. \n\n" +
                "Allahım! Efendimiz Hazreti Muhammed (sallallahü aleyhi vesellem)’e, âl ü ashabına salât ü selam eyle ve o salevât hakkı için dualarımızı kabul buyur. Âmîn! Velhamdü lillahi Rabbilâlemîn. \n\n" +
                " \n");
        duaOkunus.add("Akşam Duaları Meali (Anlamı):\n\n" +
                "Rahman ve Rahîm Allah’ın adıyla.\n\n" +
                "Allahım! Selam Sensin, bütün kusurlardan sâlimsin ve herkes için selamet kaynağısın. Ey celâl ve ikram sahibi! Bereket Senin şiarın, ululuk da şanındır. Allah, bütün noksan sıfatlardan münezzehtir. Bütün hamd ü senalar O’nadır. O’ndan başka ilah yoktur. Gerçek güç ve kuvvet ululuk ve azamet tahtının biricik sultanı Allah’ındır. [Allah o ilahtır ki, Kendisinden başka ilah yoktur. Hayy’dır, Kayyûm’dur. Kendisini ne bir uyuklama, ne de uyku tutar. Göklerde ve yerde ne varsa O’nundur." +
                " İzni olmadan huzurunda şefaat etmek kimin haddine? Yarattığı mahlûkların önünde, ardında ne var, hepsini bilir. Mahlûklar ise O’nun dilediğinden başka, ilminden hiçbir şey kavrayamazlar. O’nun kürsüsü gökleri ve yeri kaplamıştır. Gökleri ve yeri koruyup gözetmek O’na ağır gelmez; O öyle ulu, öyle büyüktür.]\n\n" +
                "[Sübhanallah. (33 defa)] [Elhamdülillah. (33 defa)] [Allahüekber. (33 defa)] [Lâilaheillallah. (100 defa)]\n\n" +
                "Ey kalbleri evirip çeviren Allahım! Kalblerimizi dinin üzere sâbit kıl.\n\n" +
                "[Eûzübillahimineşşeytanirracîm. Bismillahirrahmanirrahîm. (10 defa)]\n\n" +
                "Biz ve bütün mülk, Allah’a ait olarak akşamladık. O’nun ortağı yoktur. O’ndan başka bir ilah da bulunmaz. Dönüş O’nadır. Biz ve bütün mülk Allah’a ait olarak akşama erdik. Kusursuz olarak yaratıp her tarafa saçtığı şeylerin şerrinden, yerin üstüne düşmesin diye göğü tutan ve göğün ancak Kendi izniyle düşebileceği Allah’a sığınırım.\n\n" +
                "Allahım! Senden imanda sıhhat, güzel ahlakla bezenmiş bir iman, peşinden felah gelecek bir muvaffakiyet, katından bir rahmet ve afiyet ve mağfiret ve rızanı diliyorum.\n\n" +
                "[Gökleri ve yeri yaratan, hem gayb hem de şehadet âlemini bilen, her şeyin Rabbi ve Sahibi olan Allahım! Şehadet ederim ki, Senden başka ilah yoktur. Nefsimin ve şeytanın şerrinden, onun her türlü tuzağından, günah işleyerek kendi nefsime zulmetmekten veya bir başka müslümana kötülük dokundurmaktan Sana sığınırım. (3 defa)]\n\n" +
                "[Allahım! Senden başka ilah olmadığına, Senin bir olduğuna, şerîkin bulunmadığına ve Hazreti Muhammed (sallallahü aleyhi vesellem)’in Senin kulun ve Rasûlün olduğuna, Seni, hamele-i arşını, meleklerini ve bütün mahlûkatını şahit tutarak akşamladım. (3 defa)]\n\n" +
                "Allahım, dünyada ve ahirette Senden afiyet dilerim. \n\n" +
                "Allahım, dinim, dünyam, ailem ve malımda Senden afv u afiyet diliyorum. Allahım, ayıplarımı ört ve beni korktuklarımdan emin eyle. \n\n" +
                "Allahım, önümden, arkamdan, sağımdan, solumdan ve üstümden gelebilecek tehlikelerden beni koru. Ayaklarımın altından derdest edilmekten de Senin azametine sığınırım. \n\n" +
                "[Rabb olarak Allah’tan, Din olarak İslam’dan, Rasûl olarak da Hazreti Muhammed (sallallahü aleyhi vesellem)’den razı olduk. Rabb olarak Allah’tan, Din olarak İslam’dan, Nebî olarak da Hazreti Muhammed (sallallahü aleyhi vesellem)’den razı oldum. (3 defa)]\n\n" +
                "[Allahım, Sana sığınırım küfürden ve fakirlikten. Allahım! Sana sığınırım kabir azabından. Senden başka ilah yoktur. (3 defa)] [Allahım! Bedenime afiyet ver. Allahım! Kulağıma afiyet ver. Allahım! Gözüme afiyet ver. Senden başka ilah yoktur. (3 defa)]\n\n" +
                "Allah’a hamd ederek O’nu tenzîh ederim. Gerçek güç yalnız Allah’ındır. Dilediği olur, olmamasını dilediği de olmaz. Bilirim ki, Allah’ın her şeye gücü yeter ve o ilmiyle her şeyi kuşatmıştır.\n\n" +
                "İslam fıtratı ve ihlâs/tevhid kelimesi ile Peygamberimiz Hazreti Muhammed (sallallahü aleyhi vesellem)’in dini üzerinde ve hiçbir zaman şirke düşmeden hep Hakk’a yönelen ve Müslüman olan atamız İbrahim (aleyhisselam)’ın milletinden olarak akşama erdik.\n\n" +
                "Ya Hayy u ya Kayyûm! Rahmetin hakkı için Senden yardım dileniyorum; her halimi ıslah buyur ve göz açıp kapayıncaya kadar olsun beni nefsime terk etme.\n\n" +
                "Allahım! Adı anılmaya en layık olan Sen, kullukta bulunulmaya en layık olan da yine Sensin. Sensin yardım istenilenlerin en çok yardım edeni, güç sahiplerinin en şefkatlisi, kapısında bir şeyler dilenilenlerin en cömerdi ve verenlerin eli en açık olanı. Sensin her şeyin, ortağı olmayan yegâne sahibi ve hâkimi. Sensin eşi ve benzeri olmayan biricik varlık. Senden başka ne varsa hepsi yok olmaya mahkûmdur. Sana, ancak Senin iznin ile itaat edilir ve Sen isyan edenleri mutlaka bilirsin. Sana itaat edilir, karşılığını verirsin. İsyan edilir, affedersin." +
                " Her şeye en yakın şahit Sen, en yakın koruyucu da yine Sensin. Nefislerin önüne geçer ve perçemlerden yakalarsın. İnsanların yaptıklarını yazar ve ecellerini takdir edersin." +
                " Kalbler sırlarını yalnız Sana açar, dolayısıyla her gizli Sana ayandır. Helal, Senin helal kıldığın, haram da Senin haram buyurduğundur. Din, Senin teşri kıldığın; emir de Senin hükmettiğindir. Mahlûkat, Senin varlığın; kul da Senin kulundur. Sen, Raûf ve Rahîm Allah’sın. Göklerin ve yerin kendisiyle parıldadığı yüzünün nuru hürmetine, Sana ait her bir hak hürmetine ve Sana el açıp dua eden kulların hürmetine beni şu günün sabahında ve akşamında affetmeni ve kudretinle Cehennem ateşinden korumanı diliyorum. \n\n" +
                "[Allah bana yeter. O’ndan başka ilah yoktur. Ona tevekkül ettim. O, Arş-ı Azîm’in Rabbidir. (7 defa)]\n\n" +
                "Allahım! Sen, benim Rabbimsin; Senden başka ilah yoktur. Beni Sen yarattın. Ben, Senin kulunum ve gücüm yettiğince Sana olan ahdime ve vaadime bağlıyım. İşlediklerimin şerrinden Sana sığınırım. Üzerimdeki nimetlerini itiraf, günahlarımı da ikrar ederim. Beni bağışla; zira günahları sadece Sen bağışlarsın.\n\n" +
                "Allah’tan başka ilah yoktur. Büyük Allah’tır; başka ilah yoktur, sadece Allah vardır. Allah’tan başka ilah yoktur; O’nun ortağı bulunmaz. Allah’tan başka ilah yoktur. Hamd ve mülk O’na mahsustur. Allah’tan başka ilah yoktur; gerçek havl ve kuvvet ancak Allah’a aittir.\n\n" +
                "[Yüce ismi anılınca ne yerde ne de gökte hiçbir şeyin zarar veremeyeceği Allah’ın ismiyle ki, O Semî ve Alîm’dir. (3 defa)]\n\n" +
                "Yarattıklarının şerrinden Allah’ın tastamam kelimelerine sığınıyorum.\n\n" +
                "[Haydi, siz akşama girerken, sabaha çıkarken Allah’ı takdîs ve tenzîh edin, namaz kılın! Göklerde ve yerde hamd, güzel övgü O’na mahsustur. İkindi vaktinde de, öğleye girerken de, O’nu takdîs ve tenzîh edin, namaz kılın! O, ölüden diriyi çıkarır, diriden ölüyü çıkarır ve ölmüş toprağa hayat verir. İşte siz de öldükten sonra böylece diriltileceksiniz.]\n" +
                "Biz de, bütün mülk de Allah’a ait olarak akşamladık. Hamd, Allah’a mahsustur. Başka ilah yoktur, ancak Allah vardır. O’nun ortağı yoktur; mülk de hamd de O’na aittir. O’nun her şeye gücü yeter.\n\n" +
                "Rabbim! Bu ve bundan sonraki gecelerin hayrını Senden diler, bu gecenin ve daha sonraki gecelerin şerrinden de Sana sığınırım.\n\n" +
                "Rabbim! Tembellikten ve ihtiyarlığın dertlerinden Sana sığınırım. \n\n" +
                "Rabbim! Cehennem’deki ve kabirdeki azaptan Sana sığınırım. \n\n" +
                "Allahım! Tembellikten, kocamaktan, ihtiyarlığın dertlerinden, dünyanın fitnesinden ve ahiret azabından Sana sığınıyorum. Biz de, bütün mülk de, Âlemlerin Rabbi Allah’a ait olarak akşamladık.\n\n" +
                "Allahım! Senden bu gecenin hayrını, fethini, yardımını, nurunu, bereket ve hidayetini istiyor, bu ve bundan sonraki gecelerde olan ve olacakların şerrinden Sana sığınıyorum. \n\n" +
                " Allahım! İmanı bize sevdir ve onu kalblerimizde tezyin et. Küfür, fısk ve isyanı da bize çirkin göster ve bizi hep dosdoğru yolda yürüyenlerden eyle. \n\n" +
                "Allahım, Senden, Seninle itmi’nan bulmuş, Sana kavuşacağına inanan, kazana razı ve verdiğine kanaat eden bir nefis diliyorum.\n\n" +
                "\n");
        duaOkunus.add("1. Seyyidünâ ve nebiyyünâ Muhammed el-Muhâcirî (Sallallahu aleyhi ve sellem)\n" +
                "\n" +
                "2. Seyyidünâ Ebû Bekir Sıddıyk el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "3. Seyyidünâ Ömer ibnü’l-Hattab el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "4. Seyyidünâ Osman ibn-i Affan el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "5. Seyyidünâ Aliyy ibn-i Ebî Tâlib el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "6. Seyyidünâ Talha bin Ubeydullah el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "7. Seyyidünâ Zübeyr ibn-i Avvâm el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "8. Seyyidünâ Abdurrahman bin Avf el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "9. Seyyidünâ Sa’d bin Ebî Vakkas el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "10. Seyyidünâ Said ibn-i Zeyd el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "11. Seyyidünâ Ebû Ubeyde bin Cerrâh el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "12. Seyyidünâ Übeyy ibn-i Ka’b el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "13. Seyyidünâ el-Ahnes ibn-i Habib el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "14. Seyyidünâ el-Erkam ibn-i Erkam el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "15. Seyyidünâ Es’ad ibn-i Yezid el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "16. Seyyidünâ Enes mevlâ Rasûlillâh sallallahu aleyhi ve sellem el-Muhâcirî (radıyallahu teâlâ anh)\n" +
                "\n" +
                "17. Seyyidünâ Enes ibn-i Muâz el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "18. Seyyidünâ Enes ibn-i Katâdet’el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "19. Seyyidünâ Evs ibn-i Sâbit el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "20. Seyyidünâ Evs ibn-i Havlî el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "21. Seyyidünâ ‹yas ibn-i Evs el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "22. Seyyidünâ ‹yas ibn’il-Bükeyr el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "23. Seyyidünâ Büceyr ibn-i Ebî Büceyr el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "24. Seyyidünâ Bahhas ibn-i Sa’lebe el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "25. Seyyidünâ el-Bera bin Ma’rur el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "26 . Seyyidünâ Besbese bin Amr el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "27. Seyyidünâ Biflr ibn’il-Bera el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "28. Seyyidünâ Beflir ibn-i Said el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "29. Seyyidünâ Bilâl ibn-i Rebâh el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "30. Seyyidünâ Temim mevlâ H›râfl el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "31. Seyyidünâ Temim mevlâ Benî Ganem bin es-Silm el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "32. Seyyidünâ Temim ibn-i Yuar el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "33. Seyyidünâ Sâbit ibn-i Akram el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "34. Seyyidünâ Sâbit ibn-i Sa’lebe el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "35. Seyyidünâ Sâbit ibn-i Hâlid el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "36. Seyyidünâ Sâbit ibn-i Amr el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "37. Seyyidünâ Sâbit ibn-i Hezzâl el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "38. Seyyidünâ Sa’lebe bin Hât›m el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "39. Seyyidünâ Sa’lebe bin Amr el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "40. Seyyidünâ Sa’lebe bin Aneme el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "41. Seyyidünâ S›kf ibn-i Amr el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "42. Seyyidünâ Câbir ibn-i Abdullah bin Riyab el Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "43. Seyyidünâ Câbir ibn-i Abdullah bin Amr el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "44. Seyyidünâ Cebbâr ibn-i Sahr el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "45. Seyyidünâ Cebr ibn-i Atik el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "46. Seyyidünâ Cübeyr ibn-i ‹yas el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "47. Seyyidünâ Hamza bin Abdülmuttalib el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "48. Seyyidünâ el-Hâris ibn-i Enes el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "49. Seyyidünâ el-Hâris ibn-i Evs bin Râfi’ el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "50. Seyyidünâ el-Hâris ibn-i Evs bin Muâz el-Evsi (radıyallahu anh)\n" +
                "\n" +
                "51. Seyyidünâ el-Hâris ibn-i Hât›b el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "52. Seyyidünâ el-Hâris ibn-i Ebî Hazme el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "53. Seyyidünâ el-Hâris ibn-i Hazme el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "54. Seyyidünâ el-Hâris ibn’is-S›mme el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "55. Seyyidünâ el-Hâris ibn-i Arfece el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "56. Seyyidünâ el-Hâris ibn-i Kays el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "57. Seyyidünâ el-Hâris ibn-i Kays el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "58. Seyyidünâ el-Hâris ibn’un-Nu’man ibn-i Ümeyye el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "59. Seyyidünâ Hârise bin Sürâka el-Hazrecî (radıyallahu anh) (Şehit)\n" +
                "\n" +
                "60. Seyyidünâ Hârise bin Nu’man el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "61. Seyyidünâ Hât›b ibn-i Ebî Beltea el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "62. Seyyidünâ Hât›b ibn-i Amr el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "63. Seyyidünâ el-Hubab ibn-i Münzir el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "64. Seyyidünâ Habîb ibn-i Esved el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "65. Seyyidünâ Haram ibn-i Milhan el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "66. Seyyidünâ Hureys ibn-i Zeyd el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "67. Seyyidünâ el-Husayn ibn-i Hâris el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "68. Seyyidünâ Hamza bin el-Mumeyyir el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "69. Seyyidünâ Hârice bin Zeyd el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "70. Seyyidünâ Hâlid ibn-i el-Bükeyr el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "71. Seyyidünâ Hâlid ibn-i Kays el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "72. Seyyidünâ Habbab ibn’ül-Eret el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "73. Seyyidünâ Habbab mevlâ Utbe el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "74. Seyyidünâ Hubeyb ibn-i ‹saf el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "75. Seyyidünâ H›dafl ibn-i Katâde el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "76. Seyyidünâ H›rafl ibn’is-S›mme el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "77. Seyyidünâ Hureym ibn-i Fâtik el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "78. Seyyidünâ Hallâd ibn-i Râfi’ el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "79. Seyyidünâ Hallâd ibn-i Süveyd el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "80. Seyyidünâ Hallâd ibn-i Amr el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "81. Seyyidünâ Hallâd ibn-i Kays el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "82. Seyyidünâ Huleyd ibn-i Kays el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "83. Seyyidünâ Halife bin Adiy el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "84. Seyyidünâ Huneys ibn-i Hazafe el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "85. Seyyidünâ Havvât ibn-i Cübeyr el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "86. Seyyidünâ Havlî bin Ebî Havlî el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "87. Seyyidünâ Zekvân ibn-i Ubeyd el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "88. Seyyidünâ Zü’ş-Şimaleyn ibn-i Abd Amr el-Muhâcirî (radıyallahu anh) (Şehit)\n" +
                "\n" +
                "89. Seyyidünâ Râflid ibn-i Muallâ el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "90. Seyyidünâ Râfi bin Hâris el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "91. Seyyidünâ Râfi’ bin ⁄unecde el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "92. Seyyidünâ Râfi’ bin Mâlik el-Hazercî (radıyallahu anh)\n" +
                "\n" +
                "93. Seyyidünâ Râfi ibn’ül-Muall el-Hazrecî (radıyallahu anh) (Şehit)\n" +
                "\n" +
                "94. Seyyidünâ Râfi’ bin Yezid el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "95. Seyyidünâ Rib’›y bin Râfi’ el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "96. Seyyidünâ er-Rebî ibn-ü ‹yas el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "97. Seyyidünâ Râbia bin Eksem el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "98. Seyyidünâ Ruhayle bin Sa’lebe el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "99. Seyyidünâ Rifâa bin Hâris el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "100. Seyyidünâ Rifâa bin Râfi’ el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "101. Seyyidünâ Rifâa bin Abd’il-Münzir el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "102. Seyyidünâ Rifâa bin Amr el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "103. Seyyidünâ Zübeyr ibn-i Avvam (radıyallahu anh)\n" +
                "\n" +
                "104. Seyyidünâ Ziyad ibn’is-Seken el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "105. Seyyidünâ Ziyad ibn-i Lebid el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "10. Seyyidünâ Ziyad ibn-i Amr el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "107. Seyyidünâ Zeyd ibn-i Eslem el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "108. Seyyidünâ Zeyd ibn-i Hârise el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "109. Seyyidünâ Zeyd ibn-ü-Hattab el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "110. Seyyidünâ Zeyd ibn’ül-Müzeyyen el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "111. Seyyidünâ Zeyd ibn’ül-Muallâ el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "112. Seyyidünâ Zeyd ibn-i Vedia el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "113. Seyyidünâ Sâlim mevlâ Ebî Huzeyfe el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "114. Seyyidünâ Sâlim ibn-i Umeyr el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "115. Seyyidünâ es-Saib ibn-i Osman el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "116. Seyyidünâ Sebre bin Fâtik el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "117. Seyyidünâ Sürâka bin Amr el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "118. Seyyidünâ Sürâka bin Ka’b el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "119. Seyyidünâ Sa’d mevlâ Hât›b el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "120. Seyyidünâ Sa’d ibn-i Havle el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "121. Seyyidünâ Sa’d ibn-i Hayseme el-Evsî (Şehit) (radıyallahu anh)\n" +
                "\n" +
                "122. Seyyidünâ Sa’d ibn’ür-Rebî el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "123. Seyyidünâ Sa’d ibn-i Zeyd el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "124. Seyyidünâ Sa’d ibn-i Sa’d el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "125. Seyyidünâ Sa’d ibn-i Sehl el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "126. Seyyidünâ Sa’d ibn-i Ubâde el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "127. Seyyidünâ Sa’d ibn-i Ubeyd el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "128. Seyyidünâ Sa’d ibn-i Osman el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "129. Seyyidünâ Sa’d ibn-i Muâz el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "130. Seyyidünâ Süflan ibn-i Biflr el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "131. Seyyidünâ Seleme bin Eslem el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "132. Seyyidünâ Süleym ibn’ül-Hâris el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "133. Seyyidünâ Seleme bin Selâme el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "134. Seyyidünâ Selît ibn-i Kays el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "135. Seyyidünâ Süleym ibn’ül-Haris el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "136. Seyyidünâ Süleym ibn-i Kays el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "137. Seyyidünâ Süleym ibn-i Amr el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "138. Seyyidünâ Süleym ibn-i Milhan el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "139. Seyyidünâ Simak ibn-i Sa’d el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "140. Seyyidünâ Sinan ibn-i Ebî Sinan el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "141. Seyyidünâ Sinan ibn-i Sayfî el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "142. Seyyidünâ Sehl ibn-i Huneyf el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "143. Seyyidünâ Sehl ibn-i Râfi’ el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "144. Seyyidünâ Sehl ibn-i Atik el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "145. Seyyidünâ Sehl ibn-i Kays el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "146. Seyyidünâ Sehl ibn-i Vehb el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "147. Seyyidünâ Sehl ibn-i Râfi’ el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "148. Seyyidünâ Sevad ibn-i Zerin el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "149. Seyyidünâ Sevad ibn-i ⁄aziyye el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "150. Seyyidünâ Süveyb›t ibn-i Harmele el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "151. Seyyidünâ fiücâ’ ibn-i Ebî Vehb el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "152. Seyyidünâ fierik ibn-i Enes el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "153. Seyyidünâ fiemmâs ibn-i Osman el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "154. Seyyidünâ Sebîy mevlâ Eb’il-As el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "155. Seyyidünâ Safvan ibn-i Vehb el-Muhâcirî (Şehit) (radıyallahu anh)\n" +
                "\n" +
                "156. Seyyidünâ Suheyb ibn-i Sinan el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "157. Seyyidünâ Sayfî bin Sevad el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "158. Seyyidünâ ed-Dahhak ibn-i Hârise el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "159. Seyyidünâ ed-Dahhâk ibn-i Abd-i Amr el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "160. Seyyidünâ Damre bin Amr el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "161. Seyyidünâ et-Tufeyl ibn-i Hâris el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "162. Seyyidünâ et-Tufeyl ibn-i Mâlik el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "163. Seyyidünâ et-Tufeyl ibn-i Nu’mân el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "164. Seyyidünâ Tuleyb ibn-i Umeyr el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "165. Seyyidünâ Âs›m ibn-i Sâbit el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "166. Seyyidünâ Âs›m ibn-i Adiy el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "167. Seyyidünâ Âs›m ibn-i Ukeyr el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "168. Seyyidünâ Âs›m ibn-i Kays el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "169. Seyyidünâ Âk›l ibn’ül-Bükeyr el-Muhâcirî (Şehit) (radıyallahu anh)\n" +
                "\n" +
                "170. Seyyidünâ Âmir ibn-i Ümeyye el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "171. Seyyidünâ Âmir ibn-i Bükeyr el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "172. Seyyidünâ Âmir ibn-i Rebîa el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "173. Seyyidünâ Âmir ibn-i Sa’d el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "174. Seyyidünâ Âmir ibn-i Seleme el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "175. Seyyidünâ Âmir ibn-i Füheyre el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "176. Seyyidünâ Âmir ibn-i Muhalled el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "177. Seyyidünâ Âmir ibn-i Yezid el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "178. Seyyidünâ Âyiz ibn–i Ma›s el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "179. Seyyidünâ Abbâd ibn-i Biflr el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "180. Seyyidünâ Abbâd ibn-i Kays el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "181. Seyyidünâ Ubâde bin Sâmit el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "182. Seyyidünâ Abdullah ibn-i Sa’lebe el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "183. Seyyidünâ Abdullah ibn-i Cübeyr el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "184. Seyyidünâ Abdullah ibn-i Cahfl el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "185. Seyyidünâ Abdullah ibnü’l-Ced el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "186. Seyyidünâ Abdullah ibnü’l-Humeyyir el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "187. Seyyidünâ Abdullah ibnür-Rebî el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "188. Seyyidünâ Abdullah ibn-i Revâha el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "189. Seyyidünâ Abdullah ibn-i Zeyd el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "190. Seyyidünâ Abdullah ibn-i Sürâka el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "191. Seyyidünâ Abdullah ibn-i Seleme el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "192. Seyyidünâ Abdullah ibn-i Sehl el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "193. Seyyidünâ Abdullah ibn-i Süheyl el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "194. Seyyidünâ Abdullah ibn-i fierik el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "195. Seyyidünâ Abdullah ibn-i Târ›k el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "196. Seyyidünâ Abdullah ibn-i Âmir el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "197. Seyyidünâ Abdullah ibn-i Abd-i Menâf el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "198. Seyyidünâ Abdullah ibn-i Urfuta el-Hazercî (radıyallahu anh)\n" +
                "\n" +
                "199. Seyyidünâ Abdullah ibn-i Amr el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "200. Seyyidünâ Abdullah ibn-i Ümeyr el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "201. Seyyidünâ Abdullah ibn-i Kays bin Halid el Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "202. Seyyidünâ Abdullah ibn-i Kays bin Sayfî el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "203. Seyyidünâ Abdullah ibn-i Ka’b el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "204. Seyyidünâ Abdullah ibn-i Mahreme el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "205. Seyyidünâ Abdullah ibn-i Mes’ud el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "206. Seyyidünâ Abdullah ibn-i Maz’un el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "207. Seyyidünâ Abdullah ibn-i Numan el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "208. Seyyidünâ Abd-i Rabb ibn-i Hakk el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "209. Seyyidünâ Abdurrahman ibn-i Cebr el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "210. Seyyidünâ Abdet’el-Haflhâfl el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "211. Seyyidünâ Abd ibn-i Amir el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "212. Seyyidünâ Ubeyd ibn-i üt-Teyyihan el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "213. Seyyidünâ Ubeyd ibn-i Zeyd el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "214. Seyyidünâ Ubeyd ibn-i Ebî Ubeyd el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "215. Seyyidünâ Ubeyde bin Hâris el-Muhâcirî (radıyallahu anh) (Şehit)\n" +
                "\n" +
                "216. Seyyidünâ Utban ibn-i Mâlik el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "217. Seyyidünâ Utbe bin Rebîa el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "218. Seyyidünâ Utbe bin Abdullah el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "219. Seyyidünâ Utbe bin Gazvan el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "220. Seyyidünâ Osman ibn-i Maz’un el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "221. Seyyidünâ el-Aclân ibn’ün-Nu’mân el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "222. Seyyidünâ Adiy ibn-i Ebî Zağbâ el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "223. Seyyidünâ ‹smet’übn’ül-Husayn el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "224. Seyyidünâ Usaymet’ül-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "225. Seyyidünâ Atiyye bin Nüveyre el-Hazercî (radıyallahu anh)\n" +
                "\n" +
                "226. Seyyidünâ Ukbe bin Amir el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "227. Seyyidünâ Ukbe bin Osman el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "228. Seyyidünâ Ukbe bin Vehb el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "229. Seyyidünâ Ukbe bin Vehb el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "230. Seyyidünâ Ukkâfle bin M›hsan el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "231. Seyyidünâ Ammar ibn-i Yasir el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "232. Seyyidünâ Umâre bin Hazm el-Hazrevî (radıyallahu anh)\n" +
                "\n" +
                "233. Seyyidünâ Umâre bin Ziyad el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "234. Seyyidünâ Amr ibn-i ‹yas el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "235. Seyyidünâ Amr ibn-i Sa’lebe el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "236. Seyyidünâ Amr ibn’ül-Cemûh el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "237. Seyyidünâ Amr ibn’ül-Hâris el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "238. Seyyidünâ Amr ibn’ül-Hâris el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "239. Seyyidünâ Amr ibn-i Süraka el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "240. Seyyidünâ Amr ibn-i Ebî Serh el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "241. Seyyidünâ Amr ibn-i Talk el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "242. Seyyidünâ Amr ibn-i Kays el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "243. Seyyidünâ Amr ibn-i Muâz el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "244. Seyyidünâ Umeyr ibn-i Haram el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "245. Seyyidünâ Umeyr ibn’ül-Humam el-Hazrecî (radıyallahu anh) (Şehit)\n" +
                "\n" +
                "246. Seyyidünâ Umeyr ibn’ul-Âmir el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "247. Seyyidünâ Umeyr ibn-i Avf el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "248. Seyyidünâ Umeyr ibn-i Ma’bed el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "249. Seyyidünâ Umeyr ibn-i Ebî Vakkas el-Muhâcirî (radıyallahu anh) (Şehit)\n" +
                "\n" +
                "250. Seyyidünâ Avf ibn’ül-Hâris el-Hazrecî (radıyallahu anh) (Şehit)\n" +
                "\n" +
                "251. Seyyidünâ Uveym ibn-i Sâ›de el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "252. Seyyidünâ Iyâz ibn-i Züheyr el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "253. Seyyidünâ ⁄annâm ibn-i Evs el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "254. Seyyidünâ el-Fâkih ibn-i Biflr el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "255. Seyyidünâ Ferve bin Amr el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "256. Seyyidünâ Katâde bin Numan el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "257. Seyyidünâ Kudâme bin Maz’un el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "258. Seyyidünâ Kutbe bin Amir el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "259. Seyyidünâ Kays ibn-i Amr el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "260. Seyyidünâ Kays ibn-i M›hsan el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "261. Seyyidünâ Kays ibn-i Muhalled el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "262. Seyyidünâ Ka’b ibn-i Cemmez el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "263. Seyyidünâ Ka’b ibn-i Zeyd el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "264. Seyyidünâ Libde bin Kays el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "265. Seyyidünâ Mâlik ibn-i Ebî Havli el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "266. Seyyidünâ Mâlik ibn’ud-Duhflum el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "267. Seyyidünâ Mâlik ibn’ur-Rebîa el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "268. Seyyidünâ Mâlik ibn-i Rifâa el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "269. Seyyidünâ Mâlik ibn-i Amr el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "270. Seyyidünâ Mâlik ibn-i Kudâme el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "271. Seyyidünâ Mâlik ibn-i Mes’ûd el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "272. Seyyidünâ Mâlik ibn-i Nümeyle el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "273. Seyyidünâ Mâlik Mübeflflir bin Abd’il-Münzir el-Evsî (radıyallahu anh) (Şehit)\n" +
                "\n" +
                "274. Seyyidünâ Mücezzer ibn-i Ziyâd el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "275. Seyyidünâ Muhriz ibn-i Âmin el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "276. Seyyidünâ Muhriz ibn-i Nasle el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "277. Seyyidünâ Muhammed ibn-i Mesleme el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "278. Seyyidünâ Midlâc ibn-i Amr el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "279. Seyyidünâ Mersed ibn-i Mersed el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "280. Seyyidünâ Mistah ibn-i Üsâse el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "281. Seyyidünâ Mes’ûd ibn-i Evs el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "282. Seyyidünâ Mes’ûd ibn-i Halde el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "283. Seyyidünâ Mes’ûd ibn-i Rebîa el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "284. Seyyidünâ Mes’ûd ibn-i Zeyd el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "285. Seyyidünâ Mes’ûd ibn-i Sa’d el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "286. Seyyidünâ Mes’ûd ibn-i Sa’d el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "287. Seyyidünâ Mus’ab ibn-i Umeyr el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "28. Seyyidünâ Muâz ibn-i Cebel el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "28. Seyyidünâ Muâz ibn-i Haris el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "290. Seyyidünâ Muâz ibn’üs-S›mme el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "291. Seyyidünâ Muâz ibn-i Amr el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "292. Seyyidünâ Muâz ibn-i Ma›s el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "293. Seyyidünâ Ma’bed ibn-i Abbâd el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "294. Seyyidünâ Ma’bed ibn-i Kays el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "295. Seyyidünâ Muattib ibn-i Ubeyd el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "296. Seyyidünâ Muattib ibn-i Avf el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "297. Seyyidünâ Muattib ibn-i Kufleyr el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "298. Seyyidünâ Ma’k›l ibn-i Münzir el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "299. Seyyidünâ Ma’mer ibn-i Hâris el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "300. Seyyidünâ Ma’n ibn-i Adiy el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "301. Seyyidünâ Ma’n ibn-i Yezîd el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "302. Seyyidünâ Muavviz ibn-i Hâris el-Hazrecî (radıyallahu anh) (Şehit)\n" +
                "\n" +
                "303. Seyyidünâ Muavviz ibn-i Amr el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "304. Seyyidünâ Mikdad ibn’ül-Esved el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "305. Seyyidünâ Müleyl ibn-i Vebre el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "306. Seyyidünâ Münzir ibn-i Amr el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "307. Seyyidünâ Münzir ibn-i Kudâme el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "308. Seyyidünâ Münzir ibn-i Muhammed el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "309. Seyyidünâ Mihca’ ibn’üs-Sâlih Mevlâ Ömer’-İbn’il- Hattab el-Muhâcirî (radıyallahu anh) (Şehit)\n" +
                "\n" +
                "310. Seyyidünâ Nadr ibn-i Hâris el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "311. Seyyidünâ Nu’man ibn-i el-A’rac el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "312. Seyyidünâ Nu’man ibn-i Ebî Hazme el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "313. Seyyidünâ Nu’man ibn-i Sinan el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "314. Seyyidünâ Nu’man ibn-i Abd-i Amr el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "315. Seyyidünâ Nu’man ibn-i Amr el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "316. Seyyidünâ Nu’man ibn-i Amr el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "317. Seyyidünâ Nu’man ibn-i Mâlik el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "318. Seyyidünâ Nu’man ibn-i Amr el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "319. Seyyidünâ Nevfel ibn-i Abdullah el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "320. Seyyidünâ Vâk›d ibn-i Abdullah el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "321. Seyyidünâ Varaka bin ‹yas el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "322. Seyyidünâ Vedia bin Amr el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "323. Seyyidünâ Vehb ibn-i Ebî fierh el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "324. Seyyidünâ Vehb ibn-i Sa’d el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "325. Seyyidünâ Hânî bin Niyar el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "326. Seyyidünâ Hübeyl ibn-i Vebre el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "327. Seyyidünâ Hilâl ibn-i Muallâ el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "328. Seyyidünâ Yezîd ibn-i el-Ahnes el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "329. Seyyidünâ Yezîd ibn-i Rukayfl el-Muhâcirî (radıyallahu anh)\n" +
                "\n" +
                "330. Seyyidünâ Yezîd ibn-i Haram el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "331. Seyyidünâ Yezid ibn’ül-Hâris el-Hazrecî (radıyallahu anh) (Şehit)\n" +
                "\n" +
                "332. Seyyidünâ Yezîd ibn’üs-Seken el-Evsî (radıyallahu anh)\n" +
                "\n" +
                "333. Seyyidünâ Yezîd ibn’ül-Münzir el-Hazrecî (radıyallahu anh)\n" +
                "\n" +
                "\n\nBEDİR ŞEHİTLERİ\n\n" +
                "\n" +
                "1. Mihca’ bin Salih el-Muhâcirî, Ömer (radıyallahu teâlâ anh)’in azadlısı, ok ile ilk şehit olan sahabi.\n" +
                "\n" +
                "2. Hârise bin Hâris el-Muhâcirî (radıyallahu Teâlâ anh)\n" +
                "\n" +
                "3. Hârise bin Sürâka el-Hazrecî (radıyallahu Teâlâ anh)\n" +
                "\n" +
                "4. Umeyr ibn-i Humâm el-Hazrecî (radıyallahu Teâlâ anh) (kılıç ile ilk şehit olan sahabi)\n" +
                "\n" +
                "5. Avf ibnü’l-Hâris el-Hazrecî (radıyallahu teâlâ anh) Afra Hâtun’un oğlu.\n" +
                "\n" +
                "6. Muavviz ibn-ül-Hâris el-Hazrecî (radıyallahu Teâlâ anh) Afra Hâtun’un oğlu\n" +
                "\n" +
                "7. Râfi’ bin Muallâ el-Hazrecî (radıyallahu Teâlâ anh)\n" +
                "\n" +
                "8. Zi’ş-fiimâleyn ibn-i Abd-i Amr el-Muhâcirî (radıyallahu teâlâ anh)\n" +
                "\n" +
                "9. Sa’d ibn-i Huneyme el-Evsî (radıyallahu Teâlâ anh)\n" +
                "\n" +
                "10. Safvan ibn-i Vehb el-Muhâcirî (radıyallahu Teâlâ anh)\n" +
                "\n" +
                "11. Ak›l ibn-i Bükeyr el-Muhâcirî (radıyallahu Teâlâ anh)\n" +
                "\n" +
                "12. Umeyr ibn-i Ebî Vakkas el-Muhâcirî (radıyallahu teâlâ anh)\n" +
                "\n" +
                "13. Mâlik ibn-i Mübeflflir bin Abdü’l-Münzir el Evsî (radıyallahu teâlâ anh)\n" +
                "\n" +
                "14. Yezîd ibn-i Hâris el-Hazrecî (radıyallahu Teâlâ anh)\n");
        duaOkunus.add("1. Seyyid’ül Şüheda Seyyidüna Hz. Hamza ibni Abdülmuttalib el-Muhacirî (ra)\n\n" +
                "2. Seyyidüna Ebî Eymen Mevlâ Amr el-Ensarî (ra)\n\n" +
                "3. Seyyidüna Ebî Hanne el-Ensarî (ra)\n\n" +
                "4. Seyyidüna Ebî Suryan İbni el-Haria el-Ensarî (ra)\n\n" +
                "5. Seyyidüna Ebî Hubeyre ibn-i el-Hâris el-Ensarî (ra)\n\n" +
                "6. Seyyidüna Enes ibn-i Nadr el-Ensarî (ra)\n\n" +
                "7. Seyyidüna Uyens ibn-i Katade el-Ensarî (ra)\n\n" +
                "8. Seyyidüna Evs ibn-i el-Erkam el-Ensarî (ra)\n\n" +
                "9. Seyyidüna Evs ibn-i Sabit el-Ensarî (ra)\n\n" +
                "10. Seyyidüna İyas ibn-i Evs el-Ensarî (ra)\n\n" +
                "11. Seyyidüna İyas ibn-i Adiyy el-Ensarî (ra)\n\n" +
                "12. Seyyidüna Sabit ibn-i Amr el-Ensarî (ra)\n\n" +
                "13. Seyyidüna Sabit ibn-i Vakş el-Ensarî (ra)\n\n" +
                "14. Seyyidüna Sa’lebe ibn-i Sa’d el-Ensarî (ra)\n\n" +
                "15. Seyyidüna Sakf ibn-i Ferve el-Ensarî (ra)\n\n" +
                "16. Seyyidüna El-Hâris ibn-i Encs el-Ensarî (ra)\n\n" +
                "17. Seyyidüna El-Hâris ibn-i Evs el-Ensarî (ra)\n\n" +
                "18. Seyyidüna El-Hâris ibn-i Adiyy el-Ensarî (ra)\n\n" +
                "19. Seyyidüna Hubab ibn-i Kayzıyy el-Ensarî (ra)\n\n" +
                "20. Seyyidüna Hubeyb ibn-i Yezîd el-Ensarî (ra)\n\n" +
                "21. Seyyidüna Huseyl ibn-i Cabir el-Ensarî (ra)\n\n" +
                "22. Seyyidüna Hanzala ibn-i Amr el-Ensarî (ra)\n\n" +
                "23. Seyyidüna Harice ibn-i Zeyd el-Ensarî (ra)\n\n" +
                "24. Seyyidüna Hallâd ibn-i Amrel-Cumuh el-Ensarî (ra)\n\n" +
                "25. Seyyidüna Hayşemle ibn-i Abi Sa’d el-Ensarî (ra)\n\n" +
                "26. Seyyidüna Zekvan ibn-i abdi Gayş el-Ensarî (ra)\n\n" +
                "27. Seyyidüna Rifâa ibn-i Amr el-Ensarî (ra)\n\n" +
                "28. Seyyidüna Rifâa ibn-i Vakş el-Ensarî (ra)\n\n" +
                "29. Seyyidüna Subey’ ibn-i Hâtıb el-Ensarî (ra)\n\n" +
                "30. Seyyidüna Sa’d ibn-i er-Rabi’ el-Ensarî (ra)\n\n" +
                "31. Seyyidüna Said ibni Süveyd el-Ensarî (ra)\n\n" +
                "32. Seyyidüna Seleme ibn-i Sabit el-Ensarî (ra)\n\n" +
                "33. Seyyidüna Sehl ibn-i Kaya el-Ensarî (ra)\n\n" +
                "34. Seyyidüna Süleym ibn-i el-Hâris el-Ensarî (ra)\n\n" +
                "35. Seyyidüna Süleym ibn-i Amr el-Ensarî (ra)\n\n" +
                "36. Seyyidüna Şemmas ibn-i Osman el-Ensarî (ra)\n\n" +
                "37. Seyyidüna Safiyy ibn-i Kayzıyy el-Ensarî (ra)\n\n" +
                "38. Seyyidüna Damra el-Cüheyniyy el-Ensarî (ra)\n\n" +
                "39. Seyyidüna Amr ibn-i Mahlid el-Ensarî (ra)\n\n" +
                "40. Seyyidüna Ubâde ibn-i el-Hashas el-Ensarî (ra)\n\n" +
                "41. Seyyidüna Abbâd ibn-i Ubâde el-Ensarî (ra)\n\n" +
                "42. Seyyidüna Abbas ibn-i Ubâde el-Ensarî (ra)\n\n" +
                "43. Seyyidüna Abdullah ibn-i Cübeyr el-Ensarî (ra)\n\n" +
                "44 Seyyidüna Abdullah İbn-i Cahş el-Ensarî (ra)\n\n" +
                "45. Seyyidüna Abdullah ibn-i Selem el-Ensarî (ra)\n\n" +
                "46. Seyyidüna Abdullah ibn-i Amr Haram el-Ensarî (ra)\n\n" +
                "47. Seyyidüna Abdullah ibn-i Amr ibn-i Vehb el-Ensarî (ra)\n\n" +
                "48. Seyyidüna Ubeyd ibn-i et-Teyyihân el-Ensarî (ra)\n\n" +
                "49. Seyyidüna Ubeyd ibn-i el-Muallâ el-Ensarî (ra)\n\n" +
                "50. Seyyidüna Utbe ibn-i Rebî el-Ensarî (ra)\n\n" +
                "51. Seyyidüna Umâre ibn-i Ziyad el-Ensarî (ra)\n\n" +
                "52. Seyyidüna Amr ibn-i Iyas el-Ensarî (ra)\n\n" +
                "53. Seyyidüna Amr ibn Sabit el-Ensarî (ra)\n\n" +
                "54. Seyyidüna Amr ibn-i el Cemuh el-Ensarî (ra)\n\n" +
                "55. Seyyidüna Amr ibn-i Kays el-Ensarî (ra)\n\n" +
                "56. Seyyidüna Amr ibn-i Mutarrif el-Ensarî (ra)\n\n" +
                "57. Seyyidüna Amr ibn-i Muâz el-Ensarî (ra)\n\n" +
                "58. Seyyidüna Antere Mevlâ Süleym el-Ensarî (ra)\n\n" +
                "59. Seyyidüna Kaya ibn-i Amr el-Ensarî (ra)\n\n" +
                "60. Seyyidüna Kays ibn-i Muhallid el-Ensarî (ra)\n\n" +
                "61. Seyyidüna Keyman ibn-i Elmaziniyyin el-Ensarî (ra)\n\n" +
                "62. Seyyidüna Mâlik ibn-i İyas el-Ensarî (ra)\n\n" +
                "63. Seyyidüna Mâlik ibn-i Sinan el-Ensarî (ra)\n\n" +
                "64. Seyyidüna Mâlik ibn-i Nümeyle el-Ensarî (ra)\n\n" +
                "65. Seyyidüna Mücezzin ibn-i Ziyad el-Ensarî (ra)\n\n" +
                "66 Seyyidüna Mus’ab ibn-i Umeyr el-Ensarî (ra)\n\n" +
                "67. Seyyidüna Nu’man ibn-i Mâlik el-Ensarî (ra)\n\n" +
                "68. Seyyidüna Nu’man ibn-i Abdillah el-Ensarî (ra)\n\n" +
                "69. Seyyidüna Nevfel ibn-i Abdillah el-Ensarî (ra)\n\n" +
                "70. Seyyidüna Yezîd ibn-i Hâtib el-Ensarî (ra)\n\n");

        final ArrayList<String> dualarArab = new ArrayList<>();

        dualarArab.add("\n" +
                "سُبْحَانَكَ اللَّهُمَّ وَبِحَمْدِكَ ﴿﴾\n" +
                " وَتَبَارَكَ اسْمُكَ ﴿﴾\n" +
                " وَتَعَالَى جَدُّكَ ﴿﴾\n" +
                " وَلاَ إِلَهَ غَيْرُكَ ﴿﴾\n");
        dualarArab.add("التَّحِيَّاتُ لِلَّهِ وَالصَّلَوَاتُ وَالطَّيِّبَاتُ ﴿﴾\n" +
                "السَّلامُ عَلَيْكَ أَيُّهَا النَّبِيُّ وَرَحْمَةُ اللَّهِ وَبَرَكَاتُهُ ﴿﴾\n" +
                " السَّلامُ عَلَيْنَا وَعَلَى عِبَادِ اللَّهِ الصَّالِحِينَ ﴿﴾\n" +
                " أَشْهَدُ أَنْ لا إِلَهَ إِلا اللَّهُ ﴿﴾\n" +
                " وَأَشْهَدُ أَنَّ مُحَمَّدًا عَبْدُهُ وَرَسُولُهُ ﴿﴾\n");
        dualarArab.add("اللَّهُمَّ صَلِّ عَلَى مُحَمَّدٍ وَعَلَى آلِ مُحَمَّدٍ ﴿﴾\n" +
                " كَمَا صَلَّيْتَ عَلَى إِبْرَاهِيمَ وَعَلَى آلِ إِبْرَاهِيم ﴿﴾\n" +
                " إِنَّكَ حَمِيدٌ مَجِيدٌ ﴿﴾\n");
        dualarArab.add("اللَّهُمَّ بَارِكَ عَلَى مُحَمَّدٍ وَعَلَى آلِ مُحَمَّدٍ ﴿﴾\n" +
                " كَمَا بَارَكْتَ عَلَى إِبْرَاهِيمَ وَعَلَى آلِ إِبْرَاهِيم ﴿﴾\n" +
                " إِنَّكَ حَمِيدٌ مَجِيدٌ ﴿﴾\n");
        dualarArab.add("رَبَّنَا آتِنَا فِي الدُّنْيَا حَسَنَةً\n\n" +
                " وَفِي الآخِرَةِ حَسَنَةً وَقِنَا عَذَابَ النَّارِ\n");
        dualarArab.add("َبَّنَا اغْفِرْ لِي وَلِوَالِدَيَّ وَلِلْمُؤْمِنِينَ\n" +
                " يَوْمَ يَقُومُ الْحِسَابُ\n");
        dualarArab.add("اَللَّهُمَّ إِنَّا نَسْتَعِينُكَ وَ نَسْتَغْفِرُكَ وَ نَسْتَهْدِيكَ ﴿﴾\n" +
                " وَ نُؤْمِنُ بِكَ وَ نَتُوبُ اِلَيْكَ ﴿﴾\n" +
                " وَ نَتَوَكَّلُ عَلَيْكَ وَنُثْنِى عَلَيْك اْلخَيْرَ كُلَّهُ نَشْكُرُكَ وَ لاَ نَكْفُرُكَ ﴿﴾ \n" +
                "وَ نَخْلَعُ وَ نَتْرُكُ مَنْ يَفْجُرُكَ ﴿﴾\n");
        dualarArab.add("\n" +
                "اَللَّهُمَّ اِيَّاكَ نَعْبُدُ وَ لَكَ نُصَلِّى وَ نَسْجُدُ ﴿﴾\n" +
                " وَ اِلَيْكَ نَسعْىَ وَ نَحْفِدُ ﴿﴾\n" +
                " نَرْجُو رَحْمَتَكَ وَ نَخْشَى عَذَابَك ﴿﴾\n" +
                " اِنَّ عَذَابَكَ بِاْلكُفَّارِ مُلْحِقٌ ﴿﴾\n");
        dualarArab.add("");
        dualarArab.add("اللَّهُمَّ رَبَّ هَذِهِ الدَّعْوَةِ التَّامَّةِ وَالصَّلَاةِ الْقَائِمَةِ آتِ مُحَمَّداً الْوَسِيلَةَ وَالْفَضِيلَةَ وَالدَّرَجَةَ الرَّافِعَةَ وَابْعَثْهُ مَقَاماً مَحْمُوداً الَّذِي وَعَدْتَهُ إَنَّكَ لَا تُخْلِفُ الْمِيعَادَ\n");
        dualarArab.add("");
        dualarArab.add("اَللَّهُمَّ صَلِّ صَلاَةً كَامِلَةً وَسَلِّمْ سَلاَمًا تَامًّا عَلَى سَيِّدِنَا مُحَمَّدٍ الَّذِي تَنْحَلُّ بِهِ الْعُقَدُ وَتَنْفَرِجُ بِهِ الْكُرَبُ وَتُقْضَى بِهِ الْحَوَائِجُ وَتُنَالُ بِهِ الرَّغَائِبُ وَحُسْنُ الْخَوَاتِمِ وَيُسْتَسْقَى الْغَمَامُ بِوَجْهِهِ الْكَرِيمِ وَعَلَى آلِهِ وَصَحْبِهِ فِي كُلِّ لَمْحَةٍ وَنَفَسٍ بِعَدَدِ كُلِّ مَعْلُومٍ لَكَ.\n");
        dualarArab.add("لَا إِلَهَ إِلَّا اللَّهُ الْحَلِيمُ الْكَرِيمُ سُبْحَانَ اللَّهِ رَبِّ الْعَرْشِ الْعَظِيمِ اَلْحَمْدُ لِلَّهِ رَبِّ الْعَالَمِينَ أَسْأَلُكَ مُوجِبَاتِ رَحْمَتِكَ وَعَزَائِمَ مَغْفِرَتِكَ وَالْعِصْمَةَ مِنْ كُلِّ ذَنْبٍ وَالْغَنِيمَةَ مِنْ كُلِّ بِرٍّ وَالسَّلَامَةَ مِنْ كُلِّ إِثْمٍ لَا تَدَعْ لِي ذَنْبًا إِلَّا غَفَرْتَهُ وَلَا هَمًّا إِلَّا فَرَّجْتَهُ وَلَا حَاجَةً هِيَ لَكَ رِضًا إِلَّا قَضَيْتَهَا يَا أَرْحَمَ الرَّاحِمِينَ.\n" +
                "اَللّهُمَّ أَنْتَ تَحْكُمُ بَيْنَ عِبَادِكَ فِيمَا كَانُوا فِيهِ يَخْتَلِفُونَ لاَ إِلهَ إِلاَّ اللَّهُ الْعَلِيُّ الْعَظِيمُ لاَ إِلهَ إِلاَّ اللَّهُ الْحَلِيمُ الْكَرِيمُ سـُبْحَانَ رَبِّ السَّـموَاتِ السَّـبْعِ وَرَبِّ الْعَـرْشِ الْعَظِيمِ اَلْحَمْدُ لِلَّهِ رَبِّ الْعَالَمِينَ. \n" +
                "اَللّهُمَّ كَاشِـفَ الْغَمِّ مُفَرِّجَ الْهَمِّ مُجِيبَ دَعْوَةِ الْمُضْطَرِّينَ إِذَا دَعَوْكَ رَحْمانَ الدُّنْيَا وَاْلاخِرَةِ وَرَحِيمَهُمَا فَارْحَمْنِي فِي حَاجَتِي هذِهِ بِقَضَائِهَا وَنَجَاحِهَا رَحْمَةً تُغْنِينِي بِهَا عَنْ رَحْمَةِ مَنْ سِوَاكَ.\n" +
                "اَللّهُمَّ إِنِّي أَسْأَلُكَ وَأَتَوَجَّهُ إِلَيْكَ بِنَبِيّـِكَ مُحَمَّدٍ نَبِيِّ الرَّحْمَةِ، يَا مُحَمَّدُ إِنِّي أَتَوَجَّهُ بِكَ إِلَى رَبِّي فِي حَاجَتِي هَذِهِ لِتُقْضَى لِي، اَللّهُمَّ فَشَفّـِعْهُ فِيَّ.\n");
        dualarArab.add("أَلْحَمْدُ لِلَّٰهِ رَبِّ الْعَالَم۪ينَ ﴿﴾ وَالْعَاقِـبَـةُ لِلْمُـتَّـق۪ينَ ﴿﴾ وَلَا عُدْوَانَ إِلَّا عَلَي الظَّالِم۪ينَ ﴿﴾ وَالصَّلٰاةُ وَالسَّلٰامُ عَلٰى رَسُولِـنَا مُحَمَّدٍ وَأٰلِه۪ وَصَحْبِه۪ٓ أَجْمَع۪ينَ ﴿﴾ أَللَّٰـهُمَّ رَبَّـنَا يَا رَبَّـنَا تَـقَـبَّـلْ مِنَّا إِنَّكَ أَنْتَ السَّم۪يعُ الْعَل۪يمُ ﴿﴾ وَتُبْ عَلَيْنَا يَا مَوْلٰــنَآ إِنَّكَ أَنْتَ التَّــوَّابُ الرَّح۪يمُ ﴿﴾ وَاهْدِنَا وَوَفِّقْـنَآ إِلَى الْحَقِّ وَإِلٰى طَر۪يقٍ مُسْتَـق۪يمٍ ﴿﴾ بِـبَـرَكَـةِ الْقُرْأٰنِ الْعَظ۪يمِ ﴿﴾ وَبِحُرْمَـةِ مَنْ أَرْسَلْـتَـهُ رَحْمَةً لِلْعَالَم۪ينَ ﴿﴾ وَاعْفُ عَـنَّا يَا كَر۪يمُ ﴿﴾ وَاعْفُ عَـنَّا يَا رَح۪يمُ ﴿﴾ وَاغْفِرْ لَـنَا ذُنُـوبَـنَا بِفَضْلِكَ وَجُودِكَ وَكَرَمِكَ يَآأَكْرَمَ الْاَكْرَم۪ينَ ﴿﴾ أَللَّٰـهُمَّ زَيِّـنَّا بِز۪يـنَـةِ الْقُرْأٰنِ ﴿﴾ وَأَكْرِمْنَا بِكَرَامَةِ الْقُرْأٰنِ ﴿﴾ وَشَرِّفْـنَا بِشَرَافَةِ الْقُرْأٰنِ ﴿﴾ وَأَلْبِسْنَا بِـخِلْعَةِ الْقُرْأٰنِ ﴿﴾ وَأَدْخِـلْـنَا الْجَـنَّـةَ بِشَفَاعَةِ الْقُرْأٰنِ ﴿﴾ وَعَافِـنَا مِنْ كُلِّ بَلٰٓاءِ الدُّنْـيَا وَعَذَابِ الْاٰخِرَةِ بِحُرْمَةِ الْقُرْأٰنِ ﴿﴾ وَارْحَمْ جَم۪يعَ أُمَّـةِ مُحَمَّدٍ يَا رَح۪يمُ يَا رَحْمٰنُ ﴿﴾ أَللَّٰـهُمَّ اجْعَلِ الْقُرْأٰنَ لَـنَا فِي الدُّنْـيَا قَر۪ينًا ﴿﴾ وَفِي الْقَـبْـرِ مُونِسًا ﴿﴾ وَفِي الْقِيَامَـةِ شَف۪يعًا ﴿﴾ وَعَلَى الصِّرَاطِ نُـورًا ﴿﴾ وَفِي الْجَـنَّـةِ رَف۪يقًا ﴿﴾ وَمِنَ النَّارِ سِتْـرًا وَحِجَابًا ﴿﴾ وَإِلىَ الْخَـيْـرَاتِ كُـلِّـهَا دَل۪يلًا وَإِمَامًا ﴿﴾ بِفَضْلِكَ وَجُودِكَ وَكَرَمِكَ يَآ أَكْرَمَ الْاَكْرَم۪ينَ وَيَآ أَرْحَمَ الرَّاحِم۪ينَ. أَللَّٰـهُمَّ اهْدِنَا بِـهِدَايَـةِ الْقُرْأٰنِ ﴿﴾ وَنَـجِّـنَا مِنَ النّ۪ـيرَانِ بِكَرَامَةِ الْقُرْأٰنِ ﴿﴾ وَارْفَعْ دَرَجَاتِـنَا بِفَض۪يلَـةِ الْقُرْأٰنِ ﴿﴾ وَكَفِّرْ عَـنَّا سَيِّأٰتِـنَا بِـتِـلٰاوَةِ الْقُرْأٰنِ ﴿﴾ يَا ذَا الْفَضْلِ وَالْاِحْسَانِ ﴿﴾ أَللَّٰـهُمَّ طَهِّرْ قُـلوُبَـنَا ﴿﴾ وَاسْتُرْ عُيوُبَـنَا ﴿﴾ وَاشْفِ مَرْضَانَا ﴿﴾ وَاقْضِ دُيُـونَـنَا ﴿﴾ وَارْفَعْ دَرَجَاتِـنَا ﴿﴾ وَارْحَمْ أٰبَآءَنَا ﴿﴾ وَاغْفِرْ أُمَّـهَاتِـنَا ﴿﴾ وَأَصْلِحْ د۪يـنَـنَا وَدُنْـيَانَا ﴿﴾ وَشَتِّتْ شَمْلَ أَعْدَآئِـنَا ﴿﴾ وَاحْفَظْ أَهْلَـنَا وَأَمْوَالَـنَا وَبِلَادَنَا مِنْ جِم۪يعِ الْاٰفَاتِ وَالْاَمْرَاضِ وَالْـبَـلٰايَا ﴿﴾ وَثَـبِّتْ أَقْدَامَنَا وَانْصُرْنَا عَلَى الْقَوْمِ الْكَافِر۪ينَ ﴿﴾ بِحُرْمَةِ الْقُرْأٰنِ الْعَظ۪يمِ ﴿﴾\n" +
                "\n" +
                "أَللَّٰـهُمَّ بَـلِّـغْ ثَــوَابَ مَا قَرَأْنَاهُ ، وَنُـورَ مَا تَـلَوْنَاهُ ، إِلٰى رُوحِ سَيِّـدِنَا وَنَـبِـيِّـنَا مُحَمَّدٍ صَلَّى اللّٰهُ تَـعَالٰى عَلَـيْـهِ وَسَلَّمَ ﴿﴾ وَإِلٰٓى أَرْوَاحِ جَم۪يعِ الْاَنْبِـيَـآءِ وَالْمُرْسَل۪ينَ ، صَلَوَاتُ اللّٰهِ وَسَلٰامُهُ عَلَـيْهِمْ أَجْمَع۪ينَ ﴿﴾وَإِلٰٓى أَرْوَاحِ أٰلِه۪، وَأَوْلٰادِه۪ ، وَأَزْوَاجِه۪، وَأَصْحَابِـه۪، أَتْـبَاعِه۪، وَجَم۪يعِ ذُرِّيَّاتِـه۪ رِضْوَانُ اللّٰهِ تَعَالٰى عَلَـيْـهِمْ أَجْمَع۪ينَ ﴿﴾ وَإِلٰٓى أَرْوَاحِ أٰ بَآئِـنَا، وَأُمَّـهَاتِـنَا، وَإِخْوَانِـنَا وَأَخَوَاتِـنَا، وَأَوْلَادِنَا، وَأَقْرِبَآئِـنَا، وَأَحِبَّآئِـنَا، وَأَصْدِقَآئِـنَا، وَأَسَات۪يذِنَا، وَمَشَايِـخِـنَا، وَلِمَنْ كَانَ لَهُ حَقٌّ عَلَـيْـنَا ﴿﴾ وَإِلٰي أَرْوَاحِ جَم۪يعِ الْمُؤْمِن۪ينَ وَالْمُؤْمِنَاتِ، وَالْمُسْلِم۪ينَ وَالْمُسْلِمَاتِ، أَلْاَحْـيَآءِ مِـنْـهُمْ وَالْاَمْوَاتِ ﴿﴾ يَا قَاضِيَ الْحَاجَاتِ وَيَا مُج۪يبَ الدَّعَـوَاتِ ﴿﴾ رَبَّـنَآ أٰتِـنَا فِي الدُّنْـيَا حَسَنَةً وَفِي الْاٰخِرَةِ حَسَنَةً وَقِنَا عَذَابَ النَّارِ ﴿﴾ أَللَّٰـهُمَّ رَبَّـنَا اغْفِرْ ل۪ي وَلِـوَالِدَيَّ وَلِلْمُؤْمِن۪ينَ يَوْمَ يَقُومُ الْحِسَابُ\n");
        dualarArab.add("");
        dualarArab.add("");
        dualarArab.add("");
        dualarArab.add("");
        dualarArab.add("");
        dualarArab.add("");

        ArrayAdapter arrayAdapter = new ArrayAdapter(Dualar.this,R.layout.surelayout,dualar);
        listViewDua.setAdapter(arrayAdapter);

        listViewDua.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getApplicationContext(),DuaOkunus.class);
                intent.putExtra("name",duaOkunus.get(position));
//                intent.putExtra("arabic",dualarArab.get(position));
                intent.putExtra("title",dualar.get(position));
                selectedDua = duaImages.get(position);
                startActivity(intent);
            }
        });
    }
}