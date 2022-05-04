package pratic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TaskAnswers {

    //   List<Integer> sayi = new ArrayList<>(Arrays.asList(34, 22, 16, 11, 35, 20, 63, 21, 65, 44, 66, 64, 81, 38, 15));

    //Day-1

    //Task : list elemanlarını aynı satirda aralarında bosluk olacak sekilde print ediniz.
    //list elemanlarını aynı satirda aralarında bosluk olacak sekilde print ediniz.
    //Task : functional Programming ile list elemanlarinin  cift olanalrini ayni satirda aralarina bosluk birakarak print ediniz.
    //Task :functional Programming ile list elemanlarinin 34 den kucuk cift olanalrini ayni satirda aralarina bosluk birakarak print ediniz.
    //Task : functional Programming ile list elemanlarinin 34 den buyk veya cift olanalrini ayni satirda aralarina bosluk birakarak print ediniz.





    public static void main(String[] args) {
        //  List<Integer> sayi = new ArrayList<>(Arrays.asList(2,4,8,34, 22, 16, 11, 35, 20, 63, 21, 65, 44, 66, 64, 81, 38, 15));
        //  List<Integer> sayi2 = new ArrayList<>(Arrays.asList(2,1));

        /*Task : list elemanlarını aynı satirda aralarında bosluk olacak sekilde print ediniz.

       sayi.stream().forEach(Utulities::boslukluYazdirInt);

        */

        /* Task : functional Programming ile list elemanlarinin  cift olanalrini ayni satirda aralarina bosluk birakarak print ediniz.

       sayi.stream().filter(Utulities::ciftSayilardondurInt).forEach(Utulities::boslukluYazdirInt);

         */

        /*Task :functional Programming ile list elemanlarinin 34 den kucuk cift olanalrini ayni satirda aralarina bosluk birakarak print ediniz.

        sayi.stream().filter(t->t%2==0 && t<34 ).forEach(Utulities::boslukluYazdirInt);

         */

        /*Task : functional Programming ile list elemanlarinin 34 den buyk veya cift olanalrini ayni satirda aralarina bosluk birakarak print ediniz.

        sayi.stream().filter(t->t%2==0 || t>34 ).forEach(Utulities::boslukluYazdirInt);

         */

        //  **************************************************************************************************
        //  **************************************************************************************************
        //  **************************************************************************************************
        //  **************************************************************************************************
        //  **************************************************************************************************

        //Day-2

        //   List<Integer> sayi = new ArrayList<>(Arrays.asList(34, 22, 16, 11, 35, 20, 63, 21, 65, 44, 66, 64, 81, 38, 15));

        // Task : Functional Programming ile listin cift elemanlarinin  karelerini ayni satirda aralarina bosluk bırakarak print ediniz
        // Task : Functional Programming ile listin tek elemanlarinin  kuplerinin bir fazlasini ayni satirda aralarina bosluk birakarak print edi
        // Task : Functional Programming ile listin cift elemanlarinin   karekoklerini ayni satirda aralarina bosluk birakarak yazdiriniz
        // Task : list'in en buyuk elemanini yazdiriniz
        // Task : List'in cift elemanlarin karelerinin en buyugunu print ediniz
        // Task : List'teki tum elemanlarin toplamini yazdiriniz.
        // Task : List'teki cift elemanlarin carpimini  yazdiriniz.
        // Task : List'teki elemanlardan en kucugunu 4 farklı yontem ile print ediniz.
        // Task : List'teki 5'ten buyuk en kucuk tek sayiyi print ediniz.
        // Task : list'in cift  elemanlarinin karelerini  kucukten buyuge print ediniz.
        // Task : list'in tek  elemanlarinin kareleri ni buykten kucuge  print ediniz.

        /* Task : Functional Programming ile listin cift elemanlarinin  karelerini ayni satirda aralarina bosluk bırakarak print ediniz

        sayi.stream().filter(Utulities::ciftSayilarDondurInt).map(Utulities::kareAlInt).forEach(Utulities::boslukluYazdirInt);

         */

        /* Task : Functional Programming ile listin tek elemanlarinin  kuplerinin bir fazlasini ayni satirda aralarina bosluk birakarak print edin.

        sayi.stream().filter(Utulities::tekSayilarDondurInt).map(t->(t*t*t)+1 ).forEach(Utulities::boslukluYazdirInt);

         */

        /* Task : Functional Programming ile listin cift elemanlarinin   karekoklerini ayni satirda aralarina bosluk birakarak yazdiriniz

        sayi.stream().filter(Utulities::ciftSayilarDondurInt).map(Math::sqrt).forEach(Utulities::boslukluYazdirDouble);

         */

        /* Task : list'in en buyuk elemanini yazdiriniz

        System.out.println(sayi.stream().reduce(Integer::max));

         */

        /* Task : List'in cift elemanlarin karelerinin en buyugunu print ediniz

        System.out.println(sayi.stream().filter(Utulities::ciftSayilarDondurInt).map(Utulities::kareAlInt).reduce(Math::max));

         */

        /* Task : List'teki tum elemanlarin toplamini yazdiriniz.


        System.out.println(sayi.stream().reduce(0, (x, y) -> x + y));
        System.out.println(sayi.stream().reduce(Integer::sum));

         */

        /* Task : List'teki cift elemanlarin carpimini  yazdiriniz.

        System.out.println(sayi.stream().filter(Utulities::ciftSayilarDondurInt).reduce(1, (x, y) -> x*y));

         */

        /* Task : List'teki elemanlardan en kucugunu 4 farklı yontem ile print ediniz.

        System.out.println(sayi.stream().reduce(Integer.MAX_VALUE, (x, y) -> x < y ? x : y));
        System.out.println(sayi.stream().reduce(Math::min));
        System.out.println(sayi.stream().reduce(Integer::min));
        sayi.stream().sorted().limit(1).forEach(Utulities::boslukluYazdirInt);

         */

        /* Task : List'teki 5'ten buyuk en kucuk tek sayiyi print ediniz.

        System.out.println(sayi.stream().filter(Utulities::tekSayilarDondurInt).reduce(Integer::min));

         */

        /* Task : list'in cift  elemanlarinin karelerini  kucukten buyuge print ediniz.

        sayi.stream().filter(Utulities::ciftSayilarDondurInt).map(Utulities::kareAlInt).sorted().forEach(Utulities::boslukluYazdirInt);

         */

        /* Task : list'in tek  elemanlarinin kareleri ni buykten kucuge  print ediniz.

        sayi.stream().filter(Utulities::tekSayilarDondurInt).map(Utulities::kareAlInt).sorted(Comparator.reverseOrder()).forEach(Utulities::boslukluYazdirInt);

         */
      //  **************************************************************************************************
      //  **************************************************************************************************
      //  **************************************************************************************************
      //  **************************************************************************************************
      //  **************************************************************************************************


        //Day-3



        // List<String> menü = new ArrayList<>(Arrays.asList("küşleme", "adana", "trileçe", "havucDilim", "buryan",
        //      "yaglama", "kokareç", "arabAşı", "güveç", "waffle", "welemen", "cacix"));


        // Task : List elemanlarini alafabetik buyuk harf ve  tekrarsiz print ediniz.
        // Task : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..
        // Task : List elemanlarini character sayisina gore kckten byk e gore print ediniz..
        // Task : list elemanlarinin son harfine gore ters sirali print ediniz.
        // Task : listin elemanlarin karakterlerinin cift sayili  karelerini hesaplayan,ve
        // karelerini tekrarsiz buyukten kucuge sirali  print ediniz...
        // Task : List elelmmalarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol ediniz.
        // Task : List elelmanlarinin "W" ile baslamasını kontrol ediniz.
        // Task : List elelmanlarinin "x" ile biten en az bir elemanı kontrol ediniz.
        // Task : Karakter sayisi en buyuk elemani yazdiriniz.
        // Task : list elemanlarini son harfine göre siralayıp ilk eleman hariç kalan elemanlari print ediniz.

    //    List<String> menu = new ArrayList<>(Arrays.asList("küşleme", "adana", "trileçe", "havucDilim", "buryan",
      //          "yaglama", "kokarec", "arabAşi", "güvec", "waffle", "welemen", "cacix","adana","adana"));

        /* Task : List elemanlarini alafabetik buyuk harf ve  tekrarsiz print ediniz.

        menu.stream().sorted().map(String::toUpperCase).distinct().forEach(Utulities::boslukluYazdirString);

         */

        /*Task : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..

        menu.stream().map(t->t.toString().length()).sorted(Comparator.reverseOrder()).distinct().forEach(Utulities::boslukluYazdirInt);

         */

        /* Task : List elemanlarini character sayisina gore kckten byk e gore print ediniz..

        menu.stream().sorted(Comparator.comparing(t->t.toString().length())).forEach(Utulities::boslukluYazdirString);

         */

        /* Task : list elemanlarinin son harfine gore ters sirali print ediniz.

        menu.stream().
                sorted(Comparator.comparing(t->t.toString().charAt(t.toString().length()-1)).reversed()).
                forEach(Utulities::boslukluYazdirString);

         */

        // Task : listin elemanlarin karakterlerinin cift sayili  karelerini hesaplayan,ve
        /* karelerini tekrarsiz buyukten kucuge sirali  print ediniz...

        menu.stream().map(t->t.length()*t.length()).
                filter(Utulities::ciftSayilarDondurInt).sorted(Comparator.reverseOrder()).distinct().
                forEach(Utulities::boslukluYazdirInt);

         */

        /* Task : List elelmmalarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol ediniz.

        System.out.println(menu.stream().map(t -> t.length()).allMatch(t -> t >= 7));

         */

        /* Task : List elelmanlarinin "W" ile baslamasını kontrol ediniz.


        System.out.println(menu.stream().anyMatch(t -> t.startsWith("w")));//başlayan var mı?
        System.out.println(menu.stream().allMatch(t -> t.startsWith("w")));//Hepsi başlıyor mu?

         */

        /* Task : List elelmanlarinin "x" ile biten en az bir elemanı kontrol ediniz.

        System.out.println(menu.stream().anyMatch(t -> t.endsWith("x")));//başlayan var mı?
        System.out.println(menu.stream().allMatch(t -> t.endsWith("x")));//Hepsi başlıyor mu?

         */

        /* Task : Karakter sayisi en buyuk elemani yazdiriniz.

        System.out.println(menu.stream().map(t -> t.length()).reduce(Integer::max));

         */

        /* Task : list elemanlarini son harfine göre siralayıp ilk eleman hariç kalan elemanlari print ediniz.

        menu.stream().sorted(Comparator.comparing(t ->t.charAt( t.toString().length() - 1))).skip(1).forEach(Utulities::boslukluYazdirString);

         */

        //  **************************************************************************************************
        //  **************************************************************************************************
        //  **************************************************************************************************
        //  **************************************************************************************************
        //  **************************************************************************************************

        /*
        TASK :
        fields --> Universite (String)
        bolum (String)
        ogrcSayisi (int)
        notOrt (int)
        olan POJO clas craete edip main method içinde 5 farklı obj'den List create ediniz.
        */



        Universite u01 = new Universite("bogazici", "matematik", 571, 93);
        Universite u02 = new Universite("istanbul teknik", "matematik", 622, 81);
        Universite u03 = new Universite("istanbul", "hukuk", 1453, 71);
        Universite u04 = new Universite("marmara", "bilgisayar muh", 1071, 77);
        Universite u05 = new Universite("yıldız teknik", "gemi", 333, 74);
        List<Universite> unv = new ArrayList<>(Arrays.asList(u01, u02, u03, u04, u05));




        //task 01--> notOrt'larinin 74' den buyuk oldg kontrol eden pr create ediniz.
        //task 02-->ogrc sayilarinin   110 den az olmadigini  kontrol eden pr create ediniz.
        //task 03-->universite'lerde herhangi birinde "matematik" olup olmadigini  kontrol eden pr create ediniz.
        //task 04-->universite'leri ogr sayilarina gore b->k siralayiniz.
        //task 05-->universite'leri notOrt gore  b->k siralayip ilk 3 'unu print ediniz.
        //task 06--> ogrc sayisi en az olan 2. universite'yi  print ediniz.
        //task 07--> notOrt 63 'den buyuk olan universite'lerin ogrc sayilarini toplamini print ediniz.
        //task 08--> Ogrenci sayisi 333'dan buyuk olan universite'lerin notOrt'larinin ortalamasini bulunuz.
        //task 09-->"matematik" bolumlerinin sayisini  print ediniz.
        //task 10-->Ogrenci sayilari 571'dan fazla olan universite'lerin en buyuk notOrt'unu bulunuz.
        //task 11-->Ogrenci sayilari 1071'dan az olan universite'lerin en kucuk notOrt'unu bulunuz.

        /*task 01--> notOrt'larinin 74' den buyuk oldg kontrol eden pr create ediniz.


        System.out.println(unv.stream().allMatch(t -> t.getNotOrt() > 74));//74'ten yüksek ortalama var mi
        unv.stream().filter(t->t.getNotOrt()>74).
        forEach(t ->System.out.println(t.getUniversite())); //Hangi üniversiteler
         */

        /*task 02-->ogrc sayilarinin   110 den az olmadigini  kontrol eden pr create ediniz.

        unv.stream().filter(t->t.getOgrSayisi()<110).
                forEach(t ->System.out.println(t.getUniversite())); //

        System.out.println(unv.stream().noneMatch(t -> t.getOgrSayisi() < 110));

         */

        /*task 03-->universite'lerde herhangi birinde "matematik" olup olmadigini  kontrol eden pr create ediniz.

        unv.stream().filter(t ->t.getBolum().
                equalsIgnoreCase("matematik") ).forEach(t ->System.out.println(t.getUniversite()));

        System.out.println(unv.stream().anyMatch(t -> t.getBolum().
                equalsIgnoreCase("matematik")));

         */

        //task 04-->universite'leri ogr sayilarina gore b->k siralayiniz.

       // System.out.println(unv.stream().
         //       sorted(Comparator.comparing(Universite::getOgrSayisi).reversed()).
           //     collect(Collectors.toList()));

     //   List<Universite>unv3=unv.stream().
       //         sorted(Comparator.comparing(Universite::getOgrSayisi).reversed()).
         //       collect(Collectors.toList())


       /* Universite class'ı modifiye edilmeli:

                    public String toString() {
        return
                "universite='" + universite + '\'' +

                ", ogrSayisi=" + ogrSayisi +
               "\n";



        System.out.println(unv3);

        */

        /*task 05-->universite'leri notOrt gore  b->k siralayip ilk 3 'unu print ediniz.

        unv.stream().sorted(Comparator.comparing(Universite::getNotOrt).
                reversed()).limit(3).forEach(t-> System.out.println(t.getUniversite()) );

         */
        /*task 06--> ogrc sayisi en az olan 2. universite'yi  print ediniz.

        unv.stream().
                sorted(Comparator.comparing(Universite::getOgrSayisi)).
                limit(2).skip(1).forEach(t-> System.out.println(t.getUniversite()));

         */

        /*task 07--> notOrt 63 'den buyuk olan universite'lerin ogrc sayilarini toplamini print ediniz.

        System.out.println(unv.stream().
                filter(t -> t.getNotOrt() > 63).
                map(t -> t.getOgrSayisi()).reduce(0, (x, y) -> x + y));

         */

        /*task 08--> Ogrenci sayisi 333'dan buyuk olan universite'lerin notOrt'larinin ortalamasini bulunuz.

        System.out.println(unv.stream().filter(t -> t.getOgrSayisi() > 333).
                mapToDouble(t -> t.getNotOrt()).average());

         */

        /*task 09-->"matematik" bolumlerinin sayisini  print ediniz.

        System.out.println(unv.stream().
        filter(t -> t.getBolum().equalsIgnoreCase("matematik")).count());
         */

        /*task 10-->Ogrenci sayilari 571'dan fazla olan universite'lerin en buyuk notOrt'unu bulunuz.

        System.out.println(unv.stream().filter(t -> t.getOgrSayisi() > 571).
                mapToDouble(t -> t.getNotOrt()).reduce(Double::max));

         */

        //task 11-->Ogrenci sayilari 1071'dan az olan universite'lerin en kucuk notOrt'unu bulunuz.

        System.out.println(unv.stream().
                filter(t -> t.getOgrSayisi() < 1071).mapToDouble(t -> t.getNotOrt()).reduce(Double::min));


    }

}
