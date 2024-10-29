package d31lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda12 {
    private static List<String> myList;

    public static void main(String[] args) {
        
       printElementsUniqueToUpperCaseSorted(myList);
        
        
        
        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");

 //Örnek 5:Bir List<String> içindeki tüm elemanları benzersiz hale getirip, büyük harflere dönüştürdükten
// sonra alfabetik sıraya göre konsola yazdıran bir metod yazınız.
//Example 5: Write a method that makes all the elements in a List<String> unique,
// converts them to uppercase letters, and prints them to the console in alphabetical order.


    }
    public static void printElementsUniqueToUpperCaseSorted(List<String >myList){
        myList.stream().
                distinct().
                map(t-> t.toUpperCase()).
                sorted().
                forEach(Utils::printInTheSameLineWithSpace);
        
    }
}
