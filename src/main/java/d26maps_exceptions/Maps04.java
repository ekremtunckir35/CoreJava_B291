package d26maps_exceptions;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;
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

    }
}
