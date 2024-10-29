package d31lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Lambda11 {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");
    }
    //printElementsLengthLessThanFiveUniqueLowerCase
    public static void printElementsLengthLessThanFiveUniqueLowerCase(List<String>myList){
        myList.stream().
                distinct().
                filter(t->t.length()<5).
                map(t->t.toLowerCase()).sorted().forEach(t-> System.out.printf(t +" "));

    }
}
