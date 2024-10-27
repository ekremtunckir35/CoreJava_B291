package d30lambda;

import java.util.*;

public class Lambda07_isPresent_reverseOrder {

    //7)Verilen List’teki minimum değeri bulmak için bir method oluşturun.
    //7)Create a method to find the minimum value in the given List
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 11, 10));
        minimum1(nums);
        minimum2(nums);
        minimum3(nums);
        minimum4(nums);
        minimum6(nums);
        minimum7(nums);


    }//main disi

    //1.yol

    public static void minimum1(List<Integer> nums) {
        Integer min = nums.stream().
                distinct().reduce(Math::min).get();
        System.out.println(min);//2
    }

    //2.yol ternary
    public static void minimum2(List<Integer> nums) {
        Integer min = nums.stream().
                distinct().//2,3,4,5,11,10
                reduce((t, u) -> t > u ? u : t).get();
        System.out.println(min);//2
    }
    //3/yol

    //sorted(Comparator.reverseOrder()) ifadesi,
    // Java Stream API'si içinde bir koleksiyonu ters sıralamak için kullanılır.
    //Comparator class, reverseOrder() methoddur.

    public static void minimum3(List<Integer> nums) {
        Integer min = nums.stream().
                distinct().
                sorted(Comparator.reverseOrder()).//11,10,5,4,3,2 //buyukten kucuge
                reduce((t, u) -> u).get();
        System.out.println(min);
    }

    //4.
    public static void minimum4(List<Integer> nums) {
        Integer min = nums.stream().distinct().sorted().reduce((t, u) -> t).get();
        System.out.println(min); //2
    }

    //null kontrolu//Optional kontrolu ---->  isPresent ile yapilir deger var mi demek
    public static void minimum5(List<Integer> nums) {
        Optional<Integer> min = nums.stream().distinct().sorted().reduce((t, u) -> t);
        if (min.isPresent()) {
            System.out.println(min.get());


        } else {
            System.out.println("Liste bos veya minimum deger bulunamadi");
        }
    }

    //5.yol --->Math.min metodu
    public static void minimum6(List<Integer> nums) {
        Integer min = nums.stream().distinct().reduce((t, u) -> Math.min(t, u)).get();
        System.out.println(min);

    }

    // 6.yol---> best practice
    public static void minimum7(List<Integer> nums) {
        Integer min = nums.stream().distinct().reduce(Math::min).get();
        System.out.println(min);//
    }
}