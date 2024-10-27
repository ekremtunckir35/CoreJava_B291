package d30lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda08_findFirst {


    //8) Verilen listedeki 7'den büyük en küçük çift sayıyı bulan bir yöntem oluşturun.
//2, 3, 4, 5, 11, 10, 14 ==> 10 <-- 7’den buyuk en kucuk cift sayi
//8) Create a method that finds the smallest even number greater than 7 in the given list.
//2, 3, 4, 5, 11, 10, 14 ==> 10 <-- Smallest even number greater than 7
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 11, 10,14));
         getMinGreaterThanSevenEven(nums);
         getMinGreaterThanSevenEven1(nums);
    } //main disi
     public static  void getMinGreaterThanSevenEven(List<Integer>nums){


//findFirst(): Sıralı akışta bulunan ilk elemanı (yani yani bu senaryo da en küçük elemanı) alır.
// Bu işlem bir Optional döndürür, çünkü akışta hiç eleman kalmamış olabilir
// (filtreleme nedeniyle veya başka bir sebepten dolayı)



         Integer min = nums.stream().
                 distinct().
                 filter(t->t>7 && t % 2 == 0).
                 sorted().
                 reduce((t,u)->t).get();
         System.out.println(min);

     }

     //2.yol
     public static void getMinGreaterThanSevenEven1(List<Integer>nums){
         Integer min = nums.stream().
                 filter(t -> t > 7 && t % 2 == 0).
                 sorted().findFirst().get(); //findFirst akistaki ilk elemani verir
         System.out.println(min);
     }
}
