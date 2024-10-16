package d24collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Sets01 {
    public static void main(String[] args) {

//Set’ler tekrarsiz(unique) datalari depolamak icin kullanilir. Ornegin; e-mail, tc kimlik no, il plaka no

/*Java'da üç tür set vardır:
1) HashSet: Bu set, elemanların hash kodlarına göre depolandığı bir settir. Elemanlar,
her birinin benzersiz bir hash kodu (kimlik numarası) ile depolandığı bir yapıda tutulur.
Bir eleman eklediğinizde, bu elemanın hash kodu hesaplanır ve o hash koduna karşılık gelen
bir hücreye yerleştirilir.

HashSet'ler, en hızlı performansı sunar.Ancak, elemanların sırasını korumazlar.
null'i eleman olarak kabul ederler */


        //-------------ek bilgi

        //Hash Code gormek istersek
        String a = "Aliye canan";
        System.out.println(a.hashCode()); //hashcode'lari benzersiz (unique) degildir

     /*2) LinkedHashSet: Bu set, elemanların eklenme sırasına göre(insertion order) depolandığı
bir settir. LinkedHashSet class'i, HashSet class'inin child'idir.
LinkedHashSet'ler, elemanların sırasını korumaya ihtiyaç duyulan uygulamalar için iyi bir seçimdir.
Ancak, HashSet'lerden daha yavaş performans sunarlar. (orta)

Ornegin; Okullarda kayit sirasina gore ogrenci bilgilerini tutmak isterseniz kullanabilirsiniz

3) TreeSet: Bu set, elemanların doğal sırasına(natural order-kucukten buyuge) göre depolandığı bir settir.
HashSet'ler ve LinkedHashSet'lerden daha yavaş performans sunarlar.
Java'da TreeSet, SortedSet arayüzünü(interface) uygulayan bir class'tir.
Bu nedenle, TreeSet bir Sorted Set'tir.*/

        //*********************************************************************************


//HasSet  nasil olusturulur?

        HashSet<String >hs =new HashSet<>();
        System.out.println(hs);//bos olustu


// HasSet nasil eleman eklenir?

        hs.add("Sinan");
        hs.add("Kerem");
        hs.add("Tuba");
        hs.add("Onur");
        System.out.println(hs);//[Kerem, Sinan, Tuba, Onur] HasSet karisik tutar.

        hs.add("Kerem");//tekrarli eleman hata vermez,uzerine yazar.
        System.out.println(hs);

        hs.add(null);
        System.out.println(hs);//[Kerem, null, Sinan, Tuba, Onur]

        //LinkedHashSet nasil olusturlur?

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(14);
        lhs.add(19);
        lhs.add(7);
        lhs.add(1);
        lhs.add(null);
        System.out.println(lhs);


        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        ls.add(17);
        ls.add(11);
        ls.add(17);
        ls.add(11);
        ls.add(null);
        System.out.println(ls);

//retainAll() metodu, bir koleksiyondaki öğelerin başka bir koleksiyonla kesişimini
// (yani her iki koleksiyonda da bulunan öğeleri-ortak) bulmak için kullanılır.

    lhs.retainAll(ls); //ortaklari bul
        System.out.println(lhs);
        System.out.println(ls);

//ODEV: Farkli olanlari bulan bir metot var mi?


//TreeSet nasil olusturulur?
        TreeSet<Character>ts =new TreeSet<>();
        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('R');
        ts.add('Z');
    //  ts.add(null); HATA null koyamazsiniz.Cunku Null dogal sirlamasi yoktur.
        System.out.println(ts);//[A, G, R, Z]//natural order yani dogal A dan Z ye

//subset() belirli bir aralıktaki elemanları içeren yeni bir küme oluşturmak için kullanılır.
//subSet() methodu, belirtilen aralıkta bulunan elemanlardan oluşan bir sorted set alt kümesi
// oluşturur. Bu nedenle, subSet() yöntemini kullanmak için,
// SortedSet türünden bir değişken oluşturmanız gerekir.

SortedSet<Character> ss = ts.subSet('G','U');//G den basla U ya kadar git G ve U haric
        System.out.println(ss);//[G,R]

        //Interview Sorusu
//Ornek 1 : Ogrenci email adreslerini natural order’da siralanmis olarak depolayiniz.
//Interview Question
//Example 1 : Store student email addresses in natural order.









    }
}
