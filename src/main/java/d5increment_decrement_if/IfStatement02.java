package d5increment_decrement_if;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {

        //Ornek 1: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz.

        //Example 1: Create the code that prints whether a number received from the user is odd or even.


        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");

        int num = input.nextInt();

        if(num % 2 == 0){
            System.out.println("Cift Sayi");

        }
        if(num %2 !=0){  //num %2 ==1 seklinde de yazabiliriz.
            System.out.println("Tek Sayi");

        }

        // --------------2.Yol

        // if else Statement

        if (num %2 == 0){
            System.out.println("Sayi Ciftir");
        }else {
            System.out.println("Sayi tektir");
        }
    }
}
