package d31lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda13 {

    //
 //Örnek 6:Bir List<String> içindeki tüm elemanları önce benzersiz hale getirin, ardından küçük harflere çevirin
// ve elemanların uzunluklarına göre küçükten büyüğe sıralayarak konsola yazdıran bir metod yazınız.
//Example 6: First make all the elements in a List<String> unique, then convert them to lowercase letters and write
// a method that sorts the elements from smallest to largest according to their length and prints them to the console.

//Comparator.comparing(): Comparator sınıfında bulunan comparing metodu,
// belirtilen bir fonksiyona göre karşılaştırma yapmak için bir karşılaştırıcı (comparator) oluşturur.
//sorted(Comparator.comparing(t->t.length())) ifadesi, stream içindeki elemanları uzunluklarına
// göre artan sırayla sıralar. Eğer ters sıralama istenirse, reversed() metodu eklenerek
// sorted(Comparator.comparing(String::length).reversed()) şeklinde kullanılabilir.
public static void main(String[] args) {
    List<String> myList = new ArrayList<>();
    myList.add("Ali");
    myList.add("Elif");
    myList.add("Yusuf");
    myList.add("Elif");
    myList.add("Zeynep");
    myList.add("Mustafa");


}
  public static void printElUniqueLowerCaseSortWithLength(List<String>myList){
    myList.stream().
            distinct().
            map(String::toUpperCase).
            sorted(Comparator.comparing(String::length)).
            forEach(t-> System.out.printf(t+""));

  }
}

