package d30lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda06_sorted_optional_methodReferance {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 2, 4, 5, 11, 10));
        maximum1( nums);
        maximum2(nums);
        maximum3(nums);
        maximum4 (nums);


        //6)Verilen List'teki maksimum değeri bulmak için bir method oluşturun.
        //6)Create a method to find the maximum value in the given List


         //1.yol

        //Integer.MIN_VALUE: Bu, int tipinin alabileceği en küçük değeri verir (-2^31 dir)


    }//main disi

    public static void maximum1(List<Integer> nums) {
        int max =
                nums.stream().
                        distinct().
                        reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);//ternary kullandik
        System.out.println(max);//11


    }


    //2.yol
    public static void maximum2(List<Integer> nums) {
        //Integer.MIN_VALUE: Bu, int tipinin alabileceği en küçük değeri verir (-2^31 dir)
        int max =
                nums.stream().
                        distinct().
                        reduce(Integer.MAX_VALUE, (t, u) -> t > u ? t : u);
        System.out.println(max);

    }
//------------------------------------------------------------


    //3.yol
    public static void maximum3(List<Integer>nums){

    //sorted(): Koleksiyonu belilrli bir kretere gore siralar.
             //  Naturel order(kucukten buyuge)

        //Reduce tek parametreli kullanilirsa Optional olur.
        // Optional ne demek -->Sonuc bos da olabilir ,olmayabilir.Null donebilir demektir.
        //Deger var mi yok mu kontrolu yapar.
        // Optional bir sonuc almamak icin Integer e cevrilir.Bunun icin get() method kullanilir.

        Integer max = nums.stream().distinct().sorted().reduce((t,u)->u).get();//tek parametreli

        System.out.println(max);

    }

//-----------------------------------------------------------------


    //4.yol best practice
//Java'da :: işareti, "Method Reference" olarak adlandırılır.
// Bir metodun doğrudan referansını alarak lambda ifadeleri yazmadan kullanmanızı sağlar.

    public static void maximum4(List<Integer>nums){

        Integer max = nums.stream().distinct().reduce(Math::max).get();
        System.out.println(max);//11
    }
}
