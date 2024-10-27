package d30lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda05_reduce01 {
    public static void main(String[] args) {


        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 11,13));

        printProductOfSquareOfDistinctEvenElements(nums);


/*Java'da method reference, lambda ifadelerine bir alternatif olarak sunulan bir özelliktir.
Method reference, zaten tanımlanmış bir metodu doğrudan bir fonksiyonel arayüze atamak için kullanılır.
Bu, bazen bir lambda ifadesinden daha okunabilir bir kod yazmamıza olanak tanır.*/









//5) Bir listedeki tüm tekrarlanmayan çift sayıların karelerinin çarpımını hesaplayan bir method oluşturunuz.
//5) Create a method that calculates the product of the squares of all non-repeating even numbers in a list.

    }//main disi
    //printProductOfSquareOfDistinctEvenElements -->tekrarlanmayanlarin

      public static void printProductOfSquareOfDistinctEvenElements(List<Integer>nums){

        int carpim = nums.stream().distinct().filter(t-> t % 2 ==0).map(t-> t * t).reduce(1,(t,u)->t*u);
          System.out.println(carpim);//64
      }

    }

