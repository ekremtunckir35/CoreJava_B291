package d30lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda04_reduce {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 3, 3, 5,11,10));
        printSumOfSquaresOfDistinctEvenElements(nums);

        //distinct() metodu, bir akistaki tekrar eden ogeleri kaldirmak icin kullanilir

        //reduce()azaltmak: Koleksiyon elemanlarını tek bir değere indirger.

//reduce(0, (t,u) -> t+u); deki 0 etkisiz elemandir. carpma olsa 1 koyardik
//t: Şu ana kadar hesaplanmış olan ara toplam. İlk iterasyonda, bu değer başlangıç değeri olan 0’dır.
//u: Ilk elemandir
//(t,u) -> t+u: İki girdi alarak tek bir çıktı üreten bir lambda ifadesidir.

//----------------------------
        //reduce(0, (t,u) -> t+u); deki 0 etkisiz elemandir. carpma olsa 1 koyardik
        //t: Şu ana kadar hesaplanmış olan ara toplam. İlk iterasyonda, bu değer başlangıç değeri olan 0’dır.
        //u: Ilk elemandir
        //(t,u) -> t+u: İki girdi alarak tek bir çıktı üreten bir lambda ifadesidir.

        //İlk iterasyonda:
        //t=0 (başlangıç değeri olarak belirtildiği için)
        //u=4 (ilk eleman)
        //t+u = 4

        //İkinci iterasyonda:
        //t=4 (önceki adımdan gelen sonuç)
        //u=100 (ikinci eleman)
        //t+u = 104
//---------------------------------------

 /*Java'da method reference, lambda ifadelerine bir alternatif olarak sunulan bir özelliktir.
Method reference, zaten tanımlanmış bir metodu doğrudan bir fonksiyonel arayüze atamak için kullanılır.
Bu, bazen bir lambda ifadesinden daha okunabilir bir kod yazmamıza olanak tanır.*/



        //--------------------



//4)Bir listedeki tekrarlanmayan çift sayıların karelerinin toplamını(reduce) hesaplayan bir method oluşturunuz.
//4)Create a method that calculates the sum of squares of non-repeating even numbers in a list.

        //3+5 =8 e indirgendi. iki sayi toplaninca tek bir sayi elde edilir.Bu reduce dir.
        //tek bir sonuc cikar ise reducedir.




    }//main disi

    //printSumOfSquaresOfDistinctEvenElements-->
    public static void printSumOfSquaresOfDistinctEvenElements(List<Integer>nums){
        int toplam = nums.stream().
                distinct().
                filter(t-> t % 2 == 0).//cift sayilar dedigi icin filter//2 ve 10
                map(t->  t * t). //akistan gelen her bir t degeri // 4 ve 100
                reduce(0,(t,u) -> t + u);//reduce burada cift parametreli
        System.out.println(toplam);
    }
}
