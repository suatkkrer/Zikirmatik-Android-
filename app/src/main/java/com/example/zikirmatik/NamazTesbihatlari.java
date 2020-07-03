package com.example.zikirmatik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class NamazTesbihatlari extends AppCompatActivity {

    ListView listViewTesbihat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namaz_tesbihatlari);

        listViewTesbihat = findViewById(R.id.listViewTesbihat);

        this.setTitle("Namaz Tesbihatları");

        final ArrayList<String> tesbihatlar = new ArrayList<>();

        tesbihatlar.add("Sabah Namazi Tesbihati");
        tesbihatlar.add("Ögle Namazi Tesbihati");
        tesbihatlar.add("Ikindi Namazi Tesbihati");
        tesbihatlar.add("Aksam Namazi Tesbihati");
        tesbihatlar.add("Yatsi Namazi Tesbihati");

        final ArrayList<String> tesbh = new ArrayList<>();
        tesbh.add("SABAH NAMAZI\n" +
                " \n" +
                "\n" +
                "   Sabahın farzı kılınıp selâm verildikten sonra,\n" +
                "\n" +
                "\n" +
                "    5 defa Esteğfirullah denir. Sonrasında\n" +
                "    “Allahumme entesselâmu ve minkesselâm, tebârekte yâ zelcelâli velikram”  denir ve şu duâ okunur:\n" +
                "\n" +
                " \n" +
                "\n" +
                "   SALÂTEN TÜNCÎNÂ DUÂSI\n" +
                "\n" +
                "    “Allahumme salli alâ Seyyidinâ Muhammedin ve alâ âli seyyidinâ Muhammed. Salâten tuncina biha min cemîil ahvâli vel âfât, ve takdilena biha cemîel hâcat, ve   tutahhirunâ biha min cemîis seyyiât, ve terfeuna biha indeke âledderecât, ve tubelliğuna biha aksel ğâyat, min cemiil hayrat fil hayati ve bâdel memat, birahmetika yâ erhamerrahimin, bi hurmeti Habibike yâ erhamerrahimin, bi hurmeti cemiil enbiya-i vel evliya-i  pîri pîran, pîri âzam ya Erhamerrahimin âmin, ve selâmun âlel murselin velhamdulillahi rabbil âlemin …” denilir, eller yüze sürülüp indirilir.     \n" +
                "\n" +
                "   Tesbihâta devam edilir:  1 Defa\n" +
                "\n" +
                "    “Allahumme innâ nukaddimu ileyke beyne yedey kulli nefesin ve lemhetin ve lehzetin ve tarfetin yetrifu bihâ ehlu’s-semâvâti ve ehlu’l-aradî-ne şehâdeten: Eşhedu enlâilahe illellah, ve eşhedu enne muhammeden abduhu ve resuluhu.”\n" +
                "\n\n" +
                "   Cümle-i Tevhid söylenir:  10 defa\n" +
                "\n" +
                "    “Lâ ilâhe illallahu vahdehû lâ şerike leh. Lehul mulku ve lehul hamdu yuhyî ve yumît. Vehuve hayyullezî lâyemut, biyedihil hayr ve huve alâ kulli şey’in kadîr.  (9 defa okunup, onuncuda) ve ileyhi’l-mesîr” ilâve edilir.\n" +
                "\n" +
                "\n" +
                "     İstiâze duâları okunur (Eller avuç içi yere bakar şekilde kaldırılır.)\n" +
                "\n" +
                "\n" +
                "    Allahumme ecirnâ mine’n-nâr. (Bu satır 3, 5 veya 7 defa,  diğerleri birer defa)\n" +
                "\n" +
                "    Allahumme ecirnâ min kulli nâr.\n" +
                "\n" +
                "    Allahumme ecirnâ min fitneti’d-dînîyyeti ve’d-dünyeviye.\n" +
                "\n" +
                "    Allahumme ecirnâ min fitneti âhiri’z-zaman.\n" +
                "\n" +
                "    Allahumme ecirnâ min fitneti’l-Mesîhi’d-Deccâli ve’s-Sufyan.\n" +
                "\n" +
                "    Allahumme ecirnâ mine’d-dalâlâti ve’l-bidiyyâti ve’l-beliyyât.\n" +
                "\n" +
                "    Allahumme ecirnâ min şerri’n-nefsi’l-emmâreh.\n" +
                "\n" +
                "    Allahumme ecirnâ min şurûri’n-nufûsi’l-emmârâti’l-firavniyyeh.\n" +
                "\n" +
                "    Allahumme ecirnâ min şerri’n-nisâ.\n" +
                "\n" +
                "    Allahumme ecirnâ min belâi’n-nisâ.\n" +
                "\n" +
                "    Allahumme ecirnâ min fitneti’n-nisâ.\n" +
                "\n" +
                "    Allahumme ecirnâ min azâbi’l-kabr.\n" +
                "\n" +
                "    Allahumme ecirnâ min azâbi yevmi’l-kıyâmeh.\n" +
                "\n" +
                "    Allahumme ecirnâ min azâbi Cehennem.\n" +
                "\n" +
                "    Allahumme ecirnâ min azâbi kahrik.\n" +
                "\n" +
                "    Allahumme ecirnâ min nâri kahrik.\n" +
                "\n" +
                "    Allahumme ecirnâ min azâbi’l-kabri ve’n-nîrân.\n" +
                "\n" +
                "    Allahumme ecirnâ mine’r-riyâi ve’s-sum’ati ve’l-ucubi ve’l-fahr.\n" +
                "\n" +
                "    Allahumme ecirnâ min tecâvuzi’l-mulhidîn.\n" +
                "\n" +
                "    Allahumme ecirnâ min şerri’l-munâfıkîn.\n" +
                "\n" +
                "    Allahumme ecirnâ min fitneti’l-fâsıkîn.    \n" +
                "\n" +
                "    Allahumme ecirnâ ve ecir vâlideynâ ve talebete Resâili’n-Nûri’s-sâdıkîne fi hidmeti’l-Kur’âni ve’l-îmân. Ve ahbâbene’l-mu'minîne’l-muhlisîne ve akribâenâ ve ecdâdenâ mine’n-nâr.\n" +
                "\n" +
                "\n" +
                "    (Avuç içi yukarı çevrilerek devam edilir.)\n" +
                "\n\n" +
                "    Biafvike yâ Mucîr, bifadlike yâ Ğaffâr. Bi rahmetike yâ erhemerrahimin.\n" +
                "\n" +
                "    Allahumme edhilne’l-Cennete meâl ebrâr.\n" +
                "\n" +
                "    Allahumme’d-hilne’l-Cennete meâl ebrâr.\n" +
                "\n" +
                "    Allahumme edhilnâ ve edhil üstâzenâ ve meşâyîhine (radıyallâhu anhüm) ve vâlideynâ ve talebete Resâili’n-Nûri’s-sadıkîne ve ihvânena ve ehavâtenâ ve akribâenâ ve ecdâdenâ ve ahbâbene’l-mu'minîne’l-muhlisîne fî hidmeti’l-îmâni ve’l-Kur’ân. El-Cennete meal ebrâr, bişefâat-i Nebiyyi-ke’l-Muhtâr ve âlihi’l-ethâr ve eshâbihi’l-ehyâr ve sellim mâdâme’l-leylu ve’n-nehâr. Âmin, ve selamun alel murselin velhamdu lillâhi Rabbi’l-Âlemîn. (Eller yüze sürülür.)\n" +
                "\n" +
                " \n" +
                "\n" +
                "    (Tesbihata devam edilir)\n" +
                "\n" +
                "   “Subhânallahi velhamdulillâhi ve lâilâhe illallahu vallahu ekber, ve lâhavle ve lâkuvvete illâ billâhil aliyyil azîm”\n" +
                "\n" +
                "   denilir ve ÂYETÜ’L-KÜRSÎ okunur:\n" +
                "\n" +
                "   Bismillâhirrahmânirrahîm,\n" +
                "\n" +
                "    “Allahu lâ ilâhe illâ huve’l-hayyul kayyûm. Lâ te’huzuhû sinetun velâ nevm. Lehu mâ fissemâvâti vemâ fi’l-ard. Menzellezî yeşfeu indehû illâ biiznih. Ya’lemu mâ beyne eydîhim vemâ halfehum velâ yuhîtûne bişey’in min ilmihî illâ bimâ şâe, vesia kursiyyuhu’s-semâvâti ve’l-ard. Velâ yeuduhû hıfzuhumâ vehuve’l-âliyyu’l-azîm”\n" +
                "\n" +
                "Subhanellah   (33 kere)\n" +
                "\n" +
                "Elhamdulillah  (33 kere)\n" +
                "\n" +
                "Allahuekber   (33 kere)   \n" +
                "\n" +
                " \n" +
                "\n" +
                "    “Lâ ilâhe illallahu vahdehû lâ şerike leh. Lehul mulku ve lehul hamdu yuhyî ve yumît. Vehuve hayyullezî lâyemut, biyedihil hayr ve huve alâ kulli şey’in kadîr ve ileyhi’l-mesîr” denilip duâ edilir.\n" +
                "\n" +
                "    Duâdan sonraki tesbihâta devam edilir:\n" +
                "\n" +
                "    Fağlem ennehû  ( 1 defa )\n" +
                "\n" +
                "    Lâ ilâhe illallah   (33 defa )\n" +
                "\n" +

                "    Muhammedu’r-resûlullahi sallallâhu teâlâ aleyhi vesellem. (1 defa)\n" +
                "\n\n\n" +
                "    Lâilâhe illallahu elmeliku’l-hakku’l-mubîn, Muhammedu’r-resûlullahi sâdıku’l-va'dil emîn. (10 defa )\n" +
                "\n" +
                "   (Tesbihâttaki sâlât ü selâmlar okunur:)\n" +
                "\n\n" +
                "   Bismillâhirrahmânirrahîm,\n" +
                "\n\n" +
                "   İnnellahe ve melâiketehû yusellûne ale'n-nebiy. Yâ eyyuhellezîne âmenû sallû aleyhi ve sellimû teslîmâ. Lebbeyk.\n" +
                "\n" +
                "   Allahumme salli alâ seyyidinâ Muhammedin ve alâ âli seyyidinâ Muhammed. Biadedi kulli dâin ve devâin  ve bârik ve sellim aleyhi ve aleyhim tesliman kesîrâ.\n" +
                "\n" +
                "   Allahumme salli alâ seyyidinâ Muhammedin ve alâ âli seyyidinâ Muhammed. Biadedi kulli dâin ve devâin  ve bârik ve sellim aleyhi ve aleyhim tesliman kesîrâ..\n" +
                "\n" +
                "   Allahumme salli alâ seyyidinâ Muhammedin ve alâ âli seyyidinâ Muhammed. Biadedi kulli dâin ve devâin  ve bârik ve sellim aleyhi ve aleyhim tesliman kesirân kesîrâ.\n" +
                "\n" +
                "   Salli vesellim yâ Rabbi alâ habîbike Muhammedin ve alâ cemîi’l-enbiyâi ve’l evliya-i ve’l murselîn ve alâ âli kullin ve sahbi kullin ecmaîn. Âmin ve’l-hamdulillâhi Rabbi’l-âlemin.\n" +
                "\n" +
                " \n" +
                "\n" +
                "   Elfu elfi salâtin ve elfu elfi selâmin aleyke yâ Resûlallah.  \n" +
                "\n" +
                "   Elfu elfi salâtin ve elfu elfi selâmin aleyke yâ Habîballah. \n" +
                "\n" +
                "   Elfu elfi salâtin ve elfu elfi selâmin aleyke yâ emîne vahyillâh.\n" +
                "\n" +
                " \n" +
                "\n" +
                "    Allahumme salli ve sellim ve bârik alâ seyyidinâ Muhammedin ve alâ âlihî ve ashâbihî biadedi evrakı’l-eşcâr ve emvâci’l-bihâr ve katarâti’l-emtâr, vağfirlenâ verhamnâ veltufbinâ vebi üstâdinâ ve meşâyîhina  (radıyallâhu anhüm) ve vâlideynâ ve ihvânena vebi talebeti Resâili’n-Nûri’s-sadıkîne yâ ilâhenâ bikulli salâtin minhâ şehadeten.. eşhedu en lâ ilâhe illallah ve eşhedu enne Muhammeden Resûlullahi Sallallahu Aleyhi Tealâ Vesellem. \n" +
                "\n" +
                " \n" +
                "\n" +
                "  DUÂ-İ  TERCÜMÂN-I  İSM-İ ÂZAM  okunur:\n" +
                "\n\n" +
                "    Bismillâhirrahmânirrahîm,\n" +
                "\n\n" +
                "    Subhâneke yâ Allah teâleyte yâ Rahmân ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Rahîm teâleyte yâ Kerîm ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Hamîd teâleyte yâ Hakîm ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Mecîd teâleyte yâ Melîk ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Kuddûs teâleyte yâ Selâm ecirnâ mine’n-nâr  biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Mu’min teâleyte yâ Muheymin ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Azîz teâleyte yâ Cebbâr ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Mutekebbîr teâleyte yâ Hâlık ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Evvel teâleyte yâ Âhir ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Zâhir teâleyte yâ Bâtın ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Bâri teâleyte yâ Musavvir ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Tevvâb teâleyte yâ Vehhâb ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Bâis teâleyte yâ Vâris ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Kadîm teâleyte yâ Mukîm ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Ferd teâleyte yâ Vitr ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Nûr teâleyte yâ Settâr ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Celîl teâleyte yâ Cemîl ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Kâhir teâleyte yâ Kâdir ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Melîk teâleyte yâ Muktedir ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Alîm teâleyte yâ Allâm ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Azîm teâleyte yâ Ğafûr ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Halîm teâleyte yâ Vedûd ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Şehîd teâleyte yâ Şâhid ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Kebîr teâleyte yâ Muteâl ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Nûr teâleyte yâ Latıf ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Semi’ teâleyte yâ Kefîl ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Karîb teâleyte yâ Basîr ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Hak teâleyte yâ Mubîn ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Raûf teâleyte yâ Rahîm ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Tâhir teâleyte yâ Mutahhir ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Mucemmil teâleyte yâ Mufaddıl ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Muzhir teâleyte yâ Mun’im ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Deyyân teâleyte yâ Sultân ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Hannân teâleyte yâ Mennân ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Ehad teâleyte yâ Samed ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Hayy teâleyte yâ Kayyûm ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Adl teâleyte yâ Hakem ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Ferd teâleyte yâ Kuddûs ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                " \n" +
                "\n" +
                "     Celle celâluhu ve âmme nevâvuhû velâ ilâhe ğâyruh.\n" +
                "\n" +
                "  \n" +
                "   (Avuçlar yukarı gelecek şekilde eller kaldırılır:)\n" +
                "\n" +
                "    Subhâneke âhiyyen şerâhiyyen teâleyte lâ ilâhe illâ ente ecirnâ ve ecir üstâzenâ ve meşâyîhena (radıyallâhu anhüm) ve vâlideynâ ve ihvânenâ ve ehavâtenâ ve talebete Resâili’n-Nûri ve rufekâenâ ve akrebâena ahbâbene’l-mu’mînine’l-muhlisîne mine’n-nâr. (Avuç içleri aşağıya çevrilir.) Ve min kulli nâri vahfeznâ min şerri’n-nefsi ve’ş-şeytân ve min şerri’l-cinni ve’l-insân ve min şerri’l-bid’ati ve’d-dalâlâti ve’l-ilhâdi ve’t-tuğyân. (Avuçlar tekrar yukarı çevrilir.)\n" +
                "\n" +
                "    Biafvike yâ Mucîr, bifadlike yâ Gaffâr, birahmetike yâ Erhame’r-râhimîn.\n" +
                "\n" +
                "    Allahumme edhılne’l-Cennete meâal ebrâr, bişefâati nebiyyike’l-muhtâr ve âlihi-l ethâr, ve eshâbihi-l ahyâr, ve sellim mâdâme-l leylu vennehâr,  Âmin, ve  selâmun ale-l murselîn, ve-l hamdu lillâhi Rabbi’l-Âlemîn. \n" +
                "\n" +
                " \n" +
                "\n" +
                "   (Haşir Sûresi’nin 20-24. Âyetleri (Lâ Yestevî) okunur.)\n" +
                "\n" +
                "   Bismillâhirrahmânirrahîm,\n" +
                "\n" +
                "   Lâ yestevî eshâbu’n-nâri ve eshâbu’l-Cenneh. Eshâbu’l-Cenneti humu’l-fâizûn.\n" +
                "\n" +
                "   Lev enzelnâ hâze’l-Kur'âne alâ cebelilleraeytehû hâşian muteseddian min haşyetillah.\n" +
                "\n" +
                "   Ve tilke’l-emsâlu nadribuhâ linnâsi leallehum yetefekkerûn.\n" +
                "\n" +
                "   Huvallâhullezi lâ ilâhe illâ hû. Âlimu'l-ğaybi veş-şehâdeh. Huver-rahmânur-rahîm.\n" +
                "\n" +
                "   Huvallâhullezî lâ ilâhe illâ hû. El-melikul-kuddûsus-selâmul-mu'minul-muheyminul-azîzul-cebbârul-mutekebbir.\n" +
                "\n" +
                "   Subhânellâhi ammâ yuşrikûn. Huvallâhul-hâlikul-bâriul-musavviru lehul-esmâ-ul husnâ.\n" +
                "\n" +
                "   Yusebbihu lehü mâ fis-semâvâti vel-ard. Ve hüvel-'azîzul-hakîm.");
        tesbh.add("  ÖĞLE   NAMAZI\n" +
                "\n" +
                "\n" +
                "    Öğlenin farzı kılınıp selâm verildikten sonra,\n" +
                "\n" +
                "\n" +
                "    “5 defa Esteğfirullah denir ve sonrasında... Allahumme entesselâmu ve minkesselâm, tebârekte yâ zelcelâli velikram”\n" +
                "\n" +
                "denilerek şu duâ okunur:\n" +
                "\n" +
                "\n" +
                "   SALÂTEN TÜNCÎNÂ DUÂSI\n" +
                "\n" +
                "\n" +
                "    “Allahumme salli alâ Seyyidinâ Muhammedin ve alâ âli seyyidinâ Muhammed. Salâten tuncina biha min cemîil ahvâli vel âfât, ve takdilena biha cemîel hâcat, ve   tutahhirunâ biha min cemîis seyyiât, ve terfeuna biha indeke âledderecât, ve tubelliğuna biha aksel ğâyat, min cemiil hayrat fil hayati ve bâdel memat, birahmetika yâ erhamerrahimin, bi hurmeti Habibike yâ erhamerrahimin, bi hurmeti cemiil enbiya-i vel evliya-i  pîri pîran, pîri âzam ya Erhamerrahimin âmin, ve selâmun âlel murselin velhamdulillahi rabbil âlemin …” denilir, eller yüze sürülüp indirilir.     \n" +
                "\n" +
                "\n\n" +
                "    Öğlenin son sünneti kılındıktan sonra,\n" +
                "\n" +
                "\n" +
                "   “Subhânallahi velhamdulillâhi ve lâilâhe illallahu vallahu ekber, ve lâhavle ve lâkuvvete illâ billâhil aliyyil azîm”\n" +
                "\n" +
                "   denilir ve ÂYETÜ’L-KÜRSÎ okunur:\n" +
                "\n" +
                "\n" +
                "   Bismillâhirrahmânirrahîm,\n" +
                "\n" +
                "\n" +
                "    “Allahu lâ ilâhe illâ huve’l-hayyul kayyûm. Lâ te’huzuhû sinetun velâ nevm. Lehu mâ fissemâvâti vemâ fi’l-ard. Menzellezî yeşfeu indehû illâ biiznih. Ya’lemu mâ beyne eydîhim vemâ halfehum velâ yuhîtûne bişey’in min ilmihî illâ bimâ şâe, vesia kursiyyuhu’s-semâvâti ve’l-ard. Velâ yeuduhû hıfzuhumâ vehuve’l-âliyyu’l-azîm”\n" +
                "\n" +
                "\n" +
                "Subhanellah   (33 kere)\n" +
                "\n" +
                "Elhamdulillah  (33 kere)\n" +
                "\n" +
                "Allahuekber    (33 kere)   \n" +
                "\n" +
                "\n" +
                "    “Lâ ilâhe illallahu vahdehû lâ şerike leh. Lehul mulku ve lehul hamdu yuhyî ve yumît. Vehuve hayyullezî lâyemut, biyedihil hayr ve huve alâ kulli şey’in kadîr ve ileyhi’l-mesîr” denilip duâ edilir. \n" +
                "\n" +
                "\n" +
                "    (Duâdan sonraki tesbihâta devam edilir:)\n" +
                "\n" +
                "\n" +
                "    Fağlem ennehû  ( 1 defa )\n" +
                "\n" +
                "    Lâ ilâhe illallah   (33 defa )\n" +
                "\n" +
                "    Muhammedu’r-resûlullahi sallallâhu teâlâ aleyhi vesellem. (1 defa)\n" +
                "\n" +
                "\n" +
                "   Tesbihâttaki sâlât ü selâmlar okunur:\n" +
                "\n" +
                "\n" +
                "   Bismillâhirrahmânirrahîm,\n" +
                "\n" +
                "\n" +
                "   İnnellahe ve melâiketehû yusellûne ale'n-nebiy. Yâ eyyuhellezîne âmenû sallû aleyhi ve sellimû teslîmâ. Lebbeyk.\n" +
                "\n" +
                "   Allahumme salli alâ seyyidinâ Muhammedin ve alâ âli seyyidinâ Muhammed. Biadedi kulli dâin ve devâin  ve bârik ve sellim aleyhi ve aleyhim tesliman kesîrâ.\n" +
                "\n" +
                "   Allahumme salli alâ seyyidinâ Muhammedin ve alâ âli seyyidinâ Muhammed. Biadedi kulli dâin ve devâin  ve bârik ve sellim aleyhi ve aleyhim tesliman kesîrâ..\n" +
                "\n" +
                "   Allahumme salli alâ seyyidinâ Muhammedin ve alâ âli seyyidinâ Muhammed. Biadedi kulli dâin ve devâin  ve bârik ve sellim aleyhi ve aleyhim tesliman kesirân kesîrâ.\n" +
                "\n" +
                "   Salli vesellim yâ Rabbi alâ habîbike Muhammedin ve alâ cemîi’l-enbiyâi ve’l evliya-i ve’l murselîn ve alâ âli kullin ve sahbi kullin ecmaîn. Âmin ve’l-hamdulillâhi Rabbi’l-âlemin.\n" +
                "\n" +
                " \n" +
                "\n" +
                "   Elfu elfi salâtin ve elfu elfi selâmin aleyke yâ Resûlallah.  \n" +
                "\n" +
                "   Elfu elfi salâtin ve elfu elfi selâmin aleyke yâ Habîballah. \n" +
                "\n" +
                "   Elfu elfi salâtin ve elfu elfi selâmin aleyke yâ emîne vahyillâh.\n" +
                "\n" +
                " \n" +
                "\n" +
                "    Allahumme salli ve sellim ve bârik alâ seyyidinâ Muhammedin ve alâ âlihî ve ashâbihî biadedi evrakı’l-eşcâr ve emvâci’l-bihâr ve katarâti’l-emtâr, vağfirlenâ verhamnâ veltufbinâ vebi üstâdinâ ve meşâyîhina  (radıyallâhu anhüm) ve vâlideynâ ve ihvânena vebi talebeti Resâili’n-Nûri’s-sadıkîne yâ ilâhenâ bikulli salâtin minhâ şehadeten.. eşhedu en lâ ilâhe illallah ve eşhedu enne Muhammeden Resûlullahi Sallallahu Aleyhi Tealâ Vesellem. \n" +
                "\n" +
                " \n" +
                "\n" +
                "   DUÂ-İ  İSM-İ  ÂZAM okunur:\n" +
                "\n" +
                "(Soldan sağa satır satır okuyunuz.)\n" +
                " \n" +
                "\n" +
                "Bismillâhirrahmânirrahîm  \n" +
                "\n" +
                "\n" +
                "Yâ Cemîl  yâ Allah " +

                "    Yâ Karîb  yâ Allah\n" +
                "\n" +
                "Yâ Mucîb  yâ Allah    " +

                "Yâ Habîb  yâ  Allah\n" +
                "\n" +
                "Yâ Raûf  yâ Allah    " +

                "Yâ Atûf   yâ Allah\n" +
                "\n" +
                "Yâ Ma’ruf yâ Allah    " +

                "Yâ Latîf  yâ Allah\n" +
                "\n" +
                "Yâ Azîm  yâ Allah    " +

                "Yâ Hannân  yâ Allah\n" +
                "\n" +
                "Yâ Mennân yâ Allah    " +

                "Yâ Deyyân  yâ Allah\n" +
                "\n" +
                "Yâ Sübhan  yâ Allah    " +

                "Yâ Emân  yâ Allah\n" +
                "\n" +
                "Yâ Bürhân   yâ Allah    " +

                "Yâ Sultân  yâ Allah\n" +
                "\n" +
                "Yâ Müsteân yâ Allah    " +

                "Yâ Muhsin yâ Allah\n" +
                "\n" +
                "Yâ Müteâl yâ Allah    " +

                "Yâ Rahmân  yâ Allah\n" +
                "\n" +
                "Yâ Rahîm yâ Allah    " +

                "Yâ Kerîm  yâ Allah\n" +
                "\n" +
                "Yâ Mecîd  yâ Allah    " +

                "Yâ Ferd  yâ Allah\n" +
                "\n" +
                "Yâ Vitr  yâ Allah    " +

                "Yâ Ehad yâ Allah\n" +
                "\n" +
                "Yâ Samed  yâ Allah    " +

                "Yâ Mahmûd yâ Allah\n" +
                "\n" +
                "Yâ Sâdıka’l-Va’di yâ Allah    " +

                "Yâ Aliyy  yâ Allah\n" +
                "\n" +
                "Yâ Ganiyy  yâ Allah    " +

                "Yâ Şâfî  yâ Allah\n" +
                "\n" +
                "Yâ Kâfî  yâ Allah    " +

                "Yâ Muâfî  yâ Allah\n" +
                "\n" +
                "Yâ Bâkî  yâ Allah    " +

                "Yâ Hâdî yâ Allah\n" +
                "\n" +
                "Yâ Kàdir  yâ Allah    " +

                "Yâ Sâtir yâ Allah\n" +
                "\n" +
                "Yâ Kàhhâr  yâ Allah    " +

                "Yâ Cebbâr  yâ Allah\n" +
                "\n" +
                "Yâ Ğaffâr  yâ Allah    " +

                "Yâ Fettâh  yâ Allah\n" +
                "\n" +
                "\n" +
                "Celle celâluhu ve âmme nevâvuhû velâ ilâhe ğâyruh.\n" +
                "\n" +
                " \n" +
                "\n" +
                "   (Avuçlar yukarı gelecek şekilde eller açılır:)\n" +
                "\n" +
                "\n" +
                "    “Yâ Rabbe’s-semâvâti Ve’l-ardı, yâ ze’l-Celâli ve’l-İkrâm. Nes’eluke bihakkı hâzihi’l-esmâi kullehâ entusalli-ye alâ seyyidinâ Muhammedin ve alâ âli Muhammed, verham Muhammeden kemâ salleyte ve sellemte ve bârekte ve rahimte ve terehamte alâ İbrâhîme ve alâ âli İbrâhîme fi’l âlemîn, Rabbenâ inneke hamîdüm mecîd, birahmetike yâ erhamerrâhimîn, ve’l-hamdülillâhi Rabb’l-alemîn.” \n" +
                "\n" +
                " \n" +
                "\n" +
                "  Fetih Sûresi’nin 27-29. Âyetleri (Lakad Sadakallâhü) okunarak namaz bitirilir.\n" +
                "\n" +
                "\n" +
                "Bismillâhirrahmânirrahîm,\n" +
                "\n" +
                "\n" +
                "    Lekad sadakallahu resûlehu’r-ruyâ bilhakk letedhulunne’l-mescide’l-harâme inşâallâhu âminîne muhallikîne ruûsekum ve mukessırîne lâtehafûn feâlime mâ lem ta'lemû fecaâle min dûni zâlike fethan karîba.\n" +
                "\n" +
                "    Huvellezî ersele resûlehu bilhudâ ve dînil hakkı liyuzhirahu aleddîni kullih ve kefâ billâhi şehîdâ.\n" +
                "\n" +
                "    Muhammedu’r-resûlullah vellezîne meahû eşiddâü âlel kuffâri ruhamâu beynehum terâhum rukkeân succeden yebteğûne fadlen minallahi verıdvânâ.   Sîmâhüm   fî vucûhihim min eseri’s-sucud zalike meseluhum fittevrâti ve meseluhum fi’l-incîl kezer'in ahrace şat'ehû feâzerehu festağleze festevâ alâ sûkihî         yu'cibuzzurrâe       liyeğîze bihimu’l-kuffâr. Veadallâhullezîne âmenû ve amilu’s-sâlihâti minhum mağfiraten ve ecran azîmâ.");
        tesbh.add("İKİNDİ NAMAZI \n" +
                " \n" +
                "\n" +
                "   İkindinin farzını kılınıp selâm verildikten sonra,\n" +
                "\n" +
                "    “5 defa Esteğfirullah denir ve sonrasında... Allahumme entesselâmu ve minkesselâm, tebârekte yâ zelcelâli velikram”  denilerek şu duâ okunur:\n" +
                "\n" +
                " \n" +
                "\n" +
                "SALÂTEN TÜNCÎNÂ DUÂSI \n" +
                "\n" +
                "    “Allahumme salli alâ Seyyidinâ Muhammedin ve alâ âli seyyidinâ Muhammed. Salâten tuncina biha min cemîil ahvâli vel âfât, ve takdilena biha cemîel hâcat, ve tutahhirunâ biha min cemîis seyyiât, ve terfeuna biha indeke âledderecât, ve tubelliğuna biha aksel ğâyat, min cemiil hayrat fil hayati ve bâdel memat, birahmetika yâ erhamerrahimin, bi hurmeti Habibike yâ erhamerrahimin, bi hurmeti cemiil enbiya-i vel evliya-i  pîri pîran, pîri âzam ya Erhamerrahimin âmin, ve selâmun âlel murselin velhamdulillahi rabbil âlemin …” denilir, eller yüze sürülüp indirilir.     \n" +
                "\n" +
                "    (Tesbihata devam edilir)\n" +
                "\n\n" +
                "  “Subhânallahi velhamdulillâhi ve lâilâhe illallahu vallahu ekber, ve lâhavle ve lâkuvvete illâ billâhil aliyyil azîm”\n" +
                "\n" +
                "   denilir ve ÂYETÜ’L-KÜRSÎ okunur:\n\n" +
                "\n" +
                "   Bismillâhirrahmânirrahîm,\n" +
                "\n\n" +
                "    “Allahu lâ ilâhe illâ huve’l-hayyul kayyûm. Lâ te’huzuhû sinetun velâ nevm. Lehu mâ fissemâvâti vemâ fi’l-ard. Menzellezî yeşfeu indehû illâ biiznih. Ya’lemu mâ beyne eydîhim vemâ halfehum velâ yuhîtûne bişey’in min ilmihî illâ bimâ şâe, vesia kursiyyuhu’s-semâvâti ve’l-ard. Velâ yeuduhû hıfzuhumâ vehuve’l-âliyyu’l-azîm”\n" +
                "\n" +
                "Subhanellah   (33 kere)\n" +
                "\n" +
                "Elhamdulillah  (33 kere)\n" +
                "\n" +
                "Allahuekber   (33 kere)   \n" +
                "\n\n" +
                "    “Lâ ilâhe illallahu vahdehû lâ şerike leh. Lehul mulku ve lehul hamdu yuhyî ve yumît. Vehuve hayyullezî lâyemut, biyedihil hayr ve huve alâ kulli şey’in kadîr ve ileyhi’l-mesîr” denilip duâ edilir.\n" +
                "\n\n" +
                "    (Duâdan sonraki tesbihâta devam edilir:)\n" +
                "\n" +
                "   Fağlem ennehû  ( 1 defa )\n" +
                "\n" +
                "   Lâ ilâhe illallah   (33 defa )\n" +
                "\n" +
                "    Muhammedu’r-resûlullahi sallallâhu teâlâ aleyhi vesellem. (1 defa)\n" +
                "\n\n" +
                "    (Tesbihâttaki sâlât ü selâmlar okunur:)\n" +
                "\n\n\n" +
                "   Bismillâhirrahmânirrahîm,\n" +
                "\n" +
                "   İnnellahe ve melâiketehû yusellûne ale'n-nebiy. Yâ eyyuhellezîne âmenû sallû aleyhi ve sellimû teslîmâ. Lebbeyk.\n" +
                "\n" +
                "   Allahumme salli alâ seyyidinâ Muhammedin ve alâ âli seyyidinâ Muhammed. Biadedi kulli dâin ve devâin  ve bârik ve sellim aleyhi ve aleyhim tesliman kesîrâ.\n" +
                "\n" +
                "   Allahumme salli alâ seyyidinâ Muhammedin ve alâ âli seyyidinâ Muhammed. Biadedi kulli dâin ve devâin  ve bârik ve sellim aleyhi ve aleyhim tesliman kesîrâ..\n" +
                "\n" +
                "   Allahumme salli alâ seyyidinâ Muhammedin ve alâ âli seyyidinâ Muhammed. Biadedi kulli dâin ve devâin  ve bârik ve sellim aleyhi ve aleyhim tesliman kesirân kesîrâ.\n" +
                "\n" +
                "   Salli vesellim yâ Rabbi alâ habîbike Muhammedin ve alâ cemîi’l-enbiyâi ve’l evliya-i ve’l murselîn ve alâ âli kullin ve sahbi kullin ecmaîn. Âmin ve’l-hamdulillâhi Rabbi’l-âlemin.\n" +
                "\n" +
                " \n" +
                "\n" +
                "   Elfu elfi salâtin ve elfu elfi selâmin aleyke yâ Resûlallah.  \n" +
                "\n" +
                "   Elfu elfi salâtin ve elfu elfi selâmin aleyke yâ Habîballah. \n" +
                "\n" +
                "   Elfu elfi salâtin ve elfu elfi selâmin aleyke yâ emîne vahyillâh. \n" +
                "\n\n" +
                "    Allahumme salli ve sellim ve bârik alâ seyyidinâ Muhammedin ve alâ âlihî ve ashâbihî biadedi evrakı’l-eşcâr ve emvâci’l-bihâr ve katarâti’l-emtâr, vağfirlenâ verhamnâ veltufbinâ vebi üstâdinâ ve meşâyîhina  (radıyallâhu anhüm) ve vâlideynâ ve ihvânena vebi talebeti Resâili’n-Nûri’s-sadıkîne yâ ilâhenâ bikulli salâtin minhâ şehadeten.. eşhedu en lâ ilâhe illallah ve eşhedu enne Muhammeden Resûlullahi Sallallahu Aleyhi Tealâ Vesellem.\n" +
                "\n\n\n" +
                "   DUÂ-İ  TERCÜMÂN-I  İSM-İ ÂZAM  okunur:\n" +
                "\n\n" +
                "    Bismillâhirrahmânirrahîm,\n" +
                "\n" +
                "    Subhâneke yâ Allah teâleyte yâ Rahmân ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Rahîm teâleyte yâ Kerîm ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Hamîd teâleyte yâ Hakîm ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Mecîd teâleyte yâ Melîk ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Kuddûs teâleyte yâ Selâm ecirnâ mine’n-nâr  biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Mu’min teâleyte yâ Muheymin ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Azîz teâleyte yâ Cebbâr ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Mutekebbîr teâleyte yâ Hâlık ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Evvel teâleyte yâ Âhir ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Zâhir teâleyte yâ Bâtın ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Bâri teâleyte yâ Musavvir ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Tevvâb teâleyte yâ Vehhâb ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Bâis teâleyte yâ Vâris ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Kadîm teâleyte yâ Mukîm ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Ferd teâleyte yâ Vitr ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Nûr teâleyte yâ Settâr ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Celîl teâleyte yâ Cemîl ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Kâhir teâleyte yâ Kâdir ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Melîk teâleyte yâ Muktedir ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Alîm teâleyte yâ Allâm ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Azîm teâleyte yâ Ğafûr ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Halîm teâleyte yâ Vedûd ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Şehîd teâleyte yâ Şâhid ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Kebîr teâleyte yâ Muteâl ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Nûr teâleyte yâ Latıf ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Semi’ teâleyte yâ Kefîl ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Karîb teâleyte yâ Basîr ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Hak teâleyte yâ Mubîn ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Raûf teâleyte yâ Rahîm ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Tâhir teâleyte yâ Mutahhir ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Mucemmil teâleyte yâ Mufaddıl ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Muzhir teâleyte yâ Mun’im ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Deyyân teâleyte yâ Sultân ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Hannân teâleyte yâ Mennân ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Ehad teâleyte yâ Samed ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Hayy teâleyte yâ Kayyûm ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Adl teâleyte yâ Hakem ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "    Subhâneke yâ Ferd teâleyte yâ Kuddûs ecirnâ mine’n-nâr biafvike yâ Rahmân.\n" +
                "\n" +
                "\n" +
                "     Celle celâluhu ve âmme nevâvuhû velâ ilâhe ğâyruh.\n" +
                "\n\n" +
                "   (Avuçlar yukarı gelecek şekilde eller kaldırılır:)\n" +
                "\n" +
                "    Subhâneke âhiyyen şerâhiyyen teâleyte lâ ilâhe illâ ente ecirnâ ve ecir üstâzenâ ve meşâyîhena (radıyallâhu anhüm) ve vâlideynâ ve ihvânenâ ve ehavâtenâ ve talebete Resâili’n-Nûri ve rufekâenâ ve akrebâena ahbâbene’l-mu’mînine’l-muhlisîne mine’n-nâr.\n" +
                "\n" +
                "  (Avuç içleri aşağıya çevrilir.)\n" +
                "\n" +
                "Ve min kulli nâri vahfeznâ min şerri’n-nefsi ve’ş-şeytân ve min şerri’l-cinni ve’l-insân ve min şerri’l-bid’ati ve’d-dalâlâti ve’l-ilhâdi ve’t-tuğyân.\n" +
                "\n" +
                "  (Avuçlar tekrar yukarı çevrilir.)\n" +
                "\n" +
                "Biafvike yâ Mucîr, bifadlike yâ Gaffâr, birahmetike yâ Erhame’r-râhimîn. \n" +
                "\n" +
                "    Allahumme edhılne’l-Cennete meâal ebrâr, bişefâati nebiyyike’l-muhtâr ve âlihi-l ethâr, ve eshâbihi-l ahyâr, ve sellim mâdâme-l leylu vennehâr,  Âmin, ve selâmun ale-l murselîn, ve-l hamdu lillâhi Rabbi’l-Âlemîn." +
                "\n\n\n(Nebe Suresi okunarak namaz bitirilir.)");
        tesbh.add("  AKŞAM   NAMAZI\n" +
                "\n" +
                " \n" +
                "\n" +
                "   Akşamın farzı kılınıp selâm verildikten sonra,\n" +
                "\n" +
                "\n" +
                "    “5 defa Esteğfirullah denir ve sonrasında... Allahumme entesselâmu ve minkesselâm, tebârekte yâ zelcelâli velikram”  denilerek şu duâ okunur:\n" +
                "\n\n" +
                "  SALÂTEN TÜNCÎNÂ DUÂSI\n" +
                "\n\n" +
                "    “Allahumme salli alâ Seyyidinâ Muhammedin ve alâ âli seyyidinâ Muhammed. Salâten tuncina biha min cemîil ahvâli vel âfât, ve takdilena biha cemîel hâcat, ve   tutahhirunâ biha min cemîis seyyiât, ve terfeuna biha indeke âledderecât, ve tubelliğuna biha aksel ğâyat, min cemiil hayrat fil hayati ve bâdel memat, birahmetika yâ erhamerrahimin, bi hurmeti Habibike yâ erhamerrahimin, bi hurmeti cemiil enbiya-i vel evliya-i  pîri pîran, pîri âzam ya Erhamerrahimin âmin, ve selâmun âlel murselin velhamdulillahi rabbil âlemin …” denilir, eller yüze sürülüp indirilir.     \n" +
                "\n" +
                "    Sünneti kıldıktan sonra, \n" +
                "\n\n" +
                "   Cümle-i Tevhid söylenir:  10 defa\n" +
                "\n" +
                "    “Lâ ilâhe illallahu vahdehû lâ şerike leh. Lehul mulku ve lehul hamdu yuhyî ve yumît. Vehuve hayyullezî lâyemut, biyedihil hayr ve huve alâ kulli şey’in kadîr.  (9 defa okunup, onuncuda) ve ileyhi’l-mesîr” ilâve edilir.\n" +
                "\n\n\n" +
                "   İstiâze duâları okunur (Eller avuç içi yere bakar şekilde kaldırılır.)\n" +
                "\n\n" +
                "    Allahumme ecirnâ mine’n-nâr. (Bu satır 3, 5 veya 7 defa,  diğerleri birer defa)\n" +
                "\n" +
                "    Allahumme ecirnâ min kulli nâr.\n" +
                "\n" +
                "    Allahumme ecirnâ min fitneti’d-dînîyyeti ve’d-dünyeviye.\n" +
                "\n" +
                "    Allahumme ecirnâ min fitneti âhiri’z-zaman.\n" +
                "\n" +
                "    Allahumme ecirnâ min fitneti’l-Mesîhi’d-Deccâli ve’s-Sufyan.\n" +
                "\n" +
                "    Allahumme ecirnâ mine’d-dalâlâti ve’l-bidiyyâti ve’l-beliyyât.\n" +
                "\n" +
                "    Allahumme ecirnâ min şerri’n-nefsi’l-emmâreh.\n" +
                "\n" +
                "    Allahumme ecirnâ min şurûri’n-nufûsi’l-emmârâti’l-firavniyyeh.\n" +
                "\n" +
                "    Allahumme ecirnâ min şerri’n-nisâ.\n" +
                "\n" +
                "    Allahumme ecirnâ min belâi’n-nisâ.\n" +
                "\n" +
                "    Allahumme ecirnâ min fitneti’n-nisâ.\n" +
                "\n" +
                "    Allahumme ecirnâ min azâbi’l-kabr.\n" +
                "\n" +
                "    Allahumme ecirnâ min azâbi yevmi’l-kıyâmeh.\n" +
                "\n" +
                "    Allahumme ecirnâ min azâbi Cehennem.\n" +
                "\n" +
                "    Allahumme ecirnâ min azâbi kahrik.\n" +
                "\n" +
                "    Allahumme ecirnâ min nâri kahrik.\n" +
                "\n" +
                "    Allahumme ecirnâ min azâbi’l-kabri ve’n-nîrân.\n" +
                "\n" +
                "    Allahumme ecirnâ mine’r-riyâi ve’s-sum’ati ve’l-ucubi ve’l-fahr.\n" +
                "\n" +
                "    Allahumme ecirnâ min tecâvuzi’l-mulhidîn.\n" +
                "\n" +
                "    Allahumme ecirnâ min şerri’l-munâfıkîn.\n" +
                "\n" +
                "    Allahumme ecirnâ min fitneti’l-fâsıkîn.\n" +
                "\n" +
                "    Allahumme ecirnâ ve ecir vâlideynâ ve talebete Resâili’n-Nûri’s-sâdıkîne fi hidmeti’l-Kur’âni ve’l-îmân. Ve ahbâbene’l-mu'minîne’l-muhlisîne ve akribâenâ ve ecdâdenâ mine’n-nâr.\n" +
                "\n" +
                "    (Avuç içi yukarı çevrilerek devam edilir.)\n" +
                "\n" +
                "    Biafvike yâ Mucîr, bifadlike yâ Ğaffâr. Bi rahmetike yâ erhemerrahimin.\n" +
                "\n" +
                "    Allahumme edhilne’l-Cennete meâl ebrâr.\n" +
                "\n" +
                "    Allahumme’d-hilne’l-Cennete meâl ebrâr.\n" +
                "\n" +
                "    Allahumme edhilnâ ve edhil üstâzenâ ve meşâyîhine (radıyallâhu anhüm) ve vâlideynâ ve talebete Resâili’n-Nûri’s-sadıkîne ve ihvânena ve ehavâtenâ ve akribâenâ ve ecdâdenâ ve ahbâbene’l-mu'minîne’l-muhlisîne fî hidmeti’l-îmâni ve’l-Kur’ân. El-Cennete meal ebrâr, bişefâat-i Nebiyyi-ke’l-Muhtâr ve âlihi’l-ethâr ve eshâbihi’l-ehyâr ve sellim mâdâme’l-leylu ve’n-nehâr. Âmin, ve selamun alel murselin velhamdu lillâhi Rabbi’l-Âlemîn. (Eller yüze sürülür.)\n" +
                "\n\n" +
                "    (Tesbihata devam edilir)\n" +
                "\n" +
                "   “Subhânallahi velhamdulillâhi ve lâilâhe illallahu vallahu ekber, ve lâhavle ve lâkuvvete illâ billâhil aliyyil azîm”\n" +
                "\n" +
                "   denilir ve ÂYETÜ’L-KÜRSÎ okunur\n" +
                "\n\n" +
                "   Bismillâhirrahmânirrahîm,\n" +
                "\n" +
                "    “Allahu lâ ilâhe illâ huve’l-hayyul kayyûm. Lâ te’huzuhû sinetun velâ nevm. Lehu mâ fissemâvâti vemâ fi’l-ard. Menzellezî yeşfeu indehû illâ biiznih. Ya’lemu mâ beyne eydîhim vemâ halfehum velâ yuhîtûne bişey’in min ilmihî illâ bimâ şâe, vesia kursiyyuhu’s-semâvâti ve’l-ard. Velâ yeuduhû hıfzuhumâ vehuve’l-âliyyu’l-azîm”\n" +
                "\n\n" +
                "Subhanellah   (33 kere)\n" +
                "\n" +
                "Elhamdulillah  (33 kere)\n" +
                "\n" +
                "Allahuekber   (33 kere)   \n" +
                "\n\n" +
                "    “Lâ ilâhe illallahu vahdehû lâ şerike leh. Lehul mulku ve lehul hamdu yuhyî ve yumît. Vehuve hayyullezî lâyemut, biyedihil hayr ve huve alâ kulli şey’in kadîr ve ileyhi’l-mesîr” denilip duâ edilir.\n" +
                "\n" +
                "    (Duâdan sonraki tesbihâta devam edilir:)\n" +
                "\n\n" +
                "    Fağlem ennehû  ( 1 defa )\n" +
                "\n" +
                "    Lâ ilâhe illallah   (33 defa )\n" +
                "\n" +
                "    Muhammedu’r-resûlullahi sallallâhu teâlâ aleyhi vesellem. (1 defa)\n" +
                "\n" +
                "    Lâ İlâhe illa ente subhaneke inni küntü minezzalimin. (33 defa)\n" +
                "\n\n\n" +
                "   (Tesbihâttaki sâlât ü selâmlar okunur:)\n" +
                "\n\n" +
                "   Bismillâhirrahmânirrahîm,\n" +
                "\n" +
                "   İnnellahe ve melâiketehû yusellûne ale'n-nebiy. Yâ eyyuhellezîne âmenû sallû aleyhi ve sellimû teslîmâ. Lebbeyk.\n" +
                "\n" +
                "   Allahumme salli alâ seyyidinâ Muhammedin ve alâ âli seyyidinâ Muhammed. Biadedi kulli dâin ve devâin  ve bârik ve sellim aleyhi ve aleyhim tesliman kesîrâ.\n" +
                "\n" +
                "   Allahumme salli alâ seyyidinâ Muhammedin ve alâ âli seyyidinâ Muhammed. Biadedi kulli dâin ve devâin  ve bârik ve sellim aleyhi ve aleyhim tesliman kesîrâ..\n" +
                "\n" +
                "   Allahumme salli alâ seyyidinâ Muhammedin ve alâ âli seyyidinâ Muhammed. Biadedi kulli dâin ve devâin  ve bârik ve sellim aleyhi ve aleyhim tesliman kesirân kesîrâ.\n" +
                "\n" +
                "   Salli vesellim yâ Rabbi alâ habîbike Muhammedin ve alâ cemîi’l-enbiyâi ve’l evliya-i ve’l murselîn ve alâ âli kullin ve sahbi kullin ecmaîn. Âmin ve’l-hamdulillâhi Rabbi’l-âlemin.\n" +
                "\n" +
                "\n" +
                "   Elfu elfi salâtin ve elfu elfi selâmin aleyke yâ Resûlallah.  \n" +
                "\n" +
                "   Elfu elfi salâtin ve elfu elfi selâmin aleyke yâ Habîballah. \n" +
                "\n" +
                "   Elfu elfi salâtin ve elfu elfi selâmin aleyke yâ emîne vahyillâh. \n" +
                "\n\n" +
                "    Allahumme salli ve sellim ve bârik alâ seyyidinâ Muhammedin ve alâ âlihî ve ashâbihî biadedi evrakı’l-eşcâr ve emvâci’l-bihâr ve katarâti’l-emtâr, vağfirlenâ verhamnâ veltufbinâ vebi üstâdinâ ve meşâyîhina  (radıyallâhu anhüm) ve vâlideynâ ve ihvânena vebi talebeti Resâili’n-Nûri’s-sadıkîne yâ ilâhenâ bikulli salâtin minhâ şehadeten.. eşhedu en lâ ilâhe illallah ve eşhedu enne Muhammeden Resûlullahi Sallallahu Aleyhi Tealâ Vesellem.\n" +
                "\n\n\n" +
                "  DUÂ-İ  İSM-İ  ÂZAM okunur:\n" +
                "\n" +
                "(Soldan sağa satır satır okuyunuz.)\n" +
                "\nBismillâhirrahmânirrahîm  \n" +
                "\n" +
                "\n" +
                "Yâ Cemîl  yâ Allah " +

                "    Yâ Karîb  yâ Allah\n" +
                "\n" +
                "Yâ Mucîb  yâ Allah    " +

                "Yâ Habîb  yâ  Allah\n" +
                "\n" +
                "Yâ Raûf  yâ Allah    " +

                "Yâ Atûf   yâ Allah\n" +
                "\n" +
                "Yâ Ma’ruf yâ Allah    " +

                "Yâ Latîf  yâ Allah\n" +
                "\n" +
                "Yâ Azîm  yâ Allah    " +

                "Yâ Hannân  yâ Allah\n" +
                "\n" +
                "Yâ Mennân yâ Allah    " +

                "Yâ Deyyân  yâ Allah\n" +
                "\n" +
                "Yâ Sübhan  yâ Allah    " +

                "Yâ Emân  yâ Allah\n" +
                "\n" +
                "Yâ Bürhân   yâ Allah    " +

                "Yâ Sultân  yâ Allah\n" +
                "\n" +
                "Yâ Müsteân yâ Allah    " +

                "Yâ Muhsin yâ Allah\n" +
                "\n" +
                "Yâ Müteâl yâ Allah    " +

                "Yâ Rahmân  yâ Allah\n" +
                "\n" +
                "Yâ Rahîm yâ Allah    " +

                "Yâ Kerîm  yâ Allah\n" +
                "\n" +
                "Yâ Mecîd  yâ Allah    " +

                "Yâ Ferd  yâ Allah\n" +
                "\n" +
                "Yâ Vitr  yâ Allah    " +

                "Yâ Ehad yâ Allah\n" +
                "\n" +
                "Yâ Samed  yâ Allah    " +

                "Yâ Mahmûd yâ Allah\n" +
                "\n" +
                "Yâ Sâdıka’l-Va’di yâ Allah    " +

                "Yâ Aliyy  yâ Allah\n" +
                "\n" +
                "Yâ Ganiyy  yâ Allah    " +

                "Yâ Şâfî  yâ Allah\n" +
                "\n" +
                "Yâ Kâfî  yâ Allah    " +

                "Yâ Muâfî  yâ Allah\n" +
                "\n" +
                "Yâ Bâkî  yâ Allah    " +

                "Yâ Hâdî yâ Allah\n" +
                "\n" +
                "Yâ Kàdir  yâ Allah    " +

                "Yâ Sâtir yâ Allah\n" +
                "\n" +
                "Yâ Kàhhâr  yâ Allah    " +

                "Yâ Cebbâr  yâ Allah\n" +
                "\n" +
                "Yâ Ğaffâr  yâ Allah    " +

                "Yâ Fettâh  yâ Allah\n" +
                "\n" +
                " \t \n" +
                "   Celle celâluhu ve âmme nevâvuhû velâ ilâhe ğâyruh.\n" +
                "\n" +
                "   (Avuçlar yukarı gelecek şekilde eller açılır:)\n" +
                "\n" +
                "    “Yâ Rabbe’s-semâvâti Ve’l-ardı, yâ ze’l-Celâli ve’l-İkrâm. Nes’eluke bihakkı hâzihi’l-esmâi kullehâ entusalli-ye alâ seyyidinâ Muhammedin ve alâ âli Muhammed, verham Muhammeden kemâ salleyte ve sellemte ve bârekte ve rahimte ve terehamte alâ İbrâhîme ve alâ âli İbrâhîme fi’l âlemîn, Rabbenâ inneke hamîdüm mecîd, birahmetike yâ erhamerrâhimîn, ve’l-hamdülillâhi Rabb’l-alemîn.” \n" +
                "\n\n\n" +
                "Haşir Sûresi’nin 20-24. Âyetleri (Lâ Yestevî) okunur.\n" +
                "\n" +
                "   Bismillâhirrahmânirrahîm,\n" +
                "\n" +
                "   Lâ yestevî eshâbu’n-nâri ve eshâbu’l-Cenneh. Eshâbu’l-Cenneti humu’l-fâizûn.\n" +
                "\n" +
                "   Lev enzelnâ hâze’l-Kur'âne alâ cebelilleraeytehû hâşian muteseddian min haşyetillah.\n" +
                "\n" +
                "   Ve tilke’l-emsâlu nadribuhâ linnâsi leallehum yetefekkerûn.\n" +
                "\n" +
                "   Huvallâhullezi lâ ilâhe illâ hû. Âlimu'l-ğaybi veş-şehâdeh. Huver-rahmânur-rahîm.\n" +
                "\n" +
                "   Huvallâhullezî lâ ilâhe illâ hû. El-melikul-kuddûsus-selâmul-mu'minul-muheyminul-azîzul-cebbârul-mutekebbir.\n" +
                "\n" +
                "   Subhânellâhi ammâ yuşrikûn. Huvallâhul-hâlikul-bâriul-musavviru lehul-esmâ-ul husnâ.\n" +
                "\n" +
                "   Yusebbihu lehü mâ fis-semâvâti vel-ard. Ve hüvel-'azîzul-hakîm.");
        tesbh.add("  YATSI  NAMAZI\n" +
                "\n" +
                " \n" +
                "\n" +
                "    Yatsının farzı kılınıp selâm verildikten sonra,\n" +
                "\n" +
                "\n" +
                "    “5 defa Esteğfirullah denir ve sonrasında... Allahumme entesselâmu ve minkesselâm, tebârekte yâ zelcelâli velikram”\n" +
                "\n" +
                "denilerek şu duâ okunur:\n" +
                "\n" +
                "\n" +
                "SALÂTEN TÜNCÎNÂ DUÂSI\n" +
                "\n" +
                "\n" +
                "    “Allahumme salli alâ Seyyidinâ Muhammedin ve alâ âli seyyidinâ Muhammed. Salâten tuncina biha min cemîil ahvâli vel âfât, ve takdilena biha cemîel hâcat, ve   tutahhirunâ biha min cemîis seyyiât, ve terfeuna biha indeke âledderecât, ve tubelliğuna biha aksel ğâyat, min cemiil hayrat fil hayati ve bâdel memat, birahmetika yâ erhamerrahimin, bi hurmeti Habibike yâ erhamerrahimin, bi hurmeti cemiil enbiya-i vel evliya-i  pîri pîran, pîri âzam ya Erhamerrahimin âmin, ve selâmun âlel murselin velhamdulillahi rabbil âlemin …” denilir, eller yüze sürülüp indirilir.     \n" +
                "\n" +
                " \n" +
                "\n" +
                "    Vitir namazını kılındıktan sonra,\n" +
                "\n" +
                "\n" +
                "   “Subhânallahi velhamdulillâhi ve lâilâhe illallahu vallahu ekber, ve lâhavle ve lâkuvvete illâ billâhil aliyyil azîm”\n" +
                "\n" +
                "   denilir ve ÂYETÜ’L-KÜRSÎ okunur:\n" +
                "\n" +
                "\n" +
                "   Bismillâhirrahmânirrahîm,\n" +
                "\n" +
                "\n" +
                "    “Allahu lâ ilâhe illâ huve’l-hayyul kayyûm. Lâ te’huzuhû sinetun velâ nevm. Lehu mâ fissemâvâti vemâ fi’l-ard. Menzellezî yeşfeu indehû illâ biiznih. Ya’lemu mâ beyne eydîhim vemâ halfehum velâ yuhîtûne bişey’in min ilmihî illâ bimâ şâe, vesia kursiyyuhu’s-semâvâti ve’l-ard. Velâ yeuduhû hıfzuhumâ vehuve’l-âliyyu’l-azîm”\n" +
                "\n" +
                "\n" +
                "Subhanellah   (33 kere)\n" +
                "\n" +
                "Elhamdulillah  (33 kere)\n" +
                "\n" +
                "Allahuekber    (33 kere)   \n" +
                "\n" +
                "\n" +
                "    “Lâ ilâhe illallahu vahdehû lâ şerike leh. Lehul mulku ve lehul hamdu yuhyî ve yumît. Vehuve hayyullezî lâyemut, biyedihil hayr ve huve alâ kulli şey’in kadîr ve ileyhi’l-mesîr” denilip duâ edilir. \n" +
                "\n" +
                "\n" +
                "    (Duâdan sonraki tesbihâta devam edilir:)\n" +
                "\n" +
                "\n" +
                "    Fağlem ennehû  ( 1 defa )\n" +
                "\n" +
                "    Lâ ilâhe illallah   (33 defa )\n" +
                "\n" +
                "\n" +
                "    Muhammedu’r-resûlullahi sallallâhu teâlâ aleyhi vesellem. (1 defa)\n" +
                "\n" +
                " \n" +
                "\n" +
                "   Tesbihâttaki sâlât ü selâmlar okunur:\n" +
                "\n" +
                "\n" +
                "   Bismillâhirrahmânirrahîm,\n" +
                "\n" +
                "\n" +
                "   İnnellahe ve melâiketehû yusellûne ale'n-nebiy. Yâ eyyuhellezîne âmenû sallû aleyhi ve sellimû teslîmâ. Lebbeyk.\n" +
                "\n" +
                "   Allahumme salli alâ seyyidinâ Muhammedin ve alâ âli seyyidinâ Muhammed. Biadedi kulli dâin ve devâin  ve bârik ve sellim aleyhi ve aleyhim tesliman kesîrâ.\n" +
                "\n" +
                "   Allahumme salli alâ seyyidinâ Muhammedin ve alâ âli seyyidinâ Muhammed. Biadedi kulli dâin ve devâin  ve bârik ve sellim aleyhi ve aleyhim tesliman kesîrâ..\n" +
                "\n" +
                "   Allahumme salli alâ seyyidinâ Muhammedin ve alâ âli seyyidinâ Muhammed. Biadedi kulli dâin ve devâin  ve bârik ve sellim aleyhi ve aleyhim tesliman kesirân kesîrâ.\n" +
                "\n" +
                "   Salli vesellim yâ Rabbi alâ habîbike Muhammedin ve alâ cemîi’l-enbiyâi ve’l evliya-i ve’l murselîn ve alâ âli kullin ve sahbi kullin ecmaîn. Âmin ve’l-hamdulillâhi Rabbi’l-âlemin.\n" +
                "\n" +
                " \n" +
                "\n" +
                "   Elfu elfi salâtin ve elfu elfi selâmin aleyke yâ Resûlallah.  \n" +
                "\n" +
                "   Elfu elfi salâtin ve elfu elfi selâmin aleyke yâ Habîballah. \n" +
                "\n" +
                "   Elfu elfi salâtin ve elfu elfi selâmin aleyke yâ emîne vahyillâh.\n" +
                "\n" +
                " \n" +
                "\n" +
                "    Allahumme salli ve sellim ve bârik alâ seyyidinâ Muhammedin ve alâ âlihî ve ashâbihî biadedi evrakı’l-eşcâr ve emvâci’l-bihâr ve katarâti’l-emtâr, vağfirlenâ verhamnâ veltufbinâ vebi üstâdinâ ve meşâyîhina  (radıyallâhu anhüm) ve vâlideynâ ve ihvânena vebi talebeti Resâili’n-Nûri’s-sadıkîne yâ ilâhenâ bikulli salâtin minhâ şehadeten.. eşhedu en lâ ilâhe illallah ve eşhedu enne Muhammeden Resûlullahi Sallallahu Aleyhi Tealâ Vesellem. \n" +
                "\n" +
                " \n" +
                "\n" +
                "5. DUÂ-İ  İSM-İ  ÂZAM okunur:\n" +
                "\n" +
                "(Soldan sağa satır satır okuyunuz.)\n" +
                " \n" +
                "\n" +
                "Bismillâhirrahmânirrahîm  \n" +
                "\n" +
                "\n" +
                "Yâ Cemîl  yâ Allah " +

                "    Yâ Karîb  yâ Allah\n" +
                "\n" +
                "Yâ Mucîb  yâ Allah    " +

                "Yâ Habîb  yâ  Allah\n" +
                "\n" +
                "Yâ Raûf  yâ Allah    " +

                "Yâ Atûf   yâ Allah\n" +
                "\n" +
                "Yâ Ma’ruf yâ Allah    " +

                "Yâ Latîf  yâ Allah\n" +
                "\n" +
                "Yâ Azîm  yâ Allah    " +

                "Yâ Hannân  yâ Allah\n" +
                "\n" +
                "Yâ Mennân yâ Allah    " +

                "Yâ Deyyân  yâ Allah\n" +
                "\n" +
                "Yâ Sübhan  yâ Allah    " +

                "Yâ Emân  yâ Allah\n" +
                "\n" +
                "Yâ Bürhân   yâ Allah    " +

                "Yâ Sultân  yâ Allah\n" +
                "\n" +
                "Yâ Müsteân yâ Allah    " +

                "Yâ Muhsin yâ Allah\n" +
                "\n" +
                "Yâ Müteâl yâ Allah    " +

                "Yâ Rahmân  yâ Allah\n" +
                "\n" +
                "Yâ Rahîm yâ Allah    " +

                "Yâ Kerîm  yâ Allah\n" +
                "\n" +
                "Yâ Mecîd  yâ Allah    " +

                "Yâ Ferd  yâ Allah\n" +
                "\n" +
                "Yâ Vitr  yâ Allah    " +

                "Yâ Ehad yâ Allah\n" +
                "\n" +
                "Yâ Samed  yâ Allah    " +

                "Yâ Mahmûd yâ Allah\n" +
                "\n" +
                "Yâ Sâdıka’l-Va’di yâ Allah    " +

                "Yâ Aliyy  yâ Allah\n" +
                "\n" +
                "Yâ Ganiyy  yâ Allah    " +

                "Yâ Şâfî  yâ Allah\n" +
                "\n" +
                "Yâ Kâfî  yâ Allah    " +

                "Yâ Muâfî  yâ Allah\n" +
                "\n" +
                "Yâ Bâkî  yâ Allah    " +

                "Yâ Hâdî yâ Allah\n" +
                "\n" +
                "Yâ Kàdir  yâ Allah    " +

                "Yâ Sâtir yâ Allah\n" +
                "\n" +
                "Yâ Kàhhâr  yâ Allah    " +

                "Yâ Cebbâr  yâ Allah\n" +
                "\n" +
                "Yâ Ğaffâr  yâ Allah    " +

                "Yâ Fettâh  yâ Allah\n" +
                "\n" +
                "\n" +
                "     Celle celâluhu ve âmme nevâvuhû velâ ilâhe ğâyruh.\n" +
                "\n" +
                "\n" +
                "   (Avuçlar yukarı gelecek şekilde eller açılır:)\n" +
                "\n" +
                "\n" +
                "    “Yâ Rabbe’s-semâvâti Ve’l-ardı, yâ ze’l-Celâli ve’l-İkrâm. Nes’eluke bihakkı hâzihi’l-esmâi kullehâ entusalli-ye alâ seyyidinâ Muhammedin ve alâ âli Muhammed, verham Muhammeden kemâ salleyte ve sellemte ve bârekte ve rahimte ve terehamte alâ İbrâhîme ve alâ âli İbrâhîme fi’l âlemîn, Rabbenâ inneke hamîdüm mecîd, birahmetike yâ erhamerrâhimîn, ve’l-hamdülillâhi Rabb’l-alemîn.” \n" +
                "\n" +
                " \n" +
                "\n" +
                "  Bakara Sûresi’nin 285-286. Âyetleri (Âmenerresûlü) okunarak namaz bitirilir.\n" +
                "\n" +
                "\n" +
                " Bismillâhirrahmânirrahîm,\n" +
                "\n" +
                "“Âmene’r-resûlu bimâ unzile ileyhi mir rabbihî ve’l-mu'minûn. Kullun âmene billâhi ve melâiketihî ve kütubihî ve rusulih. Lâ nuferriku beyne ehâdin mir rusulih. Ve kàlû semi'na ve ata'nâ ğufrâneke rabbenâ ve ileyke’l-mesîr.  Lâ yukellifullâhu nefsen illâ vüs'ahâ. Lehâ mâ kesebet ve aleyhâ mektesebet. Rabbenâ lâ tuâhiznâ in nesînâ ev ahta'nâ. Rabbenâ velâ tehmil aleynâ isren kema hameltehu âlellezîne min kablinâ. Rabbenâ velâ tuhammilnâ mâ lâ tâkete lenâ bih. Va'fu annâ, vağfirlenâ, verhamnâ ente mevlânâ fensurnâ âlel kavmil kâfirîn.”");

        ArrayAdapter arrayAdapter = new ArrayAdapter(NamazTesbihatlari.this,R.layout.layout,tesbihatlar);
        listViewTesbihat.setAdapter(arrayAdapter);

        listViewTesbihat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getApplicationContext(),Tesbihatlar.class);
                intent.putExtra("name",tesbh.get(position));
                intent.putExtra("title",tesbihatlar.get(position));
                startActivity(intent);

            }
        });

    }
}