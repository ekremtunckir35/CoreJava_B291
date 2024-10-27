package d26maps_exceptions;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Maps04 {
    public static void main(String[] args) {
        //Thread Safe, Multi Thread, Synchronized kavramlarini inceleyelim

        /*
Thread Safe: Aynı anda birçok iş parçacığı tarafından güvenli bir şekilde erişilebilen yapılar.
Veri yarışlarını ve tutarsızlıkları önler.
Multi Thread: Aynı anda birden fazla iş parçacığı tarafından çalıştırılabilen programlar.
Paralel işleme ve performans artışı sağlar.
Synchronized: Aynı anda sadece bir iş parçacığı tarafından erişilebilen metodlar veya kod blokları.
Eşzamanlılık sorunlarını ve veri tutarsızlıklarını önler.
*/


  /*HashMap, HashTable ve ConcurrentHashMap arasindaki fark nedir?
1- HashMap
a) Thread Safety:
Thread-safe değildir.
Çok iş parçacıklı (multi-threaded) ortamda veri tutarsızlıkları olabilir.
b) Multi Thread:
Tek iş parçacıklı (single-threaded) ortamlar için idealdir.
Çok iş parçacıklı ortamlar için harici senkronizasyon gerektirir.
c) Synchronized:
Synchronized değildir, yani aynı anda birden fazla iş parçacığı tarafından erişilebilir.
d) Null Key/Value:
Bir null key ve birden fazla null value kabul eder.
e) Performans:
En hızlısıdır çünkü synchronized değildir.
 */

/*
3- ConcurrentHashMap
a) Thread Safety:
Thread-safe'tir.
Segment-based locking kullanarak senkronizasyon sağlar.
b) Multi Thread:
Çok iş parçacıklı (multi-threaded) ortamlar için idealdir.
Aynı anda birden fazla iş parçacığı tarafından güvenli bir şekilde kullanılabilir.
c) Synchronized:
Synchronized'dir, ancak segment-based locking sayesinde daha iyi performans sunar.
d) Null Key/Value:
Ne null key ne de null value kabul eder. NullPointerException atar.
e) Performans:
HashTable'dan daha hızlıdır çünkü segment-based locking kullanır.
Çok iş parçacıklı ortamlar için optimize edilmiştir.
*/
        Hashtable<String,Integer> studentGrades =new Hashtable<>();
        studentGrades.put("Selma", 70);
        studentGrades.put("Tuba", 75);
        studentGrades.put("Ibrahim", 85);
        studentGrades.put("Sefa", 87);

       // studentGrades.put(null,50); //null kabul etmiyor.Exception atar.

        HashMap<String,Integer> stdAges =new HashMap<>();
        stdAges.put("Ali", 18);
        stdAges.put("Ahmet", 41);
        stdAges.put(null,39);
        System.out.println(stdAges);

        // ConcurrentHashMap oluşturma

        ConcurrentHashMap<String, Integer> stock = new ConcurrentHashMap<>();

        // Eleman ekleme
        stock.put("Elma", 10);
        stock.put("Muz", 20);

        //Elemana erisme
        System.out.println("Elmanin stok miktari: " + stock.get("Elma")); //Elmanin stok miktari: 10

        //Guncelleme veya ekleme
        stock.putIfAbsent("Cilek", 30); //Cilek yoksa ekle
        System.out.println(stock); //{Muz=20, Elma=10, Cilek=30}

        stock.replace("Muz",20,25);
        System.out.println(stock);

        //Eleman silme
        stock.remove(("Elma"));
        System.out.println(stock);

        for(Map.Entry<String,Integer> entry:stock.entrySet()) {
            String key =entry.getKey();
            Integer valuue = entry.getValue();
            System.out.println(key + " stok miktari " + valuue);
        }

        System.out.println("----------------------------------------------");

        // /*
        //1) TreeMap'ler entry'leri natural order'a gore siraya koyar, bu yuzden yavastirlar
        //2) TreeMap'ler  thread-safe ve synchronized degildir.
        //3) TreeMap'lerin key'lerinde null kullanilamaz(Comparator istisnasi var ama onerilmez),
        //ama value kisimlarinda istediginiz kadar kullanabilirsiniz
        //4) TreeMapler key'e bakarak siralama yapar
        // */



        TreeMap<String, Integer> countryPopulation = new TreeMap<>();
        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("USA", 400000000);
        //countryPopulation.put(null,18000000);//HATA
        countryPopulation.put("Turkiye", 83000000);
        countryPopulation.put("Netherland", 18000000);

        System.out.println(countryPopulation);


        //------------------------------------------------------/*LinkedHashMap, HashMap'e benzer, ancak ekleme sırasına göre sıralanmış bir şekilde verileri tutar.
        //Yani, LinkedHashMap verileri eklediğiniz sırayla tutar ve bu sırayı korur.
        //Bu nedenle, verileri eklediğiniz sırayla geri almanız gerektiğinde kullanışlı olabilir.
        //
        //**ornegin,bir takvim uygulamasında, etkinlikleri tarih sırasına göre tutmak için kullanılabilir.
        //yada bir restoranın sipariş alım sistemi düşünün. Müşterilerin siparişlerini verme sırası,
        //restoranın sipariş hazırlama sırasını belirler.
        //
        //Aynı mantık, müşteri hizmetleri çağrı merkezleri, sırayla hizmet veren işletmeler veya
        //benzeri senaryolarda da kullanılabilir.
        //Müşteri veya işlem sıralarını takip etmek için LinkedHashMap tercih edilebilir.LinkedHashMap sınıfı thread-safe degildir
        //*/


        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        lhm.put("Ali", 25);
        lhm.put("Can", 18);
        lhm.put("Mehmet", 30);

        for (Map.Entry<String, Integer> entry : lhm.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }
//HashMap arka planda nasil calisiyor?
//HashMap'in varsayılan boyutu(kapasitesi) 16'dır (0 ila 15).16 adet "bucket" (kova) bulunacağı anlamına gelir.
// Bu "bucket"lar, HashMap içindeki anahtar-değer çiftlerini tutar. Bucket'in memory'de kapsadigi alan degiskendir.

       HashMap<String,String >capitals = new HashMap<>();
       capitals.put("USA","Washington");
       capitals.get("USA");
       capitals.put("Italy","Roma");
       capitals.put("Turkiye","Ankara");
       capitals.get("Turkiye");
       capitals.put("Turkiye","Istanbul");

    }



}
