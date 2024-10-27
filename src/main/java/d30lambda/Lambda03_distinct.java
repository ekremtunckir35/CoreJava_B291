package d30lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda03_distinct {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 3, 3, 5, 10, 10));
        printCubeOfDistinctOddElements(nums);

    }//main disi
    //3) Bir tamsayı listesindeki tek sayıların küplerini, tekrarlanmadan, aynı satırda,
    // aralarına boşluk koyarak yazdıran bir method oluşturunuz.(Functional)
    //3) Create a method that prints the cubes of odd numbers in a list of integers,
    // without repeating, on the same line, with spaces between them. (Functional)

    //distinct() metodu, bir akistaki tekrar eden ogeleri kaldirmak icin kullanilir.uniq hale getirir.
    //tekrarli halini getirir.
    // 1,2,2,3,3,3,4,4,5 ===> 1,2,3,4,5


    //tek sayilarin kupunu yazdirma (printCubeOfDistinctOddElements)

    public static void printCubeOfDistinctOddElements(List<Integer>nums){
        nums.
                stream().
                distinct().
                filter(t -> t % 2 != 0).
                map(t -> t * t * t).
                forEach(t -> System.out.print(t + " "));//27,125

    }



}
